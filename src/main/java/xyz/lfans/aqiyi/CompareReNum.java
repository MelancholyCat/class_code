package xyz.lfans.aqiyi;

import java.util.Scanner;

/**
 * @author MelancholyCat
 * @date Created in 20:36 2019-10-03
 * @description 循环数比较
 * 对于任意两个正整数x和k,我们定义repeat(x, k)为将x重复写k次形成的数,例如repeat(1234, 3) = 123412341234,repeat(20,2) = 2020.
 * 牛牛现在给出4个整数x1, k1, x2, k2, 其中v1 = (x1, k1), v2 = (x2, k2),请你来比较v1和v2的大小。
 */

public class CompareReNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x1 = sc.nextInt();
        int k1 = sc.nextInt();
        int x2 = sc.nextInt();
        int k2 = sc.nextInt();
        compareNum(x1, k1, x2, k2);
    }
    public static String compareNum(int v1,int k1,int v2,int k2){
        String s1 = "",s2="";
        while (k1>0){
            s1 += String.valueOf(v1);
            k1--;
        }
        while (k2>0){
            s2 += String.valueOf(v2);
            k2--;
        }
        if (s1.length()>s2.length()){
            return "Greater";
        }else if (s1.length()==s2.length()){
            for (int i = 0; i < s1.length(); i++) {
                if (s1.charAt(i)>s2.charAt(i)){
                    return "Greater";
                }else if (s1.charAt(i)<s2.charAt(i)){
                    return "Less";
                }if (i==s1.length()-1&&s1.charAt(i)==s2.charAt(i)){
                    return "Equal";
                }
            }
        }
        return "Less";
    }
}
