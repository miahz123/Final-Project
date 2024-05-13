import java.util.List;
import java.util.LinkedList;
import java.util.HashSet;
import java.util.ArrayList;
import java.util.Iterator;


public class DepthFirstSearch implements GraphSearchAlgorithm {

    public Path search(Vertex<start> startVertex, State goal) {
        Deque <Vertex<start>> stack = new LinkedList<>();
        stack.Push(startVertex);
        while (!stack.isEmpty()){
            Vertex<start> current = stack.pop();
            if (!current.isVisited()){
                current.setVisited(true);
                system.out.print(current);
            }
        }
        return State start, State goal;
    }

}
