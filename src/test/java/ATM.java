public class ATM {
    int balance = 0;
    public void addCredit(int toAdd){
        balance += toAdd;
    }
    public int withdraw(int x){
        if (x <= balance){
            balance -= x;
            System.out.println("Withdraw of " + x + " Successful.");
            System.out.println("New Balance is " + balance);
            return x;
        }
        else System.out.println("Not enough credit!");
        return 0;
    }
    public int withdrawStub(int x){
    addCredit(x); // to make sure there is enough balance
    balance -= x;
    return x;
    }

}
