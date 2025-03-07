import java.util.Scanner;

public class scanner {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int numberfuncionario;
        int horastrabalhadas;
        double valorhora;
        double salario;

        System.out.println("Digite o numero do funcionario: ");
        numberfuncionario = sc.nextInt();
        System.out.println("Horas trabalhadas: ");
        horastrabalhadas = sc.nextInt();
        System.out.println("Valor por hora: ");
        valorhora = sc.nextDouble();

        salario = horastrabalhadas * valorhora;

        System.out.println("Numero do funcionario: " + numberfuncionario);
        System.out.println("Salario é: " + salario);



    }
}
