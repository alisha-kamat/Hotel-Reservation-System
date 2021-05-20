import java.util.*;
public class first_page_2
{
   static String RoomType;
   static double RoomTariff;
   int t=0;
   static int RoomCost=0;
   char ch=' ';
    void Room_Type()
    {
        Scanner sh=new Scanner(System.in);
        
        do{
            do{
                System.out.println("Choose Type of room:(Super Deluxe\\Deluxe)");
                RoomType=sh.nextLine();
                System.out.println();
                if(RoomType.equalsIgnoreCase("Super Deluxe"))
                {
                    t=1;
                    RoomCost=500;
                    System.out.println("Room Type: "+RoomType);
                    System.out.println("- They are ingeniously designed with elegant interiors");
                    System.out.println("- These Rooms provide all modern day facilities");
                }
                else if(RoomType.equalsIgnoreCase("Deluxe"))
                {
                    t=1;
                    RoomCost=0;
                    System.out.println("Room Type: "+RoomType);
                    System.out.println("- The Deluxe room has a traditional Indian look");
                    System.out.println("- Rooms have all facilities that a modern day guest expects.\n- These rooms prove to be an economical deal for your budget also. ");
                }
                else
                {
                    System.out.println("Invalid input...\nPlease  enter Room type again");
                    System.out.println();
                }

            }while(t!=1);
            System.out.println();
            System.out.println("Do you want to change your choice(Y/N)");
            ch=sh.nextLine().trim().charAt(0);
            t=0;
        }while(ch=='Y'||ch=='y');
    }
}
