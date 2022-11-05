import java.util.Scanner;

public class Server {

    public static void main(String[] args) {
        // TODO Create Database

        
        // TODO Create Menu
        Menu menu1 = new Menu();
        menu1.setName("Bakso");
        menu1.setCategory("Makanan");
        menu1.setPrice(12000);

        Menu menu2 = new Menu();
        menu2.setName("Teh panas");
        menu2.setCategory("Minuman");
        menu2.setPrice(5000);

        Menu menu3 = new Menu();
        menu3.setName("Es Krim");
        menu3.setCategory("Dessert");
        menu3.setPrice(8000);

        // TODO Insert Menu to Database

        // TODO Display Main Menu

        
        // TODO Create User
        User user = new User("Arya_SI4507", 1202210170);
        user.displayUser();

        // Display Menu

    }
}