package entities;

import java.util.Scanner;

public class Sistema {
    public void sistem(){
        int op = 1;
        ServicoStreaming servico = new ServicoStreaming();
        Scanner sc = new Scanner(System.in);
        System.out.println("    -------------------------------------------------");
        System.out.println("    |                  BEM- VINDO                   |");
        System.out.println("    |                 AO STREAMNOW                  |");
        System.out.println("    -------------------------------------------------");
        while (op != 0){
            System.out.println("-------------------------------------------------");
            System.out.println("|             Como podemos ajudá-lo?            |");
            System.out.println("|         Escolha uma das opções abaixo:        |");
            System.out.println("|   [1] CRIAR UMA CONTA                         |");
            System.out.println("|   [2] ACESSAR UM FILME OU SÉRIE               |");
            System.out.println("|   [3] ADICIONAR FILME OU SÉRIE NOS FAVORITOS  |");
            System.out.println("|   [0] SAIR                                    |");
            System.out.println("-------------------------------------------------");
            System.out.print("  |    OPÇÃO: ");
            op = Integer.parseInt(sc.next());
            switch (op){
                case 1:
                    System.out.println("OPÇÃO 1: CRIAR CONTA");
                    System.out.println("------------------------------------------");
                    System.out.print("Nome: ");
                    String nome = sc.next();
                    System.out.println(" ");
                    System.out.print("E-mail: ");
                    String email = sc.next();
                    System.out.println(" ");
                    System.out.print("Senha: ");
                    String senha = sc.next();
                    System.out.println(" ");
                    System.out.print("Ano de nascimento: ");
                    int ano = Integer.parseInt(sc.next());
                    System.out.println(" ");
                    Usuario conta = new Usuario(nome, email, senha, ano);
                    servico.cadastrar_usuario(conta);
                    System.out.println("CONTA CRIADA COM SUCESSO! \nID Nº: " + conta.getId());
                    break;
                case 2:
                    System.out.println("OPÇÃO 2: ACESSAR FILME OU SÉRIE");
                    System.out.print("ID USUÁRIO: ");
                    int id = Integer.parseInt(sc.next());
                    System.out.println(" ");
                    Usuario c = servico.encontrar_usuario(id);
                    System.out.print("ID FILME/SÉRIE: ");
                    int idf = Integer.parseInt(sc.next());
                    System.out.println(" ");
                    Video v = servico.encontrar_video(idf);
                    Acesso ac = new Acesso(c,v);
                    break;
                case 3:
                    System.out.println("OPÇÃO 3: ADICIONAR FILME OU SÉRIE NOS FAVORITOS");
                    System.out.print("ID USUÁRIO: ");
                    id = Integer.parseInt(sc.next());
                    System.out.println(" ");
                    c = servico.encontrar_usuario(id);
                    System.out.print("ID FILME/SÉRIE: ");
                    idf = Integer.parseInt(sc.next());
                    System.out.println(" ");
                    v = servico.encontrar_video(idf);
                    c.adicionar(v);
                    break;
                case 0:
                    System.out.println("OBRIGADO POR USAR NOSSA PLATAFORMA! ATÉ MAIS :)");
                    break;
            }

        }
    }
}
