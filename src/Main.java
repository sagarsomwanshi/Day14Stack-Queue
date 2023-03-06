import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(70);
        stack.push(30);
        stack.push(56);
        System.out.println(stack);
        int size = stack.size();

    for(int i =0; i<size;i++) {
    System.out.println("peek operation :"+stack.peek());
        System.out.println("pop operation : "+stack.pop() );
    }
        System.out.println("Stack After performing peek & pop operation :"+stack);
        System.out.println("Is Stack Empty : "+stack.empty());

    }
}