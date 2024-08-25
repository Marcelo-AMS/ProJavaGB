package Entidades;

import java.util.Scanner;

public class Usuario {
    String nome = new String();
    String endereco = new String();
    String email = new String();
    String telefone = new String();
    int ID;
    int idade;

    Scanner entradaSt = new Scanner(System.in);
    Scanner entradaInt = new Scanner(System.in);


    public void registroU(){

            System.out.println("Informe o nome do Usuário a ser cadastrado: ");
            nome = entradaSt.nextLine();

            System.out.println("Informe a idade do Usuário a ser cadastrado: ");
            idade = entradaInt.nextInt();

        if (idade >= 15) {

            System.out.println("Informe o ID do Usuário a ser cadastrado: ");
            ID = entradaInt.nextInt();

            System.out.println("Informe o Email do Usuário a ser cadastrado: ");
            email = entradaSt.nextLine();

            System.out.println("Informe o número telefônico do Usuário para contato: ");
            telefone = entradaSt.nextLine();

            System.out.println("Informe o Endereço residencial do Usuário: ");
            endereco = entradaSt.nextLine();

        } else {

            System.out.println("O Usuário não pode ser cadastrado pois só é permitido " +
                    "o cadastro de pessoas com idade acima de 14 anos!");
        }
    }

    public void editarU(char c){

        switch(c){

            case '1':
                System.out.println("Informe o nome do Usuário a ser cadastrado: ");
                nome = entradaSt.nextLine();
                break;

            case '2':

                System.out.println("Informe a idade do Usuário a ser cadastrado: ");
                idade = entradaInt.nextInt();
                break;

            case '3':

                System.out.println("Informe o ID do Usuário a ser cadastrado: ");
                ID = entradaInt.nextInt();
                break;

            case '4':

                System.out.println("Informe o Email do Usuário a ser cadastrado: ");
                email = entradaSt.nextLine();
                break;

            case '5':

                System.out.println("Informe o número telefônico do Usuário para contato: ");
                telefone = entradaSt.nextLine();
                break;

            case '6':

                System.out.println("Informe o Endereço residencial do Usuário: ");
                endereco = entradaSt.nextLine();
                break;

            default:
                System.out.println("Opção não encontrada!!");
                break;
        }

    }

    public void excluirU(){
        nome = null;
        endereco = null;
        email = null;
        telefone = null;
        ID = 0;
        idade = 0;
    }
}
