public class ticket{
   
    
    private int ticketId;
    private String title;
    private String description;
    private String status;
    private String createdBy;

    public ticket(int ticketId,String title,String description,String status,String createdBy){
        this.ticketId = ticketId;
        this.title = title;
        this.description = description;
        this.status = status;
        this.createdBy = createdBy;
    }

    public int getTicketId(){
        return ticketId;
    }

    public String getTitle(){
        return title;
    }

    public String getDescription(){
        return description;
    }

    public String getStatus(){
        return status;
    }

    public String getCreatedby(){
        return createdBy;
    }
     public void setStatus(String status){
        this.status = status;
    }
    @Override
    public String toString(){
        return "ID : "+ ticketId + "\n Title :"+ title + "\n Description : "+ description +" \n Status :"+ status +"\n Created by :" + createdBy;
    }
   

    
}