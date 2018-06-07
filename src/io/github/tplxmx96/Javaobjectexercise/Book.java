package io.github.tplxmx96.Javaobjectexercise;

/**
 * 图书实体类
 */
public class Book {
    private String name;
    private String isbn;
    private double peice;
    private int count;  //当前图书对象的库存量
    private boolean boeeow;   //是否可借

    public Book(){}

    public Book(String name){
        this.setName(name);
    }
    public Book(String name,String isbn,double peice,int count){
        setName(name);
        setIsbn(isbn);
        setPeice(peice);
        setCount(count);
        setBoeeow(boeeow);
    }

    public boolean isBoeeow() {
        return boeeow;
    }

    public void setBoeeow(boolean boeeow) {
        this.boeeow = boeeow;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public double getPeice() {
        return peice;
    }

    public void setPeice(double peice) {
        if (peice < 0){
            peice = 0;
        }else {
            this.peice = peice;
        }
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        if (count < 0) {
            count = 0;
        }else {
            this.count = count;
        }
    }
}
