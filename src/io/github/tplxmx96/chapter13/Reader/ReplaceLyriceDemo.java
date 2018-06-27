package io.github.tplxmx96.chapter13.Reader;

import java.io.*;

/**
 * 修改歌词中的内容
 */
public class ReplaceLyriceDemo {
    //注意：这里的dat后缀名是随便起的！
    static final String FilePath ="src/io/github/tplxmx96/chapter13/Reader/lyric.dat";
    public static void main(String[] args){
        //使用字符流进行操作
        Reader reader = null;
        BufferedReader bReader = null;
        Writer writer = null;
        BufferedWriter bWriter = null;
        StringBuffer lyric = new StringBuffer();
        try {
            reader = new FileReader(FilePath);
            bReader = new BufferedReader(reader);
            String line = null;
            while ((line=bReader.readLine()) !=null){
                lyric.append(line);
                lyric.append(System.getProperty("line.separator"));//拼接一个系统默认的分隔符win-\r\n

            }
            String newLyric = lyric.toString().replaceAll("(女)","女:").replaceAll("男","男:");
            //将歌词写入文件
            writer = new FileWriter(FilePath);
            bWriter = new BufferedWriter(writer);
            bWriter.write(newLyric);
            System.out.println("已替换成功!");

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                bReader.close();
                reader.close();
//                bWriter.flush();
                bWriter.close();
                writer.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
