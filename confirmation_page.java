
import java.util.*;
public class confirmation_page
{
    public static void main()
    {
        first_page_1 o = new first_page_1();
        first_page_2 ab = new first_page_2();
        money obj=new money();
        Scanner sc=new Scanner(System.in);
        database ob=new database();
        System.out.println("BOOKING CONFIRMATION\nPersonal Information::");
        System.out.print("Full Name: "+ob.name+" "+ob.s_name + "  |  ");
        System.out.print("Email: "+ob.email + "  |  ");
        System.out.println("Mobile no.: "+ob.ph_no);
        System.out.print("Hotel Name: "+obj.hotel_name.substring(2) + "  |  ");
        System.out.println("City Name: "+o.CustArea);
        System.out.print("No. of days: "+o.Days + "  |  ");
        System.out.println("Trip dates: "+o.CustFromDate  + " to " + o.CustToDate);
        System.out.print("No. of adults: "+o.numAdult + "  |  ");
        System.out.print("No. of Kids: "+o.numKid + "  |  ");
        System.out.println("No. of rooms: "+o.Rooms + "(" + ab.RoomType + ")");
        System.out.println("------------------------------------------------------------------");
        System.out.println("Hotel Bill::");
        double price_ = obj.price+ab.RoomCost;
        System.out.println("Room Cost(Basic room price Rs." + price_ + " x " +o.Days + " days x " + o.Rooms + " rooms): Rs." + obj.price_1);
        double Tot_Kp = o.KidPrice*obj.price_1;
        System.out.println("Price for extra kids(20% for each kid): Rs." + Tot_Kp);
        double off_d= o.dscnt*obj.price_2;
        System.out.println("Discount(10% only for off-season): Rs." + off_d);
        System.out.println("GST(18%): Rs." + obj.tax*obj.price_3);
        System.out.println("TOTAL: Rs." + obj.total);
        System.out.println("-------------------------------------------------------------------");
        System.out.println("Press X to cancel your booking (Press any other letter to continue)");
        char ch=sc.nextLine().charAt(0);
        if(ch=='X'||ch=='x')
            {
                System.out.println("Your booking has been cancelled.");
                System.out.println("Thank You. Please visit us again");
            }
        else
        {
            System.out.println("Thank you for confirming. ");
            System.out.println("We have registered your details and a confirmation has been sent to your email address. ");
            System.out.println("Tarriff can be paid on arrival at the hotel. ");
            System.out.println("Thank You. Please visit us again.");
        }
    }
}