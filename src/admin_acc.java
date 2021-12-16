package src;

import java.util.ArrayList;

public class admin_acc extends account22 {;
    public String admin_password;
    public String admin_id;
    // chuc nang chuyen,nap,ru tien & kich hoat tin nhan gui ve
    // xem thong tin TK , lich su giao dich
    // doc tin nhan ngan hang
    
    // tạo contructor lúc đăng kí
    public admin_acc(String bank_id , String bank_password , String user_name ,  int user_money){
        this.admin_id = admin_id;
        this.admin_password = admin_password;


    }   
    // constructor để khởi tạo normal_acc sẵn
    public admin_acc(){
    }

    @Override
    boolean sign_in(String bank_id ,String  password) {
        
        if(.equals(bank_id) && .equals(password)){
            return true;
        }
        return false;
    }


}
