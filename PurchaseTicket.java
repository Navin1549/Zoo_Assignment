
package zoo;
import java.lang.reflect.Array;
import java.util.*;
abstract class Ticket
{
    abstract void billing();
}
public class PurchaseTicket extends Ticket {

    public static ArrayList<Integer> ticket=new ArrayList<>();
    private static int ticketnum=1;

    static ArrayList<Integer> getList()
    {
        return ticket;
    }
    void billing()
    {
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter The No. Of Guest: ");
        int n=sc.nextInt();
        System.out.println("----------------------------");
        ArrayList<Integer> al=new ArrayList<>();
        for(int i=1;i<=n;i++)
        {
            System.out.print("Enter Age Of Guest "+ i +" :");
            int y=sc.nextInt();
            al.add(y);
        } 

        System.out.println();
        DisplayTicket(al);
        return;
    }
    
    static void DisplayTicket(ArrayList<Integer> al)
    {
        int total=0,i=1; 
        System.out.println("----------Display Ticket---------");
        System.out.println("---------------------------------");        
        System.out.print("Ticket No:"+ticketnum);
        ticket.add(ticketnum++);
        System.out.println("       No. Of Guest:"+ al.size());
        System.out.println("---------------------------------"); 
        for(int x:al)
        {
            if(x<=2)
            {
                System.out.println("Guest "+i+" (age: "+x+") | Price: 0 ");
                total+=0;
            }
            else if(x>2 && x<18)
            {
                System.out.println("Guest "+i+" (age: "+x+") | Price: 100 ");
                total+=100;
            }
            else if(x>=18 && x<60)
            {
                System.out.println("Guest "+i+" (age: "+x+") | Price: 500 ");
                total+=500;
            }
            else if(x>=60)
            {
                System.out.println("Guest "+i+" (age: "+x+") | Price: 300 ");
                total+=300;
            }

            i++;
                
        }
        System.out.println("---------------------------------");
        System.out.println("Total Price 0f Ticket: "+ total);
        System.out.println("---------------------------------");
        System.out.println();

    }
    
}
