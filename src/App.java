import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import br.com.java.modelo.Pessoa;

public class App {
    public static void main(String[] args) throws Exception {

        List<Pessoa> lista = new ArrayList<Pessoa>();

        Pessoa pessoa;

        Scanner teclado = new Scanner(System.in);
        int opcao = 0;

        do {
            System.out.println("----Menu----");

            System.out.println("Escolha uma opção: ");

            System.out.println("1 - Inserir Aluno"); 
            System.out.println("2 - Listar Aluno");
            System.out.println("3 - Sair");

            

            System.out.println("Digite sua opção: ");
            opcao = Integer.parseInt(teclado.nextLine());

            if (opcao == 1) {

                

                String CPF = " ";
                
                // criar objeto
                pessoa = new Pessoa();

                boolean x = true;
                while (x == true) {
                    System.out.print("Informe um número inteiro maior que 1: ");
                    
                    System.out.println("Digite seu cpf: ");
                    pessoa.setCpf(teclado.nextLine());

                    if (ValidaCPF.isCPF(CPF) == true) {
                        System.out.println("Digitou corretamente");
                    } else {
                        for (int index = 0; index < lista.size(); index++) {
                            System.out.printf("Erro, CPF invalido !!!\n");

                        }

                    } // break;

                }

                

                // System.out.println("Digite seu cpf: ");
                // pessoa.setCpf(teclado.nextLine());

                // if (ValidaCPF.isCPF(CPF) == true)
                // //    System.out.printf("%s\n", ValidaCPF.imprimeCPF(CPF));

                
                // else System.out.printf("Erro, CPF invalido !!!\n");
            

                System.out.println("Digite seu nome: ");
                pessoa.setNome(teclado.nextLine());

                lista.add(pessoa);

            } else if (opcao == 2) {
                
                if (lista.isEmpty()) {
                    
                    System.out.println("Ainda não existem pessoas cadastradas.");
                    teclado.nextLine();

                } else {

                    System.out.println(lista);

                    System.out.println("Pressione uma tecla para prosseguir.");
                    teclado.nextLine();
                }
            }
        } while (opcao != 0);

        teclado.close();
    }
}
