public class Checking extends Account {
    private int debitCardNumber;
    private int debitCardPin;

    public Checking(String name, String ssN, double initDeposit){
        super(name, ssN, initDeposit);
        accountNumber = "2" + accountNumber;
        setDebitCard();
    }
    @Override
    public void setRate() {
        rate = getBaseRate() * .15;
    }

    private void setDebitCard() {
        debitCardNumber = (int) (Math.random() * Math.pow(10, 12));
        debitCardPin = (int) (Math.random() * Math.pow(10, 4));
        
    }
    public void showInfo() {
        super.showInfo();
        System.out.println(
            "Your Checking account features " +
            "\n Debit card #: " + debitCardNumber +
            "\n Debit PIN: " + debitCardPin
        );
    }


}