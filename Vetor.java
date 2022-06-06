import java.util.Scanner;
public class Vetor{

    public static void main(String[] args) {
        int v[] = new int[5];

    Scanner teclado = new Scanner (System.in);

    for (int i = 0; 1 < 5; i++) {
        System.out.println("Digite umvalor para a posição " + 1 + " do vetor: ");
        v[i] = teclado.nextInt();

    }

    for (int j = 0; j < 5 ; j++) {
        System.out.println("O vetor tem o valor " + v[j] + " na posição [" + j + "]");
        
        }
    }
}