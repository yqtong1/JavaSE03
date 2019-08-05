package com.yqt.date;

import java.util.Scanner;

/**
 *   从键盘上输入一个日期，输出该日期对应这一年的第几天
 *   如：
 *      输入：2009 1 10     输出：2019年1月10日是2019年的第10天
 *      输入：2009 2 10     输出：2019年2月10日是2019年的第41天
 *      输入：2009 3 10     输出：2019年3月10日是2019年的第69天
 */

public class Test {
    public static void main(String[] args) {
        //1.从键盘上输入一个日期
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入日期");
        int year = sc.nextInt();
//        int month = sc.nextInt();
        int day = sc.nextInt();

        //2.计算
      //  int sumdays = getsumDays(year, month, day);

        //3.输出该日期对应这一年的第几天
//        System.out.println(year + "年" + month + "月" + day + "日是" + year + "年的第" + sumdays + "天" );
    }

   /* public static int getsumDays(int year,int month,int day){
        return
    }
    */
}
