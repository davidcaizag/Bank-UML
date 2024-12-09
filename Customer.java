import java.util.ArrayList;
import java.util.List;

public class Customer {
    private String name;
    private String address;
    private List<Account> accounts = new ArrayList<>();

    public void owns (){
        System.out.println("El cliente " + name + " es propietario de " + accounts.size() + " cuentas.");
    }
}
