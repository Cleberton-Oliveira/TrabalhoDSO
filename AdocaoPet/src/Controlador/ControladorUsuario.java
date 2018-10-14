package Controlador;

import Entidade.Animal;
import Entidade.Cachorro;
import Entidade.ConteudoTelaPet;
import Entidade.ConteudoTelaUsuario;
import Entidade.Gato;
import Entidade.Passaro;
import Entidade.Usuario;
import Telas.TelaUsuario;
import java.util.ArrayList;


public class ControladorUsuario {
    private ControladorPrincipal ctrlPrincipal;
    private TelaUsuario telaUsuario;
    private ArrayList<Usuario> usuarios;
    private int usuarioLogado; 
    
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
                usuarioLogado = usuarios.lastIndexOf(usuario);
                ctrlPrincipal.fazerLogin();  
            }
        }
        telaUsuario.erroLogin();
    }

    public void incluiUsuario(ConteudoTelaUsuario conteudoTela) {
        String cpf = conteudoTela.cpfUsuario;
        for(Usuario usuario: usuarios){
            if(cpf.equals(usuario.getCpf())){
                telaUsuario.cpfJaCadastrado();
                break;
            }
        }
        Usuario usuario = desempacota(conteudoTela);
        usuarios.add(usuario);
        telaUsuario.exibeContaCriadaComSucesso();
                
    }
    private Usuario desempacota(ConteudoTelaUsuario conteudoTela) {
       return new Usuario(conteudoTela.nomeUsuario, conteudoTela.cpfUsuario, conteudoTela.senhaUsuario);
    }
    
    
    private ConteudoTelaUsuario empacota(Usuario usuario) {
       return new ConteudoTelaUsuario(usuario.getNome(), usuario.getCpf(), usuario.getSenha());
    }

    public void historicoUsuario(){
        Usuario usuario = usuarios.get(usuarioLogado);
        String nome = usuario.getNome();
        if(usuario.getCpf().equals("123")){
            ArrayList<Animal> adocao = usuario.getAdocao();
            ArrayList<Animal> doacao = usuario.getDoacao();
            telaUsuario.historicoSuperUsuario(nome, adocao, doacao, usuarios);
        }else{
        ArrayList<Animal> adocao = usuario.getAdocao();
        ArrayList<Animal> doacao = usuario.getDoacao();
        telaUsuario.historico(nome, adocao, doacao);
        }
    }
    public void telaPrincipal() {
        ctrlPrincipal.fazerLogin();
    }
    
    public void mudarSenha(String senha){
        Usuario usuario = usuarios.get(usuarioLogado);
        usuario.setSenha(senha);
        ctrlPrincipal.fazerLogin();
    }
    
    public void mudarNome(String nome){
      Usuario usuario = usuarios.get(usuarioLogado);
      usuario.setNome(nome);
      ctrlPrincipal.fazerLogin();
    }
        
    public void mudarCpf(String cpf){
      Usuario usuario = usuarios.get(usuarioLogado);
      usuario.setCpf(cpf);
      ctrlPrincipal.fazerLogin();
    }
    
    public void adocaoCachorro(Cachorro cachorro) {
        Usuario usuario = usuarios.get(usuarioLogado);
        usuario.registroCachorro(cachorro);
    }
    
    public void adocaoGato(Gato gato) {
        Usuario usuario = usuarios.get(usuarioLogado);
        usuario.registroGato(gato);
    }

    public void adocaoPassaro(Passaro passaro) {
         Usuario usuario = usuarios.get(usuarioLogado);
            usuario.registroPassaro(passaro);    
    }

    public void doaCachorro(Cachorro cachorro) {
        Usuario usuario = usuarios.get(usuarioLogado);
        usuario.doaCachorro(cachorro);
    }

    public void doaGato(Gato gato) {
        Usuario usuario = usuarios.get(usuarioLogado);
        usuario.doaGato(gato);
    }

    public void doaPassaro(Passaro passaro) {
        Usuario usuario = usuarios.get(usuarioLogado);
        usuario.doaPassaro(passaro);
    }
   
    
}
