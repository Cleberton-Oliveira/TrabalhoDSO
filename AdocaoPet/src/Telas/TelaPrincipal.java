package Telas;

import Controlador.ControladorPrincipal;
import Entidade.ConteudoTelaUsuario;
import java.util.InputMismatchException;

import java.util.Scanner;

public class TelaPrincipal {
    private ControladorPrincipal ctrlPrincipal;
    private Scanner teclado;
    
    public TelaPrincipal(ControladorPrincipal ctrlPrincipal) {
        this.ctrlPrincipal = ctrlPrincipal;
        this.teclado = new Scanner(System.in);
      
    }

    private int leInteiro() throws InputMismatchException {
        try {  
          int inteiro = teclado.nextInt();
          teclado.nextLine();
          return inteiro;

        }catch (InputMismatchException e){
          System.out.println("Digite uma opção válida!" + e.getMessage()); 
          return 0;
        }   
    }
    
    public void exibeTelaLogin(){
        System.out.println("----------------------------------------------------------------");
        System.out.println("------------------BEM VINDO AO ADOÇAO DE PET--------------------");
        System.out.println("----------------------------------------------------------------");
        System.out.println("");
        System.out.println("(1) Já tenho cadastro!");
        System.out.println("(2) Cadastrar-se!");
        System.out.println("");
        System.out.println("----------------------------------------------------------------");
        
        int opcao = leInteiro();
        
        ctrlPrincipal.executaOpcaoLogin(opcao);
             
    }
    
    public void exibeTelaPrincipal() {
        System.out.println("----------------------------------------------------------------");
        System.out.println("-----------------------MENU ADOÇAO DE PET ----------------------");
        System.out.println("----------------------------------------------------------------");
        System.out.println("");
        System.out.println("(1) Adotar um pet");
        System.out.println("(2) Doar um pet");
        System.out.println("(3) Conferir meu historico");
        System.out.println("(4) Editar Dados");
        System.out.println("(5) Sair");
        System.out.println("(6) Apagar Conta");
        
        System.out.println("----------------------------------------------------------------");
        
        int opcao = leInteiro();
        
        switch(opcao){
            case 1: 
                adotarPet();
                break;
            case 2:
                doarPet();
                break;
             case 3:
                ctrlPrincipal.historico();
                break;
             case 4:
                exibeEditarDados();
                break;
             case 5:
                exibeTelaLogin();
                break;
             case 6:
                ctrlPrincipal.apagaConta();
                break;   
             case 0:
                erroDigitacao();
                break; 
                      
        }        
             
    }

    private void adotarPet() {
        System.out.println("----------------------------------------------------------------");
        System.out.println("--------------------------ADOÇÃO DE PET-------------------------");
        System.out.println("----------------------------------------------------------------");
        System.out.println("                  QUAL PET GOSTARIA DE ADOTAR          ");
        System.out.println("");
        System.out.println("(1) Dog");
        System.out.println("(2) Gato");
        System.out.println("(3) Passaro");
        
         int opcao = leInteiro();
         ctrlPrincipal.adotarPet(opcao);
                
    }

    private void doarPet() {
        System.out.println("----------------------------------------------------------------");
        System.out.println("--------------------------DOAÇÃO DE PET-------------------------");
        System.out.println("----------------------------------------------------------------");
        System.out.println("                    QUAL PET GOSTARIA DE DOAR          ");
        System.out.println("");
        System.out.println("(1) Dog");
        System.out.println("(2) Gato");
        System.out.println("(3) Passaro");
    
        int opcao = leInteiro();
         ctrlPrincipal.doarPet(opcao);
    
    }

    public void registroSucessoTela() {
        System.out.println("----------------------------------------------------------------");
        System.out.println("-------------------PET REGISTRADO COM SUCESSO-------------------");
        System.out.println("----------------------------------------------------------------");
        exibeTelaPrincipal();
        
    }

    private void exibeEditarDados() {
        ConteudoTelaUsuario conteudoTela = new ConteudoTelaUsuario();
        System.out.println("----------------------------------------------------------------");
        System.out.println("-------------------------- EDITAR DADOS ------------------------");
        System.out.println("----------------------------------------------------------------");
        System.out.println("");
        System.out.println("(1) Editar Nome");
        System.out.println("(2) Editar CPF");
        System.out.println("(3) Editar Senha");
        System.out.println("(4) Volta Menu Principal");
        
         int opcao = leInteiro();
        
        switch(opcao){
            case 1: 
                System.out.println("Digite a novo nome: ");
                String nome = teclado.nextLine();
                ctrlPrincipal.mudaNome(nome);
                break;
            case 2:
                System.out.println("Digite a novo CPF: ");
                String cpf = teclado.nextLine();
                ctrlPrincipal.mudaCpf(cpf);
                break;
             case 3:
                System.out.println("Digite a nova senha: ");
                String senha = teclado.nextLine();
                ctrlPrincipal.mudaSenha(senha);
                break;
             case 4:
                exibeTelaPrincipal();
                break;
            
        }        
    }

    private void erroDigitacao() {
        System.out.println("Devido ao erro de digitação você voltara ao Menu Principal");
        teclado.nextLine();
        exibeTelaPrincipal();
    }
    
    
}
