package br.com.controle;

public class Horas {
    private int voto;
    int qtdmais;
    int qtdmenos;

    public int getVoto() {
        return voto;
    }

    public void setVoto(int voto) {
        this.voto = voto;
        if(this.voto == 1){
            qtdmais++;            
        }
        if(this.voto == 2){
            qtdmenos++;            
        }
    }

    public int getVotoMais(){
        return qtdmais;
    }
    public int getVotoMenos(){
        return qtdmenos;
    }
    
    public int setVotoMais(int par){
        return qtdmais;
    }
    public int setVotoMenos(int par){
        return qtdmenos;
    }
    
     public void zerarVotos() {
        qtdmais = 0;
        qtdmenos = 0;
    }

    
}
