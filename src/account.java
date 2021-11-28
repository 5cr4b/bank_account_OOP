package src;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public class account extends bank{
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
            this.list_history.add(this.create_history(so_tien,type));
            // trigger tin nhan thong bao
            this.list_message.add(noti_bank(so_tien,type));
            return true;
        }
        return false;
    }
        
    //rut tien 
    // add lich su gd
    public boolean rut_tien(int so_tien, String password){
        // show anh rut tien
        if (this.get_bankPassword().equals(password) && this.user_money >= so_tien){
            String type = "rut";
            this.set_user_money(this.user_money - so_tien);
            this.list_history.add(this.create_history(so_tien,type));
            this.list_message.add(noti_bank(so_tien,type));
            return true;    
        }
        return false;
    }


    //chuyen tien
    // add lich su gd   
    public boolean chuyen_tien(account account,String id , String password ,int so_tien){
        String type1 = "chuyen";
        String type2 = "nhan";
        if (this.get_bankPassword().equals(password) && this.get_user_money() >= so_tien){
            this.set_user_money(this.get_user_money() - so_tien);
            account.set_user_money(account.get_user_money() + so_tien);

            // luu vao lich su giao dich cua nguoi nhan/gui
            this.list_history.add(this.create_history(so_tien, account.get_bank_id(), type1));
            account.list_history.add(this.create_history(so_tien, this.get_bank_id(),type2));
            this.list_message.add(noti_bank(account.get_bank_id(), so_tien,type1));
            account.list_message.add(noti_bank(this.get_bank_id() , so_tien,type2));
            return true;
        }
        return false;
    }


} 


