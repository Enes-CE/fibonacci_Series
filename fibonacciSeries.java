import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Lütfen terim sayısını giriniz : ");
    int number = scanner.nextInt();
     int sayi1 = 1;
     int sayi2 = 1;
     int sayi3 ;

    for(int i = 0; i<number ; ++i){

        sayi3=sayi1+sayi2;
        sayi1=sayi2;
        sayi2=sayi3;
        System.out.print(" "+sayi3);

    }
  }
}
