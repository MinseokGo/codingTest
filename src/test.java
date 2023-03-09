package src;
import java.util.*;
public class test {
    static int calNum(int year, int month, int day) {
        return year*12*28 + month*28 + day;
    }
    public static void main(String[] args) {
        String answer = "";
        String[] survey = {"AN", "CF", "MJ", "RT", "NA"};
        int[] choices = {5, 3, 2, 7, 5};
        int[] score = new int[8];
        String type = "RTCFJMAN";
        int i=0;
        //RTCFJMAN
        System.out.println(survey[1]);
        for(String a:survey) {
            if(choices[i] > 4) {
                if(a.charAt(1) == 'R') {
                    score[0] += choices[i] - 4;
                } else if(a.charAt(1) == 'T') {
                    score[1] += choices[i] - 4;
                } else if(a.charAt(1) == 'C') {
                    score[2] += choices[i] - 4;
                } else if(a.charAt(1) == 'F') {
                    score[3] += choices[i] - 4;
                } else if(a.charAt(1) == 'J') {
                    score[4] += choices[i] - 4;
                } else if(a.charAt(1) == 'M') {
                    score[5] += choices[i] - 4;
                } else if(a.charAt(1) == 'A') {
                    score[6] += choices[i] - 4;
                } else if(a.charAt(1) == 'N') {
                    score[7] += choices[i] - 4;
                }
            } else if(choices[i] < 4) {
                if(a.charAt(0) == 'R') {
                    score[0] += 4 - choices[i];
                } else if(a.charAt(0) == 'T') {
                    score[1] += 4 - choices[i];
                } else if(a.charAt(0) == 'C') {
                    score[2] += 4 - choices[i];
                } else if(a.charAt(0) == 'F') {
                    score[3] += 4 - choices[i];
                } else if(a.charAt(0) == 'J') {
                    score[4] += 4 - choices[i];
                } else if(a.charAt(0) == 'M') {
                    score[5] += 4 - choices[i];
                } else if(a.charAt(0) == 'A') {
                    score[6] += 4 - choices[i];
                } else if(a.charAt(0) == 'N') {
                    score[7] += 4 - choices[i];
                }
            }
            i++;
        }
        for(int k=0; k<8; k++) {
            System.out.println(score[k]);
        }
        for(int j=0; j<8; j=j+2) {
            if(score[j] > score[j+1]) answer += type.charAt(j);
            else if(score[j] == score[j+1]) {
                if(type.charAt(j) > type.charAt(j+1))
                    answer += type.charAt(j+1);
                else answer += type.charAt(j);
            }
            else if(score[j] < score[j+1]) answer += type.charAt(j+1);
        }


    }
}
