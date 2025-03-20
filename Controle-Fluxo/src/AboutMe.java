import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class AboutMe {
    public static void main(String [] args){
        try {

            Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

            System.out.println("Digite seu nome :");
            String nome = scanner.next();

            System.out.println("Digite o seu sobrenome :");
            String sobreNome = scanner.next();

            System.out.println("Digite sua idade :");
            int idade = scanner.nextInt();

            System.out.println("Digite sua Altura");
            double altura = scanner.nextDouble();

            System.out.println("O meu nome é " + nome + " " + sobreNome);
            System.out.println("E eu tenho " + idade + " anos, e eu tenho " + altura + " de altura");
        } catch (InputMismatchException e) {
            System.err.println("Os campos idade e altura, devem ser obrigatoriamente numéricos");

        }
    }
}