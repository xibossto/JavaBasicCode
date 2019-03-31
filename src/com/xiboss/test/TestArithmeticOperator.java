package com.xiboss.test;

/**
 * 测试算术运算符
 * @author xiboss
 * @create 2019-03-30 18:07
 */
public class TestArithmeticOperator {
    public static void main(String[] args) {
        int a = 3;
        int b = a++;   //执行完后,b=3。先给b赋值，再自增。
        System.out.println("a="+a+"\nb="+b);
        b = ++a;   //执行完后,a=5。a先自增，再给b赋值
        System.out.println("a="+a+"\nb="+b);
    }
}
