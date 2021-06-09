import java.util.Scanner;

public class Functions {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Задайте координату x первой точки");
        double x1 = Double.parseDouble(s.nextLine());
        System.out.println("Задайте координату y первой точки");
        double y1 = Double.parseDouble(s.nextLine());
        System.out.println("Задайте координату x второй точки");
        double x2 = Double.parseDouble(s.nextLine());
        System.out.println("Задайте координату y второй точки");
        double y2 = Double.parseDouble(s.nextLine());
        System.out.println("Задайте координату x третьей точки");
        double x3 = Double.parseDouble(s.nextLine());
        System.out.println("Задайте координату y третьей точки");
        double y3 = Double.parseDouble(s.nextLine());
        double square = Math.abs((x2-x1)*(y3-y1) - (x3-x1)*(y2-y1))/2;
        System.out.println(square);
    }
}
