import java.util.List;
import java.util.LinkedList;

public class BankAccountApp {
    public static void main(String[] args) {
        List<Account> accounts = new LinkedList<Account>();
        
        
        String file = " ";
        List<String[]> newAccountHolder = utilities.CSV.read(file);
        for (String[] accountHolder : newAccountHolder) {
            String name = accountHolder[0];
            String ssN = accountHolder[1];
            String accountType = accountHolder[2];
            double initDeposit = Double.parseDouble(accountHolder[3]);
            System.out.println(name + " " + ssN + " " + accountType + "$" + initDeposit);
            if (accountType.equals("Savings")) {
                System.out.println("Open savings!");
            } else if (accountType.equals("Checking")) {
                System.out.println("Open checking!");
            } else {
                System.out.println("Error reading account");
            }
        }

        for (Account acc : accounts) {
            System.out.println("\n*********");
            acc.showInfo();
        }
        
        
    }
    
}