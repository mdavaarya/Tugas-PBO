import java.util.ArrayList;
import java.util.Scanner;
public class Admin {
    Student student = new Student();
    User user = new User();
    Scanner scan = new Scanner(System.in);
    ArrayList<Student> registeredStudents = new ArrayList<>();
    String adminUsername;
    String adminPassword;


    boolean loginAdmin() {
        System.out.print("Enter your username (admin): ");
        adminUsername = scan.next();
        System.out.print("Enter your password (admin): ");
        adminPassword = scan.next();
        if (adminUsername.equals("admin") && adminPassword.equals("admin")) {
            System.out.println("Successful Login as Admin");
            return true;
        } else {
            System.out.println("Admin User Not Found!!");
            return false;
        }
    }

    void AddStudent() {
        Student[] userStudents = new Student[2];
        userStudents[0] = new Student();
        userStudents[0].name = "Jack Sparrow";
        userStudents[0].faculty = "Teknik";
        userStudents[0].nim = "202310370311435";
        userStudents[0].major = "Informatika";

        userStudents[1] = new Student();
        userStudents[1].name = "Entity 09";
        userStudents[1].faculty = "Teknik";
        userStudents[1].nim = "202310370311420";
        userStudents[1].major = "Informatika";

        registeredStudents.add(userStudents[0]);
        registeredStudents.add(userStudents[1]);

        System.out.print("Masukkan nama mahasiswa: ");
        student.name = scan.nextLine();
        System.out.print("Masukkan NIM mahasiswa: ");
        student.nim = scan.nextLine();
        if (student.nim.length() != 15) {
            System.out.println("Panjang NIM harus 15 angka.");
            return;
        }
        System.out.print("Masukkan Faculty: ");
        student.faculty = scan.nextLine();
        System.out.print("Masukkan Program: ");
        student.major = scan.nextLine();
        System.out.println("Data mahasiswa berhasil ditambahkan.");

        registeredStudents.add(student);
    }

    void displayStudent() {
        // Menampilkan data mahasiswa dengan looping
        if (registeredStudents.isEmpty()) {
            System.out.println("Tidak ada mahasiswa terdaftar.");
        } else {
            System.out.println("Daftar Mahasiswa Terdaftar:");
            for (Student student : registeredStudents) {
                System.out.println("Nama: " + student.name);
                System.out.println("NIM: " + student.nim);
                System.out.println("Fakultas: " + student.faculty);
                System.out.println("Program: " + student.major);
                System.out.println();

            }
        }
    }
    public void addBook() {
        String bookId, title, author, category;
        int stock;

        System.out.println("Select book category");
        System.out.println("1. History book");
        System.out.println("2. Story book");
        System.out.println("3. Text book");
        System.out.print("Pilihan Anda: ");
        String pilihan = scan.nextLine();

        switch (pilihan) {
            case "1":
                System.out.print("Masukkan ID buku: ");
                bookId = scan.nextLine();
                System.out.print("Masukkan judul buku: ");
                title = scan.nextLine();
                System.out.print("Masukkan penulis buku: ");
                author = scan.nextLine();
                System.out.print("Masukkan kategori buku: ");
                category = scan.nextLine();
                System.out.print("Masukkan stok buku: ");
                stock = scan.nextInt();
                scan.nextLine(); // Membersihkan buffer

                HistoryBook text = new HistoryBook(bookId, title, author, category, stock);
                text.setBookId(bookId);
                text.setTitle(title);
                text.setAuthor(author);
                text.setCategory(category);
                text.setStock(stock);

                // Memasukkan objek HistoryBook ke dalam array
                user.bookList.add(text);
                break;
            case "2":
                System.out.print("Masukkan ID buku: ");
                bookId = scan.nextLine();
                System.out.print("Masukkan judul buku: ");
                title = scan.nextLine();
                System.out.print("Masukkan penulis buku: ");
                author = scan.nextLine();
                System.out.print("Masukkan kategori buku: ");
                category = scan.nextLine();
                System.out.print("Masukkan stok buku: ");
                stock = scan.nextInt();
                scan.nextLine(); // Membersihkan buffer

                StoryBook storyBook = new StoryBook(bookId, title, author, category, stock);
                storyBook.setBookId(bookId);
                storyBook.setTitle(title);
                storyBook.setAuthor(author);
                storyBook.setCategory(category);
                storyBook.setStock(stock);

                // Memasukkan objek TextBook ke dalam array
                user.bookList.add(storyBook);
            case "3":
                System.out.print("Masukkan ID buku: ");
                bookId = scan.nextLine();
                System.out.print("Masukkan judul buku: ");
                title = scan.nextLine();
                System.out.print("Masukkan penulis buku: ");
                author = scan.nextLine();
                System.out.print("Masukkan kategori buku: ");
                category = scan.nextLine();
                System.out.print("Masukkan stok buku: ");
                stock = scan.nextInt();
                scan.nextLine(); // Membersihkan buffer

                TextBook textBook = new TextBook(bookId, title, author, category, stock);
                textBook.setBookId(bookId);
                textBook.setTitle(title);
                textBook.setAuthor(author);
                textBook.setCategory(category);
                textBook.setStock(stock);

                // Memasukkan objek TextBook ke dalam array
                user.bookList.add(textBook);

                break;
            default:
                System.out.println("tidak ada pilihan, coba lagi");
        } user.DisplayBookList();
    }
    public void DisplayBook() {
                // Menampilkan header
                System.out.println("==================================================================");
                System.out.println("|| No. || Id Buku ||  Title   || Author || Category || Stock ||  ");
                System.out.println("==================================================================");
                //Menampilkan data buku
                for (int i = 0; i < user.bookList.size(); i++) {
                    Book book = user.bookList.get(i);
                    System.out.printf("|| %d || %s || %s || %s || %s || %d Stock ||\n",
                            i + 1, book.getBookId(), book.getTitle(), book.getAuthor(), book.getCategory(), book.getStock());
                }
    }
}









