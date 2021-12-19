package src;
import java.util.ArrayList;

public abstract class employee extends bank {
    abstract void send_message(account account, String message);
    abstract boolean sign_in(String bank_id, String password);
    abstract ArrayList<String> get_registed();
}
