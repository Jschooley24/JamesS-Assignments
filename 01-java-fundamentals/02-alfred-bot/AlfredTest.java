public class AlfredTest {
    public static void main(String[] args){
        AlfredQuotes alfredBot = new AlfredQuotes();
        String testBasicGreeting =alfredBot.basicGreeting();
        String testGuestGreeting = alfredBot.guestGreeting("John", "Evening");
        String testDateAnnouncement = alfredBot.dateAnnouncement();
        String alexisTest = alfredBot.alfredResponse("Alexis do your thing.");
        String alfredTest = alfredBot.alfredResponse("Alfred you are the best");
        String notAlfred = alfredBot.alfredResponse("I would like some pizza please");
        
        //System.out.println(alexisTest);
        //System.out.println(alfredTest);
        //System.out.println(notAlfred);
        //System.out.println(testDateAnnouncement);
        System.out.println(testGuestGreeting);
        //System.out.println(testBasicGreeting);
    }
}