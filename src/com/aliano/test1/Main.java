package com.aliano.test1;

import java.util.*;
public class Main {
    public static void main(String[] args)  {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            String s = sc.nextLine();
            String t = sc.nextLine();
            if(s.length() > t.length()){
                System.out.println(fun(t,s));
            } else{
                System.out.println(fun(s,t));
            }
        }

//        int[]  arr = fun("dedcecfbbbecaffedcedbadadbbfaafcafdd","bacefaebcdfabfaadebdaacabbdabcfffbdcebaabecefddfaceeebaeabebbad"); // 最大字串为:s[26],bfaa
//        // int [] arr = fun("asdfas","werasdfaswer");
//        for(int i = 0;i<arr.length;i++)
//        {
//            System.out.println(arr[i]);
//        }
        //String a  = "123";
        //System.out.println(a.substring(0,1));
        //System.out.println(a.substring(0,2));
        //System.out.println(a.substring(0,4));

    }

    public static int fun(String s,String t)
    {

        // String q = "";
        // int temp = 0;
        int len = 0;
        // int[] array = new int[s.length()];
        for(int i = 0;i < s.length();i++)
        {
//            if (i == 26)
//            {
//                System.out.println(1111);
//            }
            // temp = s.length()-i;
            // int len = 0;

            for(int j = i ;j <= s.length();j++)
            {

                if(t.contains(s.substring(i,j)))
                {
                    // q = s.substring(i,j);
                    int slength = s.substring(i, j).length();
                    if(slength > len)
                        len = slength;
                }
                else
                {
                    break;
                }
            }
            // array[i] = len;
        }
        // return array;
        // return Arrays.stream(array).max().getAsInt();
        return len;
    }
}
