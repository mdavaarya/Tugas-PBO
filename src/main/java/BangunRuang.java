import java.util.Scanner;
public class BangunRuang {
    Scanner scanner = new Scanner(System.in);
    public String name;
    public double panjang;
    public double lebar;
    public double tinggi;
    public void inputNilai(){
        System.out.println("Menghitung luas " + name);

        System.out.print("Masukkan panjang balok: ");
        panjang = scanner.nextDouble();
        System.out.print("Masukkan lebar balok: ");
        lebar = scanner.nextDouble();
        System.out.print("Masukkan tinggi balok: ");
        tinggi = scanner.nextDouble();
    }
    public void luasPermukaan(){
        double luasPermukaan = 2 * ((panjang * lebar) + (panjang * tinggi) + (lebar * tinggi));
        System.out.println("Luas permukaan adalah: " + luasPermukaan);
    }

    public void volume(){
        System.out.println("Menghitung volume " + name);
        double volume = panjang * lebar * tinggi;
        System.out.println("Volume balok adalah: " + volume);
    }
    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }
}
