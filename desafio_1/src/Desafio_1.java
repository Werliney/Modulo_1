import java.util.Scanner;

public class Desafio_1 {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Informe a capacidade máxima do teleférico: ");
        int capacidadeMaxima = leitor.nextInt();
        System.out.println("Informe o número de alunos: ");
        int numeroAlunos = leitor.nextInt();
        int alunosComMonitor = capacidadeMaxima - 1;
        int numeroDeViagens = 0;

        while (numeroAlunos > 0) {
            numeroAlunos = numeroAlunos - alunosComMonitor ;
            numeroDeViagens++;
        }
        System.out.println("Numero de viagens: " + numeroDeViagens);
    }
}
