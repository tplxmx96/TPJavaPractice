package io.github.tplxmx96.chapter14.boodemo_v1;

import io.github.tplxmx96.chapter11.superdemo.IFly;

import java.io.*;

/**
 * 文件工具类，包含对文件的读写静态方法，方便使用
 */
public class FileUtil {
    /** 用来进行读写操作的图书信息文件路径 */
    private static final String BookFile = "src/io/github/tplxmx96/chapter14/boodemo_v1/BookInfo.dat";
    /** 用来分割属性的分隔符，默认是英文逗号 */
    private static final String SepAttr = ",";
    /** 默认的行的分隔符 */
    private static final String SepLine = System.getProperty("line.separator");
    /**
     * 将传入的图书对象数组写入到文件中
     * 注意：本方法会将图书仓库数组中的内容全新的写入到文件中(覆盖操作)
     * @param bookArray
     */
    public static void SaveBooks(Book ...bookArray){
        if (bookArray == null || bookArray.length== 0)return;
        BookBiz bookBiz = new BookBiz();
        File bookFile = new File(BookFile);
        if (!bookFile.exists())
          try{
            bookFile.createNewFile();
          } catch (IOException e) {
              e.printStackTrace();
          }
          try(FileWriter fout = new FileWriter(bookFile,false); //不追加，会覆盖当前文件
              BufferedWriter out = new BufferedWriter(fout)
          ){
            StringBuffer content = new StringBuffer();
            int bookCount = bookBiz.getBookCount(bookArray);  //获得传入图书数组中的图书对象个数(不为null的)
            for (int i = 0;i < bookCount;i++){  //这里暂时实现的是简单的属性拼接
                content.append(bookArray[i].getBookId());  content.append(SepAttr);
                content.append(bookArray[i].getBookNeam());  content.append(SepAttr);
                content.append(bookArray[i].getCount());   content.append(SepLine);  //一行结束，就拼接行的分隔符
            }
//            将字符串写入到文件
              out.write(content.toString() );
          } catch (FileNotFoundException e) {
              e.printStackTrace();
          } catch (IOException e) {
              e.printStackTrace();
          }
    }

}
