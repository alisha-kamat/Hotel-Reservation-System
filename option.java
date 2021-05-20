import java.util.*;
public class option
{
   String ch;
   int count=1;
   first_page_1 o = new first_page_1();
   first_page_2 a= new first_page_2();
   money abc = new money();
   confirmation_page cp=new confirmation_page();
   database oj = new database();
   void opt()
   {
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter C if you want to continue.");
       ch = sc.nextLine();
       if(ch.charAt(0)=='c'||ch.charAt(0)=='C')
       {
           if(count==1)
           {
           System.out.print("\f");
           o.title();
           System.out.println("Step 2 :");
           abc.stars();
           abc.price();
           abc.dis();
           a.Room_Type();
           abc.total();
           System.out.println("Enter c to proceed");
           ch = sc.nextLine();
        }
          count++;
          if(count==2)
          {
             System.out.print("\f");
             o.title();
             System.out.println("Step 3 :");
             oj.data();
            }
            count++;
          if(count==3)
          {
             System.out.print("\f");
             o.title();
             cp.main();
          }
      }
      
}
}
