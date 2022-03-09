import java.util.Scanner;
public class p20 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        String username, paswd;
        int control = 3, balance = 9879;

        do {
            System.out.print("Enter username : ");
            username = inp.nextLine();
            System.out.print("Enter password : ");
            paswd = inp.nextLine();
            if(username.equals("mens1s") && paswd.equals("strongpass")){
                int choice = 1;
                while (choice != 4) {
                    System.out.println("Welcome MENS1S Bank !");
                    System.out.println("1-) Deposit Money\n2-) Withdraw Money\n3-) Check Your Balance\n4-) Exit");
                    choice = inp.nextInt();
                    switch (choice) {
                        case 1 -> {
                            System.out.print("Enter amount of deposit money : ");
                            int dMoney = inp.nextInt();
                            balance += dMoney;
                            System.out.println("Your depositing process succesfully completed!");
                        }
                        case 2 -> {
                            System.out.print("Enter amount of money :");
                            int wMoney = inp.nextInt();
                            if (wMoney > balance) System.out.println("Your balance is not enough");
                            else {
                                balance -= wMoney;
                                System.out.println("You are succesfully withdraw your money!");
                            }
                        }
                        case 3 -> System.out.println("Your Balance is " + balance);
                        case 4 -> System.out.println("Exitting!");
                        default -> System.out.println("Wrong Choice");
                    }
                }
                System.out.println("Goodbye!");
                break;
            }
            else control--;
        }while(control>0);
    }
}
