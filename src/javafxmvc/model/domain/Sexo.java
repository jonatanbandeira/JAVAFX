package javafxmvc.model.domain;

import java.io.Serializable;

public class Sexo  implements Serializable  {
    private String cod_sexo;
    private String descricao;
    
    private Sexo sexo;
    
    public Sexo() {
    }
    
    public Sexo(String cod_sexo, String descricao) {
        this.cod_sexo = cod_sexo;
        this.descricao = descricao;
    }
    
    public String getCod_sexo() {
        return cod_sexo;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    
    @Override
    public String toString() {
        return this.descricao;
    }
}
