package com.data;

import com.books.Books;
import com.util.iMenu;
import java.util.ArrayList;
import java.util.Scanner;
public class Student extends iMenu {

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
   /* public void DisplayBook() {
        // Menampilkan header
        System.out.println("==================================================================");
        System.out.println("|| No. || Id Buku ||  Title   || Author || Category || Stock ||  ");
        System.out.println("==================================================================");
        //Menampilkan data buku
        for (int i = 0; i < user.bookList.size(); i++) {
            Books book = user.bookList.get(i);
            System.out.printf("|| %d || %s || %s || %s || %s || %d Stock ||\n",
                    i + 1, book.getBookId(), book.getTitle(), book.getAuthor(), book.getCategory(), book.getStock());
        }
    }*/

    public boolean displayInfo (){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your NIM (masukkan 99 untuk kembali): ");
        String Nim = scanner.next();
        if (Nim.equals("202310370311434")) {
            System.out.println("Successful Login as Student");
            return true;
        } else {
            System.out.println(" Student User Not Found!!");
            return false;
        }
    }
    public void choiceBook() {
        Scanner scan = new Scanner(System.in);
        //Student student = new Student();
        user.DisplayBookList();

        System.out.println("Input ID buku yang ingin dipinjam (masukkan 99 untuk kembali)");
        System.out.print("Input: ");
        String input = scan.nextLine();

        for (int i = 0; i < user.bookList.size(); i++) {
            Books book = user.bookList.get(i);
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
                for (Books book : user.bookList) {
                    if (idBuku.equals(book.getBookId())) {
                        System.out.printf("|| %s || %s || %s || %s || %d || %d Stock ||\n",
                                book.getBookId(), book.getTitle(), book.getAuthor(), book.getCategory(),book.getDuration(), book.getStock());
                        break;
                    }


                }
            }
        }
    }
    public void returnBook() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter book ID to return: ");
        String bookId = scan.nextLine();

        for (int i = 0; i < user.bookList.size(); i++) {
            Books book = user.bookList.get(i);
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

    @Override
    public void menu(){
            Scanner scanner = new Scanner(System.in);
            Student student = new Student();
            boolean isLoggedIn = true;
        /* untuk melakukan pemberhentian secara langsung terhadap method kita perlu menggunakan kondisi true/false
        di dalam perkondisiian while bila tidak program akan berulang*/
            while (isLoggedIn) {
                System.out.println("====Menu Student====");
                System.out.println("1. Buku Terpinjam");
                System.out.println("2. Pinjam Buku");
                System.out.println("3. Kembalikan Buku");
                System.out.println("4. Pinjam Buku atau logout");
                System.out.print("Pilihan Anda: ");
                String pilihan = scanner.nextLine();

                switch (pilihan) {
                    case "1":
                        student.showBorrowedBooks();
                        break;
                    case "2":
                        student.choiceBook();
                        break;
                    case "3":
                        student.returnBook();
                        break;
                    case "4":
                        student.logout();
                        isLoggedIn = false;
                        break;
                    default:
                        System.out.println("inputan salah");
                        break;
                }
            }
        }
}
