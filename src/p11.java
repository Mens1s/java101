import java.util.Scanner;
public class p11 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("Please enter month (1-Janurary..): ");
        int month = inp.nextInt();
        System.out.print("Please enter day : ");
        int day = inp.nextInt();
        if(day>=20){
            if(month==1 && day>= 22) System.out.println("Kova");
            else if(month==1)System.out.println("Oğlak");
            if(month==2) System.out.println("Balık");
            if(month==3 && day>= 21) System.out.println("Koç");
            else if(month==3) System.out.println("Balık");
            if(month==4 &&  day>=21) System.out.println("Boğa");
            else if(month==4) System.out.println("Koç");
            if(month==5 && day>=22) System.out.println("İkizler");
            else if(month==5) System.out.println("Boğa");
            if(month==6 && day>=23) System.out.println("Yengeç");
            else if(month==6) System.out.println("İkizler");
            if(month==7 && day>=23) System.out.println("Aslan");
            else if(month==7) System.out.println("Yengeç");
            if(month==8 && day>=23) System.out.println("Başak");
            else if(month==8) System.out.println("Aslan");
            if(month==9 && day>=23 ) System.out.println("Terazi");
            else if(month==9) System.out.println("Başak");
            if(month==10 && day>=23) System.out.println("Akrep");
            else if(month==10) System.out.println("Terazi");
            if(month==11 && day>=22) System.out.println("Yay");
            else if(month==11) System.out.println("Akrep");
            if(month==12 && day>=22) System.out.println("Oğlak");
            else if(month==12) System.out.println("Yay");
        }
        else{
            if(month==1) System.out.println("Kova");
            else if(month==2) System.out.println("Balık");
            else if(month==3) System.out.println("Koç");
            else if(month==4) System.out.println("Boğa");
            else if(month==5) System.out.println("İkizler");
            else if(month==6) System.out.println("Yengeç");
            else if(month==7) System.out.println("Aslan");
            else if(month==8) System.out.println("Başak");
            else if(month==9) System.out.println("Terazi");
            else if(month==10) System.out.println("Akrep");
            else if(month==11) System.out.println("Yay");
            else if(month==12) System.out.println("Oğlak");
        }
    }
}
