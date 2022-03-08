import java.util.Scanner;
public class p16 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("Please enter base num : ");
        int base = inp.nextInt();
        System.out.print("Please enter exponents of num : ");
        int exp = inp.nextInt();

        int temp=base;
        for(int a = 1;a<exp;a++)base*=temp; // I started from 1 because 2^0 = 1 to this is not necessaray!
        System.out.println("Result is "+base);

    }
}
