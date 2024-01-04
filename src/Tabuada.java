import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um número até 10 para ver a tabuada:");
        int numeroSelecionado = sc.nextInt();

        while (numeroSelecionado <= 10) {
            for (int i = 1; i <= 10; i++) {
                System.out.println(numeroSelecionado + " x " + i + " = " + numeroSelecionado * i);
            }
            numeroSelecionado++;
        }
    }
}