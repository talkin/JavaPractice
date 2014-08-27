package Practice13;

public class Reporter implements Observer {
    public String reactToGoal(String team) {

        return "Reporter: Team " + team + " scored";
    }
}
