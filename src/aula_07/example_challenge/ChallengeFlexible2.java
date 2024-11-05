package aula_07.example_challenge;

import javax.management.StandardMBean;
import java.io.*;
import java.util.Scanner;
import java.util.UUID;

public class ChallengeFlexible2 {

    static String[][] matrizCadastro = {null};
    static String[] cabecalho = {"ID", "Nome", "Telefone", "Email"};
    static Scanner scanner = new Scanner(System.in);
    static File file = new File("src//aula_07//example_challenge//bancoDeDados.txt");

    public static void main(String[] args) {
        carregarDadosNaMatriz();
        matrizCadastro[0] = cabecalho;
        int opcao;
        do {
            System.out.println("Escolha uma opção:");
            System.out.println("1 - Para cadastrar um usuário");
            System.out.println("2 - Para exibir o cadastro");
            System.out.println("3 - Para atualizar um usuário");
            System.out.println("4 - Para deletar um usuário");
            System.out.println("5 - Sair");

            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    cadastrarUsuario();
                    break;
                case 2:
                    exibirCadastro();
                    break;
                case 3:
                    atualizarUsuario();
                    break;
                case 4:
                    deletarUsuario();
                    break;
                case 5:
                    System.out.println("Fim do Programa!");
                    scanner.close();
                    break;
                default:
                    System.out.println("Opção Inválida!");
            }
        } while (opcao != 5);
    }

    private static void cadastrarUsuario() {
        System.out.print("digite a quantidade de pessoas a serem cadastradas:");
        int qtdPessoas = scanner.nextInt();
        scanner.nextLine();
        String[][] novaMatriz = new String[qtdPessoas + matrizCadastro.length][matrizCadastro[0].length];

        // copiar matrizCadastro para nova matriz
        for (int linhas = 0; linhas < matrizCadastro.length; linhas++) {
            for (int colunas = 0; colunas < matrizCadastro[0].length; colunas++) {
                novaMatriz[linhas][colunas] = matrizCadastro[linhas][colunas];
            }
        }

        System.out.println("Preencha os dados a seguir: ");

        // Preenche novos usuários na novaMatriz
        for (int linhas = matrizCadastro.length; linhas < novaMatriz.length; linhas++) {
            novaMatriz[linhas][0] = String.valueOf(linhas);
            System.out.println(matrizCadastro[0][0] + " - " + linhas);

            for (int colunas = 1; colunas < matrizCadastro[0].length; colunas++) {
                System.out.print(matrizCadastro[0][colunas] + ": ");
                novaMatriz[linhas][colunas] = scanner.nextLine();
            }
        }
        matrizCadastro = novaMatriz;
        salvarDadosNoArquivo();
    }

    private static void exibirCadastro() {
        String tabela = "";
        for (int linhas = 0; linhas < matrizCadastro.length; linhas++) {
            for (int colunas = 0; colunas < matrizCadastro[0].length; colunas++) {
                tabela += matrizCadastro[linhas][colunas];
                tabela += colunas == 0 ? "\t" : "\t\t\t";
            }
            tabela += "\n";
        }
        System.out.println(tabela);
    }

    private static void atualizarUsuario() {
        exibirCadastro();
        System.out.print("Digite o id do usuario que deseja atualizar:");
        int idUsuario = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Atualize as informações a seguir:");
        System.out.println(matrizCadastro[0][0] + " - " + idUsuario);

        for (int colunas = 1; colunas < matrizCadastro[0].length; colunas++) {
            System.out.print(matrizCadastro[0][colunas] + ": ");
            matrizCadastro[idUsuario][colunas] = scanner.nextLine();
        }
        System.out.println("Usuário atualizado com sucesso!");
        exibirCadastro();
        salvarDadosNoArquivo();
    }

    private static void deletarUsuario() {
        exibirCadastro();
        System.out.print("Digite o id do usuario que deseja deletar:");
        int idUsuario = scanner.nextInt();
        scanner.nextLine();

        String[][] novaMatriz = new String[matrizCadastro.length - 1][matrizCadastro[0].length];
        novaMatriz[0] = cabecalho;

        for (int linhasMatrizCadastro = 1, linhasNovaM = 1; linhasMatrizCadastro < matrizCadastro.length; linhasMatrizCadastro++) {
            if (linhasMatrizCadastro == idUsuario) {
                continue;
            }
            novaMatriz[linhasNovaM] = matrizCadastro[linhasMatrizCadastro];
            novaMatriz[linhasNovaM][0] = String.valueOf(linhasNovaM);
            linhasNovaM++;
        }
        matrizCadastro = novaMatriz;
        System.out.println("Usuário deletado com sucesso!");
        exibirCadastro();
        salvarDadosNoArquivo();
    }

    private static void salvarDadosNoArquivo() {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(file))) {
                for (String[] matriz : matrizCadastro) {
                    writer.write(String.join(":", matriz) + "\n");
                }


        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private static void carregarDadosNaMatriz() {

        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {

            if (!file.exists())
                return;
            String linha = "", dados = "";

            while ((linha = reader.readLine()) != null){
                dados += linha+"\n";
            }

            String[] linhaUsuarios = dados.split("\n");
            int qtdColumns = linhaUsuarios[0].split(":").length;

            matrizCadastro = new String[linhaUsuarios.length][qtdColumns];

            for (int linhas = 0; linhas < linhaUsuarios.length; linhas++){
                matrizCadastro[linhas] = linhaUsuarios[linhas].split(":");
            }

        } catch (FileNotFoundException e) {
            System.out.println("Arquivo não encontrado " + e.getMessage());
        } catch (IOException e) {
            System.out.println("Erro ao ler arquivo " + e.getMessage());
        }

    }
}
