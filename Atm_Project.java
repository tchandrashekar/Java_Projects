import java.util.*;

public class Atm_Project {

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int accno=1234567890;
        int pin=1234;//default pin
        int balance=1000,withdraw,deposit;//minimum balance is 1000
        while(true)
        {
            System.out.println("***** Welcome to the chandra's atm *****");
            System.out.println("press 1 to pin generation");
            System.out.println("press 2 to deposite");
            System.out.println("press 3 to withdraw");
            System.out.println("press 4 to check balance");
            System.out.println("press 5 to pin change");
            System.out.println("press 6 to exit");
            System.out.println("enter the option number to be performed:");

            int option=s.nextInt();
            int acno,pi;
            switch (option) {
                case 1:
                    System.out.println("...pin gereration:...");
                    System.out.println("enter the account no:");
                    acno=s.nextInt();//getting input from user
                    if(accno==acno)//checking user details and existing details of account
                    {
                        System.out.println("enter the new pin:");
                        int newpin=s.nextInt();
                        pin=newpin;
                        System.out.println("*** successfully new pin generated ***");
                    }
                    else
                    {
                        System.out.println("wrong input");
                    }
                    
                    break;

                case 2:
                    System.out.println("....depoist:....");
                    System.out.println("enter the account no");
                    acno=s.nextInt();
                    System.out.println("enter the pin");
                    pi=s.nextInt();
                    if(acno==accno && pin==pi)
                    {
                        System.out.println("enter the deposite amount ");
                        deposit=s.nextInt();
                        System.out.println("credited amount:"+deposit);
                        balance=balance+deposit;
                        System.out.println("after deposit the balance is: "+balance);
                    }
                    else
                    {
                        System.out.println("wrong input");
                    }
                    break;

                case 3:
                    System.out.println("....withdraw:....");
                    System.out.println("enter the account no");
                    acno=s.nextInt();
                    System.out.println("enter the pin");
                    pi=s.nextInt();
                    if(acno==accno && pin==pi)
                    {
                        System.out.println("enter the withdraw amount ");
                        withdraw=s.nextInt();
                        if(balance-withdraw < 1000 && withdraw<balance)
                        {
                            System.out.println("insufficent balance ");
                        }
                        else 
                        {
                            System.out.println("debiited amount"+withdraw);
                            balance=balance-withdraw;
                            System.out.println("after withdraw the balance amount is: "+balance);
                         }
                    }
                    else{
                        System.out.println("wrong input");
                    }
                    
                    break;

                case 4:
                    System.out.println("....balance enquiery:....");
                    System.out.println("enter the account no");
                    acno=s.nextInt();
                    System.out.println("enter the pin");
                    pi=s.nextInt();
                    if(acno==accno && pin==pi)
                    {
                        System.out.println("the balance is:"+balance);
                    }
                    else
                    {
                        System.out.println("wrong input");
                    }
                    break;

                case 5:
                    System.out.println(".....pin change.....");
                    System.out.println("enter the account no:");
                    int acnno=s.nextInt();
                    System.out.println("enter the old pin:");
                    pi=s.nextInt();
                    if(acnno==accno && pi==pin)
                    {
                        System.out.println("enter the updation pin");
                        int newpin=s.nextInt();
                        pin=newpin;
                    }
                    System.out.println("successfully updated pin :");
                    break;

                default:
                    System.out.println("*** thank you and vist again ***");
                    System.exit(0);
                    break;
            }
        }
    }
}