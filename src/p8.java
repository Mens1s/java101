import java.util.Scanner;

public class p8 {
    public static void main(String[] args) {
        int pMat, pfiz, pTr, pKm, pMz, ort = 0;
        Scanner inp = new Scanner(System.in);

        System.out.print("Enter math note : ");
        pMat = inp.nextInt();
        if (pMat <= 100 && pMat >= 0) ort += 1;
        else pMat = 0;

        System.out.print("Enter physics note : ");
        pfiz = inp.nextInt();
        if (pfiz <= 100 && pfiz >= 0) ort += 1;
        else pfiz = 0;

        System.out.print("Enter turkish note : ");
        pTr = inp.nextInt();
        if (pTr <= 100 && pTr >= 0) ort += 1;
        else pTr = 0;

        System.out.print("Enter chems note : ");
        pKm = inp.nextInt();
        if (pKm <= 100 && pKm >= 0) ort += 1;
        else pKm = 0;

        System.out.print("Enter music note : ");
        pMz = inp.nextInt();
        if (pMz <= 100 && pMz >= 0) ort += 1;
        else pMz = 0;

        System.out.println("Your average is : "+(pfiz+pMat+pKm+pMz+pTr)/ort);
    }
}
