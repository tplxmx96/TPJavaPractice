package io.github.tplxmx96.chapter14.boodemov1;

import java.util.Scanner;

/**
 * 图书系统的视图 - 啤酒妹
 */
public class BookView {
    private Scanner input = null;
    private BookBiz bookBiz = null;

    public BookView(){
        input = new Scanner(System.in);
        bookBiz = new BookBiz();

        System.out.println("******************************");
        System.out.println("\t欢迎使用X9图书管理系统");
        System.out.println("\t1、登录\t\t2、退出系统");
        System.out.println("******************************");
        System.out.print("请选择：");
        String choice =input.next();
        if ("1".equals(choice)){
            //执行登录操作
            //如果验证成功，就显示主菜单
            System.out.println("登录功能暂未实现，默认已登录\n");
            showMainView();
        }
        System.out.println("X9图书系统以成功退出，欢迎再次使用！");
    }
    public void showMainView(){
        System.out.println("\nX9图书管理系统 >> 主菜单");
        System.out.println("1、新增图书\t2、删除图书\t3、查看所有图书\t4、按编号查询\t5、入库\t6、出口\t7、退出");
        System.out.println("请选择:");
        String choice = input.next();
        switch (choice){
            case "1":
                showAddNewBookView();
                showBooks(Datas.BookStore);
                break;
            case "2":
                break;
            case "3":
                break;
            default:
                break;
        }
    }

    /**
     * 新增图书的界面
     */
    public Book showAddNewBookView(){
        System.out.println("\nX9图书管理系统 >> 主菜单");
        System.out.print("内部编号:");
        String bookId = input.next();
        //这里需要验证用户输入的编号是否存在
        Book newBook = bookBiz.fileById(bookId);
        if (newBook == null){  //可以添加图书
            newBook = new Book();
            newBook.setBookId(bookId);
            System.out.print("名称:");
            newBook.setBookNeam(input.next());
            System.out.print("库存:");
            newBook.setCount(input.nextInt() );
            //........
            bookBiz.addBook(newBook);//调用图书业务对象，将新增的图书对象添加到图书仓库中


        }else {  //图书已存在
            System.out.println("此内部编号已存在，请重新录入！");
            newBook = showAddNewBookView();   //重新调用本方法，让用户再次输入 - 递归调用
        }
        return newBook;
    }

    public void showBooks(Book ... bookArray){
        System.out.println("内部编号\t名称\t库存");
        int bookCount = bookBiz.getBookCount(bookArray);
        for (int i = 0; i < bookCount; i++) {
            System.out.printf("%s\t%s\t%d\n",
                    bookArray[i].getBookId(),bookArray[i].getBookNeam(),bookArray[i].getCount());
        }
    }
}
