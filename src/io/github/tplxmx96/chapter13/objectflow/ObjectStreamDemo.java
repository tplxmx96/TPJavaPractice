package io.github.tplxmx96.chapter13.objectflow;

import java.io.*;

/**
 * 对象的序列化和反序列化操作
 * 前提：对象必须实现Serializable接口(序列化接口)
 */
public class ObjectStreamDemo{
    private static final String FilePath = "src/io/github/tplxmx96/chapter13/Reader/Object.dat";
    public static void main(String[] args){
        Player player1 = new Player("我的世界你不懂",99);

        //使用对象流将序列化的对象写入到文件中  序列化
        try(
                FileOutputStream fOutStream = new FileOutputStream(FilePath);
                ObjectOutputStream objOutStream = new ObjectOutputStream(fOutStream)
        ){
            objOutStream.writeObject(player1);
            System.out.println("对象写入成功");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        //从文件中读取对象内容，转换成我们可操作的对象   反序列化
        try(
            FileInputStream fInStream = new FileInputStream(FilePath);
            ObjectInputStream objInStream = new ObjectInputStream(fInStream)
        ){
            Player player2 = (Player)objInStream.readObject();
            System.out.println("读取出的对象内容："+ player2);
            System.out.println(player1 == player2); //注意：这里比较的是两个对象的地址
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

    }
}

class Player implements Serializable {
    private static final long serialVersionUID = 421569974961829571l;

    private String nickName;
    private int lelel;

    public Player(){}

    public Player(String nickName,int lelel){
        setNickName(nickName);
        setLelel(lelel);
    }

    @Override
    public String toString() {
        return nickName + "\t" +  lelel;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public int getLelel() {
        return lelel;
    }

    public void setLelel(int lelel) {
        this.lelel = lelel;
    }
}
