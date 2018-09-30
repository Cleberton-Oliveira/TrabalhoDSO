package Telas;

import Controlador.ControladorPet;
import Entidade.ConteudoTelaPet;
import java.util.ArrayList;
import java.util.Scanner;

public class TelaPets {
    private ControladorPet ctrlPet;
    private Scanner teclado;
    
    private final int CACHORRO=1,GATO=2, PASSARO=3;
    
    public TelaPets(ControladorPet ctrlPet) {
        this.ctrlPet= ctrlPet;
        this.teclado = new Scanner(System.in);
    }
    
    private int leInteiro() {
        int inteiro = teclado.nextInt();
        teclado.nextLine();
        return inteiro;
    }

    public void adotaDog() {
        ConteudoTelaPet conteudoTela = new ConteudoTelaPet();
        System.out.println("----------------------------------------------------------------");
        System.out.println("--------------------------ADOÇÃO DE CÃO-------------------------");
        System.out.println("----------------------------------------------------------------");
        System.out.println("");
        System.out.println("Qual a Raça de cachorro gostaria de adotar:");
        System.out.println("");
        System.out.println("(1) Pastor Alemão");
        System.out.println("(2) Labrador");
        System.out.println("(3) Buldogle");
        System.out.println("(4) Beagle");
        System.out.println("(5) Poodle"); 
        int opcaoRaca = leInteiro();
        System.out.println("Qual sexo do cão:"); 
        System.out.println("");
        System.out.println("(1) Masculino "); 
        System.out.println("(2) Feminino "); 
        int opcaoSexo = leInteiro();
        enviarInformacaoAdocao(opcaoRaca, opcaoSexo);
       

    }

    public void adotaGato() {
        System.out.println("----------------------------------------------------------------");
        System.out.println("--------------------------ADOÇÃO DE GATO------------------------");
        System.out.println("----------------------------------------------------------------");
        System.out.println("");
        System.out.println("Qual a Raça de gato gostaria de adotar:");
        System.out.println("");
        System.out.println("(1) Perça");
        System.out.println("(2) Saames");
        System.out.println("(3) Azul Russo");
        System.out.println("(4) Ragdoll");
        int opcaoRaca = leInteiro();
        System.out.println("Qual sexo do gato:"); 
        System.out.println("");
        System.out.println("(1) Masculino "); 
        System.out.println("(2) Feminino "); 
        int opcaoSexo = leInteiro();
        enviarInformacaoAdocao(opcaoRaca, opcaoSexo);
    }

    public void adotaPassaro() {
        System.out.println("----------------------------------------------------------------");
        System.out.println("-------------------------ADOÇÃO DE PASSARO----------------------");
        System.out.println("----------------------------------------------------------------");
        System.out.println("");
        System.out.println("Qual a especie de passaro gostaria de adotar:");
        System.out.println("");
        System.out.println("(1) Canario");
        System.out.println("(2) Calopsita");
        System.out.println("(3) Agapornis");
        int opcaoRaca = leInteiro();
        System.out.println("Qual sexo do passaro:"); 
        System.out.println("");
        System.out.println("(1) Masculino "); 
        System.out.println("(2) Feminino "); 
        int opcaoSexo = leInteiro();
        enviarInformacaoAdocao(opcaoRaca, opcaoSexo);
        
    }

    public void doarDog() {
        ConteudoTelaPet conteudoTela = new ConteudoTelaPet();
        int pet = 1;
        System.out.println("----------------------------------------------------------------");
        System.out.println("--------------------------DOAÇÃO DE CÃO-------------------------");
        System.out.println("----------------------------------------------------------------");
        System.out.println("");
        System.out.print("Qual o nome do seu PET: ");
        conteudoTela.nomePet = teclado.nextLine();
        System.out.println("----------------------------------------------------------------");
        System.out.println("");
        System.out.print("Qual idade do seu PET: ");
        conteudoTela.idadePet = leInteiro();
        System.out.println("----------------------------------------------------------------");
        System.out.println("Qual a raça de cachorro gostaria de doar:");
        System.out.println("");
        System.out.println("(1) Pastor Alemão");
        System.out.println("(2) Labrador");
        System.out.println("(3) Buldogle");
        System.out.println("(4) Beagle");
        System.out.println("(5) Poodle");
        conteudoTela.racaPet = leInteiro();
        System.out.println("----------------------------------------------------------------");
        System.out.println("Qual sexo do Cão:"); 
        System.out.println("");
        System.out.println("(1) Masculino "); 
        System.out.println("(2) Feminino "); 
        conteudoTela.sexoPet = leInteiro();
        enviarInformacaoCadastroPet(CACHORRO, conteudoTela);
    }

    public void doarGato() {
        ConteudoTelaPet conteudoTela = new ConteudoTelaPet();
        int pet = 2;
        System.out.println("----------------------------------------------------------------");
        System.out.println("--------------------------DOÇÃO DE GATO-------------------------");
        System.out.println("----------------------------------------------------------------");
        System.out.println("");
        conteudoTela.nomePet = teclado.nextLine();
        String nome = teclado.nextLine();
        System.out.println("----------------------------------------------------------------");
        System.out.println("");
        System.out.print("Qual idade do seu PET: ");
        conteudoTela.idadePet = leInteiro();
        System.out.println("----------------------------------------------------------------");
        System.out.println("Qual a Raça de gato gostaria de doar:");
        System.out.println("");
        System.out.println("(1) Perça");
        System.out.println("(2) Saames");
        System.out.println("(3) Azul Russo");
        System.out.println("(4) Ragdoll");
        conteudoTela.racaPet = leInteiro();
        System.out.println("----------------------------------------------------------------");
        System.out.println("Qual sexo do Gato:"); 
        System.out.println("");
        System.out.println("(1) Masculino "); 
        System.out.println("(2) Feminino "); 
        conteudoTela.sexoPet = leInteiro();
        enviarInformacaoCadastroPet(GATO, conteudoTela);
    }

    public void doarPassaro() {
        ConteudoTelaPet conteudoTela = new ConteudoTelaPet();
        int pet = 3;
        System.out.println("----------------------------------------------------------------");
        System.out.println("------------------------DOAÇÃO DE PASSARO-----------------------");
        System.out.println("----------------------------------------------------------------");
        System.out.println("");
        System.out.print("Qual o nome do seu PET: ");
        conteudoTela.nomePet = teclado.nextLine();
        System.out.println("----------------------------------------------------------------");
        System.out.println("");
        System.out.print("Qual idade do seu PET: ");
        conteudoTela.idadePet = leInteiro();
        System.out.println("----------------------------------------------------------------");
        System.out.println("Qual a especie de passaro gostaria de doar:");
        System.out.println("");
        System.out.println("(1) Canario");
        System.out.println("(2) Calopsita");
        System.out.println("(3) Agapornis");
        conteudoTela.racaPet = leInteiro();
        System.out.println("----------------------------------------------------------------");
        System.out.println("Qual sexo do Passaro:"); 
        System.out.println("");
        System.out.println("(1) Masculino "); 
        System.out.println("(2) Feminino "); 
        conteudoTela.sexoPet = leInteiro();
        enviarInformacaoCadastroPet(PASSARO, conteudoTela);
    }
    
     

    public void enviarInformacaoAdocao(int opcaoRaca, int opcaoSexo) {
        ctrlPet.adocao(opcaoRaca, opcaoSexo);
    }

    private void enviarInformacaoCadastroPet(int pet, ConteudoTelaPet conteudoTela) {
        switch(pet){
            case CACHORRO: 
                ctrlPet.cadastroDog(conteudoTela);
                break;
            case 2:
                ctrlPet.cadastroGato(conteudoTela);
                break;
             case 3:
                ctrlPet.cadastroPassaro(conteudoTela);
                break;    
        }
    }

    public void mostraListaPets(ArrayList<ConteudoTelaPet> listagemPets) {
        System.out.println("----------------------------------------------------------------");
        System.out.println("                        Listagem Cachorros");
        System.out.println("----------------------------------------------------------------");
        int numero = 1;
        
        for (ConteudoTelaPet conteudoTela : listagemPets){
            System.out.println("");
            System.out.println("Registro do PET: " + numero);
            System.out.println("nome: " + conteudoTela.nomePet);
            System.out.println("Idade: " + conteudoTela.idadePet);
            System.out.println("Sexo: " + conteudoTela.sexoPet);
            System.out.println("Raça: " + conteudoTela.racaPet);
            System.out.println("");
            System.out.println("----------------------------------------------------------------");
            numero++;
            
            
    }
        gostariaDeAdotar();
   }   

    private void gostariaDeAdotar() {
            System.out.println("Qual pet gostaria de adotar?");
            System.out.println("----------------------------------------------------------------");
            System.out.println("Didite o registro do PET ou digite 0 para não adotar nenhum:");
            
            int opcao = leInteiro();
            if(opcao == 0){
              System.out.println("----------------------");
              System.out.println("Então nao adota cuzao");
              System.out.println("----------------------");
              ctrlPet.menuPrincipal();
            }else{
                System.out.println("Pet Adotado Com Sucesso");
                ctrlPet.menuPrincipal();
                
                    
            }
                
            
           
    }
}
