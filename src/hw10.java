import java.util.Scanner;
public class hw10 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("Please enter a number : ");
        int n = inp.nextInt();
        int temp = 0;
        int b = 1;
        for(int a = 1; a<n;a++){
            System.out.println(temp +" + "+b+" = "+(temp+b));
            int t = temp;
            temp = b;
            b += t;
        }
    }
}
