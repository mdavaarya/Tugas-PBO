public class App {
    public static void main(String[] args) throws Exception {
        Tabung tabung = new Tabung ();
        Kubus kubus = new Kubus ();
        BangunRuang balok = new BangunRuang();


        balok.setName("BATAKO");
        kubus.setName("KARDUS");
        tabung.setName("TONG");

        balok.inputNilai();
        balok.luasPermukaan();
        balok.volume();

        kubus.input();
        kubus.luasPermukaan();
        kubus.volume();

        tabung.inputNilai();
        tabung.luasPermukaan();
        tabung.volume();

    }

}
