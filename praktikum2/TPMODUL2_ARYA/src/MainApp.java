public class MainApp {
    public static void main(String[] args) throws Exception {
        Perangkat p1 = new Perangkat("Adata", 2, (float) 1.80);
        p1.informasi();
        System.out.println();

        Laptop l1 = new Laptop("Seagate", 8, (float) 2.40, true);
        l1.informasi();
        l1.bukaGame("Dota 2");
        l1.kirimEmail("niceyuk@gmail.com");
        l1.kirimEmail("aanarji@gmail.com", "rusmango@gmail.com");
        System.out.println();

        Handphone h1 = new Handphone("Sandisk", 3, (float) 2.20, false);
        h1.informasi();
        h1.telfon(628122122);
        h1.kirimSMS(62852112);
        h1.kirimSMS(628121212, 629292211);
    }
}
