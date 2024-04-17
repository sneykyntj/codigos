import java.util.Scanner;

public class Main{
  public static void main(String[] args) {
    Scanner scanner=new Scanner(System.in);
    System.out.println("bem vindo a calculadora simples!");

    System.out.print("Numero 1: ");
    int num1= scanner.nextInt();
    System.out.print("Numero 2: ");
    int num2= scanner.nextInt();
    System.out.print("Operacao (+,-,*,/): ");
    char operacao= scanner.next().charAt(0);

    if (operacao== '+'){
      System.out.println("o resultado é: " + soma (num1, num2));
    } else if (operacao== '-'){
      System.out.println("o resultado é: " + subtracao(num1, num2));
    } else if (operacao== '*'){
      System.out.println("o resultado é: " + multiplicacao(num1, num2));
    } else if (operacao== '/'){
      if (num2 != 0){
        System.out.println("o resultado é: " + divisao(num1, num2));
      } else {
        System.out.println("erro: divisao por zero!");
        return;
      }
    } else {
      System.out.println("erro operacao invalida!");
  }
}
  

  public static int soma(int a, int b){
    return a+b;
  }
  public static int subtracao (int a, int b){
    return a-b;
  }
  public static int multiplicacao(int a, int b){
    return a*b;
  }
  public static int divisao(int a, int b){
    return a/b;
  }
}