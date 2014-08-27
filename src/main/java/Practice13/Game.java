package Practice13;

import java.util.List;

public class Game {
    private String firstTeam;
    private String secondTeam;
    private List<Observer> observerList;

    public Game(String firstTeam, String secondTeam, List<Observer> observerList) {
        this.firstTeam = firstTeam;
        this.secondTeam = secondTeam;
        this.observerList = observerList;
    }

    public void scoreGoal(String team) {
        for(Observer observer : observerList) {
            System.out.println(observer.reactToGoal(team));
        }
    }

}
