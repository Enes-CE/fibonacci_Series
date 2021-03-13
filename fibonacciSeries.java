import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Lütfen terim sayısını giriniz : ");
    int term = scanner.nextInt();
    
    int number1 = 1;
    int number2 = 1;
    int number3 ;
    
    System.out.print(number1 +" "+number2);

    for(int i = 0; i<term ; ++i){
        number3 = number1 + number2;
        number1 = number2;
        number2 = number3;
        System.out.print(" " + sayi3);
    }
  }
}
