package src;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

public class team_non_it extends employee {
    protected String nonit =  "nonIt";
    protected String password1 = "password";
    
    @Override
    public void send_message(account account, String message){
        account.list_message.add(message_time(account.get_username(),message));
        list_message.add(message_time(account.get_username(),message));
    } 
    @Override
    public boolean sign_in(String bank_id ,String  password){
        if(nonit.equals(bank_id) && password1.equals(password)){
            return true;
        }
        return false;
    }
    @Override
    public ArrayList<String> get_registed(){
        return list_id_registed;
    }
    
        // check info & tranfer's history
    public void show_info_history(account account){
        System.out.println("name: " + account.get_username() + "\n"
                           + " bank number : "+ account.get_bank_id() + "\n"
                           + " password: "+account.get_bankPassword() + "\n"
                           + " current money: "+account.get_user_money());
        System.out.println(" lich su giao dich: ");
        for(String i[] : account.list_history) {
            System.out.println(Arrays.toString(i));
        }
    } 
    public void sao_ke(account account){       
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
