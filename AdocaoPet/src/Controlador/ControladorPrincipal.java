package Controlador;

import Controlador.ControladorUsuario;
import Telas.TelaPets;
import Telas.TelaPrincipal;
import Controlador.ControladorPet;

public class ControladorPrincipal {
    
    private ControladorUsuario ctrlUsuario;
    private TelaPrincipal telaPrincipal;
    private ControladorPet ctrlPet;
   
    
    public ControladorPrincipal() {
        this.ctrlUsuario = new ControladorUsuario(this);
        this.telaPrincipal =  new TelaPrincipal(this);
        this.ctrlPet = new ControladorPet(this);
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

    public void historicoUsuarios() {
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

}
