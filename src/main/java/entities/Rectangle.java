package entities;

import java.util.Scanner;

public class Rectangle extends Shape {
    private Point cornerRec;// điểm trái trên
    private double l;// chiều dài
    private double w;// chiều rộng

    public Rectangle() {
    }

    public Rectangle(Point cornerRec, double l, double w) {
        this.cornerRec = cornerRec;
        this.l = l;
        this.w = w;
    }

    @Override
    public void fromConsole(Scanner sc) {
        System.out.println("Nhập điểm trái trên: ");
        System.out.print("\tX = ");
        int x = sc.nextInt();
        System.out.print("\tY= ");
        int y = sc.nextInt();
        this.cornerRec = new Point(x, y);
        System.out.print("Chiều dài: ");
        this.l = sc.nextDouble();
        System.out.print("Chiều rộng: ");
        this.w = sc.nextDouble();
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Rectangle{");
        sb.append("corner=").append(cornerRec.toString());
        sb.append(", l=").append(l);
        sb.append(", w=").append(w);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public double calculateArea() {
        return (this.w * this.l);
    }
}
