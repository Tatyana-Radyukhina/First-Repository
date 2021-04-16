import java.util.Arrays;

public class Massiv {
    public static void main(String[] args) {
        String[] str = {"a","b","c","d","e"};
        int[] massiv = {1,2,3,4,5};
        int[] massiv1 = {5,6,7,6,8};
        String[] result = new String[5];
        for (int i = 0; i < str.length; i++){
            result[i] = str[i] + massiv[i];

        }
        System.out.println(Arrays.toString(result));
        System.out.println("Hello World!");
    }
}
