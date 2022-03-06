import java.util.Scanner;
public class hw5 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("Please enter a year : ");
        int year = inp.nextInt();
        if(year%4==0){
            if(year%100==0 && year%400!=0)System.out.println("This is not a leap year!");
            else System.out.println("This is a leap year!");
        }
        else System.out.println("This is not a leap year!");
    }
}
