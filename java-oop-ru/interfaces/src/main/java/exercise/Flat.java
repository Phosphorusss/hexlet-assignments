package exercise;

// BEGIN
public class Flat implements Home{
    private double area;
    private double balconyArea;
    private int floor;

    public Flat(double area, double balconyArea, int floor) {
        this.area = area;
        this.balconyArea = balconyArea;
        this.floor = floor;
    }
    public double getArea() {
        return area + balconyArea;
    }
    public int compareTo(Home apartment) {
        if (getArea() > apartment.getArea()) {
            return 1;
        } else if (getArea() < apartment.getArea()) {
            return -1;
        }else {
            return 0;
        }
        //return Double.compare(getArea(), apartment.getArea());
    }

    @Override
    public String toString() {
        return "Квартира площадью " + getArea() + " метров на " + floor +" этаже";
    }
}
// END
