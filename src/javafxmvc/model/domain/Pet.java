package javafxmvc.model.domain;

import java.io.Serializable;

public class Pet implements Serializable {

    private int cdPet;
    private String nomePet;
    private String raca;
    private String porte;
    private String sexo;
    private String nomeDono;
    private String telefone;
    private String email;
    private String cidade;

    public Pet(){
    }
    
    public Pet(int cdPet, String nomePet, String raca, String porte, String sexo, String nomeDono, String telefone, String email, String cidade) {
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

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }
    
    public String getPorte() {
        return porte;
    }

    public void setPorte(String porte) {
        this.porte = porte;
    }
    
    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
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
    
    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
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
