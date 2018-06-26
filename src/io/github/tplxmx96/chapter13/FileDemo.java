package io.github.tplxmx96.chapter13;

import sun.swing.FilePane;

import java.io.File;
import java.io.IOException;
import java.util.Date;

public class FileDemo {
    /** 当前操作的文件路径常量 */
    private static final String FilePane = "src/io/github/tplxmx96/chapter13/test.dat";
    public static void main(String[] args) throws IOException {
        //当前工程所在的根目录new File(".")
        File file = new File(FilePane);
        System.out.println("文件/文件夹是否存在:" + file.exists());
        System.out.println("是否是一个文件:" + file.isFile());
        System.out.println("是否是一个文件夹:" + file.isDirectory());
        System.out.println("文件/目录名称:" + file.getName());
        System.out.println("文件/文件夹的绝对路径:" + file.getAbsolutePath());
        System.out.println("文件/文件夹的路径:" + file.getPath());
        System.out.println("文件/文件夹的最后修改时间:" + new Date(file.lastModified()));
        System.out.println("文件/文件夹所占空间大小(字节)"  + file.length() / 1024 + "KB");
        System.out.println("是否可读:" + file.canRead());
        System.out.println("是否可写:" + file.canWrite());
        System.out.println("是否隐藏:" + file.isHidden());

        //使用File类创建文件
        if (!file.exists()){//如果文件/目录不存在，就创建
//            if (file.isFile()){
//                file.createNewFile();
//                System.out.println("创建文件");
//            }else {
//                file.mkdir();//创建目录
//                System.out.println("创建目录");
//            }
            if (file.createNewFile())
                System.out.println("文件/文件夹创建成功！");
        }
        //删除
        if (file.exists()){
            file.delete();//可以删除文件夹及文件
            file.deleteOnExit(); //在程序结束的时候将文件删除
            System.out.println("文件删除成功！");
        }
        if (file.createNewFile()){
            System.out.println("文件重新创建成功！");
        }
    }
}
