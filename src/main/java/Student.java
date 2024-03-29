import java.util.ArrayList;
import java.util.Scanner;
class Student {
    ArrayList<String> listbookData = new ArrayList<String>();
    Scanner scan = new Scanner(System.in);
    String name;
    String faculty;
    String nim;
    String major;

    String[][] bookData = {
            {"388c-e681-9152", "title", "author", "Sejarah", "4"},
            {"ed90-be30-5cdb", "title", "author", "Sejarah", "2"},
            {"d95e-0c4a-9523", "title", "author", "Sejarah", "0"}
    };
    void DisplayBook() {
        // Menampilkan header
        System.out.println("==================================================================");
        System.out.println("|| No. || Id Buku || Nama Buku || Author || Category || Stock ||");
        System.out.println("==================================================================");
        // Menampilkan data buku
        for (int i = 0; i < bookData.length; i++) {
            System.out.printf("|| %d || %s || %s || %s || %s || %s Stock ||\n",
                    i + 1, bookData[i][0], bookData[i][1], bookData[i][2], bookData[i][3], bookData[i][4]);
        }
    }
    void pinjamBuku() {
        System.out.println("Input ID buku yang ingin dipinjam (masukkan 99 untuk kembali)");
        System.out.print("Input: ");
        String input = scan.nextLine();

        for (int i = 0; i < bookData.length; i++) {
            if (input.equals(bookData[i][0])) {
                int stok = Integer.parseInt(bookData[i][4]);
                if (stok > 0) {
                    stok--; // Mengurangi stok
                    bookData[i][4] = String.valueOf(stok); // Memperbarui stok pada array
                    System.out.println("Buku berhasil dipinjam.");
                    listbookData.add(input);
                } else {
                    System.out.println("Maaf, buku tidak tersedia.");
                }
                return;
            }
        }
    }

    void BukuTerpinjam() {
        if (listbookData.isEmpty()) {
            System.out.println("Anda belum meminjam buku apapun.");
        } else {
            System.out.println("Buku yang Anda pinjam:");
            for (String idBuku : listbookData) {
                for (String[] buku : bookData) {
                    if (idBuku.equals(buku[0])) {
                        System.out.printf("ID Buku: %s, Nama Buku: %s, Penulis: %s, Kategori: %s\n",
                                buku[0], buku[1], buku[2], buku[3]);
                        break;
                    }
                }
            }
        }
    }

    void logout (){
        System.out.println("Anda Telah LOGOUT");
    }
}

