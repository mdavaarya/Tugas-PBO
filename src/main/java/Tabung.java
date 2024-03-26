import java.util.Scanner;
public class Tabung extends BangunRuang{
    Scanner scanner = new Scanner(System.in);
    public double tinggi;
    public double jari_jari;

    @Override
    public void inputNilai(){
        System.out.println("\nMenghitung Luas "+getName());
        System.out.print("Input tinggi: ");
        tinggi = scanner.nextInt();
        System.out.print("Input jari-jari: ");
        jari_jari = scanner.nextDouble();
    }

    @Override
    public void luasPermukaan(){
        double hasil = 2 * Math.PI * jari_jari * (jari_jari);
        System.out.println("Hasil luas permukaan " + getName() + ": " + hasil);
    }

    @Override
    public void volume(){
        double hasil = Math.PI * Math.pow(jari_jari, 2) * tinggi;;
        System.out.println("Hasil volume " + getName() + ": " + hasil);
    }
}