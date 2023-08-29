// ALuno: Matheus Santos Cardoso Rgm: 29629420
package Jokenpo;
import java.util.Scanner;

public class JokenpoGame {
// Placar
    private static int placarJogador = 0;
    private static int placarComputador = 0;

// Escolhas
// 1 - Pedra, 2 - Papel, 3 - Tesoura

    private static int escolhaJogador;
    private static int escolhaComputador;
    private static Scanner sc ;
    
// Método principal
    public static void main (String[] args) {
// Quantidade de rodadas
        int rodadas = 0;
        int reinicia = 0;
        try (Scanner input = new Scanner (System.in)) {
// Perguntar para o jogador
            System.out.println("::: O jogo foi iniciado :::");
            System.out.println("MENU");
            System.out.println("::: (1) Jogar / (0) Desistir :::");
            reinicia = input.nextInt();
            while (reinicia == 1) {
                System.out.println("::: Jokenpo :::");
                System.out.println("Quantas partidas o jogo terá? ");
                rodadas = input.nextInt();

// Reinicia
            for (int i = 0; i < rodadas; ++i) {
                escolhaComputador = (int) (Math.random()*3) + 1;
                rotuloescolhaJogador();
                escolhaJogador = input.nextInt();
                verificaResultado();
                exibirPlacar();
            }
            System.out.println("Quer jogar novamente?");
            System.out.println("::: (1) sim / (0) não");
            reinicia = input.nextInt();
            }
        }
    }
    private static void exibirPlacar() {
        System.out.println("Jogador Score: " + placarJogador);
        System.out.println("Computador Score: " + placarComputador);

    }

    private static void verificaResultado() {
        if (escolhaJogador == escolhaComputador) {
            System.out.println("EMPATE");
            System.out.println("Você escolheu " + escolhaJogador + " e o computador escolheu " + escolhaComputador);

        }else if (escolhaJogador == 1 && escolhaComputador == 2)
        {
        	System.out.println("Você perdeu");
        	placarComputador += 1;
        
        	System.out.println("Você escolheu " + escolhaJogador + " e o computador escolheu " + escolhaComputador);
        }else if (escolhaJogador == 1 && escolhaComputador == 3 ) {
        	System.out.println("Você ganhou");
        	placarJogador += 1;
        	System.out.println("Você escolheu " + escolhaJogador + " e o computador escolheu " + escolhaComputador);
        }else if (escolhaJogador == 2 && escolhaComputador == 1 ) {
        	System.out.println("Você ganhou");
        	placarJogador += 1;
        	System.out.println("Você escolheu " + escolhaJogador + " e o computador escolheu " + escolhaComputador);
        }else if (escolhaJogador == 2 && escolhaComputador == 3 ) {
        	System.out.println("Você ganhou");
        	placarJogador += 1;
        	System.out.println("Você escolheu " + escolhaJogador + " e o computador escolheu " + escolhaComputador);
        }else if (escolhaJogador == 3 && escolhaComputador == 1 ) {
        	System.out.println("Você ganhou");
        	placarJogador += 1;
        	System.out.println("Você escolheu " + escolhaJogador + " e o computador escolheu " + escolhaComputador);
        }else if (escolhaJogador == 3 && escolhaComputador == 2 ) {
        	System.out.println("Você ganhou");
        	placarJogador += 1;
        	System.out.println("Você escolheu " + escolhaJogador + " e o computador escolheu " + escolhaComputador);
        }else {
        	System.out.println("Você não tem mais opções");	
        }
    } 
        
        
// EscolhaComputador
// Comparar com if e else
        
        
        
private static void rotuloescolhaJogador() {
	System.out.println("Escolha: ");
	System.out.println("1 - Pedra");
	System.out.println("2 - Papel");
	System.out.println("3 - Tesoura");
	System.out.println("Escolha a sua opção");
	
	}
  }
