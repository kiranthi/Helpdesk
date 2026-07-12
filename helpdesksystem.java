import java.util.ArrayList;

public class helpdesksystem {
    
    private ArrayList<ticket> tickets = new ArrayList<>();
          
    public void addTicket(ticket Ticket){
        tickets.add(Ticket);
    }

    public String viewTicket(){
        String data = "";
        for(ticket t : tickets){
            data += t + "\n\n";
    }
    return data;
}

    public String searchTicket(int id){
        for(ticket t : tickets){
            if(t.getTicketId() == id){
                return t.toString();
            }
        }
                return "Ticket not found";
        
    }

    public String updateTicketStatus(int id,String newstatus){

        for(ticket t : tickets){
            if(t.getTicketId() == id){
                   t.setStatus(newstatus);
                   return "Ticket Status updated successfully.";
                   

            }
        }
        return" Ticket is not found.";

    }
    public String deleteTicket(int id){

        for(int i = 0 ; i < tickets.size(); i++){
            if(tickets.get(i).getTicketId() == id){
                tickets.remove(i);
                return"Ticket deleted. ";
            
            }
        }
return "ticket not found";
    }
}
