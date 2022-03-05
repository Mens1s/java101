import java.util.Scanner;

public class p4 {
    public static void main(String[] args) {
        /*
            Taksimetre Programı
            Java ile gidilen mesafeye (KM) göre taksimetre tutarını ekrana yazdıran programı yazın.
            Taksimetre KM başına 2.20 TL tutmaktadır.
            Minimum ödenecek tutar 20 TL'dir. 20 TL altında ki ücretlerde yine 20 TL alınacaktır.
            Taksimetre açılış ücreti 10 TL'dir.
        */
        float kms;
        System.out.print("Please enter your kms that you take it : ");
        Scanner input = new Scanner(System.in);
        kms = input.nextFloat();
        double price = 10+(kms*2.20);
        price = price < 20 ? 20  : price;
        System.out.println("You have to pay : "+price+"TL.");
    }
}
