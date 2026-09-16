public class Opgave1 {

    double balance;
    String accountName;

    void main(){
        accountName = "Naya";
        deposit100();
        deposit100();
        withdraw50();
        printBalance();
    }

    double deposit100(){
        balance += 100.0;
        return balance;
    }
    double withdraw50(){
        balance -= 50.0;
        return balance;
    }
    void printBalance(){
        System.out.println(accountName);
        System.out.println(balance);
    }
}
