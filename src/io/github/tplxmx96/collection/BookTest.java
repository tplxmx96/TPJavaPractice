package io.github.tplxmx96.collection;

import io.github.tplxmx96.Javaobjectexercise.Book;
import io.github.tplxmx96.datatype.BookBiz;

public class BookTest {
    public static void main(String[] args){
        Book book = new Book("老九君醉酒谈Java","123-321",98.8,5);
        //实例化图书业务对象
        BookBiz bookBiz = new BookBiz();
        bookBiz.sellBook(book);
        System.out.println(book.getCount());
    }
}
