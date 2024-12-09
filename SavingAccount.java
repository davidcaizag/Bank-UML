public class SavingAccount extends Account {
    private String accountNo;

    public SavingAccount(String accountNo, Customer owner) {
        this.type = "Ahorros";
        this.accountNo = accountNo;
        this.owner = owner;
    }

    public void debit (){
        System.out.println("Realizando débito de la cuenta: " + accountNo);
    }

    public void credit() {
        System.out.println("Realizando crédito a la cuenta: " + accountNo);
    }
}

