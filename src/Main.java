import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("tiem pho anh hai");
        System.out.println("moi chon mon");
        System.out.println("1 : pho tai");
        System.out.println("2 : pho chin");
        System.out.println("3: com nguoi");

        Scanner scanner  =  new Scanner(System.in);
        System.out.println("moi chon mon!!");
        int choose =  scanner.nextInt();
        switch(choose){
            case 1:
                System.out.println("ban da chon pho tai");
                break;
            case 2:
                System.out.println("ban da chon pho chin");
                break;
            case 3 :
                System.out.println("ban da chon com nguoi");
                break;

            default:
                System.out.println("mon da chon khong hop le");
                break;
        }
    }
};