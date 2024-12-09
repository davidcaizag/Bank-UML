public class TransferTransaction extends ATMTransaction {
    private double amount;
    private String accountNo;

    public TransferTransaction(String transactionId, String date, double amount, String accountNo) {
        this.transactionId = transactionId;
        this.date = date;
        this.type = "Transferencia";
        this.amount = amount;
        this.accountNo = accountNo;
    }

    public void transfer() {
        System.out.println("Transfiriendo $" + amount + " a la cuenta: " + accountNo + ". Transacción ID: " + transactionId);
    }
}
