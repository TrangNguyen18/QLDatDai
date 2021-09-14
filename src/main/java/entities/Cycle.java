package entities;

import java.util.Scanner;

public class Cycle extends Shape {
    private Point center;
    private double radius;

    public Cycle() {
    }

    public Cycle(Point center, double radius) {
        this.center = center;
        this.radius = radius;
    }

    public void fromConsole(Scanner sc) {
        System.out.println("Nhập vào Tâm của hình tròn: ");
        System.out.print("\tX= ");
        int x = sc.nextInt();
        System.out.print("\tY= ");
        int y = sc.nextInt();
        this.center = new Point(x, y);
        System.out.print("Nhập vào bán kính của hình tròn: ");
        this.radius = sc.nextDouble();
    }


    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Cycle{");
        sb.append("center=").append(center.toString());
        sb.append(", radius=").append(radius);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public double calculateArea() {
        final double pi = 3.14;
        return (this.radius * this.radius) * pi;
    }
}
