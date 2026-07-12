import java.util.Scanner;

public class main {
    
    public static void main(String[] args) {
        
       helpdesksystem helpdesk = new helpdesksystem();
        
       Scanner sc = new Scanner(System.in);

       while(true){
        System.out.println("\n 1.Create \n 2.View Ticket \n 3.Search Ticket \n 4.Update Ticket \n 5.Delete Ticket \n 6.Exit");
        System.out.println("Enter your choice :");
         int choice = sc.nextInt();
         sc.nextLine();
         if(choice == 1){
            System.out.println("Enter ID:");
            int id = sc.nextInt();
            sc.nextLine();

            System.out.println("Enter title :");
            String title = sc.nextLine();

            System.out.println("Enter Description : ");
            String description = sc.nextLine();

            System.out.println("Enter Status (open/closed):");
            String status = sc.nextLine();

            System.out.println("Enter Created by:");
            String creator = sc.nextLine();

            ticket t1 = new ticket(id, title, description, status, creator);
            helpdesk.addTicket(t1);

            System.out.println("Ticket added successfully :");

         }
         if(choice == 2){
           System.out.println("\nTicktes : ");
            helpdesk.viewTicket();
         }

         if(choice == 3){
            System.out.println("Enter your id : ");
            int id = sc.nextInt();
            sc.nextLine();
            helpdesk.searchTicket(id);
         }

         if(choice == 4){
            System.out.println("Enter ticket ID :");
            int id = sc.nextInt();
            sc.nextLine();
            System.out.println("Enter your Status :");
            String newstatus = sc.nextLine();
            helpdesk.updateTicketStatus(id,newstatus);

         }

         if(choice == 5){
            System.out.println("Enter ticket ID :");
            int id = sc.nextInt();
            sc.nextLine();
            helpdesk.deleteTicket(id);
         }

         if(choice == 6){
            System.out.println("Exiting.....");
            sc.close();
            break;
         }
        }
    }
}
