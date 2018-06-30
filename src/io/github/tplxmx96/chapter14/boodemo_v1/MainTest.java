package io.github.tplxmx96.chapter14.boodemo_v1;

public class MainTest {
    public static void main(String[] args){
//        AbstractBookView bookView = new BookViewConsoleImpl();
        AbstractBookView bookView = new BookViewDialogImpl();   //使用对话框实现的图书管理系统界面
        bookView.doMainView();
    }
}
