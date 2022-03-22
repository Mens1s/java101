import java.util.Random;
import java.util.Arrays;
import java.util.Scanner;

public class MineSweeper {
    public static void drawGame(int a, int b, char[][] bomb, char[][] opened, char[][] game, int n1, int n2){
        for(int c = 0; c < a ; c++){
            for(int d = 0; d < b; d++){
                System.out.print(game[c][d]+" ");
            }
            System.out.println("");
        }
    }
    public static void createBombs(int a, int b, char[][] bomb){
        Random rand = new Random();
        int bombCount = a*b/4;
        int[] t_bombArea = new int[bombCount];
        for(int c = 0; c < a ; c++){
            for(int d = 0; d < b ;d++){
                bomb[c][d] = '-';
            }
        }
        for(int c = 0;c<bombCount;c++){
            int t1 = rand.nextInt(a);
            int t2 = rand.nextInt(b);
            if(Arrays.asList(t_bombArea).contains(t1)){
                if(t_bombArea[t1] == t2){
                    bombCount++;
                }
                else{
                    bomb[t1][t2] = 'X';
                }
            }
            else{
                bomb[t1][t2] = 'X';
            }
        }
        System.out.println("bomba");
        for(int c = 0; c < a ; c++){
            for(int d = 0; d < b ;d++){
                System.out.print(bomb[c][d]+" ");
            }
            System.out.println("");
        }System.out.println("bomba");
    }

    public static void play(){
        int playTime = 0, fail = 0;
        Scanner inp = new Scanner(System.in);

        System.out.print("Please enter a : ");
        int a = inp.nextInt();
        System.out.print("Please enter b : ");
        int b = inp.nextInt();

        char[][] bomb = new char[a][b];
        char[][] game = new char[a][b];
        char[][] opened = new char[a][b];

        MineSweeper.createBombs(a,b,bomb);
        for(int c = 0; c < a ; c++){
            for(int d = 0; d < b; d++)game[c][d] = '-';
        }
        while(playTime<a*b) {
            System.out.print("Please enter satir : ");
            int n1 = inp.nextInt();

            System.out.print("Please enter sutun : ");
            int n2 = inp.nextInt();
            if(n1>=a ||n2>=b){
                System.out.println("please enter right numbers!");
            }
            else {
                fail = MineSweeper.findBombs(n1, n2, bomb, opened, game);
                if (fail == 1) {
                    System.out.println("PATLADIN");
                    break;
                }
                MineSweeper.drawGame(a, b, bomb, opened, game, n1, n2);
                playTime++;
            }
        }
        if(fail!=1){
            System.out.println("YOU WIN!");
        }
    }
    public static int findBombs(int n1, int n2, char[][] bomb, char[][] opened, char[][] game){
        int counter = 0;

        for(int a = 0; a < game.length; a++){
            for(int b = 0; b < game[0].length; b++){
                if(bomb[a][b] == 'X'){
                    if (n1==a && n2==b) return 1;
                    else if(n1-1 == a && n2 == b) counter++;
                    else if(n1==a && n2 == b+1) counter++;
                    else if(n1 == a && n2 == b-1) counter++;
                    else if(n1+1 == a && n2 == b) counter++;
                }
            }
        }
        System.out.println("counter : "+counter);
        System.out.println("counter char : "+ Character.forDigit(counter, 10));
        if(counter>0 )game[n1][n2] = (Character.forDigit(counter, 10));
        else game[n1][n2] = '0';
        return 0;
    }
}
