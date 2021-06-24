package javafxmvc.model.domain;

import java.io.Serializable;

public class Porte implements Serializable  {
    private String cod_porte;
    private String descricao;
    
    private Porte porte;
    
    public Porte() {
    }
    
    public Porte(String cod_porte, String descricao) {
        this.cod_porte = cod_porte;
        this.descricao = descricao;
    }
    
    public String getCod_porte() {
        return cod_porte;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    
    @Override
    public String toString() {
        return this.descricao;
    }
}
