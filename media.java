import java.util.Scanner;

public class media {

    public static void main (String[]args) {

        Scanner leitor = new Scanner (System.in);

        double mediaG, no1, no2, faltas;
        String nome, status;

        System.out.print ("Digite o nome do aluno: ");
        nome = leitor.nextLine ();

        System.out.print ("Digite a nota 1: ");
        no1 = leitor.nextDouble ();

        System.out.print ("Digite a nota 2: ");
        no2 = leitor.nextDouble  ();

        System.out.print ("Digite a quantidade de faltas: ");
        faltas = leitor.nextDouble ();

        if (no1 < 0 || no1 > 10 || no2 < 0 || no2 > 10) {
            
            System.out.println ("Erro! Nota 1 e 2 devem estar entre 0 e 10");
            System.exit(0);
        }

        mediaG = Math.pow (no1 * no2, 0.5);

        if (faltas > 20) {
            status = "Reprovado por faltas"; }
        else if (mediaG < 3) {
            status = "Reprovado por notas"; }
        else if (mediaG >= 3 && mediaG <5) {
            status = "Recuperação"; }
        else if (mediaG >= 5 && mediaG < 6) {
            status = "Exame"; }
        else {
            status = "Aprovado"; }

            String saida;
            saida = String.format ("Nome:%s\nStatus:%s\nMedia:%.2f\nFaltas:%.0f", nome, status, mediaG, faltas);
            System.out.println (saida);

    }
}
