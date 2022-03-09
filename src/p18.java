import java.util.Scanner;
public class p18 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("Please enter n : ");
        int n = inp.nextInt();
        double result = 0;
        for(int i = 1;i<=n;i++) result += 1/i;
        System.out.print("Result is : "+result);
    }
}
