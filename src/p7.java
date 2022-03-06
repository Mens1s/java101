import java.util.Scanner;

public class p7 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        String username = "mens1s", paswd = "nothingsecret";

        String inuser, inpass;

        System.out.print("Username : ");
        inuser = inp.nextLine();

        System.out.print("Password : ");
        inpass = inp.nextLine();

        if(inuser.equals(username)){
            if(!inpass.equals(paswd)){
                System.out.println("Password is incorrect!\n1-)Reset Password\n2-) Exit");
                int choice = inp.nextInt();

                switch (choice) {
                    case 1 -> {
                        System.out.print("Please enter your new password: ");
                        String nPass = inp.next();
                        if (nPass.equals(paswd))
                            System.out.println("Your new password cannot be same with old password!");
                        else {
                            paswd = nPass;
                            System.out.println("Your new password is setted! Your new password is : " + paswd);
                        }
                    }
                    case 2 -> System.out.println("Exitting!");
                    default -> System.out.println("Wrong typing! Program is clossing!");
                }
            }
            else{
                System.out.println("Giriş basarili !");
            }
        }
        else System.out.println("Your username is wrong!");
    }
}
