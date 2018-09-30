package Entidade;


public class Cachorro extends Animal{
      private int  raca;

    
    
    public enum RACACACHORRO  {
        PASTOR_ALEMAO(1),
        LABRADOR(2),
        BULDOGLE(3),
        BEAGLE(4),
        POODLE(5);  
        
        public final int id;
        
        RACACACHORRO(int idRacaCachorro){
            id = idRacaCachorro;
        }
    }


   
    public Cachorro(String nome, int idade, int raca, int sexo) {
        this.nome = nome;
        this.idade = idade;
        this.raca = raca;
        this.sexo = sexo;
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
    public int getIdade() {
        return idade;
    }

      @Override
    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getRaca() {
        return raca;
    }

    public void setRaca(int raca) {
        this.raca = raca;
    }

      @Override
    public int getSexo() {
        return sexo;
    }

      @Override
    public void setSexo(int sexo) {
        this.sexo = sexo;
    }
}
