package zoo;
import java.util.*;

abstract class Validate{
    
    abstract void check();
}

public class ValidateTicket extends Validate {

    static ArrayList<Integer> visited=new ArrayList<>();
    
    void check()
    {
        ArrayList<Integer> tick=PurchaseTicket.getList();
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter The Ticket No.: ");
        int x=sc.nextInt();

        if(visited.contains(x))
        {
            System.out.println("----------------------Warning---------------------------");
            System.out.println("This Ticket is Not Valid !. Ticket has been Exepired ");
            System.out.println("---------------------------------------------------------");
        }
        else if(tick.size()!=0 && tick.contains(x))
        {
            visited.add(x);
            System.out.println("-------------------------------------");
            System.out.println("This Ticket is valid for Zoo Entry");
            System.out.println("--------------------------------------");

        }
        else
        {
            System.out.println("-------------------------------------");
            System.out.println("This Ticket has been not Issued");
            System.out.println("--------------------------------------");

        }
      return;  
    }
}
