/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Class;

import java.util.Date;

/**
 *
 * @author Pichau
 */
public class ClientePJ {
    private String razaoSocial;
    private String cnpj;
    private String nomeEmpresa;
    private String endereco_PJ;
    private String estado_PJ;
    private String cidade_PJ;
    private String bairro_PJ;  
    private String telefone_PJ;
    private Date dataCadastro_PJ;
    

    public String getEstado_PJ() {
        return estado_PJ;
    }

    public void setEstado_PJ(String estado_PJ) {
        this.estado_PJ = estado_PJ;
    }
    
    public String getRazaoSocial() {
        return razaoSocial;
    }

    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getNomeEmpresa() {
        return nomeEmpresa;
    }

    public void setNomeEmpresa(String nomeEmpresa) {
        this.nomeEmpresa = nomeEmpresa;
    }

    public String getEndereco_PJ() {
        return endereco_PJ;
    }

    public void setEndereco_PJ(String endereco_PJ) {
        this.endereco_PJ = endereco_PJ;
    }

    public String getCidade_PJ() {
        return cidade_PJ;
    }

    public void setCidade_PJ(String cidade_PJ) {
        this.cidade_PJ = cidade_PJ;
    }

    public String getBairro_PJ() {
        return bairro_PJ;
    }

    public void setBairro_PJ(String bairro_PJ) {
        this.bairro_PJ = bairro_PJ;
    }

    public String getTelefone_PJ() {
        return telefone_PJ;
    }

    public void setTelefone_PJ(String telefone_PJ) {
        this.telefone_PJ = telefone_PJ;
    }
    public Date getDataCadastro_PJ() {
        return dataCadastro_PJ;
    }

    public void setDataCadastro_PJ(Date dataCadastro_PJ) {
        this.dataCadastro_PJ = dataCadastro_PJ;
    }
    
    
}
