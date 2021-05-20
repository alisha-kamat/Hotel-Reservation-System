import java.util.*;
public class database
{
    static String name,email,s_name;
    static long ph_no;
     void data()
    {
       Scanner sc = new Scanner(System.in);
       System.out.print("Enter your name : ");
       name = sc.nextLine();
       System.out.print("Enter your surname : ");
       s_name = sc.nextLine();
       System.out.print("Enter your email id for receiving a confirmation message : ");
       email = sc.nextLine();
       System.out.print("Enter you mobile number : ");
       ph_no = sc.nextLong();
    }
}
