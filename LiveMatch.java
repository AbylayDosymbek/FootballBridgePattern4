public class LiveMatch extends FootballMatch {

    public LiveMatch(DisplayMethod displayMethod) {
        super(displayMethod);
    }

    @Override
    public void displayMatchDetails() {
        String matchDetails = "Live Match: FC Barcelona vs Real Madrid";
        displayMethod.displayMatchDetails(matchDetails);
    }
}
