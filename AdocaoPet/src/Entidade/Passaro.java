package Entidade;


public class Passaro extends Animal{
      private int  raca;

   

    
    
    public enum RACAPASSARO  {
        CACATUA(1),
        CALOPSITA(2),
        CANARIO(3),
        PAPAGAIO(4),
        PERIQUITO(5);  
        
        public final int id;
        
        RACAPASSARO(int idRacaPassaro){
            id = idRacaPassaro;
        }
    }

    public Passaro(String nome, int idade, int raca, int sexo) {
        super(nome,sexo,idade);
        this.nome = nome;
        this.idade = idade;
        this.raca = raca;
        this.sexo = sexo;
    }



    public String getNome() {
        return nome;
    }


    public void setNome(String nome) {
        this.nome = nome;
    }

    
    public int getIdade() {
        return idade;
    }

   
    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getRaca() {
        return raca;
    }

    public void setRaca(int raca) {
        this.raca = raca;
    }

    
    public int getSexo() {
       return sexo;
    }
    
    public void setSexo(int sexo) {
        this.sexo = sexo;
    }
}
