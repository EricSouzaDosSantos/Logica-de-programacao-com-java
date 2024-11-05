package aula_07.challenge;

import java.util.Scanner;

public class Contacts {

    private int quantContacts;
    private String[][] listContacts = new String[quantContacts][4];
    private Scanner scanner = new Scanner(System.in);
    boolean enter = true;
    int option;

    public void optionMatriz(){

        while (enter) {
            System.out.println("-------------------Você entrou na lista da matriz------------------");
            System.out.println("Escolha uma das opções abaixo");
            System.out.println("1 - Criar uma quantidade especifica de usuários");
            System.out.println("2 - Atualizar um usuário");
            System.out.println("3 - Deletar um usuário");
            System.out.println("4 - Criar somente um usuário");
            System.out.println("5 - mostrar lista");
            System.out.println("6 = sair");
            option = scanner.nextInt();

            switch (option){
                case 1:
                    setContacts();
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    showMatriz();
                    break;
                case 6:
                    enter = false;
                    break;
            }
        }
    }

    public void setContacts(){

        System.out.println("Quantos usuários deseja inserir");
        quantContacts = scanner.nextInt() + 1;
        scanner.nextLine();
        int id = 0;
//        listContacts  = new String[quantContacts][4];
        listContacts[0][0] = "Id        ";
        listContacts[0][1] = "Name      ";
        listContacts[0][2] = "Email     ";
        listContacts[0][3] = "Phone     ";

        for (int i = 1; i < listContacts.length; i++) {
            for (int j = 0; j < listContacts[i].length; j++) {
                if (j == 0) {
                    id++;
                    listContacts[i][0] = ""+id+"         ";
                }
                    if (j == 1) {
                        System.out.print("Digite seu nome: ");
                        listContacts[i][j] = scanner.nextLine();
                    } else if (j == 2) {
                        System.out.print("Digite seu email: ");
                        listContacts[i][j] = scanner.nextLine();

                    } else if (j == 3) {
                        System.out.print("Digite seu telefone: ");
                        listContacts[i][j] = scanner.nextLine();
                    }

            }
        }
    }


    public void showMatriz() {
        System.out.println("Matriz preenchida:");
        for (int i = 0; i < listContacts.length; i++) {
            for (int j = 0; j < listContacts[i].length; j++) {
                System.out.print(listContacts[i][j] + " ");
            }
            System.out.println();
        }
    }
}
