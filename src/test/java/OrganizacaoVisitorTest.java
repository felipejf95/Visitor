import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OrganizacaoVisitorTest {

    @Test
    public void exibirClube(){
        Clube clube = new Clube("Arsenal", 35);

        OrganizacaoVisitor visitor = new OrganizacaoVisitor();
        assertEquals("Clube: Arsenal Total de jogadores: 35", visitor.exibir(clube));
    }

    @Test
    public void exibirCampeonato(){
        Campeonato campeonato = new Campeonato("Campeonato Brasileiro", 20, new Liga("CBF", "Brasil"), 20000000.0f);

        OrganizacaoVisitor visitor = new OrganizacaoVisitor();
        assertEquals("Campeonato: Campeonato Brasileiro Liga: CBF Total de clubes: 20 Premiacao: " + 20000000.0f, visitor.exibir(campeonato));
    }

    @Test
    public void exibirLiga(){
        Liga liga = new Liga("CBF", "Brasil");

        OrganizacaoVisitor visitor = new OrganizacaoVisitor();
        assertEquals("Liga: CBF Pais: Brasil", visitor.exibir(liga));
    }

}