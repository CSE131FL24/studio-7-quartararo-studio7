package studio7;

public class HockeyPlayer {
    private String name;
    private int jerseyNumber;
    private boolean rightHanded;
    private int totalGoals;
    private int totalAssists;
    private int totalGames;

    public HockeyPlayer(String name, int jerseyNumber, boolean rightHanded) {
        this.name = name;
        this.jerseyNumber = jerseyNumber;
        this.rightHanded = rightHanded;
        this.totalGoals = 0;
        this.totalAssists = 0;
        this.totalGames = 0;
    }

    public void recordGame(int goals, int assists) {
        this.totalGoals += goals;
        this.totalAssists += assists;
        this.totalGames += 1;
    }

    public int getPoints() {
        return this.totalGoals + this.totalAssists;
    }

    public void setGoals(int goals) {
        this.totalGoals = goals;
    }

    public void setAssists(int assists) {
        this.totalAssists = assists;
    }

    @Override
    public String toString() {
        return "HockeyPlayer{" +
                "name='" + name + '\'' +
                ", jerseyNumber=" + jerseyNumber +
                ", rightHandedness=" + rightHanded +
                ", totalGoals=" + totalGoals +
                ", totalAssists=" + totalAssists +
                ", totalPoints=" + getPoints() +
                ", totalGames=" + totalGames +
                '}';
    }

    public static void main(String[] args) {
        HockeyPlayer test = new HockeyPlayer("Joe", 69, false);

        test.setAssists(2);
        test.setGoals(3);

        System.out.println(test);
    }
    
}
