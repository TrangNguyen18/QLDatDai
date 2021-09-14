import entities.*;

import javax.sound.midi.Soundbank;
import java.util.Scanner;
import java.util.SortedMap;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double pricePerUnit = 100;
        double total = 0;
        System.out.println("Quy ước:");
        System.out.println("\tType = 0 --> Hình tròn");
        System.out.println("\tType = 1 --> Hình vuông");
        System.out.println("\tType = 2 --> Hình chữ nhật");
        System.out.println("\tType = 3 --> Hình tam giác");
        System.out.println("Nhập vào số mảnh đất: ");
        int n = sc.nextInt();
        Shape[] list = new Shape[n];
        for (int i = 0; i < n; i++) {
            System.out.format("Nhập vào thông tin mảnh đất thứ: %d\n", i + 1);
            System.out.print("\tType = ");
            int type = sc.nextInt();
            if (type == 0)
                list[i] = new Cycle();
            if (type == 1)
                list[i] = new Square();
            if (type == 2)
                list[i] = new Rectangle();
            if (type == 3)
                list[i] = new Triangle();
            list[i].fromConsole(sc);
            System.out.format("Diện tích mảnh đất: %,.2f\n", list[i].calculateArea());
        }
        for (Shape s : list) {
            total += pricePerUnit * s.calculateArea();
        }
        System.out.format("Tổng số tiền phải trả : %,.2f",total);
    }
}
