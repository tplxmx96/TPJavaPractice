package io.github.tplxmx96.chapter13;

import javax.swing.*;
import java.io.File;
import java.io.FileFilter;
import java.io.FilenameFilter;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.util.Date;

public class FileDemo1 {
    public static void main(String[] args) throws IOException {
        //建议：不要直接使用绝对文件名。如果使用了像c:\\test.java之类的文件名，在Windows上正常运行，但不能在其他平台上运行
        //应该使用与当前目录相关的文件
        JFileChooser fileChooser = new JFileChooser(new File("."));//设置文件对话框打开时的根目录
        //让FileChooser可以选择文件夹
        fileChooser.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);
//        fileChooser.setFileFilter(new MyFlieFiletrt());
        fileChooser.showOpenDialog(null);  //显示出选择文件的对话框(null表示无父窗体)
        //建议使用时判断file是否为null，如果为null,表示用户点了取消按钮
        File file = fileChooser.getSelectedFile(); //获得用户选择的文件
        if (null == file){
            System.out.println("用户未选择任何文件，系统强制退出！");
            System.exit(0);
        }
        System.out.println("文件/文件夹是否存在:" + file.exists());
        System.out.println("是否一个文件:" + file.isFile());
        System.out.println("是否是一个文件夹:" + file.isDirectory());
        System.out.println("文件/文件夹名称:" + file.getName());
        System.out.println("文件/文件夹的绝对路径:" + file.getAbsolutePath());
        System.out.println("文件/文件夹的最后修改时间:" + new Date(file.lastModified()));
        System.out.println("文件/文件夹所占空间大小(字节)"  + file.length() / 1024 + "KB");
        System.out.println("是否可读:" + file.canRead());
        System.out.println("是否可写:" + file.canWrite());
        System.out.println("是否隐藏:" + file.isHidden());
//        System.out.println(file.canExecute());//linux下有效
        if (!file.exists()){
            if (file.createNewFile())
                System.out.println("文件创建成功！");
        }
        if (file.exists()){
            file.delete();  //直接删除文件，删除的时候也不用判断文件是否存在，也不报异常
//            file.deleteOnExit(); //在进程结束的时候把文件删除，注意：如果当前进程重新创建文件，最终也会被删掉
            System.out.println("文件删除成功！");
        }
        file.createNewFile();
        System.out.println("文件重新创建成功！");
//                mkdir()创建此抽象路径名称指定的目录(及只能创建一级的目录，且需要存在父目录)
//        mkdirs()创建此抽象路径指定的目录,包括所有必须但不存在的父目录.(及科研创建多级目录，无论是否存在父目录) - 多级目录同时使用


//        //列出当前目录下的所有文件/文件夹
//        if (file.isDirectory()){
//            System.out.println(file.getAbsolutePath() + "路径下的所有文件及文件夹:");
//            String[] fileNames = file.list(new DirFilter());
//            for (int i = 0; i < fileNames.length; i++) {
//                System.out.println(fileNames[i]);
//            }
//        }
//    }
//    static class MyFlieFiletrt extends javax.swing.filechooser.FileFilter{
//
//
//        @Override
//        public boolean accept(File f) {
//            if (f.getName().endsWith("bean")){
//                return true;
//            }
//            return false;
//        }
//
//        @Override
//        public String getDescription() {
//            return "*.*,*.bean";
//        }
//    }
//    //补充:选学
//    /**
//     * 我们自定义的文件名过滤器类，必须实现FilenameFileter接口
//     */
//    static class DirFilter implements FilenameFilter{
//
//
//        @Override
//        public boolean accept(File dir, String name) {
//            //假设我们要求只显示git为后缀的文件，过滤掉其他后缀
//            if (name.endsWith("bean")){
//                return true;
//            }
//            return true;
//        }
    }
}

