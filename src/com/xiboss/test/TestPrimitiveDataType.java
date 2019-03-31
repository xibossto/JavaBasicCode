package com.xiboss.test;


/**
 * 测试字符类型
 * @author xiboss
 * @create 2019-03-30 17:58
 */
public class TestPrimitiveDataType {
    public static void main(String[] args) {
        char a = 'X' ;
        char b = '磊';
        char c = '\u0061' ;
        System.out.println(c);
        System.out.println(a);
        System.out.println(b);

        //转义字符
        System.out.println(""+'a'+'\n'+'b');
        System.out.println(""+'a'+'\t'+'b');
        System.out.println(""+'a'+'\''+'b');        //a'b
    }
}
