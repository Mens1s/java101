import java.util.Arrays;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

        /* PRACTISES */
        int[] arr = {1,11,22,22,22,55,66,77,88,1};
        System.out.println(HelperArray.average(arr));
        HelperArray.find(arr,55);
        HelperArray.star();
        HelperArray.repeat(arr);

        /* HOMEWORK 1 */
        Scanner inp = new Scanner(System.in);
        System.out.print("Please enter len of arr : ");
        int len = inp.nextInt();
        int[] arr1 = new int[len];
        for(int i = 0; i < len ; i++){
            System.out.print("Please enter "+(i+1)+". element : ");
            arr1[i] = inp.nextInt();
        }
        arr1 = HomeworkArray.sort(arr1,len);
        System.out.println(Arrays.toString(arr1));

        /* HOMEWORK 2 */
        int[] arr2 = {10, 20, 20, 10, 10, 20, 5, 20};
        HomeworkArray.repeat(arr2);

        /* HOMEWORK 3 */
        int[][] arr3 = {{2 ,3 ,4 },{5 ,6 , 4}};
        HomeworkArray.transpoz(arr3);
    }
}
