import java.util.Scanner;

public class Kubus extends BangunRuang{
    Scanner scanner = new Scanner(System.in);
    private double sisi;

    public void input(){
        System.out.println("\nMenghitung Luas "+ getName());
        System.out.print("Input sisi: ");
        sisi = scanner.nextInt();
    }

    @Override
    public void luasPermukaan(){
        double hasil = 6 * sisi * sisi;
        System.out.println( "Hasil luas permukaan "+ getName() + ": " + hasil);
    }

    @Override
    public void volume(){
        double hasil = Math.pow(sisi, 3);
        System.out.println("Hasil volume " + getName() + ": " + hasil);
    }
}
