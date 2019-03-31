package com.xiboss.test.homework.chapter_2;

import java.util.Scanner;

/**
 * 某个公司采用公用电话传递数据，数据是四位的整数，在传递过程中是加密的
 * 加密规则如下：每位数字都加上5,然后用和除以10的余数代替该数字，再将第一位和第四位交换，第二位和第三位交换
 * @author xiboss
 * @create 2019-03-31 10:05
 */
public class Question_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in) ;
        System.out.print("请输入一个4位的整数：");
        int a = scanner.nextInt() ;

        int a1=((((a%1000)%100)%10)+5)%10;  //最后的%10是为了获取四位整数的个位
        int a2=((((a%1000)%100)/10)+5)%10;	//获取四位整数的十位
        int a3=(((a%1000)/100)+5)%10;	//获取四位整数的百位
        int a4=((a/1000)+5)%10;	//获取四位整数的千位

        System.out.println(a1);
        System.out.println(a2);
        System.out.println(a3);
        System.out.println(a4);

        System.out.println("加密后的数字为："+a1+a2+a3+a4);
    }
}
