package com.xiboss.test.homework.chapter_2;

/**
 * 银行利率表如下表所示，请计算存款10000元，活期1年、活期2年，定期1年，定期2年后的本息合计。
 * @author xiboss
 * @create 2019-03-31 9:46
 */
public class Question_2 {
    public static void main(String[] args) {
        //定义本金
        double principle = 10000 ;
        System.out.println("本金："+principle);
        System.out.println("活期1年本金总计："+Math.round(principle+principle*(0.35/100)));
        System.out.println("定期1年本金总计："+Math.round(principle+principle*(1.5/100)));
        System.out.println("活期2年本金总计："+Math.round(principle+principle*(0.35/100)*2));
        System.out.println("定期2年本金总计："+Math.round(principle+principle*(2.1/100)*2));
    }
}
