import java.util.Scanner;
public class hw2 {
    public static void main(String[] args){
        /*
            Manav Kasa Programı
            Java ile kullanıcıların manavdan almış oldukları ürünlerin kilogram değerlerine göre toplam tutarını ekrana yazdıran programı yazın.
            Meyveler ve KG Fiyatları
            Armut : 2,14 TL Elma : 3,67 TL Domates : 1,11 TL Muz: 0,95 TL Patlıcan : 5,00 TL
        */
        Scanner input = new Scanner(System.in);
        double ar = 2.14, el = 3.67, dom = 1.11, mz = 0.95, pat = 5.0;

        System.out.print("how many kilos of pear : ");
        ar *= input.nextFloat();

        System.out.print("how many kilos of apple : ");
        el *= input.nextFloat();

        System.out.print("how many kilos of tomatto : ");
        dom *= input.nextFloat();

        System.out.print("how many kilos of banana : ");
        mz *= input.nextFloat();

        System.out.print("how many kilos of aubergine : ");
        pat *= input.nextFloat();

        System.out.print("The amount you have to pay : "+(ar+el+dom+mz+pat));

    }
}
