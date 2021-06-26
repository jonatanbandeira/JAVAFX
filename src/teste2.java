import javafxmvc.model.dao.CidadeDAO;
import javafxmvc.model.domain.Cidade;

public class teste2 {
    public static void main(String[] args) {
/*        Pet p = new Pet();
        p.setNomePet("Rafa");
        p.setCdRaca(2);
        p.setCdPorte(1);
        p.setCdSexo(1);
        p.setEmail("rafael@gmail.com");
        p.setTelefone("1199999999");
        p.setNomeDono("Rafael");      
        p.setCdCidade(1);
        
        PetDAO dao = new PetDAO();
        dao.inserir(p);*/

        Cidade p = new Cidade();
        p.setNomeCidade("Madure");
        
        CidadeDAO DAO = new CidadeDAO();
        DAO.inserir(p);
    }
}
