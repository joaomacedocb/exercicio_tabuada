import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Boas-vindas ao programa Tabuada! Digite o número da opção desejada:");
        System.out.println("1 - Ver tabuada completa de um número");
        System.out.println("2 - Fazer uma multiplicação entre dois números");
        System.out.println("3 - Ver listagem de tabuadas");

        int opcaoSelecionada = sc.nextInt();

        switch (opcaoSelecionada) {
            case 1: System.out.println("Implementar...");
            break;
            case 2: System.out.println("Implementar 2...");
            break;
            case 3: int numeroInicial = 1;

                    while (numeroInicial <= 10) {
                        System.out.println("TABUADA DO NÚMERO " + numeroInicial + ":");
                        for (int i = 1; i <= 10; i++) {
                            System.out.println(numeroInicial + " x " + i + " = " + numeroInicial * i);
                        }
                        numeroInicial++;
                    }
        }
    }
}