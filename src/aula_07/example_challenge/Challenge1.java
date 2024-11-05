package aula_07.example_challenge;

import java.util.Scanner;

public class Challenge1 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Quantos usuários você deseja criar: ");
        int userLineQunatity = scanner.nextInt();
        scanner.nextLine();

        String[] header = {"ID", "Name", "Email", "Phone"};
        String[][] arrayUsers = new String[userLineQunatity+1][4];

        arrayUsers[0] = header;

        System.out.println("Preencha os dados a seguir:");

        for (int row = 1; row < arrayUsers.length; row++) {

            System.out.println("ID: ");
            arrayUsers[row][0] = scanner.nextLine();

            System.out.println("Nome: ");
            arrayUsers[row][1] = scanner.nextLine();

            System.out.println("Email: ");
            arrayUsers[row][2] = scanner.nextLine();

            System.out.println("Telefone: ");
            arrayUsers[row][3] = scanner.nextLine();

        }

        for (int row = 0; row < arrayUsers.length; row++) {
            System.out.println(arrayUsers[row][0]+"\t"+arrayUsers[row][1]+"\t\t"+arrayUsers[row][2]+"\t\t"+arrayUsers[row][3]);

        }
    }
}
