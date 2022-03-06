import java.util.Scanner;

public class p9 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("Please enter celscius : ");
        int cel = inp.nextInt();
        if (cel < 5) System.out.println("You can skiing.");
        else if (cel >= 5 && cel <= 15) System.out.println("You can go cinema.");
        else if (cel > 15 && cel <= 25) System.out.println("You can do picning.");
        else System.out.println("You can swimm.");

    }
}
