//puv
public class ConsoleDisplay implements DisplayMethod {

    @Override
    public void displayMatchDetails(String matchDetails) {
        System.out.println("Displaying on Console: " + matchDetails);
    }
}
