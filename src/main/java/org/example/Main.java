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

    }
}