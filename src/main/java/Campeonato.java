import java.lang.reflect.Array;
import java.util.ArrayList;

public class Campeonato implements Organizacao{

    private String nome;
    private int numClubs;

    private Liga liga;
    private float premiacao;

    public Campeonato(String nome, int numClubs, Liga liga, float premiacao) {
        this.nome = nome;
        this.numClubs = numClubs;
        this.liga = liga;
        this.premiacao = premiacao;
    }

    public float getPremiacao(){
        return premiacao;
    }
    public String getNome() {
        return nome;
    }

    public int getNumClubs() {
        return numClubs;
    }

    public String getNomeLiga() {
        return liga.getNome();
    }

    public String aceitar(Visitor visitor){
        return visitor.exibirCampeonato(this);
    }
}
