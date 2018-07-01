package io.github.tplxmx96.chapter14.boodemo_v1;



public class MainFileTest {
    public static void main(String[] args){
        System.out.println(Datas.BookStore.length);
        FileUtil.SaveBooks(Datas.BookStore);


        Book[] bookArray = FileUtil.LoadBooks();
        for (int i = 0; i < bookArray.length; i++) {
            if (bookArray[i] == null)break;
            System.out.println(bookArray[i].getBookId() + "--" + bookArray[i].getBookNeam());

        }
    }
}
