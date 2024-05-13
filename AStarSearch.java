import java.util.List;
import java.util.LinkedList;
import java.util.HashSet;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.PriorityQueue;

public class AStarSearch implements GraphSearchAlgorithm {

    public Path search(State start, State goal) {
        PriorityQueue<State> unexploredStatesQueue = new PriorityQueue<State>();
        sourceState.setgScore(0);
        unexploredStatesQueue.add(sourceState);
        boolean isFound = false;

        while(!unexploredStatesQueue.isEmpty() && !isFound){
            State currentState = unexploredStatesQueue.poll();
            exploredStates.add(currentState);
            if(currentState.getValue().equals(goalState.getValue())){
                isFound = true;
            }
            else if  (Edge a ; currentState.getAdjacenciesList()){
                  State startState = a.getTargetState();
            }
        }
        return Path; 
    }

}
