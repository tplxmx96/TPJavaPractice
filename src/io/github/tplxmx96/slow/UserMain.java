package io.github.tplxmx96.slow;
/**
 *  实现用户注册功能
 *  1、用户名最多25个字符长度、不能包含空格、单双引号、问号等特殊符号
 *  2密码6-18位。只能包含字符、数字、特殊符号(下划线、@、#、￥、！)
 *  纯数字、纯字母时，密码强度都是弱(★★☆☆☆☆)
 *  数字+密码、数字+符号、数字+字母、强度为中(★★★★☆☆)
 *  同时存在三种字符，强度为强(★★★★★★)
 *  3、用户输入@符号，且只能包含一个
 *  @和。符号不能在开头，也不能在结尾
 */

import io.github.tplxmx96.datatype.StringUtil;

import java.util.Scanner;

public class UserMain {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        //以下代码实现用户注册
//        System.out.println("请输入用户名");
//        String userName = input.next();
        System.out.println("请输入密码");
        String password = input.next();
        System.out.println(StringUtil.validatePassword(password));
//        System.out.println("请输入电子邮箱地址");
//        String email = input.next();
    }
}
