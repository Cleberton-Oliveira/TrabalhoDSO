
package Entidade;

public abstract class Animal {
    
    String nome;
    int sexo;
    int idade;

    public Animal(String nome, int sexo, int idade) {
        this.nome = nome;
        this.sexo = sexo;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }
    public int getIdade(){
        return idade;
    }
    public int getSexo(){
        return sexo;
    }

    public String getNomeSexo(int sexo){
        if(sexo == 1){
            return "Masculino";
        }else{
            return "Feminino";
        }
    }
}
