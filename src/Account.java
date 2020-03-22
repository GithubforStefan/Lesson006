public class Account{
    double startBalance;
    double endBalance;
    double deposit;
    double transfer;
    double withdraw;

    public void deposit (double deposit){
        endBalance = startBalance + deposit;
        System.out.println("You have deposited " + deposit + " into your account. The balance is now " + endBalance);
    }
    public void transfer (double transfer){
        endBalance = startBalance - transfer;
        System.out.println("You have transferred " + transfer + " from your account. The balance is now " + endBalance);
    }
        public void withdraw(double withdraw){
        endBalance = startBalance - withdraw;
        System.out.println("You have withdrawn " + withdraw + " from your account. The balance is now " + endBalance);
    }
    }



