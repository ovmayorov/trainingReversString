package org.example;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
// WRITE THE REVERSESTRING METHOD HERE //
    public static String reverseString(String str){
        Stack myStack = new Stack<>();

        for(int i = 0; i < str.length(); i++){
            myStack.push(str.charAt(i));
        }
        String reversedString = "";
        while(!myStack.isEmpty()){
            reversedString = reversedString + myStack.pop();
        }


        return reversedString;
    }

    public static boolean isBalancedParentheses(String str){
        Stack<Character> myStack = new Stack();
        for(int i = 0; i < str.length(); i++ ){
            myStack.push(str.charAt(i));
        }
        if(myStack.isEmpty()) return false;
        Character x = str.charAt(0);
        if(x.equals(')')) return false;
        for(int i = 0; i < str.length(); i++ ){
            char c = myStack.pop();
            if(str.charAt(i) == c) {
                return false;
            }
        }
        return true;
        /*
        Stack<Character> stack = new Stack<>();
        for (char p : parentheses.toCharArray()) {
            if (p == '(') {
                stack.push(p);
            } else if (p == ')') {
                if (stack.isEmpty() || stack.pop() != '(') {
                    return false;
                }
            }
        }
        return stack.isEmpty();
         */
    }

    public static void testAndPrint(String testStr, boolean expected) {
        // Run the test and store the result
        boolean result = isBalancedParentheses(testStr);

        // Print the test string, expected result, and actual result
        System.out.println("Test String: " + testStr);
        System.out.println("EXPECTED: " + expected);
        System.out.println("RESULT: " + result);

        // Check if the test passed or failed
        if (result == expected) {
            System.out.println("STATUS: PASS");
        } else {
            System.out.println("STATUS: FAIL");
        }

        // Print a separator for better readability
        System.out.println("--------------");
    }

    public static void main(String[] args) {
        // Press Alt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
        System.out.printf("The reverseString method takes a single parameter String, " +
                "\nwhich is the string you want to reverse.\n" +
                "\nReturn a new String with the letters in reverse order.");



        String myString = "hello";
        System.out.println("\nOriginal string: " + myString);
        String reversedString = reverseString(myString);
        System.out.println("\nReversed string:");
        System.out.println(reversedString);

        /*
            EXPECTED OUTPUT:
            ----------------
            olleh
        */

        testAndPrint("()", true);
        testAndPrint("()()", true);
        testAndPrint("(())", true);
        testAndPrint("()()()", true);
        testAndPrint("(()())", true);
        testAndPrint(")()(", false);
        testAndPrint(")(", false);
        testAndPrint("(()", false);
        testAndPrint("))", false);
        testAndPrint("(", false);
        testAndPrint(")", false);

    }
}