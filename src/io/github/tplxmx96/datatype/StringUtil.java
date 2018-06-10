package io.github.tplxmx96.datatype;

/**
 * 字符串的工具栏，封装了常用字符串的判断方法
 */

public class StringUtil {
    /**
     * 判断传入的用户字符串是否是合法的用户名
     * 用户名最多25个字符长度、不能包含空格、单双引号、问号等特殊符号
     * @param userName
     * @return
     */
    public static boolean isCorrctUserName(String userName){
        boolean isCorrct = true;
        if (userName == null) return false;
        if (userName.length() > 25) return false;
        char[] unValidChar = {' ','\'','"','?','<','>',','};
        for (char ch : unValidChar){
            if (userName.contains(Character.toString(ch)));
            isCorrct = false;
            break;
        }

        return isCorrct;
    }

    /**
     * 密码6-18位。只能包含字符、数字、特殊符号(下划线、@、#、￥、！)
     * 纯数字、纯字母时，密码强度都是弱(★★☆☆☆☆)
     * 数字+密码、数字+符号、数字+字母、强度为中(★★★★☆☆)
     * 同时存在三种字符，强度为强(★★★★★★)
     * @param password
     * @return 如果返回值为"",那么密码的验证失败，验证成功，则返回星号表示密码的强度
     */
    public static String validatePassword(String password){
        String power = "";//密码的强度，
        if (password == null) return power;
        if (password.length() < 6 ||password.length() > 18) return power;
        //密码中合法的组成部分
//        String[] correctPart = {"_","@","#","$","!"};
        String part = "_@#$!";
        for (int i = 0; i < power.length(); i++) {
            if (Character.isLetterOrDigit(password.charAt(i))){
                //如果表示字母或者数字，并且也不是合法的特殊符号，就证明是非法的格式
                if (part.contains(Character.toString(password.charAt(i)))){
                    return power;
                }
            }
        }
        //下面开始判断密码的强度
        if (isDigit(password) || isLetter(password)){
            power = "★★☆☆☆☆";
        }else if (isDigitAndLetter(password)){
            power = "★★★★☆☆";
        }else if (isContainsSymble(password)){
            power = "★★★★★★";
        }
        return power;
    }
    private boolean isDigitAndSymble(String value){
        for (int i = 0; i < value.length(); i++) {
            if (!(Character.isDigit(value.charAt(i)) || Character.isLetter(value.charAt(i)) || "_@#$!".contains(Character.toString(value.charAt(i))))){
                return false;
            }
        }
        return true;
    }
    /**
     * 字符串中包含合法的字母和数字
     * @param value
     * @return
     */
    public static boolean isDigitAndLetter(String value){
        for (int i = 0; i < value.length(); i++) {
            if (!Character.isLetterOrDigit(value.charAt(i))){
                return false;
            }
        }
        return true;
    }

    /**
     * 判断一个字符串是不是一个纯数字
     * @param value
     * @return
     */
    private static boolean isDigit(String value){
        for (int i = 0; i < value.length(); i++) {
            if (Character.isDigit(value.charAt(i))){
                return false;
            }
        }
        return true;
    }
    /**
     * 判断一个字符串是不是纯字母组成的
     * @param value
     * @return
     */
    private static boolean isLetter(String value){
        for (int i = 0; i < value.length(); i++) {
            if (Character.isLetter(value.charAt(i))){
                return false;
            }
        }
        return true;
    }

    /**
     * 判断字符串中是否包含合法的特殊符号
     * @param value
     * @return
     */
    private static boolean isContainsSymble(String value){
        String part = "_@#$!";
        for (int i = 0; i < value.length(); i++) {
            if (part.contains(Character.toString(value.charAt(i)))){
                return true;
            }
        }
        return false;
    }
//    3、用户输入@符号，且只能包含一个
//    @和.符号不能在开头，也不能在结尾
}
