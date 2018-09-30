package Telas;

import Controlador.ControladorUsuario;
import java.util.Scanner;
import Entidade.ConteudoTelaUsuario;

public class TelaUsuario {
    private ControladorUsuario ctrlUsuario;
    private Scanner teclado;
    
    public TelaUsuario(ControladorUsuario ctrlUsuario){
        this.ctrlUsuario = ctrlUsuario;
        this.teclado = new Scanner(System.in);
    }
   
    private int leInteiro() {
        int inteiro = teclado.nextInt();
        teclado.nextLine();
        //excessao
        return inteiro;
    }
    
    public void exibeFazerLogin() {
        System.out.println("");
        System.out.println("-------------------------FAZER LOGIN----------------------------");
        System.out.println("----------------------------------------------------------------");
        System.out.print("CPF: ");
        String cpf = teclado.nextLine();
        System.out.print("Senha: ");
        String senha = teclado.nextLine();
        System.out.println("----------------------------------------------------------------");
        String loginUsuario = cpf + senha;
        ctrlUsuario.logar(loginUsuario);
    }
    
    public void erroLogin() {
        System.out.println("----------------------------------------------------------------");
        System.out.println("--------------------ERRO AO EFETUAR LOGIN-----------------------");
        System.out.println("----------------------------------------------------------------");
        System.out.println("--------------------CPF ou Seha incorreto-----------------------");
        System.out.println("----------------------------------------------------------------");
        
        exibeFazerLogin();
    }


    public void exibeCadastraUsuario() {
        ConteudoTelaUsuario conteudoTela = new ConteudoTelaUsuario();
        System.out.println("-------------------------CRIAR CONTA----------------------------");
        System.out.println("----------------------------------------------------------------");
        System.out.print("Nome: ");
        conteudoTela.nomeUsuario = teclado.nextLine();
        System.out.print("CPF: ");
        conteudoTela.cpfUsuario = teclado.nextLine();
        System.out.print("Senha: ");
        conteudoTela.senhaUsuario = teclado.nextLine();
        System.out.println("----------------------------------------------------------------");
        ctrlUsuario.incluiUsuario(conteudoTela);
    }

    public void contaCriadaComSucesso() {
        System.out.println("----------------------------------------------------------------");
        System.out.println("-------------------CONTA CRIADA COM SUCESSO---------------------");
        System.out.println("----------------------------------------------------------------");

        exibeFazerLogin();
    }
    

    
    
}
