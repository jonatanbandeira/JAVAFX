package javafxmvc.model.domain;

import java.io.Serializable;

public class Pet implements Serializable {

    private int cdPet;
    private String nomePet;
    private String nomeDono;
    private String telefone;
    private String email;
    private Raca cdRaca;
    private Porte cdPorte;
    private Sexo cdSexo;
    private Cidade cdCidade;
    private Raca raca;
    private Porte porte;
    private Sexo sexo;
    private Cidade cidade;

    public Pet(){
    }
    
    public Pet(int cdPet, String nomePet, Raca cdRaca, Porte cdPorte, Sexo cdSexo, String nomeDono, String telefone, String email, Cidade cdCidade) {
        this.cdPet = cdPet;
        this.nomePet = nomePet;
        this.cdRaca = cdRaca;
        this.cdPorte = cdPorte;
        this.cdSexo = cdSexo;
        this.nomeDono = nomeDono;
        this.telefone = telefone;
        this.email = email;
        this.cdCidade = cdCidade;
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

    public Raca getCdRaca() {
        return cdRaca;
    }

    public void setCdRaca(Raca cdRaca) {
        this.cdRaca = cdRaca;
    }

    public Porte getCdPorte() {
        return cdPorte;
    }

    public void setCdPorte(Porte cdPorte) {
        this.cdPorte = cdPorte;
    }

    public Sexo getCdSexo() {
        return cdSexo;
    }

    public void setCdSexo(Sexo cdSexo) {
        this.cdSexo = cdSexo;
    }

    public Cidade getCdCidade() {
        return cdCidade;
    }

    public void setCdCidade(Cidade cdCidade) {
        this.cdCidade = cdCidade;
    }

    
    public Raca getRaca() {
        return raca;
    }
    
    public Porte getPorte() {
        return porte;
    }

    
    public Sexo getSexo() {
        return sexo;
    }
    
    public Cidade getCidade() {
        return cidade;
    }
    
    @Override
    public String toString() {
        return this.nomePet;
    }
}
