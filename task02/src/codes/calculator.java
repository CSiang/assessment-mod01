package codes;

import java.io.Console;

public class calculator {
    public static void main(String[] args) {

        Console cons = System.console();

        System.out.println("Welcome.");

        Boolean exit = false;
        String input;
        String[] items;
        float $last=0.0f, opn1=0.0f, opn2=0.0f;

        while(!exit) {
            input = cons.readLine("> ");

            if(input.equals("exit")) {
                System.out.println("Bye bye");
                exit = true;
            } else {
            items = input.trim().split(" ");

            // To check if input format is correct
            if (items.length==3) {

                if (!((items[0].equals("$last")) || (items[2].equals("$last")))) {
                    opn1 = Float.parseFloat(items[0]);
                    opn2 = Float.parseFloat(items[2]);

                } else if ((items[0].equals("$last")) || (items[2].equals("$last"))) { 
                    
                    if((items[0].equals("$last")) && (items[2].equals("$last"))) {
                        opn1 = $last;
                        opn2 = $last;

                    } else if (items[2].equals("$last")) {
                        opn1 = Float.parseFloat(items[0]);
                        opn2 = $last;

                    } else if (items[0].equals("$last")) {
                        opn1 = $last;
                        opn2 = Float.parseFloat(items[2]);
                    }
                }
                
                items[1] = items[1].toLowerCase();

                switch (items[1]) {
                    case "+":
                        $last = opn1 + opn2;
                        break;
    
                    case "-":
                        $last = opn1 - opn2;
                        break;
                    
                    case "x":
                    $last = opn1 * opn2;
                    break;
                    
                    case "*":
                    $last = opn1 * opn2;
                    break;
    
                    case "/":
                        $last = opn1 / opn2;
                        break;
    
                    default:
                        System.out.println("Invalid input, input must consist of integer space operator space integer.");
                        System.out.println("Valid operators are + - * //.");
                } // end of switch

                System.out.printf("%.2f\n",$last);

        } else {
            System.out.println("Invalid input, input must consist of integer space operator space integer.");
            System.out.println("Valid operators are + - * //.");

        }
        } // end of if
        }// end of while


    }
}
