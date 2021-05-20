import java.util.*;
public class first_page_1
{
   static String CustArea,CustFromDate,CustToDate;
   static int numAdult=0,numKid=0;
   static int ageKid,Rooms;
   static double dscnt;
   static double Days,KidPrice;
   static String s;
   void title()
   {
       System.out.println("<<  AKSA HOTEL RESERVATION  >>");
   }
   void homepage()
   {
       Scanner sc = new Scanner(System.in);
       System.out.print("Enter the city you wish to visit : ");
       CustArea = sc.nextLine();
       System.out.print("Enter the trip dates (in dd/mm/yy format) :\nFrom: ");
       CustFromDate = sc.nextLine();
       System.out.print("To : ");
       CustToDate = sc.nextLine();
       System.out.print("Enter the number of days of your stay : ");
       Days = sc.nextInt();
       System.out.print("Enter the number of adults (12+) : ");
       numAdult = sc.nextInt();
       System.out.println("Enter the number of children (1-12 yrs) accompanying them");
       numKid = sc.nextInt();
       System.out.println("Upto 2 adults per room.");
       System.out.println("For more guests extra room is required.");
       if(numAdult%2==0)
       Rooms = numAdult/2;
       else
       Rooms = (numAdult/2)+1;
       if(numKid>=1)
       KidPrice = numKid*0.20;
       s = CustFromDate.substring(3,5);
       int i;
       for(i=1;i<=numKid;i++)
       {
           if(i==1)
           {
           System.out.println("Enter the kid's age");
           ageKid = sc.nextInt();
        }
          else if(i==2)
          {
         System.out.println("Enter the " + i + "nd kid's age");
         ageKid = sc.nextInt();
        }
         else if(i==3)
         {
         System.out.println("Enter the " + i + "rd kid's age");
         ageKid = sc.nextInt();
        }
         else if (i>3)
         {
         System.out.println("Enter the " + i + "th kid's age");
         ageKid = sc.nextInt();
        }
        else
        System.out.println("Invalid age.  Please re-enter the correct age.");
       }
        if(ageKid>12)
       {
           System.out.println("Sorry, you are considered to be an adult.");
           numAdult++;
        }
   }
}