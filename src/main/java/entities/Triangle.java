package entities;

import java.util.Scanner;

public class Triangle extends Shape {
    protected Point c1, c2, c3;

    public Triangle() {
    }

    public Triangle(Point c1, Point c2, Point c3) {
        this.c1 = c1;
        this.c2 = c2;
        this.c3 = c3;
    }

    @Override
    public void fromConsole(Scanner sc) {
        System.out.println("Nhập vào đỉnh thứ 1");
        this.c1 = new Point();
        c1.input();
        System.out.println("Nhập vào đỉnh thứ 2");
        this.c2 = new Point();
        c2.input();
        System.out.println("Nhâp vào đỉnh thứ 3");
        this.c3 = new Point();
        c3.input();
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Triangle{");
        sb.append("c1=").append(c1.toString());
        sb.append(", c2=").append(c2.toString());
        sb.append(", c3=").append(c3.toString());
        sb.append('}');
        return sb.toString();
    }

    public double calculateArea() {
        double a = this.c1.distance(this.c2);// hàm distance để tính khoảng cách giữa 2 đỉnh
        double b = this.c2.distance(this.c3);
        double c = this.c3.distance(this.c1);
        double p = (a + b + c) / 2;
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }
}
