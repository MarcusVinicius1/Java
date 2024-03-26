import java.awt.desktop.SystemEventListener;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.println("Digite o nome do produto: ");
        String NomeProduto = ler.next();

        System.out.println("Digite o 1° mes: ");
        int Mes1 = ler.nextInt();

        System.out.println("Digite o 2° mes: ");
        int Mes2 = ler.nextInt();

        System.out.println("Digite o 3° mes: ");
        int Mes3 = ler.nextInt();

        System.out.println("Digite o tempo de reposicao: ");
        int TempoDeReposicao = ler.nextInt();

        System.out.println("Digite o lote de reposição: ");
        int LoteDeReposicao = ler.nextInt();

        System.out.println("Digite estoque atual: ");
        int EstoqueAtual = ler.nextInt();

        double VMD = ((Mes1 + Mes2 + Mes3) / 3) / 25;
        double EMIN  = (TempoDeReposicao - VMD);
        double EMAX = (LoteDeReposicao + EMIN);

        /*
        \033[H move o cursor para o início do terminal.
        \033[2J limpa a tela
        */
        System.out.print("\033[H\033[2J");
        System.out.flush();

        System.out.println("\n");
        System.out.println("Produto: " + NomeProduto);
        System.out.println("EMIN: " + EMIN);
        System.out.println("EMAX: " + EMAX);
        System.out.println("VMD: " + VMD);

        if (EstoqueAtual > EMIN) {

        }else {
            
        }

        ler.close();
    }
}