
package Entidade;

public final class Passaro extends Animal {
    private especiePassaro especie;

    public Passaro(especiePassaro especie) {
        this.especie = especie;
    }

    public especiePassaro getEspecie() {
        return especie;
    }

    public void setEspecie(especiePassaro especie) {
        this.especie = especie;
    }
    
    @Override
     public String getNome() {
        return nome;
    }

    @Override
    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public int getSexo() {
        return sexo;
    }

    @Override
    public void setSexo(int sexo) {
        this.sexo = sexo;
    }

    @Override
    public int getIdade() {
        return idade;
    }

    @Override
    public void setIdade(int idade) {
        this.idade = idade;
    }

}
