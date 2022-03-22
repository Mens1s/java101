import javax.sound.midi.Soundbank;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;
public class Main {

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        /*SAYI TAHMIN OYUNU*/

        Random rand = new Random();

        boolean isWin = false;
        boolean want = true;
        int counter;
        int guess, tempNum;
        int[] wrong = new int[5];
        while (want) {
            counter = 0;
            tempNum = rand.nextInt(100);
            do {
                System.out.print("Please enter your "+(counter+1)+". guess number : ");
                guess = inp.nextInt();

                if (guess == tempNum) {
                    System.out.println("You are WIN! in " + (counter + 1) + " try!");
                    isWin = true;
                } else {
                    if(tempNum>guess) System.out.println("Enter bigger number!");
                    else System.out.println("Enter smaller number!");
                    wrong[counter] = guess;
                }
                counter++;
                System.out.println("You can still choose "+(5-counter)+" number");
            } while (!isWin && counter < 5);
            System.out.println("Your guesses are : "+Arrays.toString(wrong)+" and number was "+tempNum);

            System.out.print("Do you want play again? 1 for yes!");
            int choice = inp.nextInt();
            if(choice!=1) want=false;
        }
   
        /*Palindromik Kelimleri Bulan Program*/

        System.out.print("Please enter your word: ");
        String str = inp.nextLine();
        int len = str.length();
        boolean control = true;
        for(int a = 0;a<len/2 && control;a++){
            if(str.charAt(a) != str.charAt(len-a-1)) control = false;
        }
        if(control) System.out.println(" polindrome!");
        else System.out.println("not polindrome!");;
    }
}
