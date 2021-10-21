package zoo;
import java.util.*;
import java.io.*;

public class Zoo {

  
    public static void main(String[] args) {
        
        Ticket ob1=new PurchaseTicket();
        Validate ob2=new ValidateTicket();

        System.out.println("        WELCOME TO ZOO      ");
        Scanner sc= new Scanner(System.in);

            while(true)
            {
                System.out.println("----------Zoo Menu---------");
                System.out.println("----------------------------");
                System.out.println("1. Purchase Ticket");
                System.out.println("2. Validate Ticket");
                System.out.println("3. Exit ");
                System.out.println("----------------------------");

                System.out.print("Enter valid Number: ");
                int x=sc.nextInt();
                System.out.println("----------------------------");
                System.out.println();
                

                if(x==3)
                    break;
                else
                switch(x)
                {
                    case 1: ob1.billing();
                        break;
                    case 2: ob2.check();
                        break;
                    default: System.out.println("Wrong Entered Number !");
                }


            }    
            
        
        sc.close();
    }
    
}
