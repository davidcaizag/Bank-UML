public abstract class ATMTransaction {
    protected String transactionId;
    protected String date;
    protected String type;

    public void update(){
        System.out.println("Actualizando la transacción ID: " + transactionId);
    }

}
