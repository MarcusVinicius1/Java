import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        float soma = 0;
        float media;
        Scanner ler = new Scanner(System.in);

        // Solicitar ao usuário a quantidade de semestres
        System.out.print("Quantidade de semestre tem: ");
        int QtdSemestre = ler.nextInt();

        // Solicitar ao usuário o número de matérias
        System.out.print("Quantas matérias você tem?: ");
        int QtdMaterias = ler.nextInt();

        // Declarar as matrizes para armazenar as matérias e notas
        String[] materias = new String[QtdMaterias]; // Armazenamentos das materias
        double[][] notas = new double[QtdMaterias][QtdSemestre]; // Armazenamento de notas das materias
        double[] medias = new double[QtdSemestre]; // Armazenamento de medias
        String[] msg = new String[QtdSemestre]; // Armazenamento de mensagens de Aprovado, Recuperação e Reprovado

        System.out.println();

        // Preencher as matérias e notas
        for (int i = 0; i < QtdMaterias; i++) {
            ler.nextLine(); // Limpar o buffer
            System.out.print("Nome da matéria " + (i+1) + ": ");
            materias[i] = ler.nextLine();

            System.out.println("\nInsira as notas da matéria " + materias[i] + ":");
            for (int j = 0; j < QtdSemestre; j++) {
                System.out.print("Nota " + (j+1) + ": ");
                notas[i][j] = ler.nextDouble();

                soma += notas[i][j];
            }
            media = soma / QtdSemestre;
            medias[i] = media;

            if (media >= 7) {
                msg[i] = "Aprovado!";
            }else if (media >= 5) {
                msg[i] = "Recuperação!";
            }else {
                msg[i] = "Reprovado!";
            }

            System.out.println();
            soma = 0;
        }

        // Limpando o terminal
        System.out.print("\033[H\033[2J");
        System.out.flush();

        // Mostrar as informações
        System.out.println("\nInformações das matérias e notas\n");
        for (int i = 0; i < QtdMaterias; i++) {
            System.out.println("Matéria: " + materias[i]);
            System.out.print("Notas\n");

            for (int j = 0; j < QtdSemestre; j++) {
                System.out.print(notas[i][j] + "\n");
            }

            System.out.println("Media: " + medias[i]);
            System.out.println("Aprovação: " + msg[i]);

            System.out.println();
        }

        ler.close();
    }
}