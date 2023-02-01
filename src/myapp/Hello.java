package myapp;
import java.io.Console;
public class Hello {
    
    //entry point
    public static void main(String[] args){
        //Get the console
        // declare a variable<type><name>

        Console cons = System.console();

        // Prompt the user for an input
        String input = cons.readLine("What is your name? ");
        String phone = cons.readLine("Your contact number? ");
        String strAge = cons.readLine("How old are you? ");

        int age = Integer.parseInt(strAge);


        // print the input
        System.out.printf("Hello %s. Your Phone is %s/n", input, phone);
        System.out.printf("You are %s years old!/n", strAge);
        System.out.printf("Greater than 50? %b/n"), age > 50;

        if (greaterThan)


    }
}
