import java.util.Scanner;
public class Zad_1 {
        public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       System.out.print("Vavedi strana a:");
       int a = input.nextInt();
       System.out.print("Vavedi strana b:");
       int b = input.nextInt();
       int c;//Lice
       c=a*b;
       int d;//Perimetar
       d=(2*a)+(2*b);
       System.out.print("Liceto e ravno na:" +c+"     Perimetara e raven na:"+d);
      
     
    
   
   }
}