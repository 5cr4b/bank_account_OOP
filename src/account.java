package src;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class account extends bank implements vip , red_zone{
    public String bank_id ;
    public String bank_password;
    public String user_name;
    public int user_money;
    // chuc nang chuyen,nap,ru tien & kich hoat tin nhan gui ve
    // xem thong tin TK , lich su giao dich
    // doc tin nhan ngan hang
    
    // tạo contructor lúc đăng kí
    public account(String bank_id , String bank_password , String user_name ,  int user_money){
        this.bank_id = bank_id;
        this.bank_password = bank_id;
        this.user_name = user_name;
        this.user_money = user_money;
        

    }   
    // constructor để khởi tạo account sẵn
    public account(){
    }
    
            
    public String get_bank_id(){
        return this.bank_id;
    }
    public void set_bank_id(String bank_id){
        this.bank_id = bank_id;
    }
    public String get_bankPassword(){
        return this.bank_password;
    }
    public void set_bankPassword(String bank_password){
        this.bank_password =  bank_password;
    }
    public String get_username(){
        return this.user_name;
    }
    public void set_username(String user_name){
        this.user_name = user_name;
    }
    public int get_user_money(){
        return this.user_money;
    }
    public void set_user_money(int user_money){
        this.user_money = user_money;
    }

    
    
    // chuc nang nap tien 
    public boolean nap_tien(int so_tien ,String  password){
        if (this.get_bankPassword().equals(password) && so_tien >= 0){
            String type = "nap";
            this.set_user_money(so_tien + this.user_money);
            this.set_list_history(this.create_history(so_tien,type));
            // trigger tin nhan thong bao
            this.set_list_message(this.noti_bank(so_tien,type));
            return true;
        }
        return false;
    }
        
    //rut tien 
    // add lich su gd
    public boolean rut_tien(int so_tien, String password){
        // show anh rut tien
        if (this.get_bankPassword().equals(password) && this.user_money >= so_tien && so_tien >= 0){
            String type = "rut";
            this.set_user_money(this.user_money - so_tien);
            this.set_list_history(this.create_history(so_tien,type));
            this.set_list_message(this.noti_bank(so_tien,type));
            return true;    
        }
        return false;
    }


    //chuyen tien
    // add lich su gd   
    public boolean chuyen_tien(account account,String id , String password ,int so_tien){
        String type1 = "chuyen";
        String type2 = "nhan";
        if (this.get_bankPassword().equals(password) && this.get_user_money() >= so_tien && so_tien >= 0){
            this.set_user_money(this.get_user_money() - so_tien);
            account.set_user_money(account.get_user_money() + so_tien);

            // luu vao lich su giao dich cua nguoi nhan/gui
            this.set_list_history(this.create_history(so_tien, account.get_bank_id(), type1));
            account.set_list_history(this.create_history(so_tien, this.get_bank_id(),type2));
            this.set_list_message(noti_bank(account.get_bank_id(), so_tien,type1));
            account.set_list_message(noti_bank(this.get_bank_id() , so_tien,type2));
            return true;
        }
        return false;
    }
    
    public String[] noti_bank(String bank_id,  int so_tien, String type){
        switch (type){
            case "chuyen":
                String content ="Ban da " + type +" "+ so_tien + " USD vao so tai khoan " + bank_id ;
                DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");  
                LocalDateTime now = LocalDateTime.now();  
                String[] myarr = {(String) dtf.format(now),content};
                return myarr;
            case "nhan":
                String content1 ="Ban da " + type+ " " + so_tien + " USD tu so tai khoan " + bank_id ;
                DateTimeFormatter dtf1 = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");  
                LocalDateTime now1 = LocalDateTime.now();  
                String[] myarr1 = {(String) dtf1.format(now1),content1};
                return myarr1;
            default:
                return null;
        }
    }
               
    // trigger thong bao rut tien
    // tạo và trả về 1 mảng chứa nội dung nạp tiền
    public String[] noti_bank(int so_tien,String type){
        switch (type){
            case "nap":        
                String content ="Ban da " + type +" "+ so_tien + " USD vao tai khoan";
                DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");  
                LocalDateTime now = LocalDateTime.now();  
                String[] myarr = {(String) dtf.format(now),content};
                return myarr;
         
            case "rut":
                String content2 ="Ban da " + type + " "+ so_tien +" USD";
                DateTimeFormatter dtf1 = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");  
                LocalDateTime now1 = LocalDateTime.now();  
                String[] myarr1 = {(String) dtf1.format(now1),content2};
                return myarr1;
            default:
                return null;
        }
    }
 
    //over load create history
    // tao tin nhắn thêm vào lịch sử giao dịch khi nap tien Chuyen tien
    public String[] create_history(int so_tien, String user_id,String type){
         // loai + time + stk nguoi nhan + ngan hang nguoi nhan + so tien
        String type1 = "chuyen";
        String type2 = "nhan";
        switch (type){
            case "chuyen":
                DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");  
                LocalDateTime now = LocalDateTime.now();
                String  content = "ban da " + " " + type1 + " " + so_tien + " " + " vao TK " + user_id;
                String[] myarr = {dtf.format(now),content};
                return myarr;
            case "nhan":   
                DateTimeFormatter dtf1 = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");  
                LocalDateTime now1 = LocalDateTime.now();
                String  content1 = "ban da " + " " + type2 + " " + so_tien + " " + " tu TK " + user_id;
                String[] myarr1 = {dtf1.format(now1),content1};
                return myarr1;
            default:
            return null;
        }        
    }
    
     // tao tin nhắn thêm vào lịch sử giao dịch khi nap tien NHAN tien
    public String[] create_history(int so_tien,String type){
         // loai + time + stk nguoi gui+ ten ngan hang gui + so tien
        String type1 = "nap";
        String type2 = "rut";
        switch (type){
            case "nap":
                DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");  
                LocalDateTime now = LocalDateTime.now();
                String  content = "ban da " + " " + type1 + " " + so_tien + " " + " vao TK ";
                String[] myarr = {dtf.format(now),content};
                return myarr;
            case "rut":   
                DateTimeFormatter dtf1 = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");  
                LocalDateTime now1 = LocalDateTime.now();
                String  content1 = "ban da " + " " + type2 + " " + so_tien + " " + " tu TK ";
                String[] myarr1 = {dtf1.format(now1),content1};
                return myarr1;
            default:
            return null;
        }   
    }
} 


