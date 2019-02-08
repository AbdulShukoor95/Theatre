package Theatre.Company.Command;

public class Request {

    private String name;
    private int noOfTickets;
    private boolean isCompleted;
    private int rowNumber;
    private int sectionNumber;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNoOfTickets() {
        return noOfTickets;
    }

    public void setNoOfTickets(int noOfTickets) {
        this.noOfTickets = noOfTickets;
    }

    public boolean isCompleted() {
        return isCompleted;
    }

    public void setCompleted(boolean isCompleted) {
        this.isCompleted = isCompleted;
    }
    
    public int getRowNumber() {
        return rowNumber;
    }

    public void setRowNumber(int rowNumber) {
        this.rowNumber = rowNumber;
    }

    public int getSectionNumber() {
        return sectionNumber;
    }

    public void setSectionNumber(int sectionNumber) {
        this.sectionNumber = sectionNumber;
    }
    
    public String getStatus(){
        
        String status = null;
        
        if(isCompleted){
            
            status = name + " " + "Row " + rowNumber + " " + "Section " + sectionNumber;
            
        }else{
            
            if(rowNumber == -1 && sectionNumber == -1){
                
                status = name + " " + "Call to split party.";
                
            }else{
                
                status = name + " " + "Sorry, we can't handle your party.";
                
            }
            
        }
        
        return status;
    }

}
