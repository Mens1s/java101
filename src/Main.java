import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        int mat,fiz,kim,tr,trh,mz;
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter mat grades : ");
        mat = input.nextInt();

        System.out.println("Please enter fiz grades : ");
        fiz = input.nextInt();

        System.out.println("Please enter kim grades : ");
        kim = input.nextInt();

        System.out.println("Please enter tr grades : ");
        tr = input.nextInt();

        System.out.println("Please enter trh grades : ");
        trh = input.nextInt();

        System.out.println("Please enter mz grades : ");
        mz = input.nextInt();

        String sonuc = (mat+fiz+kim+tr+trh+mz)/6>50  ? "Basarili!" : "Basarisiz";
        System.out.println("Sonucunuz : "+sonuc);
    }
}
