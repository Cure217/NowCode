package com.aliano.test2;

import java.util.*;
public class Main {
    public static void main(String[] args)  {
//        Scanner sc = new Scanner(System.in);
//        while(sc.hasNext()){
//            String s = sc.nextLine();
//            String t = sc.nextLine();
//            if(s.length() > t.length()){
//                System.out.println(fun(t,s));
//            } else{
//                System.out.println(fun(s,t));
//            }
//        }
        System.out.println(fun("dedcecfbbbecaffedcedbadadbbfaafcafdd","bacefaebcdfabfaadebdaacabbdabcfffbdcebaabecefddfaceeebaeabebbad"));
    }

    public static int fun(String s,String t){
        int len = 0;
        for(int i = 0;i < s.length();i++){
            for(int j = i + 1;j <= s.length()-i;j++){
                if(t.contains(s.substring(i,j))){
                    if(s.substring(i,j).length() > len)
                        len = s.substring(i,j).length();
                } else{
                    break;
                }
            }
        }
        return len;
    }
}