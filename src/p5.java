import java.util.Scanner;

public class p5 {
    public static void main(String[] args){
        /*
        Dairenin Alanını ve Çevresini Hesaplayan Program
        Java ile yarı çapını kullanıcıdan aldığınız dairenin alanını ve çevresini hesaplayan programı yazın.
        Alan Formülü : π * r * r;
        Çevre Formülü : 2 * π * r;

        Yarıçapı r, merkez açısının ölçüsü 𝛼 olan daire diliminin alanı bulan programı yazınız.
        𝜋  = 3.14 .
        formül : (𝜋 * (r*r) * 𝛼) / 360
        */
        Scanner input = new Scanner(System.in);
        float r;
        System.out.print("Please enter len of R : ");
        r = input.nextFloat();

        System.out.print("Please enter angle : ");
        float angle = input.nextFloat();

        System.out.println("Perimeter of circle is : "+2*3.14*r);
        System.out.println("Area of circle is : "+3.14*r*r);
        System.out.println("Area "+angle+" radius of circle is : "+3.14*r*r*angle/360);
    }
}
