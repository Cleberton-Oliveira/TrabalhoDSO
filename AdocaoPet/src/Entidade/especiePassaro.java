package Entidade;

public enum especiePassaro {
    
    CANARIO(1),
    CALOPSITA(2),
    AGAPORNIS(3);
    
    public final int id;
    
    especiePassaro(int idEspeciePassaro){
        id = idEspeciePassaro;
    }
}
