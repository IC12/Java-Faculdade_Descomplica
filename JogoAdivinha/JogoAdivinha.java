import java.util.Scanner;
import java.util.Random;
//Random gera números aleatórios

class Main {
  public static void main(String[] args) {
    Scanner entradaMenu = new Scanner(System.in);
    
    System.out.println("*** JOGO DE ADIVINHAÇÃO NUMÉRICO ***\n");
    System.out.println("Escolha uma opção: ");
    System.out.println("1 - Jogo fácil");
    System.out.println("2 - Jogo intermediário");
    System.out.println("3 - Jogo difícil");

    int opcao = entradaMenu.nextInt();

    while(opcao >= 1 && opcao <= 3) {
      switch(opcao){
        case 1:
          jogarAdivinhacao(10);
          break;
        case 2:
          jogarAdivinhacao(50);
          break;
        case 3:
          jogarAdivinhacao(100);
          break;
        default:
          System.out.println("Opção inválida");
          break;
      }

      System.out.println("\nDeseja jogar novamente? (s/n)");
      String resposta = entradaMenu.next();
      if (!resposta.equalsIgnoreCase("s")) {
        break;
      }

      System.out.println("\nEscolha uma opção: ");
      System.out.println("1 - Jogo fácil");
      System.out.println("2 - Jogo intermediário");
      System.out.println("3 - Jogo difícil");
      opcao = entradaMenu.nextInt();
  }
}

  public static void jogarAdivinhacao(int limite) {
    Random gerador = new Random();
    int numero = gerador.nextInt(limite);

    Scanner entrada = new Scanner(System.in);

    System.out.println("\nAdivinha o número que estou pensando...");
    int chute = entrada.nextInt();

    if(chute > limite){
        System.out.println("Número inválido para essa opção de jogo.");
        return;
      }

    if(chute == numero){
      System.out.println("Parabéns, você acertou! Pensei no " + numero);
    }
    else{
      System.out.println("Você errou! Pensei no " + numero);
    }
  }
}