public class Clube implements Organizacao{

    private String nome;
    private int numJogadores;

    public Clube(String nome, int numJogadores) {
        this.nome = nome;
        this.numJogadores = numJogadores;
    }

    public String getNome() {
        return nome;
    }

    public int getNumJogadores() {
        return numJogadores;
    }

    public String aceitar(Visitor visitor){
        return visitor.exibirClube(this);
    }
}
