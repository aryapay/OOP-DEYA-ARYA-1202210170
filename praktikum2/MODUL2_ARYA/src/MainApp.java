public class MainApp {
    public static void main(String[] args) throws Exception {
        TransportasiAir ta = new TransportasiAir(4, 20000);
        ta.informasi();
        ta.berlayar();
        ta.berlabuh();
        System.out.println();

        Sampan s = new Sampan(20, 50000, 2);
        s.informasi();
        s.berlabuh();
        s.berlabuh(2);
        System.out.println();

        Kapal k = new Kapal(50, 100000, "Diesel");
        k.informasi();
        k.berlayar();
        k.berlayar(20);
        k.berlabuh();
    }
}
