package Controlador;

import Entidade.ConteudoTelaPet;
import Entidade.Cachorro;
import Entidade.Gato;
import Entidade.Passaro;
import Telas.TelaPets;
import java.util.ArrayList;
import Controlador.ControladorPrincipal;

public class ControladorPet {
    private ControladorPrincipal ctrlPrincipal;
    private TelaPets telaPets;
    private ArrayList<Cachorro> cachorros;
    private ArrayList<Gato> gatos;
    private ArrayList<Passaro> passaros;
    
        
    public ControladorPet(ControladorPrincipal ctrlPrincipal){
        this.ctrlPrincipal = ctrlPrincipal;
        this.telaPets = new TelaPets(this);
        this.cachorros = new ArrayList<>();
        this.gatos = new ArrayList<>();
        this.passaros = new ArrayList<>();
    }
    
    
    public void adotarPet(int opcao) {
          switch(opcao){
            case 1: 
                telaPets.adotaDog();
                break;
            case 2:
                telaPets.adotaGato();
                break;
             case 3:
                telaPets.adotaPassaro();
                break;    
        }        

    }

    public void doarPet(int opcao) {
                  switch(opcao){
            case 1: 
                telaPets.doarDog();
                break;
            case 2:
                telaPets.doarGato();
                break;
             case 3:
                telaPets.doarPassaro();
                break;    
        }
    }
    public void adocao(int opcaoRaca, int opcaoSexo) {
        ArrayList<ConteudoTelaPet> listagemPets = new ArrayList<ConteudoTelaPet>();
        for(Cachorro cachorro: cachorros){
            if(opcaoRaca == cachorro.getRaca()){
               listagemPets.add(empacotaCachorro(cachorro));
            }else{
                System.out.println("-----------------------------------------------------------------");
                System.out.println("Não temos nenhuma animal nos nossos dados com essas caracteriscas");
                System.out.println("-----------------------------------------------------------------");
                menuPrincipal();
            }
                
                
        }
        telaPets.mostraListaPets(listagemPets);
    }
    
    

    public void cadastroDog(ConteudoTelaPet conteudoTela) {
        Cachorro cachorro = desempacotaAnimal(conteudoTela);
        cachorros.add(cachorro);
        ctrlPrincipal.registroSucesso();
    }

    public void cadastroGato(ConteudoTelaPet conteudoTela) {
          //cadastrar
        ctrlPrincipal.registroSucesso();
    }

    public void cadastroPassaro(ConteudoTelaPet conteudoTela) {
          //cadastrar
        ctrlPrincipal.registroSucesso();
    }
    
    private Cachorro desempacotaAnimal(ConteudoTelaPet conteudoTela) {
       return new Cachorro(conteudoTela.nomePet, conteudoTela.idadePet, conteudoTela.racaPet, conteudoTela.sexoPet);
    }
    

    private ConteudoTelaPet empacotaCachorro(Cachorro cachorro) {
       return new ConteudoTelaPet(cachorro.getNome(), cachorro.getIdade(), cachorro.getRaca(), cachorro.getSexo());
    }

    public void menuPrincipal() {
        ctrlPrincipal.fazerLogin();
    }
    
}
