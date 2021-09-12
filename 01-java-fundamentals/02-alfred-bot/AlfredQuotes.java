import java.util.Date;

public class AlfredQuotes {
    //basic greeting
    public String basicGreeting() {
        return "Hello!! Nice to meet you.";
    }
    public String guestGreeting(String name, String dayPeriod){
        String timeOfday = String.format("Hi %s,What a lovely %s it is.",name,dayPeriod);
        return timeOfday;
        
    }
    public String dateAnnouncement() {
        Date date = new Date();
        return "Todays date is: " + date;
    }
    public String alfredResponse(String conversation) {
        if(conversation.indexOf("Alexis") > -1) {
            return "She is unavailable.";
        }
        if(conversation.indexOf("Alfred") > -1) {
            return"At your service sir.";
        }
        return "So, I shall retire then.";
        //String alfred = "Right away sir, Alfred at your service";
        //String alexis = "Sorry sir Alexis is not available";
        //String alfedResponseOne = alfred.indexOf("Alfred");
        
        
    
    
    }
    
}
