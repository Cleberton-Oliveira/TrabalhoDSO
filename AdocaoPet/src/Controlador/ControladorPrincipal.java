package Controlador;

import Telas.TelaPrincipal;
import Entidade.Animal;
import Entidade.Cachorro;
import Entidade.Gato;
import Entidade.Passaro;
import java.util.ArrayList;


public class ControladorPrincipal {
    
    private ControladorUsuario ctrlUsuario;
    private TelaPrincipal telaPrincipal;
    private ControladorPet ctrlPet;
    
    private final int CACHORRO=1,GATO=2, PASSARO=3;

   
    
    public ControladorPrincipal() {
        this.ctrlUsuario = new ControladorUsuario(this);
        this.telaPrincipal =  new TelaPrincipal(this);
        this.ctrlPet = new ControladorPet(this);

    }
    public ControladorUsuario getCtrlUsuario(){
        return this.ctrlUsuario;
    } 
     public ControladorPet getCtrlPet(){
        return this.ctrlPet;
    } 
    
    public void iniciaPrograma(){
        telaPrincipal.exibeTelaLogin();
    }

    public void executaOpcaoLogin(int opcao) {
        switch(opcao){
                    case 1 : ctrlUsuario.fazerLoginTela();
                        break;
                    case 2 : ctrlUsuario.fazerCadastroUsuarioTela();
                        break;
        }
    }

    public void fazerLogin() {
          telaPrincipal.exibeTelaPrincipal();
    }

    public void historico(){
      ctrlUsuario.historicoUsuario();
      telaPrincipal.exibeTelaPrincipal();
    }

    public void adotarPet(int opcao) {
        ctrlPet.adotarPet(opcao);
    }

    public void doarPet(int opcao) {
        ctrlPet.doarPet(opcao);
    }

    public void registroSucesso() {
        telaPrincipal.registroSucessoTela();
    }

   
    public void mudaSenha(String senha) {
        ctrlUsuario.mudarSenha(senha);
    }

    public void mudaNome(String nome) {
         ctrlUsuario.mudarNome(nome);
    }

    public void mudaCpf(String cpf) {
          ctrlUsuario.mudarCpf(cpf);
    }
    
    
    public void adocaoCachorro(Cachorro cachorro){
       ctrlUsuario.adocaoCachorro(cachorro);
    }
    
    public void adocaoGato(Gato gato) {
       ctrlUsuario.adocaoGato(gato);
    }

    public void adocaoPassaro(Passaro passaro) {
       ctrlUsuario.adocaoPassaro(passaro);
    }

    public void doaCachorro(Cachorro cachorro) {
        ctrlUsuario.doaCachorro(cachorro); 
    }

    public void doaGato(Gato gato) {
   ctrlUsuario.doaGato(gato);   
    }

    public void doaPassaro(Passaro passaro) {
        ctrlUsuario.doaPassaro(passaro);   
    }
    public ArrayList<Animal> adocoesUsuario(){
       ArrayList<Animal> adocoes = ctrlUsuario.enviaListaAdocao();
       return adocoes;
    }

    public void apagaConta() {
        ctrlUsuario.apagaConta();
    }
    
}
