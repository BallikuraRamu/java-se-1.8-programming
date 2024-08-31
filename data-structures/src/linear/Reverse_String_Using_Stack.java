package linear;

import java.util.Stack;
public class Reverse_String_Using_Stack {
    public static void main(String[] args) {
        String input = "Hello";
        Stack<Character> characterStack = new Stack<>();
        for (char c : input.toCharArray()) {
            characterStack.push(c);
        }
        StringBuilder stringBuilder = new StringBuilder();
        while (!characterStack.isEmpty()) {
            stringBuilder.append(characterStack.pop());
        }
        System.out.println("Reversed: " + stringBuilder);
    }
}
