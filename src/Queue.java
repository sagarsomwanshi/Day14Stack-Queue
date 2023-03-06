import java.util.LinkedList;
import java.util.Stack;

public class Queue {

    public static void main(String[] args) {
        java.util.Queue<Integer> queue = new LinkedList<>();

        queue.offer(56);
        queue.offer(30);
        queue.offer(70);
        System.out.println(queue);
        int size = queue.size();
        for(int i =0; i<size;i++) {
            System.out.println("dequeue operation using poll class: "+queue.poll() );
        }
        System.out.println("Queue After dequeue :"+queue);
    }
}
