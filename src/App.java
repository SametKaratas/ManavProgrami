import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        double ar = 2.14, el = 3.67, dom = 1.11, muz = 0.95, pat = 5.00;
        double arf, elf, domf, muzf, patf;
        Scanner input =  new Scanner(System.in);
        System.out.print("Armut Kac Kilo :");
        arf = input.nextDouble();
        System.out.print("Elma Kac Kilo :");
        elf = input.nextDouble();
        System.out.print("Domates Kac Kilo :");
        domf = input.nextDouble();
        System.out.print("Muz Kac Kilo :");
        muzf = input.nextDouble();
        System.out.print("Patlican Kac Kilo :");
        patf = input.nextDouble();
        double tp = (ar*arf)+(el*elf)+(dom*domf)+(muz*muzf)+(pat*patf);
        System.out.print("Toplam Tutar :" + tp);
    }   
}
