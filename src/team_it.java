package src;
import java.util.ArrayList;

public class team_it extends employee {
    protected String it =  "itSystem";
    protected String password1 = "password";
            
    @Override
    public void send_message(account account, String message) {
        account.list_message.add(message_time(account.get_username(),message));
        list_message.add(message_time(account.get_username(),message));
    }

    @Override
    public boolean sign_in(String bank_id ,String  password){
        if(it.equals(bank_id) && password1.equals(password)){
            return true;
        }
        return false;
    } 
    
    
    @Override
    public ArrayList<String> get_registed(){
        return list_id_registed;
    }
    
    
    public boolean sign_in(account account, String bank_id ,String  password){    
        if(account.get_bank_id().equals(bank_id) && account.get_bankPassword().equals(password)){
            return true;
        }
        return false;
    }
    
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
        

      
    
}
