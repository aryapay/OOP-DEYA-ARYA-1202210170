public class User {

    // TODO Create Attribute of User; Name and Phone Number then Create Setter
    String name;
    int noHp;
    // TODO Create Method to Register User and Display User's Name and Phone Number and success message
    public User(String name, int noHp){
        this.name = name;
        this.noHp = noHp;
    }

    public void displayUser(){
        System.out.println("Register Success");
        System.out.println("Name: " + this.name);
        System.out.println("Phone Number: " + this.noHp);
    }
}
