public class OrganizacaoVisitor implements Visitor{

    public String exibir(Organizacao organizaco) {
        return organizaco.aceitar(this);
    }

    @Override
    public String exibirLiga(Liga liga) {
        return "Liga: " + liga.getNome() +
                " Pais: " + liga.getPais();
    }

    @Override
    public String exibirCampeonato(Campeonato campeonato) {
        return "Campeonato: " + campeonato.getNome() +
                " Liga: " + campeonato.getNomeLiga() +
                " Total de clubes: " + campeonato.getNumClubs() +
                " Premiacao: " + campeonato.getPremiacao();
    }

    @Override
    public String exibirClube(Clube clube) {
        return "Clube: " + clube.getNome() +
                " Total de jogadores: " + clube.getNumJogadores();
    }
}
