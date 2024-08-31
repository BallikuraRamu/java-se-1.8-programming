package linear;

import java.util.Stack;

public class QueueUsingStacks {
    Stack<Integer> stack1 = new Stack<>();
    Stack<Integer> stack2 = new Stack<>();

    public void enqueue(int x) {
        stack1.push(x);
    }

    public int dequeue() {
        if (stack2.isEmpty()) {
            while (!stack1.isEmpty()) {
                stack2.push(stack1.pop());
            }
        }
        if (!stack2.isEmpty()) {
            return stack2.pop();
        } else {
            throw new RuntimeException("Queue is empty");
        }
    }

    public static void main(String[] args) {
        QueueUsingStacks queueUsingStacks = new QueueUsingStacks();
        queueUsingStacks.enqueue(1);
        queueUsingStacks.enqueue(2);
        queueUsingStacks.enqueue(3);
        System.out.println(queueUsingStacks.dequeue()); // 1
        System.out.println(queueUsingStacks.dequeue()); // 2
    }
}
