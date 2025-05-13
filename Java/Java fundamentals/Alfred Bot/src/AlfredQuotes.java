import java.util.Date;
public class AlfredQuotes {

    public String basicGreeting() {
        // You do not need to code here, this is an example method
        return "Hello, lovely to see you. How are you?";
    }

    public String guestGreeting(String name) {
        return String.format("Hello %s . Lovely to see you.",name);
    }
    public String guestGreeting(String name,String dayPeriod) {
        return String.format("Good %s %s . Lovely to see you.",dayPeriod,name);
    }

    public String dateAnnouncement() {
        Date date = new Date();
        return "It is currently" + date;
    }

    public String respondBeforeAlexis(String conversation) {
        if(conversation.contains("Alexis")){
            return "Right away, sir. She certainly isn't sophisticated enough for that.";
        }else if(conversation.contains("Alfred")){
            return  "At your service. As you wish, naturally.";
        }else{
            return "Right. And with that I shall retire.";
        }

    }

    // NINJA BONUS
    // See the specs to overload the guestGreeting method
    // SENSEI BONUS
    // Write your own AlfredQuote method using any of the String methods you have learned!
}