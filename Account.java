public abstract class Account {
    protected String type;
    protected Customer owner;


    public void checkBalance() {
        System.out.println("Consultando el balance de la cuenta de tipo: " + type);
    }
}
