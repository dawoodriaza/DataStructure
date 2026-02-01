package com.ga.datastructures;

import java.util.Stack;

public class Exercise2 {

    public static boolean checkExperrsion(String exp) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < exp.length(); i++) {
            char bracket = exp.charAt(i);
            if (bracket == '(' || bracket == '{' || bracket == '[') {
                stack.push(bracket);
            }
            else if (bracket == ')' || bracket == '}' || bracket == ']') {
                char open = stack.pop();
                if (open == '(' && bracket != ')') {
                    return false;
                }
                if (open == '{' && bracket != '}') {
                    return false;
                }
                if (open == '[' && bracket != ']'){
                    return false;
                }
            }
        }

        return stack.isEmpty();
    }

    public static void main(String[] args) {
        System.out.println(checkExperrsion("{[()]}"));
        System.out.println(checkExperrsion("{[(])}"));
        System.out.println(checkExperrsion("((()))"));
        System.out.println(checkExperrsion("([)]"));
        System.out.println(checkExperrsion("{[}"));
    }
}
