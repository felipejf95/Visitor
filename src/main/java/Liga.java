public class Liga implements Organizacao{

    private String nome;
    private String pais;

    public Liga(String nome, String pais) {
        this.nome = nome;
        this.pais = pais;
    }

    public String getNome() {
        return nome;
    }

    public String getPais() {
        return pais;
    }

    public String aceitar(Visitor visitor){
        return visitor.exibirLiga(this);
    }
}
