package entities;

import java.util.Scanner;

public class Point {
    protected int x, y;

    public Point() {
        this.x = 0;
        this.y = 0;
    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("(");
        sb.append(x);
        sb.append(",").append(y);
        sb.append(')');
        return sb.toString();
    }
    // nhập vào tọa độ của 1 điểm
    public void input (){
        Scanner sc = new Scanner(System.in);
        System.out.print("\tX= ");
        this.x = sc.nextInt();
        System.out.print("\tY= ");
        this.y = sc.nextInt();
    }
    // tính khoảng cách giữa 2 điểm
    public double distance(Point p2) {
        double dx = p2.x - this.x;
        double dy = p2.y - this.y;
        return Math.sqrt(dx * dx + dy * dy);
    }
}
