package Controlador;

import Entidade.ConteudoTelaUsuario;
import Entidade.Usuario;
import Telas.TelaUsuario;
import java.util.ArrayList;

public class ControladorUsuario {
    private ControladorPrincipal ctrlPrincipal;
    private TelaUsuario telaUsuario;
    private ArrayList<Usuario> usuarios;
    private Usuario usuarioLogadoLogin;
            
    
    public ControladorUsuario(ControladorPrincipal ctrlPrincipal){
        this.ctrlPrincipal = ctrlPrincipal;
        this.telaUsuario = new TelaUsuario(this);
        this.usuarios = new ArrayList<>();
    }
    
    public void fazerLoginTela() {
        telaUsuario.exibeFazerLogin();
    }

    public void fazerCadastroUsuarioTela() {
        telaUsuario.exibeCadastraUsuario();
    }


    public void logar(String loginUsuario) {
        for(Usuario usuario: usuarios){
            String loginDeUsuarios = usuario.getLogin();
            if(loginDeUsuarios.equals(loginUsuario)){
                ctrlPrincipal.fazerLogin();
                this.usuarioLogadoLogin.login = loginUsuario;
                
            }
        }
        telaUsuario.erroLogin();
    }

    public void incluiUsuario(ConteudoTelaUsuario conteudoTela) {
        Usuario usuario = desempacota(conteudoTela);
        usuarios.add(usuario);
        telaUsuario.contaCriadaComSucesso();
                
    }
    private Usuario desempacota(ConteudoTelaUsuario conteudoTela) {
       return new Usuario(conteudoTela.nomeUsuario, conteudoTela.cpfUsuario, conteudoTela.senhaUsuario);
    }
    
    
    private ConteudoTelaUsuario empacota(Usuario usuario) {
       return new ConteudoTelaUsuario(usuario.getNome(), usuario.getCpf(), usuario.getSenha());
    }
   
    
}
