import java.util.Scanner;
public class hw3 {
    public static void main(String[] args) {
        /*
        Java ile mesafeye ve şartlara göre uçak bileti fiyatı hesaplayan programı yapın. Kullanıcıdan Mesafe (KM), yaşı ve yolculuk tipi
        (Tek Yön, Gidiş-Dönüş) bilgilerini alın. Mesafe başına ücret 0,10 TL / km olarak alın. İlk olarak uçuşun toplam fiyatını hesaplayın ve
         sonrasında ki koşullara göre müşteriye aşağıdaki indirimleri uygulayın ;

        Kullanıcıdan alınan değerler geçerli (mesafe ve yaş değerleri pozitif sayı, yolculuk tipi ise 1 veya 2) olmalıdır. Aksi takdirde kullanıcıya "Hatalı Veri Girdiniz !"
        şeklinde bir uyarı verilmelidir.

        Kişi 12 yaşından küçükse bilet fiyatı üzerinden %50 indirim uygulanır.
        Kişi 12-24 yaşları arasında ise bilet fiyatı üzerinden %10 indirim uygulanır.
        Kişi 65 yaşından büyük ise bilet fiyatı üzerinden %30 indirim uygulanır.
        Kişi "Yolculuk Tipini" gidiş dönüş seçmiş ise bilet fiyatı üzerinden %20 indirim uygulanır.
        */

        Scanner inp = new Scanner(System.in);

        System.out.print("Enter your age : ");
        int age = inp.nextInt();

        System.out.print("Please enter your kms : ");
        int kms = inp.nextInt();

        System.out.print("Enter your flying type 1 => One line 2 => Two line    ");
        int type = inp.nextInt();

        if(age<0 || kms <0 || type>2 || type<=0) System.out.println("Hatali veri girdiniz!");
        else{
            double price = kms*type*0.1;
            if(age<12) price *= 0.5;
            else if(age<=24) price *= 0.9;
            else if(age>65) price *=0.7;
            if(type==2) price*=0.8;
            System.out.println("Your price is : "+price);
        }
    }
}
