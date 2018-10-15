package adocaopet;

import Controlador.ControladorPrincipal;
import Entidade.Usuario;

public class AdocaoPet {
        
    
    public static void main(String[] args) {
        ControladorPrincipal ctrlPrincipal =  new ControladorPrincipal();
        Usuario superusuario = new Usuario("Cleberton", "123", "123");           
        ctrlPrincipal.getCtrlUsuario().addUsuario(superusuario);
        ctrlPrincipal.iniciaPrograma(); 
    }
    
}
