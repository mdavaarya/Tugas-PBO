import java.util.Scanner;

class MENU {
    boolean inputNIm() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your NIM (masukkan 99 untuk kembali): ");
        String Nim = scanner.next();
        if (Nim.length() == 15) {
            System.out.println("Successful Login as Student");
            return true;
        } else {
            System.out.println("Maaf anda tidak bisa login");
            return false;
        }
    }

    void menuStudent() {
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
                    student.pinjamBuku();
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
    void menuAdmin() {
        Scanner scanner = new Scanner(System.in);
        Admin admin = new Admin();

        while (true) {
            System.out.println("====Menu Admin====");
            System.out.println("1. Add Student");
            System.out.println("2. Input Book");
            System.out.println("3. Display Book");
            System.out.println("4. Display Student");
            System.out.println("5. Keluar");
            System.out.print("Pilihan Anda: ");
            String pilihan = scanner.nextLine();

            switch (pilihan) {
                case "1":
                    admin.AddStudent();
                    break;
                case "2":
                    admin.addBook();
                    break;
                case "3":
                    admin.DisplayBook();
                    break;
                case "4":
                    admin.displayStudent();
                    break;
                case "5":
                    System.out.println("Anda Telah keluar");
                    return;
                default:
                    System.out.println("tidak ada pilihan, coba lagi");
            }
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        MENU menu = new MENU();
        Admin admin = new Admin();
       while (true) {
            System.out.println("====Library Sistem====");
            System.out.println("1. Login as Mahasiswa");
            System.out.println("2. Login as Admin");
            System.out.println("3. Keluar");
            System.out.print("Pilihan Anda: ");
            String pilihan = scanner.nextLine();

            switch (pilihan) {
                case "1":
                    if (menu.inputNIm()) {
                        menu.menuStudent();
                        break;
                    }else {}
                    break;
                case "2":
                    if(admin.loginAdmin()){
                        menu.menuAdmin();
                        break;
                    }else {}
                    break;
                case "3":
                    System.out.println("Terima kasih!");
                    System.exit(0);
                default:
                    System.out.println("Pilihan tidak valid. Silakan coba lagi.");
            }
           }
    }
}



























