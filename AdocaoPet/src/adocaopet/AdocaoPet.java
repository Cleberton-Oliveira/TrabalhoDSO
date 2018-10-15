package adocaopet;

import Controlador.ControladorPrincipal;
import Entidade.Cachorro;
import Entidade.Gato;
import Entidade.Passaro;
import Entidade.Usuario;

public class AdocaoPet {
        
    
    public static void main(String[] args) {
        ControladorPrincipal ctrlPrincipal =  new ControladorPrincipal();
        Cachorro bidu = new Cachorro("Bidu", 12, 5, 1);
        Cachorro rex = new Cachorro("Rex", 2, 1, 1);
        Cachorro toto = new Cachorro("Toto", 7, 1, 1);
        Cachorro laica = new Cachorro("Laica", 1, 1, 2);
        Gato kiara = new Gato("Kaira", 2, 3, 2);
        Gato gatolina = new Gato("Gatolina", 12, 3, 2);
        Gato chico = new Gato("Chico", 4, 3, 1);
        Gato roberval = new Gato("Roberval", 9, 1, 1);
        Passaro chitao = new Passaro("Chitão", 3, 1, 1);
        Passaro gerson = new Passaro("Gerson", 15, 1, 1);
        Passaro etvaldo = new Passaro("Etvaldo", 4, 2, 1);
        Passaro piupui = new Passaro("Piu Piu", 8, 3, 1);
        Passaro canarinha = new Passaro("Canarionha", 3, 3, 2);  
        Usuario superusuario = new Usuario("Cleberton", "123", "123");
        ctrlPrincipal.getCtrlUsuario().addUsuario(superusuario);
        ctrlPrincipal.getCtrlUsuario().doaCachorroSuperUsuario(bidu);
        ctrlPrincipal.getCtrlUsuario().doaCachorroSuperUsuario(rex);
        ctrlPrincipal.getCtrlUsuario().doaCachorroSuperUsuario(toto);
        ctrlPrincipal.getCtrlUsuario().doaCachorroSuperUsuario(laica);
        ctrlPrincipal.getCtrlUsuario().doaGatoSuperUsuario(kiara);
        ctrlPrincipal.getCtrlUsuario().doaGatoSuperUsuario(gatolina);
        ctrlPrincipal.getCtrlUsuario().doaGatoSuperUsuario(chico);
        ctrlPrincipal.getCtrlUsuario().doaGatoSuperUsuario(roberval);
        ctrlPrincipal.getCtrlUsuario().doaPassaroSuperUsuario(chitao);
        ctrlPrincipal.getCtrlUsuario().doaPassaroSuperUsuario(gerson);
        ctrlPrincipal.getCtrlUsuario().doaPassaroSuperUsuario(etvaldo);
        ctrlPrincipal.getCtrlUsuario().doaPassaroSuperUsuario(piupui);
        ctrlPrincipal.getCtrlUsuario().doaPassaroSuperUsuario(canarinha);
        ctrlPrincipal.iniciaPrograma(); 
    }
    
}
