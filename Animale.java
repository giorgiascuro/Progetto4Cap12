public class Animale {
    private String nome;
    private int eta;
    private double peso;
    public Animale() {
    }
    public void setNome(String nome) {
        this.nome = nome;
}
public void setEta(int eta) {
    this.eta = eta;
}
    public void setPeso(double peso) {
        this.peso = peso;
    }
    public String toString() {
        return nome + " " + eta + " " + peso;
}
}
        