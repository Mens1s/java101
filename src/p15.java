import java.util.Scanner;
public class p15 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("Pleas enter n : ");
        int n = inp.nextInt();
        System.out.print("Please enter r : ");
        int r = inp.nextInt();

        int resN = 1;
        for(int b = 1; b<=n;b++) resN *= b;

        int resR = 1;
        for(int b = 1; b<=r;b++) resR *= b;

        int resNmR = 1;
        for(int b = 1; b<=(n-r);b++) resNmR *= b;

        System.out.println("Our result is : "+resN/(resR*resNmR));
    }
}
