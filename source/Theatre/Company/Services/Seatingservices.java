package Theatre.Company.Services;

import java.util.List;

import com.companyname.command.Layout;
import com.companyname.command.Request;

public interface Seatingservices {
    
    Layout getLayout(String rawLayout);
    
    List<TheaterRequest> getTicketRequests(String ticketRequests);
    
    void processTicketRequests(Layout layout, List<Request> requests);

}
