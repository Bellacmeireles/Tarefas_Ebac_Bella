package Modulo11.queUe;
import java.util.PriorityQueue;
import java.util.Queue;

public class ExPriorityQueue {
    public static void main(String[] args) {
        // Ordenação Natural
        Queue<String> queue = new PriorityQueue<String>();
        queue.add("Short ");
        queue.add("Very long indeed");
        queue.add("Medium ");
        while (queue.size() != 0) {
            System.out.println(queue.remove());
        }
    }
}
