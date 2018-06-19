package io.github.tplxmx96.impl;

import io.github.tplxmx96.bean.Book;

public interface ITestAdapterListener extends ITestListener{
    Book getBook(String bookId);
}


//XXXXListener  xxxCallback