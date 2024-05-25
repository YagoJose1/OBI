import java.util.Scanner;
//Cadastro de alunos//
public class program {
        public static void main(String[] args) {
            Scanner teclado = new Scanner(System.in);

            System.out.println("Insira a quantidade de alunos : ");
                int quantidade = teclado.nextInt();
            Aluno[] alunos = new Aluno[quantidade];
            
            teclado.nextLine();   

            for(int i = 0; i < quantidade; i++){
                System.out.println("Digite o nome do aluno : ");
                var nome = teclado.nextLine();

                System.out.println("Digite a idade do aluno : ");
                var idade = teclado.nextInt();

                teclado.nextLine();

                alunos[i] = new Aluno(nome, idade);
            }
            for(int i = 0; i < quantidade; i++)
                System.out.println("Nome : " + alunos[i].getNomes() + "  Idade : " + alunos[i].getIdade());

        }
}
