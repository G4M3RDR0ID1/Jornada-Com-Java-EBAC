import java.util.Scanner;

public class EstruturasRepeticao {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Qual for você deseja ver: \nDigite 1 para Crescente.\nDigite 2 para Decrescente.");

        int opcaoEscolhida = sc.nextInt();

        if(opcaoEscolhida == 1){
            foCrescente();
        } else if (opcaoEscolhida == 2) {
            forDecrescente();
        } else {
            System.out.println("O numero digitado nao corresponde as opçoes disponiveis.\nFavor digitar novamente.");
        }

        sc.close();
    }

    public static void foCrescente(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite ate qual numero maximo deseja ir: ");
        int numeroMaximo = sc.nextInt();

        sc.close();

        if(numeroMaximo > 0) {
            System.out.println("FOR CRESCENTE:\n");
            for (int n1 = 0; n1 <= numeroMaximo; n1++) {
                System.out.println("O contador esta em: " + n1);
            }
            System.out.println();
        } else {
            System.out.println("Digite um numero maior que 0!");
        }
    }
    public static void forDecrescente(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite ate qual numero inicial para ser contado até 0: ");
        int numeroInicial = sc.nextInt();

        sc.close();

        if (numeroInicial > 0) {
            System.out.println("FOR DECRESCENTE:\n");
            for (int n1 = numeroInicial; n1 >= 0; n1--) {
                System.out.println("O contador esta em: " + n1);
            }
            System.out.println();
        } else {
            System.out.println("Digite um numero maior que 0!");
        }
    }

}
