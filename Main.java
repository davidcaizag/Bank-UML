import java.util.Date;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Bank bank = new Bank();
        System.out.println("Banco creado.");

        ATM atm = new ATM();
        System.out.println("Cajero automatico creado");

        Customer customer1 = new Customer();
        customer1.name = "Pedro Perez";
    }
}




































////// Clase Bank
//public class Bank {
//    private String code;
//    private String address;
//
//    public void manages() {
//        System.out.println("Gestionando las operaciones del banco...");
//    }
//
//    public void maintains() {
//        System.out.println("Realizando mantenimiento del banco...");
//    }
//}
//
//// Clase ATM
//public class ATM {
//    private String location;
//    private String managedBy;
//
//    public void identifies() {
//        System.out.println("Identificando al cliente...");
//    }
//
//    public void transactions() {
//       System.out.println("Identificando al cliente...");
//    }
//}
//
//// Clase DebitCard
//public class DebitCard {
//    private String cardNo;
//    private Customer ownedBy;
//
//    public void access() {
//        System.out.println("Accediendo a la cuenta con tarjeta: " + cardNo);
//    }
//}
//
//// Clase Customer
//import java.util.Date;
//import java.util.ArrayList;
//import java.util.List;
//
//public class Customer {
//    private String name;
//    private String address;
//    private Date dob;
//    private List<Account> accounts = new ArrayList<>();
//
//    public void owns() {
//        System.out.println("El cliente " + name + " es propietario de " + accounts.size() + " cuentas.");
//    }
//}
//
//// Clase Account
//public abstract class Account {
//    protected String type;
//    protected Customer owner;
//
//    public void checkBalance() {
//        System.out.println("Consultando el balance de la cuenta de tipo: " + type);
//    }
//}
//
//// Clase SavingAccount (hereda de Account)
//public class SavingAccount extends Account {
//    private String accountNo;
//
//    public SavingAccount(String accountNo, Customer owner) {
//        this.type = "Ahorros";
//        this.accountNo = accountNo;
//        this.owner = owner;
//    }
//
//    public void debit() {
//        System.out.println("Realizando débito de la cuenta de ahorros: " + accountNo);
//    }
//
//    public void credit() {
//        System.out.println("Realizando crédito a la cuenta de ahorros: " + accountNo);
//    }
//}
//
//// Clase CheckingAccount (hereda de Account)
//public class CheckingAccount extends Account {
//    private String accountNo;
//
//    public CheckingAccount(String accountNo, Customer owner) {
//        this.type = "Corriente";
//        this.accountNo = accountNo;
//        this.owner = owner;
//    }
//
//    public void debit() {
//        System.out.println("Realizando débito de la cuenta corriente: " + accountNo);
//    }
//
//    public void credit() {
//        System.out.println("Realizando crédito a la cuenta corriente: " + accountNo);
//    }
//}
//
//// Clase ATMTransaction
//public abstract class ATMTransaction {
//    protected String transactionId;
//    protected String date;
//    protected String type;
//
//    public void update() {
//        System.out.println("Actualizando la transacción ID: " + transactionId);
//    }
//}
//
//// Clase WithdrawalTransaction (hereda de ATMTransaction)
//public class WithdrawalTransaction extends ATMTransaction {
//    private double amount;
//
//    public WithdrawalTransaction(String transactionId, String date, double amount) {
//        this.transactionId = transactionId;
//        this.date = date;
//        this.type = "Retiro";
//        this.amount = amount;
//    }
//
//    public void withdraw() {
//        System.out.println("Retirando $" + amount + " de la cuenta. Transacción ID: " + transactionId);
//    }
//}
//
//// Clase TransferTransaction (hereda de ATMTransaction)
//public class TransferTransaction extends ATMTransaction {
//    private double amount;
//    private String accountNo;
//
//    public TransferTransaction(String transactionId, String date, double amount, String accountNo) {
//        this.transactionId = transactionId;
//        this.date = date;
//        this.type = "Transferencia";
//        this.amount = amount;
//        this.accountNo = accountNo;
//    }
//
//    public void transfer() {
//        System.out.println("Transfiriendo $" + amount + " a la cuenta: " + accountNo + ". Transacción ID: " + transactionId);
//    }
//}


///import java.util.Date;
//import java.util.ArrayList;
//
//public class Main {
//    public static void main(String[] args) {
//        // Crear el banco
//        Bank bank = new Bank();
//        System.out.println("Banco creado.");
//
//        // Crear un cajero automático
//        ATM atm = new ATM();
//        System.out.println("Cajero automático creado en una ubicación predefinida.");
//
//        // Crear clientes
//        Customer customer1 = new Customer();
//        customer1.name = "Juan Pérez";
//        customer1.address = "Calle Principal 123";
//        customer1.dob = new Date(1985 - 1900, 7, 15); // 15 de agosto de 1985
//
//        Customer customer2 = new Customer();
//        customer2.name = "Ana López";
//        customer2.address = "Av. Secundaria 456";
//        customer2.dob = new Date(1990 - 1900, 3, 20); // 20 de abril de 1990
//
//        System.out.println("Clientes creados:");
//        System.out.println("- Cliente 1: " + customer1.name);
//        System.out.println("- Cliente 2: " + customer2.name);
//
//        // Crear cuentas
//        SavingAccount account1 = new SavingAccount("001", customer1);
//        CheckingAccount account2 = new CheckingAccount("002", customer2);
//
//        System.out.println("Cuentas creadas:");
//        System.out.println("- Cuenta de ahorros (cliente 1): " + account1.type);
//        System.out.println("- Cuenta corriente (cliente 2): " + account2.type);
//
//        // Asociar cuentas a los clientes
//        customer1.accounts.add(account1);
//        customer2.accounts.add(account2);
//
//        // Crear tarjetas de débito
//        DebitCard debitCard1 = new DebitCard();
//        debitCard1.cardNo = "1234-5678-9876-5432";
//        debitCard1.ownedBy = customer1;
//
//        DebitCard debitCard2 = new DebitCard();
//        debitCard2.cardNo = "4321-8765-6789-1234";
//        debitCard2.ownedBy = customer2;
//
//        System.out.println("Tarjetas de débito asignadas:");
//        System.out.println("- Tarjeta 1: " + debitCard1.cardNo + " (Cliente 1)");
//        System.out.println("- Tarjeta 2: " + debitCard2.cardNo + " (Cliente 2)");
//
//        // Crear transacciones
//        WithdrawalTransaction withdrawal1 = new WithdrawalTransaction("TXN001", "2024-12-09", 100.00);
//        withdrawal1.withdraw();
//
//        WithdrawalTransaction withdrawal2 = new WithdrawalTransaction("TXN002", "2024-12-09", 200.00);
//        withdrawal2.withdraw();
//
//        TransferTransaction transfer1 = new TransferTransaction("TXN003", "2024-12-09", 50.00, account2.accountNo);
//        transfer1.transfer();
//
//        TransferTransaction transfer2 = new TransferTransaction("TXN004", "2024-12-09", 150.00, account1.accountNo);
//        transfer2.transfer();
//
//        WithdrawalTransaction withdrawal3 = new WithdrawalTransaction("TXN005", "2024-12-09", 75.00);
//        withdrawal3.withdraw();
//
//        TransferTransaction transfer3 = new TransferTransaction("TXN006", "2024-12-09", 300.00, account1.accountNo);
//        transfer3.transfer();
//
//        System.out.println("Transacciones realizadas:");
//        System.out.println("- 3 Retiros");
//        System.out.println("- 3 Transferencias");
//    }
//}














