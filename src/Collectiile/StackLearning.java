package Collectiile;

import java.util.Stack;

public class StackLearning {

    public static void main(String[] args) {

        Stack<String> stack = new Stack<>();
        stack.push("Dodan");
        stack.push("Marius");
        stack.push("Andi");
        System.out.println(stack.peek());
        System.out.println(stack);
        stack.add("Marian");
        System.out.println(stack);

        stack.pop();
        System.out.println(stack);
    }
}
