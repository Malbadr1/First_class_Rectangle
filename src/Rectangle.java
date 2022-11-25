import java.util.Scanner;

public class Rectangle {

    private  double length;
    private double width;
    Scanner input= new Scanner(System.in);

    public Rectangle() {
        this.length = length;
        this.width = width;
    }

    public double getLength() {
        System.out.println("enter length");
        length=input.nextDouble();
        return length;
    }

    public void setLength(double length) {


        this.length = length;
    }

    public double getWidth() {
        System.out.println("enter width");
        width=input.nextDouble();
        return width;
    }

    public void setWidth(double width) {

        this.width = width;
    }

    public double area(){
        double area =length*width;
        return area;
    }
    public double parameter(){
       double parameter= 2*(length+width);
       return parameter;
    }
    @Override
    public String toString() {
        return super.toString();}



    public static void main(String[] args) {

        Rectangle re=new Rectangle();
        re.getLength();
        re.getWidth();
        System.out.println("Area =  "+re.area());
        System.out.println("Parameter"+re.parameter());
    }



}
