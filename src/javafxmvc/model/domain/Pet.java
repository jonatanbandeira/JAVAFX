package javafxmvc.model.domain;

import java.io.Serializable;

public class Pet implements Serializable {

    private int cdPet;
    private String nomePet;
    private Raca raca;
    private Porte porte;
    private Sexo sexo;
    private String nomeDono;
    private String telefone;
    private String email;
    private Cidade cidade;

    public Pet(){
    }
    
    public Pet(int cdPet, String nomePet, Raca raca, Porte porte, Sexo sexo, String nomeDono, String telefone, String email, Cidade cidade) {
        this.cdPet = cdPet;
        this.nomePet = nomePet;
        this.raca = raca;
        this.porte = porte;
        this.sexo = sexo;
        this.nomeDono = nomeDono;
        this.telefone = telefone;
        this.email = email;
        this.cidade = cidade;
    }

    public int getCdPet() {
        return cdPet;
    }

    public void setCdPet(int cdPet) {
        this.cdPet = cdPet;
    }

    public String getNomePet() {
        return nomePet;
    }

    public void setNomePet(String nomePet) {
        this.nomePet = nomePet;
    }

    public Raca getRaca() {
        return raca;
    }

    public void setRaca(Raca raca) {
        this.raca = raca;
    }
    
    public Porte getPorte() {
        return porte;
    }

    public void setPorte(Porte porte) {
        this.porte = porte;
    }
    
    public Sexo getSexo() {
        return sexo;
    }

    public void setSexo(Sexo sexo) {
        this.sexo = sexo;
    }
    
    public String getNomeDono() {
        return nomeDono;
    }

    public void setNomeDono(String nomeDono) {
        this.nomeDono = nomeDono;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    public Cidade getCidade() {
        return cidade;
    }

    public void setCidade(Cidade cidade) {
        this.cidade = cidade;
    }
    
    /**
     *
     * @return
     */
    @Override
    public String toString() {
        return this.nomePet;
    }
    
}
