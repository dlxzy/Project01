package com.atguigu.java;

import com.atguigu.bean.Customer;

import java.util.ArrayList;

/**
 * @author dlxzy
 * @datetime 2019-11-29 17:21
 *
 * 1. IDEA中代码模板所处的位置：settings - Editor - Live Templates（可修改） / Postfix Completion（不可修改）
 * 2. 常用的模板
 *
 */
public class TemplatesTest {

    //模板6：prsf 私有静态常量
    private static final Customer CT = new Customer();
    //变形：psf 共有静态常量
    public static final int NUM = 0;
    //变形：psfi
    public static final int MAX = 10;
    //变形：psfs
    public static final String CODE = "200";


    //模板1：psvm
    public static void main(String[] args) {

        //模板2：sout
        System.out.println("hello moto!");
        //变形：soutp/soutm/soutv/xxx.sout
        System.out.println("args = [" + args + "]");//参数
        System.out.println("TemplatesTest.main");//方法名
        String str1 = "猪猪";
        String str2 = "大地";
        System.out.println("str2 = " + str2);//变量（就近）
        System.out.println(str1);//变量选择

        //模板3：fori
        String[] strs = new String[]{"Tom","Jerry","LiLei","Max"};
        for (int i = 0; i < strs.length; i++) {
            System.out.println(strs[i]);
        }
        //变形：iter
        for (String str : strs) {
            System.out.println("str = " + str);
        }
        //变形：itar
        for (int i = 0; i < strs.length; i++) {
            String str = strs[i];
            System.out.println(str);
        }


        //模板4：list.for
        ArrayList<String> strList = new ArrayList<>();
        strList.add("S");
        strList.add("X");
        strList.add("B");

        for (String s : strList) {
            System.out.println(s);

        }
        //变形：list.fori
        for (int i = 0; i < strList.size(); i++) {

        }
        //变形：list.forr（倒序遍历）
        for (int i = strList.size() - 1; i >= 0; i--) {

        }

        //模板5：ifn
        if (strList == null) {

        }
        //变形：inn
        if (strList != null) {

        }
        //变形：xxx.nn / xxx.null
        if (strList != null) {

        }
        if (strList == null) {

        }





    }



}
