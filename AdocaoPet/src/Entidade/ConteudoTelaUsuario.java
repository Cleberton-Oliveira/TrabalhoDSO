package Entidade;


public class ConteudoTelaUsuario {
    public String nomeUsuario;
    public String cpfUsuario;
    public String senhaUsuario;
    
    
    
    public ConteudoTelaUsuario(){
        
    }

    public ConteudoTelaUsuario(String nome, String cpf, String senha) {
        this.nomeUsuario = nome;
        this.cpfUsuario = cpf;
        this.senhaUsuario = senha;
    }

    public void add(ConteudoTelaUsuario empacota) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
