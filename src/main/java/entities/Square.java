package entities;

import java.util.Scanner;

public class Square extends Shape {
    private Point cornerSquare;
    private double d;

    public Square() {
    }

    public Square(double d) {
        this.d = d;
    }

    @Override
    public void fromConsole(Scanner sc) {
        System.out.println("Nhập điểm trái trên của hình vuông");
        System.out.print("\tX= ");
        int x = sc.nextInt();
        System.out.print("\tY= ");
        int y = sc.nextInt();
        this.cornerSquare = new Point(x, y);
        System.out.print("Nhập chiều rộng hình vuông: ");
        this.d = sc.nextDouble();
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Square{");
        sb.append("cornerSquare=").append(cornerSquare.toString());
        sb.append(", d=").append(d);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public double calculateArea() {
        return (this.d * this.d);
    }
}
