import java.util.Scanner;
public class NghiemPhuongTrinh {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        double a;
        double b;
        double c;
        System.out.println("Nhap a: ");
        a=scanner.nextDouble();
        System.out.println("Nhap b: ");
        b=scanner.nextDouble();
        System.out.println("Nhap c: ");
        c=scanner.nextDouble();
        if (a!=0){
            double nghiem=(c-b)/a;
            System.out.println("Nghiem la: "+nghiem);
        } else {
            if (b==0){
                System.out.println("Phuong trinh vo so nghiem");
            } else {
                System.out.println("Phuong trinh vo nghiem");
            }
        }
    }
}
