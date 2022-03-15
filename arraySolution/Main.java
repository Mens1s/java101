import java.util.Arrays;
public class Main {

    public static void main(String[] args) {
        int[] arr = {1,11,22,22,22,55,66,77,88,1};
        System.out.println(HelperArray.average(arr));
        HelperArray.find(arr,55);
        HelperArray.star();
        HelperArray.repeat(arr);
    }
}
