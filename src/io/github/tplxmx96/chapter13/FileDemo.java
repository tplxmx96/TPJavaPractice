package io.github.tplxmx96.chapter13;

import java.io.File;
import java.io.IOException;
import java.util.Date;

public class FileDemo {
    /** 当前操作的文件路径常量 */
    private static final String FilePath = "src/io/github/tplxmx96/chapter13/FileDemo.java";
    public static void main(String[] args) throws IOException {
        //当前工程所在的目录 new File(".");
        File file = new File(FilePath);
        System.out.println("文件/文件夹是否存在:" + file.exists());
        System.out.println("是不是一个文件:" + file.isFile());
        System.out.println("是不是一个文件夹:" + file.isDirectory());
        System.out.println("文件名/目录:" + file.getName());
        System.out.println("绝对路径:" + file.getAbsolutePath());
        System.out.println("路径:" + file.getPath());
        System.out.println("最后修改时间:" + new Date(file.lastModified()));
        System.out.println("是否隐藏:" + file.isHidden());
        System.out.println("是否可读:" + file.canRead());
        System.out.println("是否可写:" + file.canWrite());
        System.out.println("所占空间:" + file.length());

        //使用File类创建文件
        if (!file.exists()){//如果文件/目录不存在，就创建
            if (file.isFile()){
                file.createNewFile();
                System.out.println("创建文件");
            }else {
                file.mkdir();//创建目录
                System.out.println("创建目录");
            }
//            if (file.createNewFile())
//                System.out.println("文件/文件夹创建成功");
        }
//        //删除
//        if (file.exists()){
//            file.delete();//可以删除文件夹及文件
//        }

    }
}
