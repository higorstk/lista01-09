import java.util.Scanner;
class Main{
public static void main(String[] args){
//Passo1:Mostrar variaveis
  double fahrenheit;
  double celcius;
  //Passo2:Entrada de dados
  Scanner teclado = new Scanner(System.in);
  System.out.println("Digite a temperatura em fahrenheit");
  fahrenheit = teclado.nextDouble();
  //Passo3:Transformar fahrenheit em celcius
  celcius = 5 * (( fahrenheit - 32) / 9);
  //Passo4:Mostrar resultado
  System.out.println ("A temperatura em celcius é :" + celcius);
}
}