package io.github.tplxmx96.bean;

import java.util.Date;

public class Book {
//    private String chinese;
//    private String math;
//    private String history;
//    private String geography;
//    private String political;
//    private String skill;

    private String bookType;
    private String bookName;
    private String startAt;    //借书时间
    private String endAt;      //借书类别

    public String getBookType() {
        return bookType;
    }

    public void setBookType(String bookType) {
        this.bookType = bookType;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getStartAt() {
        return startAt;
    }

    public void setStartAt(String startAt) {
        this.startAt = startAt;
    }

    public String getEndAt() {
        return endAt;
    }

    public void setEndAt(String endAt) {
        this.endAt = endAt;
    }
}
