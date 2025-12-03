import java.util.Scanner;

public class Operator {
    public static void main(String[] args) {
        float width;
        float height;
        Scanner sc =  new Scanner(System.in);
        System.out.print("Nhập width: ");
        width = sc.nextFloat();
        System.out.print("Nhập height: ");
        height = sc.nextFloat();
        float area = width * height;
        System.out.println("Area of circle: " + area);
        sc.close();
    }
}
