package io.github.tplxmx96.chapter14.boodemo_v1;

import io.github.tplxmx96.chapter11.superdemo.IFly;

import javax.swing.*;

/**
 * 使用对话框升级的图书系统界面
 */
public class BookViewDialogImpl extends AbstractBookView{
    private BookBiz bookBiz = null;
    public BookViewDialogImpl(){
        bookBiz = new BookBiz();
    }

    @Override
    public String showMainView() {
//        System.out.println("\nX9图书管理系统 >> 主菜单");
//        System.out.println("1、新增图书\t2、删除图书\t3、查看所有图书\t4、按编号查询\t5、入库\t6、出库\t7、退出");
//        System.out.println("请选择:");
        String strMenu = "\nX9图书管理系统 >> 主菜单\n";
        strMenu += "1、新增图书\t2、删除图书\t3、查看所有图书\t4、按编号查询\t5、入库\t6、出库\t7、退出\n";
        strMenu += "请选择:";
        String result = JOptionPane.showInputDialog(strMenu);  //显示输入对话框
        if (result == null) result =  "7";
        return result;

    }

    @Override
    public void showOutStore() {

    }

    @Override
    public void showInStore() {

    }

    @Override
    public void showFindById() {

    }

    @Override
    public void showDelBookView() {

    }

    @Override
    public Book showAddNewBookView() {
        Book newBook = new Book();
        String bookId = null;
        String bookName = null;
        int count = -1;
        //注意：这里的三个变量输入时需要验证用户输入数据的合法性
        bookId = JOptionPane.showInputDialog("请输入图书编号:");
        bookName = JOptionPane.showInputDialog("图书名称:");
        count = Integer.parseInt(JOptionPane.showInputDialog("仓库量:"));

        newBook.setBookId(bookId);
        newBook.setBookNeam(bookName);
        newBook.setCount(count);
        if (bookBiz.addBook(newBook)){
            JOptionPane.showInputDialog(null,"添加成功！");
        }else {
            JOptionPane.showInputDialog(null,"添加失败！");
        }

        return newBook;
    }

    @Override
    public void showBooks(Book... bookArray) {

    }
}
