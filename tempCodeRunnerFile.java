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