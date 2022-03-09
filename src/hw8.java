import java.util.Scanner;
public class hw8 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("Please enter n :");
        int n = inp.nextInt();
        for(int a = 0; a < n;a++){
            for(int b = 0;b<2*n;b++){
                if(b<=a) System.out.print(" ");
                else if (b<=n-a)System.out.print("*");
            }
            System.out.println();
        }
    }
}
