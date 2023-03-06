import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;
public class wordSort {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        int N = Integer.parseInt(input);
        String strArr[] = new String[20000];

        for(int i=0; i<N; i++) {
            Scanner scanner1 = new Scanner(System.in);
            strArr[i] = scanner1.nextLine();
        }
        Arrays.sort(strArr,
                Comparator.comparingInt(String::length));
    }
}
