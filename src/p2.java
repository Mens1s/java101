import java.util.Scanner;
public class p2 {
    public static void main(String[] args) {
        /*
        KDV Tutarı Hesaplayan Program
        Java ile kullanıcıdan alınan para değerinin KDV'li fiyatını ve KDV tutarını hesaplayıp ekrana bastıran programı yazın.
        (Not : KDV tutarını 18% olarak alın)
        KDV'siz Fiyat = 10;
        KDV'li Fiyat = 11.8;
        KDV tutarı = 1.8;
        Ödev
        Eğer girilen tutar 0 ve 1000 TL arasında ise KDV oranı %18 , tutar 1000 TL'den büyük ise KDV oranını %8 olarak KDV tutarı hesaplayan programı yazınız.
        */
        float iPrice;
        Scanner input = new Scanner(System.in);

        System.out.print("Please enter price of product : ");
        iPrice = input.nextFloat();
        System.out.println("Our old price is : "+iPrice);
        double tax =  iPrice<=1000 ? iPrice * 0.18: iPrice*0.08;
        double nPrice = tax+iPrice;
        System.out.println("Our tax is : "+tax);
        System.out.println("Our new price is : "+nPrice);
    }
}