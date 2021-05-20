import java.util.*;
public class money
{
    int ch,ch1,ch2;
    static String hotel_name;
    static double price=0.0,price_1,price_2,price_3;
    static double total,tax = 0.18;
    Scanner sc = new Scanner(System.in);
    first_page_1 objct = new first_page_1();
    first_page_2 obj = new first_page_2();
    void stars()
    {
        do
        {
        System.out.print("Select the number of stars for the hotel (1-5) : ");
        ch = sc.nextInt();
        if(ch<1||ch>5)
        {
           System.out.println("Invalid choice.");
        }
    }
        while(ch<1||ch>5);
    }
    void price()
    {
       do
        {
         System.out.println("Select the range of prices for the hotel you are looking for : ");
         System.out.println("All figures are in INR for a single day");
         System.out.println("1. 2,000 to 5,000\n2. 5,000 to 10,000\n3. 10,000 to 15,000\n4. 15,000 to 20,000\n5. 20,000 and above");
          ch1 = sc.nextInt();
          if(ch1<1||ch1>5)
          {
              System.out.println("Invalid input.");
          }
        }
        while(ch1<1||ch1>5);
    }
    void dis()
    {
     double[] p1={2100,3300,4700,5200,5000};
     double[] p2={5500,6000,7200,8300,9400,10000};
     double[] p3={11200,12000,13500,14700,14800};
     double[] p4={20000,17400,18200,16000,19500};
     double[] p5={21540,23200,22100,20570,21000,20300};
     String[] hotels1= {"1.South Point Hotel","2.Green Valley Ranch Hotel","3.The Palms Resort","4.Red Rock Resort and Spa","5.The Flamingo"};
     String[] hotels2={"1.The Venetian","2.Ellis Island Hotel","3.Caesars Place","4.Platinum Hotel","5.Luxor hotel","6.Red Roof Inn"};
     String[] hotels3={"1.ARIA resort","2.The Westgate","3.The Travel Lodge","4.Bellagio","5.Watson's Hotel"};
     String[] hotels4={"1.Four Seasons Hotel","2.Shalini Palace","3.Taj Mahal Palace and Tower","4.Hyatt Regency","5.Trident Hilton"};
     String[] hotels5={"1.Hotel d'Angeli's","2.Savoy Hotel","3.Taj Club Hotel","4.Lake Palace","5.Westin","6.Imperial Palace"};
   do{
     if(ch1==1)
    for(int i=0;i<=4;i++)
    {
      System.out.println(hotels1[i]+"  Rs."+p1[i]);
      
    }
    else if(ch1==2)
      for(int i=0;i<=5;i++)
    {
      System.out.println(hotels2[i]+"  Rs."+p2[i]);
      
    }
    else if(ch1==3)
      for(int i=0;i<=4;i++)
    {
      System.out.println(hotels3[i]+"  Rs."+p3[i]);
      
    }
    else if(ch1==4)
      for(int i=0;i<=4;i++)
    {
      System.out.println(hotels4[i]+"  Rs."+p4[i]);
      
    }
    else if(ch1==5)
      for(int i=0;i<=5;i++)
    {
      System.out.println(hotels5[i]+"  Rs."+p5[i]);
      
    }
    System.out.println("Select your hotel (1,2,3,4,5...) : ");
    ch2 = sc.nextInt();
    if(ch2<1||ch2>6)
    System.out.println("Invalid choice. Please select the correct choice.");
}while(ch2<1||ch2>6);
    if(ch1==1)
    {
        hotel_name = hotels1[ch2-1];
       System.out.println("Your choice is " + hotels1[ch2-1]);
    }
    else if(ch1==2)
    {
        hotel_name = hotels2[ch2-1];
    System.out.println("Your choice is " + hotels2[ch2-1]);
   }
    else if(ch1==3)
    {
        hotel_name = hotels3[ch2-1];
    System.out.println("Your choice is " + hotels3[ch2-1]);
 }
    else if(ch1==4)
    {
    hotel_name = hotels4[ch2-1];
    System.out.println("Your choice is " + hotels4[ch2-1]);
   }
    else if(ch1==5)
    {
    hotel_name = hotels5[ch2-1];
    System.out.println("Your choice is " + hotels5[ch2-1]); 
   }   
       if(ch1==1)
      price = (p1[ch2-1]);
      else if(ch1==2)
      price = (p2[ch2-1]);
      else if(ch1==3)
      price = (p3[ch2-1]);
      else if(ch1==4)
      price = (p4[ch2-1]);
      else if(ch1==5)
      price = (p5[ch2-1]);
    }
    void total()
    {
        int a = Integer.parseInt(objct.s);
        if(a==5||a==6||a==10||a==12)
        {
        }
        else
        {
        System.out.println("You get an off-season discount of 10% on the total price.");
        objct.dscnt = 0.10;
       }
       int roomcost = obj.RoomCost;
       price_1 = (price + roomcost)*objct.Days*objct.Rooms;
       price_2 = price_1*(1+objct.KidPrice); //price with extra price for children
       price_3 = price_2*(1-objct.dscnt);//price with discount excluding tax
        
        total = price_3*(1+tax);//price inclusive of tax
        System.out.println("The total price inclusive of discount and taxes is Rs." + total);
    }
}