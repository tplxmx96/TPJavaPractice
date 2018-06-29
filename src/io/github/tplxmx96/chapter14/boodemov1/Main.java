package io.github.tplxmx96.chapter14.boodemov1;


public class Main {
    public static void main(String[] args){
      BookView bookView = new BookView();
//        Book newBook = new Book();
//        newBook.setBookId("10");
//        newBook.setBookNeam("天龙八部");
//        newBook.setCount(10);
//
//        BookBiz bookBiz = new BookBiz();
//        bookBiz.addBook(newBook);
//        show();
//        bookBiz.isStore("10",100);
//        show();
//        bookBiz.outStore("10",100);
//        show();
    }
    public static void show(){
        BookBiz bookBiz = new BookBiz();
        if (bookBiz.getBookCount() == 0){
            System.out.println("仓库空空如也");
            return;
        }
        for (int i = 0; i < new BookBiz().getBookCount(); i++) {
            System.out.println(Datas.BookStore[i].getBookId() + "\t" + Datas.BookStore[i].getBookNeam() + "\t" + Datas.BookStore[i].getCount());
        }
    }
}
