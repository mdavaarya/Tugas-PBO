package com.books;

public class Books {
    String bookId;
    String title;
    String author;
    String category;
    int stock;
    int duration;

    public Books () {
        this.bookId = bookId;
        this.title = title ;
        this.author = author;
        this.category = category;
    }

    public Books(String bookId, String title, String author, String category, int stock) {
    }

    //setter
    public void setBookId(String bookId){ this.bookId = bookId;}
    public void setTitle(String title){ this.title= title;}
    public void setAuthor(String author){ this.author = author;}
    public void setCategory(String category){ this.category = category;}
    public  void setStock(int  stock){ this.stock = stock;}
    public void setDuration(int duration){ this.duration = duration;}

    //getter
    public String getBookId(){ return bookId;}
    public String getTitle(){ return title;}
    public String getAuthor(){ return author;}
    public String getCategory(){ return category;}
    public int getStock (){ return  stock;}
    public int getDuration(){return duration;}

}



