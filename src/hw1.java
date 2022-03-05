import java.util.Scanner;
public class hw1 {
    public static void main(String[] args) {
        /*
            Vücut Kitle İndeksi Hesaplama
            Java ile kullanıcıdan boy ve kilo değerlerini alıp bir değişkene atayın. Aşağıdaki formüle göre kullanıcının "Vücut Kitle İndeks" değerini hesaplayıp ekrana yazdırın.
            Kilo (kg) / Boy(m) * Boy(m)
        */
        Scanner input = new Scanner(System.in);
        float kg, m;
        System.out.print("Please enter your mass :");
        kg = input.nextFloat();
        System.out.print("Please enter your height ");
        m = input.nextFloat();
        System.out.print("Your body/mass index is : "+kg/(m*m));
    }
}
