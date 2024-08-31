package linear;

import java.util.LinkedList;
import java.util.Queue;

public class StackUsingQueues {
    Queue<Integer> queue1 = new LinkedList<>();
    Queue<Integer> queue2 = new LinkedList<>();

    public void push(int x){
        queue2.add(x);
        while (!queue1.isEmpty()){
            queue2.add(queue1.remove());
        }
        Queue<Integer> temp = queue1;
        queue1 = queue2;
        queue2 = temp;
    }

    public int pop(){
        if(!queue1.isEmpty()){
            return queue1.remove();
        }else {
            throw new RuntimeException("Stack is empty");
        }
    }

    public static void main(String[] args) {
        StackUsingQueues queues = new StackUsingQueues();
        queues.push(1);
        queues.push(2);
        queues.push(3);
        System.out.println(queues.pop()); // 3
        System.out.println(queues.pop()); // 2
    }
}
