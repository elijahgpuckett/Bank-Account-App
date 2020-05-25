public class Savings extends Account {
private int safetyDepostBoxID;
private int safetyDepostBoxKey;

    public Savings(String name, String ssN, double initDeposit){
        super(name, ssN, initDeposit);
        accountNumber = "1" + accountNumber;
        setSafetyDepositBox();
    }
    @Override
    public void setRate() {
        rate = getBaseRate() - .25;

    }
    private void setSafetyDepositBox() {
        safetyDepostBoxID = (int) (Math.random() * Math.pow(10,3));
        safetyDepostBoxKey = (int) (Math.random() * Math.pow(10,4));
    }
    public void showInfo() {
        super.showInfo();
        System.out.println(
            "Your Savings account features " +
            "\n Safety deposit box ID: " + safetyDepostBoxID +
            "\n Safety deposit box key: " + safetyDepostBoxKey
        );
    }

    

}