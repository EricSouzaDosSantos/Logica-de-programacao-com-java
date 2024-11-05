package aula_07.challenge;

import java.io.*;
import java.util.Scanner;

public class ContactDataBase {

    private String[] header = {"ID", "Name", "Email", "Phone"};
    private String[][] listContacts = new String[1][header.length];
    private Scanner scanner = new Scanner(System.in);
    File file = new File("src//aula_07//challenge//backup_contact.txt");
    boolean enter = true;
    int option;
    int id;
    String table = "";

    public ContactDataBase() {
        loadDataToArray();
    }

    public void optionMatriz() {

        while (enter) {
            System.out.println("-------------------Você entrou na lista da matriz------------------");
            System.out.println("Escolha uma das opções abaixo");
            System.out.println("1 - Criar uma quantidade especifica de usuários");
            System.out.println("2 - Atualizar um usuário");
            System.out.println("3 - Deletar um usuário");
            System.out.println("4 - Criar somente um usuário");
            System.out.println("5 - Mostrar lista");
            System.out.println("6 - Sair");
            option = scanner.nextInt();
            scanner.nextLine();

            switch (option) {
                case 1:
                    setContacts();
                    break;
                case 2:
                    updateContact();
                    break;
                case 3:
                    deleteContact();
                    break;
                case 4:
                    setContact();
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

    public void expandContacts() {
        String[][] newContacts = new String[listContacts.length + 1][4];
        for (int i = 0; i < listContacts.length; i++) {
            for (int j = 0; j < header.length; j++) {
                newContacts[i][j] = listContacts[i][j];
            }
        }
        listContacts = newContacts;
    }

    public void setContacts() {
        System.out.println("Quantos usuários deseja inserir");
        int quantContacts = scanner.nextInt();
        scanner.nextLine();

        if (listContacts[0][0] == null) {
            listContacts[0] = header;
        }

        for (int i = 0; i < quantContacts; i++) {
            setContact();
            saveDataToFile();
        }
    }

    public void setContact() {
        boolean foundEmptyRow = false;
        int emptyRowIndex = -1;

        if (listContacts[0][0] == null || listContacts[0][0] == "") {
            listContacts[0] = header;
        }

        for (int i = 0; i < listContacts.length; i++) {
            if (listContacts[i][0].equals("")) {
                foundEmptyRow = true;
                emptyRowIndex = i;
                break;
            }
        }

        if (!foundEmptyRow) {
            expandContacts();
            emptyRowIndex = listContacts.length - 1;
        }

        System.out.print("Digite seu nome: ");
        listContacts[emptyRowIndex][1] = scanner.nextLine();

        System.out.print("Digite seu email: ");
        listContacts[emptyRowIndex][2] = scanner.nextLine();

        System.out.print("Digite seu telefone: ");
        listContacts[emptyRowIndex][3] = scanner.nextLine();

        if (!foundEmptyRow) {
            System.out.println("Continua id normal");
            listContacts[emptyRowIndex][0] = "" + emptyRowIndex;

        } else {
            System.out.println("O id acrescenta mais 1");
            listContacts[emptyRowIndex][0] = "" + (emptyRowIndex);
        }
        saveDataToFile();
    }

    public void updateContact() {

        int changeOption;

        System.out.println("Lista de usuários:");
        System.out.println();
        System.out.println("----------------------------------------");
        showMatriz();
        System.out.println("----------------------------------------");

        System.out.print("Qual o id do usuário que você deseja alterar: ");
        id = scanner.nextInt();

        System.out.println("O que você deseja alterar: ");
        System.out.println("1 - nome");
        System.out.println("2 - email");
        System.out.println("3 - telefone");
        System.out.println("4 - desejo alterar tudo");
        changeOption = scanner.nextInt();
        scanner.nextLine();


        switch (changeOption) {
            case 1:
                System.out.print("Digite seu nome: ");
                listContacts[id][1] = scanner.nextLine();
                break;
            case 2:
                System.out.print("Digite seu email: ");
                listContacts[id][2] = scanner.nextLine();
                break;
            case 3:
                System.out.print("Digite seu telefone: ");
                listContacts[id][3] = scanner.nextLine();
                break;
            case 4:
                System.out.print("Digite seu nome: ");
                listContacts[id][1] = scanner.nextLine();

                System.out.print("Digite seu email: ");
                listContacts[id][2] = scanner.nextLine();

                System.out.print("Digite seu telefone: ");
                listContacts[id][3] = scanner.nextLine();
                break;
        }
        saveDataToFile();
    }

    public void deleteContact() {
        System.out.println("Lista de usuários:");
        System.out.println();
        System.out.println("----------------------------------------");
        showMatriz();
        System.out.println("----------------------------------------");

        System.out.print("Qual o id do usuário que você deseja deletar: ");
        id = scanner.nextInt();

        for (int i = id; i < listContacts.length - 1; i++) {
            int changeID = Integer.parseInt(listContacts[i + 1][0]) - 1;
            listContacts[i][0] = "" + changeID;
            listContacts[i][1] = listContacts[i + 1][1];
            listContacts[i][2] = listContacts[i + 1][2];
            listContacts[i][3] = listContacts[i + 1][3];
        }

        listContacts[listContacts.length - 1][0] = "";
        listContacts[listContacts.length - 1][1] = "";
        listContacts[listContacts.length - 1][2] = "";
        listContacts[listContacts.length - 1][3] = "";

        saveDataToFile();

    }


    public void showMatriz() {
        System.out.println("Matriz preenchida:");
        for (int i = 0; i < listContacts.length; i++) {
            for (int j = 0; j < header.length; j++) {

                System.out.print(listContacts[i][j] + "\t");
            }
            System.out.println();
        }
//        loadDataToArray();
    }

    public void saveDataToFile() {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(file))) {
            if (file.exists()) {
                for (int i = 0; i < listContacts.length; i++) {
                    if (listContacts[i][0] != null && !listContacts[i][0].isEmpty()) {
                        writer.write(String.join(":", listContacts[i]));
                        writer.newLine();
                    }
                }
            }else {
                file.createNewFile();
            }
        } catch (IOException e) {
            System.out.println("Erro ao salvar os dados: " + e.getMessage());
        }
    }

    public void loadDataToArray() {
        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String line;
            int row = 0;

            while ((line = reader.readLine()) != null) {
                String[] contactData = line.split(":");

                if (row >= listContacts.length) {
                    expandContacts();
                }
                for (int col = 0; col < contactData.length; col++) {
                    listContacts[row][col] = contactData[col];
                }
                row++;
            }
            reader.close();

//            System.out.println("Dados carregados com sucesso.");

        } catch (FileNotFoundException e) {
            System.out.println("Arquivo não encontrado: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("Erro ao ler o arquivo: " + e.getMessage());
        }
    }
}