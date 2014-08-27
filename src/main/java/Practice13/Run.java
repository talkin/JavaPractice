package Practice13;

import java.util.ArrayList;
import java.util.List;

public class Run {
    public static void main(String[] args) {
        List<Observer> observerList = new ArrayList<Observer>();
        observerList.add(new Reporter());
        observerList.add(new Fan("A"));
        observerList.add(new Fan("B"));
        observerList.add(new ScoreBoard());
        Game game = new Game("A", "B", observerList);
        game.scoreGoal("A");
        game.scoreGoal("B");
    }
}
