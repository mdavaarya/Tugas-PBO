package com.data;

import com.books.Books;
import java.util.Scanner;
import java.util.ArrayList;
public class User{
    Scanner  scanner = new Scanner(System.in);
    ArrayList<Books> bookList = new ArrayList<>();
    public void DisplayBookList (){
        Books[] booklist = new Books[3];
        // Menampilkan header
        System.out.println("==================================================================");
        System.out.println("|| No. || Id Buku ||  Title   || Author || Category || Stock ||  ");
        System.out.println("==================================================================");
        //
        booklist [0] = new Books();
        booklist[0].setBookId("377c-H681-7852");
        booklist[0].setTitle("title");
        booklist[0].setAuthor("Sung Jin-woo");
        booklist[0].setCategory("Heroes");
        booklist[0].setStock(0);

        booklist [1] = new Books();
        booklist[1].setBookId("k92l-0c7x-9587");
        booklist[1].setTitle("title");
        booklist[1].setAuthor("John Doe");
        booklist[1].setCategory("Horor");
        booklist[1].setStock(2);

        booklist [2] = new Books();
        booklist[2].setBookId("m65e-0cd5-9093");
        booklist[2].setTitle("title");
        booklist[2].setAuthor("Astolfo");
        booklist[2].setCategory("Pelangi");
        booklist[2].setStock(5);

        bookList.add(booklist[0]);
        bookList.add(booklist[1]);
        bookList.add(booklist[2]);

        //Menampilkan data buku
        for (int i = 0; i < bookList.size(); i++) {
            Books book = bookList.get(i);
            System.out.printf("|| %d || %s || %s || %s || %s || %d Stock ||\n",
                    i + 1, book.getBookId(), book.getTitle(), book.getAuthor(), book.getCategory(), book.getStock());
        }
    }
}




