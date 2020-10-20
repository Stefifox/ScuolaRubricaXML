import java.util.Arrays;

public class Persona{

    public static int PRIGRESSIVO = 0;

    private String nome;
    private String cognome;
    private int eta;
    private Numero[] numeri;
    private int id;

    public Persona(String nome, String cognome, int eta){
        this.nome = nome;
        this.cognome = cognome;
        if (eta > 0){
            this.eta = eta;
        }else {
           this.eta = 0;
        }
        this.numeri = new Numero[5];
        this.id = id++;
    }
    public Persona(String nome, String cognome, int eta, Numero[] listaNumeri){
        this.nome = nome;
        this.cognome = cognome;
        if (eta > 0){
            this.eta = eta;
        }else {
            this.eta = 0;
        }
        this.numeri = listaNumeri;
        this.id = id++;
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getEta() {
        return eta;
    }

    public void setEta(int eta) {
        this.eta = eta;
    }

    public String getCognome() {
        return cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "nome='" + nome + '\'' +
                ", cognome='" + cognome + '\'' +
                ", eta=" + eta +
                ", numeri=" + Arrays.toString(numeri) +
                '}';
    }
}
