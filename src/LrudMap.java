package src;

import java.util.*;

public class LrudMap {
    public static void main(String[] args) {
        Scanner input1 = new Scanner(System.in);
        String num = input1.nextLine();
        int n = Integer.parseInt(num);
        Scanner input2 = new Scanner(System.in);
        String plans = input2.nextLine();
        String[] result = plans.split("\\s");

        //LRUD시, 좌표 변화
        int dy[] = {-1, 1, 0, 0};
        int dx[] = {0, 0, -1, 1};
        String direction[] = {"L", "R", "U", "D"};
        int x = 1, y = 1;
        int nx = 0, ny = 0;

        //R R R U D U U
        for(int i=0; i<result.length; i++) {
            for(int j=0; j<direction.length; j++) {
                if(result[i].equals(direction[j])) {
                    nx = x + dx[j];
                    ny = y + dy[j];
                }
            }
            if(nx < 1 || ny < 1 || nx > n || ny > n)
                continue;
            x = nx;
            y = ny;
        }
        System.out.println(x + " " + y);
    }
}
