import java.lang.Math;
import java.util.Scanner;

public class p3 {
    public static void main(String[] args) {
        /*
            Dik Üçgende Hipotenüs Bulan Program
            Java ile kullanıcıdan dik kenarlarının uzunluğunu alan ve hipotenüsü hesaplayan programı yazın.
            Üç kenar uzunluğunu kullanıcıdan aldığınız üçgenin alanını hesaplayan programı yazınız.
            Üç𝑔𝑒𝑛𝑖𝑛 ç𝑒𝑣𝑟𝑒𝑠𝑖 = 2𝑢
            𝑢 = (a+b+c) / 2
            Alan * Alan = 𝑢 * (𝑢 − 𝑎)* (𝑢 − 𝑏) * (𝑢 − 𝑐)
        */
        float k1,k2,k3;
        System.out.print("Please enter first value : ");
        Scanner input = new Scanner(System.in);
        k1 = input.nextFloat();

        System.out.print("Please enter second value : ");
        k2 = input.nextFloat();

        System.out.print("Please enter third value : ");
        k3 = input.nextFloat();

        float u = (k1+k2+k3)/2;
        System.out.println("Perimeter of the triangle is : "+2*u);
        System.out.println("Area of triangle is : "+Math.sqrt(u*(u-k1)*(u-k2)*(u-k3)));

    }
}
