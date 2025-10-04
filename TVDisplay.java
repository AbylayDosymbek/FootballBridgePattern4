public class TVDisplay implements DisplayMethod {

    @Override
    public void displayMatchDetails(String matchDetails) {
        System.out.println("Displaying on TV: " + matchDetails);
    }
}
