import java.util.ArrayList;
import java.util.Scanner;
public class Student {

    ArrayList<String> borrowBook = new ArrayList<>();
    User user = new User();
    String name;
    String faculty;
    String nim;
    String major;

    public Student() {
        this.name = name;
        this.nim = nim;
        this.faculty = faculty;
        this.major = major;
    }

    void pinjamBuku() {
        Scanner scan = new Scanner(System.in);
        user.DisplayBookList();
        System.out.println("Input ID buku yang ingin dipinjam (masukkan 99 untuk kembali)");
        System.out.print("Input: ");
        String input = scan.nextLine();

        for (int i = 0; i < user.bookList.size(); i++) {
            Book book = user.bookList.get(i);
            if (input.equals(book.getBookId())) {
                int Stock = book.getStock();
                if (Stock == 0) {
                    System.out.println("Maaf, buku sedang tidak tersedia.");
                } else if (Stock > 0) {
                    System.out.println("Buku berhasil dipinjam.");
                    System.out.println("Buku dipinjam selama (maksimal 14 hari):");
                    System.out.print("Input hari: ");
                    int durasi = scan.nextInt();
                    if (durasi > 14) {
                        System.out.println("Tidak bisa meminjam lebih dari 14 hari");
                        return;
                    } else {
                        Stock--; // Mengurangi stok
                        book.setStock(Stock); // Memperbarui stok pada buku
                        book.setDuration(durasi);
                        borrowBook.add(input); // Menambahkan ID buku ke dalam daftar yang dipinjam
                    }
                }
                return;
            }
        }
    }


    public void showBorrowedBooks() {
        if (borrowBook.isEmpty()) {
            System.out.println("Anda belum meminjam buku apapun.");
        } else {
            System.out.println("Buku yang Anda pinjam:");
            System.out.println("==================================================================");
            System.out.println("|| Id Buku ||  Title   || Author || Category || Durasi || Stock ||  ");
            System.out.println("==================================================================");
            for (String idBuku : borrowBook) {
                for (Book book : user.bookList) {
                    if (idBuku.equals(book.getBookId())) {
                        System.out.printf("|| %s || %s || %s || %s || %d || %d Stock ||\n",
                                book.getBookId(), book.getTitle(), book.getAuthor(), book.getCategory(),book.getDuration(), book.getStock());
                        break;
                    }


                }
            }
        }
    }
    void returnBook() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter book ID to return: ");
        String bookId = scan.nextLine();

        for (int i = 0; i < user.bookList.size(); i++) {
            Book book = user.bookList.get(i);
            if (bookId.equals(book.getBookId())) {
                int stock = book.getStock();
                stock++;
                book.setStock(stock);
                borrowBook.clear();
                System.out.println("Book returned successfully!");
                return;
            }
        }
        System.out.println("Book not found!");
    }

    public void logout() {
        Scanner scan = new Scanner(System.in);
        if (borrowBook.isEmpty()) {
            System.out.println("Anda telah logout.");
        } else {
            System.out.print("Apakah Anda ingin membatalkan peminjaman buku? (ya/tidak)");
            String choice = scan.nextLine();
            if (choice.equalsIgnoreCase("ya")) {
                borrowBook.clear();
                System.out.println("Peminjaman buku dibatalkan. Anda telah logout.");
            } else {
                System.out.println("Peminjaman buku akan diproses. Anda telah logout.");
            }
        }
    }
}