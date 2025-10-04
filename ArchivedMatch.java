//archive
public class ArchivedMatch extends FootballMatch {

    public ArchivedMatch(DisplayMethod displayMethod) {
        super(displayMethod);
    }

    @Override
    public void displayMatchDetails() {
        String matchDetails = "Archived Match: FC Arsenal vs Tottenham FC";
        displayMethod.displayMatchDetails(matchDetails);
    }
}
