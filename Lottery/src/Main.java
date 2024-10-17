import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        Lottery lottery = new Lottery();
        System.out.println("Please enter a number from 00 to 99");
        System.out.println("Be sure to only use double digits numbers!");
        Scanner scanner = new Scanner(System.in);
        int userGuess = scanner.nextInt();
        String luckyNumber = lottery.luckyNumber();
        if(String.format("%02d", userGuess).equals(luckyNumber)){

            System.out.println("The lucky number is: " + luckyNumber);
            System.out.println("Congrats you predicted the lucky number");


        } else {
            System.out.println("The lucky number is: " + luckyNumber);
            System.out.println("No match! Better luck next time!");
        }

    }
}
