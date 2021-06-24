package javafxmvc.model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafxmvc.model.domain.Cidade;
import javafxmvc.model.domain.Pet;
import javafxmvc.model.domain.Porte;
import javafxmvc.model.domain.Raca;
import javafxmvc.model.domain.Sexo;

public class PetDAO {

    private Connection connection;

    public Connection getConnection() {
        return connection;
    }

    public void setConnection(Connection connection) {
        this.connection = connection;
    }

    public boolean inserir(Pet pet) {
        String sql = "INSERT INTO pets(nomePet, raca, porte, sexo, nomeDono, telefone, email, cidade) VALUES(?,?,?,?,?,?,?,?)";
        try {
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setString(1, pet.getNomePet());
            stmt.setString(2, pet.getRaca().getNomeRaca());
            stmt.setString(3, pet.getPorte().getNomePorte());
            stmt.setString(4, pet.getSexo().getNomeSexo());
            stmt.setString(5, pet.getNomeDono());
            stmt.setString(6, pet.getTelefone());
            stmt.setString(7, pet.getEmail());
            stmt.setString(8, pet.getCidade().getNomeCidade());
            stmt.execute();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(PetDAO.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }

    public boolean alterar(Pet pet) {
        String sql = "UPDATE pets SET nomePet=?, raca=?, porte=?, sexo=?, nomeDono=?, telefone=?, email=?, cidade=? WHERE cdPet=?";
        try {
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setString(1, pet.getNomePet());
            stmt.setString(2, pet.getRaca().getNomeRaca());
            stmt.setString(3, pet.getPorte().getNomePorte());
            stmt.setString(4, pet.getSexo().getNomeSexo());
            stmt.setString(5, pet.getNomeDono());
            stmt.setString(6, pet.getTelefone());
            stmt.setString(7, pet.getEmail());
            stmt.setString(8, pet.getCidade().getNomeCidade());
            stmt.setInt(9, pet.getCdPet());
            stmt.execute();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(PetDAO.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }

    public boolean remover(Pet pet) {
        String sql = "DELETE FROM pets WHERE cdPet=?";
        try {
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setInt(1, pet.getCdPet());
            stmt.execute();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(PetDAO.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }

    public List<Pet> listar() {
        String sql = "SELECT * FROM clientes";
        List<Pet> retorno = new ArrayList<>();
        try {
            PreparedStatement stmt = connection.prepareStatement(sql);
            ResultSet resultado = stmt.executeQuery();
            while (resultado.next()) {
                Pet pet = new Pet();
                Raca raca = new raca();
                Porte porte = new porte();
                Sexo sexo = new sexo();
                Cidade cidade = new cidade();                
                pet.setCdPet(resultado.getInt("cdPet"));
                pet.setNomePet(resultado.getString("nomePet"));
                pet.setRaca(resultado.getString("raca"));
                pet.setTelefone(resultado.getString("telefone"));
                retorno.add(pet);
            }
        } catch (SQLException ex) {
            Logger.getLogger(PetDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return retorno;
    }

    public Pet buscar(Pet cliente) {
        String sql = "SELECT * FROM clientes WHERE cdCliente=?";
        Pet retorno = new Pet();
        try {
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setInt(1, pet.getCdCliente());
            ResultSet resultado = stmt.executeQuery();
            if (resultado.next()) {
                pet.setNome(resultado.getString("nome"));
                pet.setCpf(resultado.getString("cpf"));
                pet.setTelefone(resultado.getString("telefone"));
                retorno = pet;
            }
        } catch (SQLException ex) {
            Logger.getLogger(PetDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return retorno;
    }
}
