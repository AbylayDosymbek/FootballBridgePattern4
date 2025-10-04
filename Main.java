//main
public class Main {
    public static void main(String[] args) {
        DisplayMethod tvDisplay = new TVDisplay();
        DisplayMethod webDisplay = new WebDisplay();
        DisplayMethod consoleDisplay = new ConsoleDisplay();

        FootballMatch liveMatch = new LiveMatch(tvDisplay);
        FootballMatch archivedMatch = new ArchivedMatch(webDisplay);

        liveMatch.displayMatchDetails();
        archivedMatch.displayMatchDetails();

        liveMatch = new LiveMatch(consoleDisplay);
        liveMatch.displayMatchDetails();
    }
}
