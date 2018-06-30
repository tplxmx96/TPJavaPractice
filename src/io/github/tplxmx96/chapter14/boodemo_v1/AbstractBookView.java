package io.github.tplxmx96.chapter14.boodemo_v1;

import java.util.Scanner;

public abstract class AbstractBookView {


    public AbstractBookView() {

    }

    /**
     * 本方法用来规定固定的程序逻辑
     */
    public void doMainView() {
        String reault = showMainView();
        switch (reault) {
            case "1":  //添加图书
                showAddNewBookView();
                showBooks(Datas.BookStore);
                break;
            case "2":  //删除图书
                showDelBookView();
                break;
            case "3":
                showBooks(null);
                break;
            case "4":  //安编号查询
                showFindById();
                break;
            case "5": //入库
                showInStore();
                break;
            case "6":
                showOutStore();
                break;
            case "7":
//                System.exit(0); //退出系统
//                return false;
                return;

            default:
                break;
        }
        doMainView();
    }

    /**
     * 显示主菜单
     * @return 返回用户选择的菜单项(1-7之间)
     */
    public abstract String showMainView();

    public abstract void showOutStore();


    public abstract void showInStore();

    public abstract void showFindById();

    public abstract void showDelBookView();

    /**
     * 新增图书的界面
     *
     */

    public abstract Book showAddNewBookView();
    /**
     *  显示所有的图书信息
     *  * 如果传入的是null，默认显示图书仓库中的数组，Datas.BookStroe
     *  * @param bookArray
     *  */

    public abstract void showBooks(Book ... bookArray);





}
