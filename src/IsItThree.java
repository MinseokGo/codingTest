package src;

import java.util.*;
public class IsItThree {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String num = input.nextLine();
        int n = Integer.parseInt(num);
        int count = 0;

        for(int i=0; i<n+1; i++) {
            for(int j=0; j<60; j++) {
                for(int k=0; k<60; k++) {
                    String a = Integer.toString(i);
                    String b = Integer.toString(j);
                    String c = Integer.toString(k);
                    String d = a + b + c;
                    if(d.contains("3")) count++;
                }
            }
        }

        System.out.println(count);
    }
}
