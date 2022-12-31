import java.util.Scanner;
import java.util.InputMismatchException;

public class Main {
    public static void main(String[] args) throws Exception {
        boolean repeat = true;
        Scanner sc = new Scanner(System.in);
        Calculation cal = new Calculation();
        do {
            String text = "==Menu Program=="
                        + "\n1. Square"
                        + "\n2. Circle"
                        + "\n3. Trapezoid"
                        + "\n0. Exit"
                        + "\nSelect menu : ";
            System.out.print(text);
            try {
                int menu = sc.nextInt();
                switch(menu){
                    case 1:
                        System.out.print("\nEnter the length side of the square : ");
                        double side = sc.nextDouble();
                        cal.setSquare(side);
                        cal.run();
                        System.out.println("\nThe calculation result: " + cal.getSquare());
                        break;
                    case 2:
                        System.out.print("\nEnter the radius of the circle : ");
                        double radius = sc.nextDouble();
                        cal.setCicrcle(radius);
                        cal.run();
                        System.out.println("\nThe calculation result: " + cal.getCircle());
                        break;
                    case 3:
                        System.out.print("\nInsert the side of the base trapezoid : ");
                        double a = sc.nextDouble();
                        System.out.print("Enter the upper side of the trapezoid : ");
                        double b = sc.nextDouble();
                        System.out.print("Enter the height of the trapezoid : ");
                        double t = sc.nextDouble();
                        cal.setTrapezoid(a, b, t);
                        cal.run();
                        System.out.println("\nThe calculation result: " + cal.getTrapezoid());
                        break;
                    case 0:
                        System.out.println("Program Ended");
                        break;
                    default:
                        System.out.println("\nOption not Available\n");
                        continue;
                }
                repeat = false;
            } catch (InputMismatchException e) {
                System.out.println("\n====Error: Input must be a number====\n");
                sc.next();
            } catch (IllegalArgumentException e){
                System.out.println("\n" + e + "\n");
            }
        } while (repeat);
        sc.close();
    }
}
