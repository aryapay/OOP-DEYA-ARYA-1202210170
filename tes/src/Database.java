import java.util.List;
import java.util.ArrayList;

public class Database {
    // TODO Create List of Menu Object to Store Menu from Menu Class
    List<Menu> arr = new ArrayList<>();

    // TODO Create Method to Insert Menu to Database
    public void insertMenu(Menu menu){
        arr.add(menu);
    }
    // TODO Create Method to Show Menu from Database
    public void showMenu(){
        for(int i = 0; i < arr.size(); i++){
            System.out.println((i + 1) + arr.get(i).name + arr.get(i).category + "Rp . " + arr.get(i).price);
        }
    }
    // TODO Create Method to Search Menu from Database
    public void searchMenu(){
    
    }
}
