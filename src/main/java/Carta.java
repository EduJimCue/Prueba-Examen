public class Carta {
    private String palo;
    private String numero;

    public Carta (String palo, String numero){
        this.numero=numero;
        this.palo=palo;
    }

    public String toString(){
        return null;
    }

    public int getValor(){
        return 0;
    }

    public String getPalo() {return palo;}

    public void setPalo(String palo) {this.palo = palo;}

    public String getNumero() {return numero;}

    public void setNumero(String numero) {this.numero = numero;}
}
