package Practice13;

public class ScoreBoard implements Observer{

    public String reactToGoal(String teamA, String teamB) {
        return "ScoreBoard : A:B = 1:1";
    }

    @Override
    public String reactToGoal(String team) {
        return null;
    }
}
