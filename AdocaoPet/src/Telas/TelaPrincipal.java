package Telas;

import Controlador.ControladorPrincipal;
import Controlador.ControladorPet;
import java.util.Scanner;

public class TelaPrincipal {
    private ControladorPrincipal ctrlPrincipal;
    private Scanner teclado;
    
    public TelaPrincipal(ControladorPrincipal ctrlPrincipal) {
        this.ctrlPrincipal = ctrlPrincipal;
        this.teclado = new Scanner(System.in);
      
    }

    
    private int leInteiro() {
        int inteiro = teclado.nextInt();
        teclado.nextLine();
        return inteiro;
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
        System.out.println("(4) Sair");
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
                ctrlPrincipal.historicoUsuarios();
                break;
             case 4:
                exibeTelaLogin();
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
        System.out.println("(3) Peixe");
        
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
        System.out.println("(3) Peixe");
    
        int opcao = leInteiro();
         ctrlPrincipal.doarPet(opcao);
    
    }

    public void registroSucessoTela() {
        System.out.println("----------------------------------------------------------------");
        System.out.println("-------------------PET REGISTRADO COM SUCESSO-------------------");
        System.out.println("----------------------------------------------------------------");
        exibeTelaPrincipal();
        

    }
    
    
    
}
