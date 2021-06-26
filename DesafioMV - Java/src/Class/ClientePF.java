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
public class ClientePF {
    private String nome;
    private String cpf;
    private String endereco_PF;
    private String bairro_PF;
    private String estado_PF;
    private String telefone_PF;
    private Date dataCadastro_PF;
    private String cidade_PF;

    public String getCidade_PF() {
        return cidade_PF;
    }

    public void setCidade_PF(String cidade_PF) {
        this.cidade_PF = cidade_PF;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEndereco_PF() {
        return endereco_PF;
    }

    public void setEndereco_PF(String endereco_PF) {
        this.endereco_PF = endereco_PF;
    }

    public String getBairro_PF() {
        return bairro_PF;
    }

    public void setBairro_PF(String bairro_PF) {
        this.bairro_PF = bairro_PF;
    }

    public String getEstado_PF() {
        return estado_PF;
    }

    public void setEstado_PF(String estado_PF) {
        this.estado_PF = estado_PF;
    }

    public String getTelefone_PF() {
        return telefone_PF;
    }

    public void setTelefone_PF(String telefone_PF) {
        this.telefone_PF = telefone_PF;
    }

    public Date getDataCadastro_PF() {
        return dataCadastro_PF;
    }

    public void setDataCadastro_PF(Date dataCadastro_PF) {
        this.dataCadastro_PF = dataCadastro_PF;
    }
    
    
}
