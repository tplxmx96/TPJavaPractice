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
//        System.out.println(file.canExecute());//linux下有效
        if (!file.exists()){
            if (file.createNewFile())
                System.out.println("文件创建成功");
        }
        if (file.exists()){
            file.delete();  //直接删除文件，删除的时候也不用判断文件是否存在，也不报异常
            file.deleteOnExit(); //在进程结束的时候把文件删除，注意：如果当前进程重新创建文件，最终也会被删掉
            System.out.println("文件删除成功");
        }
        file.createNewFile();
        System.out.println("文件重新创建成功");
//                mkdir()创建此抽象路径名称指定的目录(及只能创建一级的目录，且需要存在父目录)
//        mkdirs()创建此抽象路径指定的目录,包括所有必须但不存在的父目录.(及科研创建多级目录，无论是否存在父目录) - 多级目录同时使用

        //使用File类创建文件
//        if (!file.exists()){//如果文件/目录不存在，就创建
//            if (file.isFile()){
//                file.createNewFile();
//                System.out.println("创建文件");
//            }else {
//                file.mkdir();//创建目录
//                System.out.println("创建目录");
//            }
//            if (file.createNewFile())
//                System.out.println("文件/文件夹创建成功");
//        }
//        //删除
//        if (file.exists()){
//            file.delete();//可以删除文件夹及文件 立即删除文件/目录
//        file.deleteOnExit(); //在程序结束的时候将文件删除
//        }


    }
}
