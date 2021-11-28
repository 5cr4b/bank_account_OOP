package src;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;

public class admin extends bank{
    //xem thông tin tài khoản user
    // gửi tin nhắn cho user
    // sao kê tài khỏan cho user
    // liệt kê danh sách id
    
    protected String admin_id;
    protected String admin_password;
    
    public admin(){
        this.admin_id = "admin";
        this.admin_password = "passwd";
    }
    
    // getter 
    public String get_admin_id(){
        return this.admin_id;
    }
    
    public String get_admin_password(){
        return this.admin_id;
    }
    
    
    
    // quyền hạn quản trị viên      
    
    
    
    
    
    // send message to some body
    protected void send_message(account account, String message){
        account.list_message.add(this.message_time(account.get_username(),message));
        this.list_message.add(this.message_time(account.get_username(),message));
    }  
    
        // check info & tranfer's history
    protected void show_info_history(account account){
        System.out.println("name: " + account.get_username() + "\n"
                           + " bank number : "+ account.get_bank_id() + "\n"
                           + " password: "+account.get_bankPassword() + "\n"
                           + " bank name: "+account.get_bank_name() + "\n"
                           + " current money: "+account.get_user_money());
        System.out.println(" lich su giao dich: ");
        for(String i[] : account.list_history) {
            System.out.println(Arrays.toString(i));
        }
    }  
    
       // print file tranfer's history
    protected void sao_ke(account account){       
        try {
            // tao file trong ubuntu
            FileWriter fWriter = new FileWriter("/home/cr4b/bank/saoke.txt");
            //doc file trong lich su giao dich
            for(String i[] : account.list_history) {
                 fWriter.write((Arrays.toString(i)+"\n"));
            }
            fWriter.close();
        }
        // Catch block to handle if exception occurs
        catch (IOException e) {
            // Print the exception
            System.out.print(e.getMessage());
        }
    }
    
    
}
