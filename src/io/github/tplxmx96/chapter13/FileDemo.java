package io.github.tplxmx96.chapter13;

import java.io.File;

/**
 * 演示File类的常用方法
 */
public class FileDemo {
    /** 当前操作的文件路径常量 */
    private static final String FilePath = "src/io/github/tplxmx96/chapter13/FileDemo.java";
    public static void main(String[] args){
        //当前工程所在的根目录 new File(".");
        File file = new File(FilePath);
        System.out.println("文件/文件夹是否存在:" + file.exists());
        System.out.println("是不是一个文件:" + file.isFile());
        System.out.println("是不是一个文件夹:" + file.isDirectory());
        System.out.println("文件名/目录名:" + file.getName());
        System.out.println("绝对路径:" + file.getAbsolutePath());
        System.out.println("路径:" + file.getPath());

    }
}
