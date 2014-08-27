package Practice13;

public class Fan implements Observer {
    private String myTeam;

    public Fan(String myTeam) {
        this.myTeam = myTeam;
    }

    public String reactToGoal(String team) {
        if(team.equals(myTeam)) {
            return "Fan " + myTeam + ": Yay";
        } else {
            return "Fan " + myTeam + ": Boo";
        }

    }
}
