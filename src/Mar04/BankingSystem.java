package Mar04;
import java.util.Scanner;

class InsufficientFundsException extends Exception {
    public InsufficientFundsException(String message) {
        super(message);
    }
}

abstract class BankAccount {
    int AccNum;
    String AccName;
    double Balance=0;
    double DepAmount=0;
    double witAmount=0;
    double intAmount=0;
    double odAmount=0;
    public abstract void withdraw(double D2);

    public void deposit(double D1)
    {
        this.DepAmount=D1;
        this.Balance=this.Balance+this.DepAmount;
    }
    public void displayBalance()
    {
        System.out.println("Your account balance is "+this.Balance);
    }
}

interface InterestCalculator
{
    public double calculateInterest(double D4);
}

class SavingsAccount extends BankAccount implements InterestCalculator
{
    public SavingsAccount(int AccNum, String AccName)
    {
        this.AccNum=AccNum;
        this.AccName=AccName;
    }
    public double calculateInterest(double D3)
    {
        this.DepAmount=D3;
        this.intAmount=(this.DepAmount*8)/100;
        return this.intAmount;
    }
    @Override
    public void withdraw(double D2)
    {
        this.witAmount=D2;
        try {
            if (this.Balance <= 0) {
                throw new InsufficientFundsException("Your account balance is insufficient");
            } else {
                this.Balance = this.Balance - this.witAmount;
            }
        } catch (Exception e) {
            System.out.println("Exception caught: "+e.getMessage());
        }
    }
}

class CurrentAccount extends BankAccount
{
    public CurrentAccount(int AccNum, String AccName)
    {
        this.AccNum=AccNum;
        this.AccName=AccName;
    }
    @Override
    public void withdraw(double D2)
    {
        this.witAmount=D2;
        if(this.Balance>0)
        {
            if (this.witAmount>=25000)
            {
                System.out.println("Your overdraft limit is 25000");
            }else
            {
                if(odAmount<=25000)
                {
                    this.Balance=this.Balance-this.witAmount;
                    this.odAmount=this.odAmount+this.witAmount;
                } else{
                    System.out.println("You have reached your overdraft limit ");
                }
            }
        }else {
            System.out.println("Your account balance is insufficient");
        }
    }
}

public class BankingSystem {
    public static void main(String[] args) {
        SavingsAccount S1=new SavingsAccount(12345, "Rohit");
        CurrentAccount S2=new CurrentAccount(98765, "Kohli");

        Scanner DA = new Scanner(System.in);
        Scanner WA = new Scanner(System.in);
        Scanner item = new Scanner(System.in);
        Scanner type = new Scanner(System.in);
        Scanner ANum = new Scanner(System.in);
        while(true)
        {
            System.out.println("Enter 1-SavingsAccount 2-CurrentAccount 3-Exit");
            int a = type.nextInt();
            if (a==1)
            {
                System.out.println("Enter Account number");
                int b=ANum.nextInt();
                if (b==12345)
                {
                    while(true)
                    {
                        System.out.println("Enter 1-Deposit 2-Withdraw 3-DisplayBalance 4-Exit");
                        int c = item.nextInt();
                        if (c == 1) {
                            System.out.println("Enter Amount to be deposited");
                            double d = DA.nextDouble();
                            S1.deposit(d);
                            S1.displayBalance();
                            double TotInt = S1.calculateInterest(d);
                            System.out.println("Interest for the deposit amount for annum is " + TotInt);
                        } else if (c == 2) {
                            System.out.println("Enter Amount to be withdrawal");
                            double e = WA.nextDouble();
                            S1.withdraw(e);
                            S1.displayBalance();
                        } else if (c == 3) {
                            S1.displayBalance();
                        } else {
                            break;
                        }
                    }
                }else
                {
                    break;
                }
            }else if(a==2)
            {
                System.out.println("Enter Account number");
                int b=ANum.nextInt();
                if (b==98765)
                {
                    while(true)
                    {
                        System.out.println("Enter 1-Deposit 2-Withdraw 3-DisplayBalance 4-Exit");
                        int c = item.nextInt();
                        if (c == 1) {
                            System.out.println("Enter Amount to be deposited");
                            double d = WA.nextDouble();
                            S2.deposit(d);
                            S2.displayBalance();
                        } else if (c == 2) {
                            System.out.println("Enter Amount to be withdrawal");
                            double e = WA.nextDouble();
                            S2.withdraw(e);
                            S2.displayBalance();
                        } else if (c == 3) {
                            S2.displayBalance();
                        } else {
                            break;
                        }
                    }
                }else
                {
                    break;
                }
            }else if (a==3)
            {
                break;
            }
        }
    }
}
