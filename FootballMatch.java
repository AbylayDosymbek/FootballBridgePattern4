public abstract class FootballMatch {
    protected DisplayMethod displayMethod;

    public FootballMatch(DisplayMethod displayMethod) {
        this.displayMethod = displayMethod;
    }

    public abstract void displayMatchDetails();
}
