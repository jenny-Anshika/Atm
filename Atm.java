import java.util.*;
public class Atm
{
    int amount, age;
    String branch, address, fathername, name;
    long accountno, aadhaar;
    public static void details()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Amount:");
        int amount=sc.nextInt();
        System.out.println("Enter age:");
        int age=sc.nextInt();
        System.out.println("Enter branch name:");
        String branch=sc.next();
        System.out.println("Enter user's address:");
        String address=sc.next();
        // System.out.println("Enter Father's name:");
        // fathername=sc.nextLine();
        // System.out.println("Enter Your name:");
        // name=sc.nextLine();
        // System.out.println("Enter account number:");
        // accountno=sc.nextLong();
        // System.out.println("Enter yout aadhaar number");
        // aadhaar=sc.nextLong();

        sc.close();
    }

    public static void deposit()
    {
        System.out.println("atm");

    }

    public static void withdraw()
    {
        System.out.println("atm");
    }

    public static void main(String args[])
    {
        Atm atm=new Atm();
        Atm.details();
        int swtch=2;
        switch(swtch)
        {
        case 1:
                Atm.deposit();
                break;
        case 2:
                Atm.withdraw();
                break;
        default:
                System.out.println("Enter valid choice!");
        }
    }
}