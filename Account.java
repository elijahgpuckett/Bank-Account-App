public abstract class Account implements IBaseRate {
    private String name;
    private String ssN;
    private double balance;

    static int index = 10000;
    protected String accountNumber;
    protected double rate;

    public Account(String name, String ssN, double initDeposit) {
        index++;
        this.name = name;
        this.ssN = ssN;
        this.balance = initDeposit;
        this.accountNumber = setAccountNumber();
        setRate();
    }

    public abstract void setRate();

    private String setAccountNumber(){
        String lastTwoOfssN = ssN.substring(ssN.length()-2, ssN.length());
        int uniqueID = index;
        int randomNumber = (int) (Math.random() * Math.pow(10, 3));
        return lastTwoOfssN + uniqueID + randomNumber;
    }
    public void compound() {
        double accruedInterest= balance * (rate/100);
        balance = balance + accruedInterest;
        System.out.println("accrued interest: $" + accruedInterest);
        printBalance();
        
    }

    public void deposit(double amount){
        balance = balance + amount;
    }
    public void withdraw(double amount){
        balance = balance - amount;
    }
    public void transfer(String toWhere, double amount){
        balance = balance - amount;
        System.out.println("Transferring $" + amount + "to" + toWhere);
    }
    public void printBalance() {
        System.out.println("Your balance is now: $" + balance);
        
    }

    public void showInfo() {
        System.out.println(
            "Name: " + name +
            "\n Account #: " + accountNumber +
            "\n Balance: " + balance +
            "\n Rate: " + rate + "%"
        );
    }
    
}