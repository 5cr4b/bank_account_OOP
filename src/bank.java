package src;
import java.util.ArrayList;
import java.time.format.DateTimeFormatter;  
import java.time.LocalDateTime;   


public class bank{
    // tạo bank & tạo người dùng
    // tạo tin nhắn gửi về
    // tạo nội dung nạp tiền
    // kiểm tra đăng nhập & đăng kí
    public ArrayList<String> list_id_registed = new ArrayList<String>();
    public ArrayList<String[]> list_history = new ArrayList<String[]>();
    public ArrayList<String[]> list_message = new ArrayList<String[]>();

    
    
    //init construcor no argumant
    public bank(){

    } 


    // ----------------end getter, setter ----------------------
    
    public ArrayList get_list_history(){
        return this.list_history;
    }
    public ArrayList get_list_message(){
        return this.list_message;
    }
    // ----------------------sign up-----------
    
    public boolean sign_up(account acc ,String bank_id,String bank_password , String user_name, int user_money ){
        // xem có trùng tài khoản k & mật khẩu k trùng
        if(check_sign_up(bank_id) && bank_password != null){       
            acc.set_bankPassword(bank_password);
            acc.set_bank_id(bank_id);
            acc.set_user_money(user_money);
            acc.set_username(user_name);
            this.list_id_registed.add(bank_id); // thêm vào danh sách đã đăng kí
            return true;
        }
        return false;

    }
    
    // kiểm tra trùng id 
    protected boolean check_sign_up(String bank_id){
        for(String i : this.list_id_registed) {
            if(i.equals(bank_id)){
                return false;
            }
        }
        return true;
    }    
        
    // đăng nhập 
    public boolean sign_in(account account, String bank_id ,String  password){
        if(account.get_bank_id().equals(bank_id) && account.get_bankPassword().equals(password)){
            return true;
        }
        return false;
    }
    
    
    // tạo tin nhắn  và trả về  tin nhắn
    // create array message with time & content
    public String[] message_time(String reciever , String message){
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");  
        LocalDateTime now = LocalDateTime.now();  
        String[] myarr = {reciever ,(String) dtf.format(now), message};
        return myarr;
    }
    
      
     // overload noti_bank
    // trigger thong bao chuyen tien
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
