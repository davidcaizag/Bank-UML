public class WithdrawlTransaction extends ATMTransaction{
    private double amount;

    public WithdrawlTransaction(String transactionId, String date, double amount) {
        this.transactionId = transactionId;
        this.date = date;
        this.type = "Retiro";
        this.amount = amount;
    }

    public void withdraw (){
        System.out.println("Retirando $" + amount + " de la cuenta. Transacción ID: " + transactionId);
    }

}
