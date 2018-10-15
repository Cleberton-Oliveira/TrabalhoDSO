package Telas;

import Controlador.ControladorUsuario;
import Entidade.Animal;
import Entidade.Cachorro;
import java.util.Scanner;
import Entidade.ConteudoTelaUsuario;
import Entidade.Usuario;
import java.util.ArrayList;
import java.util.InputMismatchException;

public class TelaUsuario {
    private ControladorUsuario ctrlUsuario;
    private Scanner teclado;
    
    public TelaUsuario(ControladorUsuario ctrlUsuario){
        this.ctrlUsuario = ctrlUsuario;
        this.teclado = new Scanner(System.in);
    }
   
        private int leInteiro() {
        try {  
           int inteiro = teclado.nextInt();
            teclado.nextLine();
            return inteiro;
        } catch (NumberFormatException e) {
            System.out.println("Digite uma opção válida!");
            ctrlUsuario.telaPrincipal();
            teclado.nextLine();
            return 0;
        }  
    }
    
    public void exibeFazerLogin() {
        System.out.println("");
        System.out.println("-------------------------FAZER LOGIN----------------------------");
        System.out.println("----------------------------------------------------------------");
        System.out.print("CPF: ");
        String cpf = teclado.nextLine();
        System.out.print("Senha: ");
        String senha = teclado.nextLine();
        System.out.println("----------------------------------------------------------------");
        String loginUsuario = cpf + senha;
        ctrlUsuario.logar(loginUsuario);
    }
    
    public void erroLogin() {
        System.out.println("----------------------------------------------------------------");
        System.out.println("--------------------ERRO AO EFETUAR LOGIN-----------------------");
        System.out.println("----------------------------------------------------------------");
        System.out.println("--------------------CPF ou Seha incorreto-----------------------");
        System.out.println("----------------------------------------------------------------");
        
        exibeFazerLogin();
    }


    public void exibeCadastraUsuario() {
        ConteudoTelaUsuario conteudoTela = new ConteudoTelaUsuario();
        System.out.println("-------------------------CRIAR CONTA----------------------------");
        System.out.println("----------------------------------------------------------------");
        System.out.print("Nome: ");
        conteudoTela.nomeUsuario = teclado.nextLine();
        System.out.print("CPF: ");
        conteudoTela.cpfUsuario = teclado.nextLine();
        System.out.print("Senha: ");
        conteudoTela.senhaUsuario = teclado.nextLine();
        System.out.println("----------------------------------------------------------------");
        ctrlUsuario.incluiUsuario(conteudoTela);
    }

    public void exibeContaCriadaComSucesso() {
        System.out.println("----------------------------------------------------------------");
        System.out.println("-------------------CONTA CRIADA COM SUCESSO---------------------");
        System.out.println("----------------------------------------------------------------");

        exibeFazerLogin();
    }

     public void historico(String nome, ArrayList<Animal> adocao, ArrayList<Animal> doacao) {
        System.out.println("----------------------------------------------------------------");
        System.out.println("                      HISTORICO " + nome );
        System.out.println("----------------------------------------------------------------");
        System.out.println("------------------------- ANIMAIS ADOTADOS ---------------------");
        System.out.println("----------------------------------------------------------------");
        if(adocao.isEmpty()){
            System.out.println("");       
            System.out.println("Você não adotou nenhum animal ainda");
            System.out.println("");   
        }else{
            for (Animal pet : adocao){ 
                 System.out.println("");
                 System.out.println("Nome: " + pet.getNome());
                 System.out.println("Idade: " + pet.getIdade());
                 System.out.println("Sexo: " + pet.getNomeSexo(pet.getSexo()));
                 System.out.println("Especie: " + pet.getEspecie());
             }
        }    
        System.out.println("");
        System.out.println("------------------------- ANIMAIS DOADOS -----------------------");
        System.out.println("----------------------------------------------------------------");
         if(doacao.isEmpty()){
            System.out.println("");       
            System.out.println("Você não doou nenhum animal ainda");
            System.out.println("");   
        }else{
            for (Animal pet : doacao){ 
                 System.out.println("");
                 System.out.println("Nome: " + pet.getNome());
                 System.out.println("Idade: " + pet.getIdade());
                 System.out.println("Sexo: " + pet.getNomeSexo(pet.getSexo()));
                 System.out.println("Especie: " + pet.getEspecie());
            }  
        }
    }

    public void cpfJaCadastrado() {
        System.out.println("----------------------- Erro ao Cadastrar ----------------------");
        System.out.println("----------------------------------------------------------------");
        System.out.println("");
        System.out.println("Já existe Usuario cadastrado com esse CPF");
        System.out.println("");
        exibeCadastraUsuario();
    }

    public void historicoSuperUsuario(String nome, ArrayList<Animal> adocao, ArrayList<Animal> doacao, ArrayList<Usuario> usuarios) {
 
        System.out.println("----------------------------------------------------------------");
        System.out.println("                      HISTORICO " + nome );
        System.out.println("----------------------------------------------------------------");
        System.out.println("------------------------- ANIMAIS ADOTADOS ---------------------");
        System.out.println("----------------------------------------------------------------");
        if(adocao.isEmpty()){
            System.out.println("");       
            System.out.println("Você não adotou nenhum animal ainda");
            System.out.println("");   
        }else{
            for (Animal pet : adocao){ 
                 System.out.println("");
                 System.out.println("Nome: " + pet.getNome());
                 System.out.println("Idade: " + pet.getIdade());
                 System.out.println("Sexo: " + pet.getNomeSexo(pet.getSexo()));
                 System.out.println("Especie: " + pet.getEspecie());
             }
        }    
        System.out.println("");
        System.out.println("------------------------- ANIMAIS DOADOS -----------------------");
        System.out.println("----------------------------------------------------------------");
         if(doacao.isEmpty()){
            System.out.println("");       
            System.out.println("Você não doou nenhum animal ainda");
            System.out.println("");   
        }else{
            for (Animal pet : doacao){ 
                 System.out.println("");
                 System.out.println("Nome: " + pet.getNome());
                 System.out.println("Idade: " + pet.getIdade());
                 System.out.println("Sexo: " + pet.getNomeSexo(pet.getSexo()));
                 System.out.println("Especie: " + pet.getEspecie());
            }  
        }
       System.out.println("");
       System.out.println("----------------------------------------------------------------");
       System.out.println("-----------------Historico Outros Clientes ---------------------");
       System.out.println("----------------------------------------------------------------");
       System.out.println("");
       if(usuarios.isEmpty()){
                            System.out.println("Sem mais nenhum registro");
                    }else{
                    for (Usuario usuario : usuarios){
                        System.out.println("----------------------------------------------------------------");
                        System.out.println("                      HISTORICO " + usuario.getNome() );
                        System.out.println("----------------------------------------------------------------");
                        System.out.println("CPF: "+ usuario.getCpf());
                        ArrayList<Animal> pets = usuario.getAdocao();
                         System.out.println("");
                         System.out.println("----------------------- ANIMAIS ADOTADOS -----------------------");
                         System.out.println("----------------------------------------------------------------");
                             if(pets.isEmpty()){
                                System.out.println("");       
                                System.out.println("Não doou nenhum animal ainda");
                                System.out.println(""); 
                             }else{       
                                for (Animal pet : pets){ 
                                    System.out.println("");
                                    System.out.println("Nome: " + pet.getNome());
                                    System.out.println("Idade: " + pet.getIdade());
                                    System.out.println("Sexo: " + pet.getNomeSexo(pet.getSexo()));
                                    System.out.println("Especie: " + pet.getEspecie());
                                }
                        
                            }       
                    
                    ArrayList<Animal> petsDocao = usuario.getDoacao();
                         System.out.println("");
                         System.out.println("------------------------- ANIMAIS DOADOS -----------------------");
                         System.out.println("----------------------------------------------------------------");
                             if(petsDocao.isEmpty()){
                                System.out.println("");       
                                System.out.println("Não doou nenhum animal ainda");
                                System.out.println(""); 
                             }else{       
                                for (Animal pet : petsDocao){ 
                                    System.out.println("");
                                    System.out.println("Nome: " + pet.getNome());
                                    System.out.println("Idade: " + pet.getIdade());
                                    System.out.println("Sexo: " + pet.getNomeSexo(pet.getSexo()));
                                    System.out.println("Especie: " + pet.getEspecie());
                                }
                        
               }
            }             
        }
    }
}
