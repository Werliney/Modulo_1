import java.util.ArrayList;
import java.util.Scanner;

public class Desafio2 {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Informe o número para calcular a quantidade de fatoriais: ");
        int numero = leitor.nextInt();
        int copiaDonumero = numero;
        int[] vetorDoNumero = new int[numero + 1];
        int[] vetorDoFatorial = new int[numero + 1];
        ArrayList<Integer> listaReduzida = new ArrayList();
        int fatorial = 1;
        int j = 1;
        int maiorNumero = 0;
        int quantidade = 0;
        int quantidade2 = 0;

        for (int i = 1; i <= numero; i++) {
            vetorDoNumero[i] = i;
        }

        for (int i = 1; i <= numero; i++) {
            fatorial *= vetorDoNumero[i];
            vetorDoFatorial[j] = fatorial;
            j++;
        }

        System.out.println("Vetor dos números: ");

        for (int z = 1; z <= numero; z++) {
            System.out.println(vetorDoNumero[z]);
        }

        System.out.println("Vetor de fatoriais do vetor dos números: ");

        for (int i = 1; i <= numero; i++) {
            System.out.println(vetorDoFatorial[i]);
        }

        for (int i = 1; i <= numero; i++) {
            if (vetorDoFatorial[i] <= numero) {
                listaReduzida.add(vetorDoFatorial[i]);
            }
        }

        for (int i = 0; i < listaReduzida.size(); i++) {
            maiorNumero = listaReduzida.get(listaReduzida.size()-1);
            if (numero - maiorNumero == 0) {
                quantidade = 1;
                System.out.println("A quantidade é: " + quantidade);
                break;
            }
            if (numero - maiorNumero != 0) {
                while (copiaDonumero >= 0) {
                    copiaDonumero = copiaDonumero - maiorNumero;
                    quantidade2++;
                }
                System.out.println("A quantidade é: " + quantidade2);
                break;
            }
            System.out.println(listaReduzida.get(i));
        }

    }



}
