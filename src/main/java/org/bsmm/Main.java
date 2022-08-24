package org.bsmm;

import java.util.Scanner;
import java.util.Stack;

public class Main {
    private static final Stack<Character> stack = new Stack<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the string to be evaluated: ");
        String input = scanner.nextLine().trim();

        if (isBalanced(input)) {
            System.out.println("The string is balanced.");
        } else {
            System.err.println("The string is not balanced.");
        }
    }

    public static boolean isBalanced(String string) {
        boolean isBalanced = true;
        for (int i = 0; i < string.length(); i++) {
            char charAt = string.charAt(i);
            switch (charAt) {
                case '(' -> stack.push(')');
                case '[' -> stack.push(']');
                case '{' -> stack.push('}');
                default -> isBalanced = validate(charAt);
            }
            if (!isBalanced) {
                return false;
            }
        }
        return stack.isEmpty();
    }

    private static boolean validate(char charAt) {
        if (charAt == ')' || charAt == ']' || charAt == '}') {
            return !stack.isEmpty() && charAt == stack.pop();
        }
        return true;
    }

    public static void cleanStack() {
        stack.clear();
    }
}