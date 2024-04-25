import java.util.Scanner;
import java.util.ArrayList;
public class User{
    Scanner  scanner = new Scanner(System.in);
    ArrayList<Book> bookList = new ArrayList<>();
   public void DisplayBookList (){
        Book[] booklist = new Book[3];
        // Menampilkan header
        System.out.println("==================================================================");
        System.out.println("|| No. || Id Buku ||  Title   || Author || Category || Stock ||  ");
        System.out.println("==================================================================");
        //
        booklist [0] = new Book();
        booklist [0].bookId = "377c-H681-7852";
        booklist [0].title  = "title";
        booklist [0].author = "Sung Jin-woo";
        booklist [0].category  = "Heroes";
        booklist [0].stock = 0;

        booklist [1] = new Book();
        booklist [1].bookId = "k92l-0c7x-9587";
        booklist [1].title  = "title";
        booklist [1].author = "John Doe";
        booklist [1].category  = "Horor";
        booklist [1].stock = 2;

        booklist [2] = new Book();
        booklist [2].bookId = "m65e-0cd5-9093";
        booklist [2].title  = "title";
        booklist [2].author = "Astolfo";
        booklist [2].category  = "Pelangi";
        booklist [2].stock = 5;

        bookList.add(booklist[0]);
        bookList.add(booklist[1]);
        bookList.add(booklist[2]);

         //Menampilkan data buku
        for (int i = 0; i < bookList.size(); i++) {
            Book book = bookList.get(i);
            System.out.printf("|| %d || %s || %s || %s || %s || %d Stock ||\n",
                    i + 1, book.getBookId(), book.getTitle(), book.getAuthor(), book.getCategory(), book.getStock());
        }
    }
}



