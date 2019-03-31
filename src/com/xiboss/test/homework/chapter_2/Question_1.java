package com.xiboss.test.homework.chapter_2;

import java.util.Scanner;

/**
 * 输入圆形半径，求圆形的周长和圆形的面积，并将结果输出。
 * @author xiboss
 * @create 2019-03-31 9:40
 */
public class Question_1 {

    public static void main(String[] args) {
        //定义圆周率
        final double p = 3.14 ;
        Scanner scanner = new Scanner(System.in) ;
        System.out.println("请输入圆的半径：");
        double r = scanner.nextDouble() ;       //输入半径
        System.out.println("该圆的半径为：R="+r);
        System.out.println("该圆的周长为：C=2*3.14*12.5="+2*p*r);
        System.out.println("该圆的面积为：C=3.14*12.5*12.5="+p*r*r);
    }
}
