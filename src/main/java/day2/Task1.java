package day2;
import java.util.Scanner;


public class Task1 {
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     int a = sc.nextInt();
     if(a>0&&a<=4){
         System.out.println("Дом малоэтажный");
     }
     else if(a>4&&a<9){
         System.out.println("Дом среднеэтажный");
     }
     else if(a<1){
         System.out.println("Ошибка ввода");
     }
     else{
         System.out.println("Дом многоэтажный");
     }
    }
}
