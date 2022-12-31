public class Calculation implements Runnable{
    private double radius, side, area;
    private final double phi = 3.14;

    public void setSquare(double side){
        if(side < 1){
            throw new IllegalArgumentException();
        } else{
            this.area = side * side;
        }
    }

    public double getSquare(){
        return area;
    }

    public void setCicrcle(double radius){
        if(radius < 1){
            throw new IllegalArgumentException();
        } else{
            this.area = phi * radius * radius;
        }
    }

    public double getCircle(){
        return area;
    }

    public void setTrapezoid(double a, double b, double t){
        if(a < 1 || b < 1 || t < 1 ){
            throw new IllegalArgumentException();
        } else{
            this.area = ((a+b)*t) * 0.5;
        }
    }

    public double getTrapezoid(){
        return area;
    }

    @Override
    public void run(){
        try {
            System.out.println("\n====Program will start in====");
            for(int i = 3; i > 0; i--){
                System.out.println("Starting with thread " + i);
                Thread.sleep(1000);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
