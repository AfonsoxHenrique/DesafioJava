/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Data;

import Class.ClientePF;
import Interfaces.InterfaceClientePF;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.sql.Date;
import java.sql.ResultSet;

/**
 *
 * @author Pichau
 */
public class DadosClientePF extends ConexãoSGBD implements InterfaceClientePF{

    @Override
    public void cadastrarClientePF(ClientePF clientepf) throws Exception {
        
       abrindoConexao();

        String SQL = " Insert Into Cliente_PF (Nome_PF, CPF_PF, Endereco_PF, Bairro_PF, Estado_PF, Telefone_PF, DataCadastro_PF, Cidade_PF) ";
        SQL += " Values (?,?,?,?,?,?,?,?) ";

        PreparedStatement preparedStatement = conn.prepareStatement(SQL);

        preparedStatement.setString(1, clientepf.getNome());
        preparedStatement.setString(2, clientepf.getCpf());
        preparedStatement.setString(3, clientepf.getEndereco_PF());
        preparedStatement.setString(4, clientepf.getBairro_PF());
        preparedStatement.setString(5, clientepf.getEstado_PF());
        preparedStatement.setString(6, clientepf.getTelefone_PF());
        preparedStatement.setDate(7, (Date) clientepf.getDataCadastro_PF());
        preparedStatement.setString(8, clientepf.getCidade_PF());

        preparedStatement.executeUpdate();

        fechandoConexao();
    }

    @Override
    public void editarClientePF(ClientePF clientepf) throws Exception {
        abrindoConexao();
        String SQL = " Update cliente_PF set Nome_PF = ?, Endereco_PF = ? , Bairro_PF = ?, Estado_PF = ?, Telefone_PF = ?, Cidade_PF = ?";
        SQL += " Where CPF_PF = ? ";
        PreparedStatement preparedStatement = conn.prepareStatement(SQL);

        preparedStatement.setString(1, clientepf.getNome());        
        preparedStatement.setString(2, clientepf.getEndereco_PF());
        preparedStatement.setString(3, clientepf.getBairro_PF());
        preparedStatement.setString(4, clientepf.getEstado_PF());
        preparedStatement.setString(5, clientepf.getTelefone_PF());
        preparedStatement.setString(6, clientepf.getCidade_PF());
        preparedStatement.setString(7, clientepf.getCpf());

        preparedStatement.executeUpdate(); 
       
        fechandoConexao();
    }

    @Override
    public void excluirClientePF(ClientePF clientepf) throws Exception {
        abrindoConexao();

        String SQL = " Delete From cliente_PF Where CPF_PF = ? ";

        PreparedStatement preparedStatement = conn.prepareStatement(SQL);

        preparedStatement.setString(1, clientepf.getCpf());

        preparedStatement.executeUpdate();

        fechandoConexao();
    }

    @Override
    public ArrayList<ClientePF> listarClientePF(ClientePF clientePf) throws Exception {
        abrindoConexao();
        ArrayList<ClientePF> retorno = new ArrayList<>();
        String sql = " Select Nome_PF, CPF_PF, Endereco_PF, Bairro_PF, Estado_PF, Telefone_PF, Cidade_PF, DataCadastro_PF ";
        sql += " From cliente_PF ";
        sql += " Where 0 = 0";
        
        if (clientePf.getNome()!= null && clientePf.getNome().trim().equals("") == false) {
            sql += " and Nome_PF Like  ? " ;
        }
        if (clientePf.getCpf()!= null && clientePf.getCpf().trim().equals("") == false) {
            sql += " and CPF_PF Like  ? " ;
        }
        if (clientePf.getEndereco_PF()!= null && clientePf.getEndereco_PF().trim().equals("") == false) {
            sql += " and Endereco_PF Like  ? " ;
        }
        if (clientePf.getBairro_PF()!= null && clientePf.getBairro_PF().trim().equals("") == false) {
            sql += " and Bairro_PF Like  ? " ;
        }
        if (clientePf.getEstado_PF()!= null && clientePf.getEstado_PF().trim().equals("") == false) {
            sql += " and Estado_PF Like  ? " ;
        }
        if (clientePf.getTelefone_PF()!= null && clientePf.getTelefone_PF().trim().equals("") == false) {
            sql += " and Telefone_PF Like  ? " ;
        }
        if (clientePf.getCidade_PF()!= null && clientePf.getCidade_PF().trim().equals("") == false) {
            sql += " and Cidade_PF Like  ? " ;
        }
        if (clientePf.getDataCadastro_PF()!= null && clientePf.getDataCadastro_PF().equals("") == false) {
            sql += " and DataCadastro_PF Like  ? " ;
        }
        
        PreparedStatement preparedStatement = conn.prepareStatement(sql);
        
        int pos = 1;
        
        if (clientePf.getNome()!= null && clientePf.getNome().trim().equals("") == false) {
            preparedStatement.setString(pos, "%" + clientePf.getNome()+"%") ;
            pos++;
        }
        if (clientePf.getCpf()!= null && clientePf.getCpf().trim().equals("") == false) {
            preparedStatement.setString(pos, "%" +clientePf.getCpf()+"%");
            pos++;
        }
        if (clientePf.getEndereco_PF()!= null && clientePf.getEndereco_PF().trim().equals("") == false) {
            preparedStatement.setString(pos, "%" + clientePf.getEndereco_PF()+"%");
            pos++;
        }
        if (clientePf.getBairro_PF()!= null && clientePf.getBairro_PF().trim().equals("") == false) {
            preparedStatement.setString(pos, "%" + clientePf.getBairro_PF()+"%") ;
            pos++;
        }
        if (clientePf.getEstado_PF()!= null && clientePf.getEstado_PF().trim().equals("") == false) {
            preparedStatement.setString(pos, "%" +clientePf.getEstado_PF()+"%");
            pos++;
        }
        if (clientePf.getTelefone_PF()!= null && clientePf.getTelefone_PF().trim().equals("") == false) {
            preparedStatement.setString(pos, "%" + clientePf.getTelefone_PF()+"%");
            pos++;
        }
        if (clientePf.getCidade_PF()!= null && clientePf.getCidade_PF().trim().equals("") == false) {
            preparedStatement.setString(pos, "%" + clientePf.getCidade_PF()+"%");
            pos++;
        }
        if (clientePf.getDataCadastro_PF()!= null && clientePf.getDataCadastro_PF().equals("") == false) {
            preparedStatement.setString(pos, "%" + clientePf.getDataCadastro_PF()+"%");
            pos++;
        }
        
        ResultSet resultado = preparedStatement.executeQuery();
        while (resultado.next()) {
            ClientePF c = new ClientePF();
            c.setCpf(resultado.getString("CPF_PF"));
            c.setNome(resultado.getString("Nome_PF"));
            c.setEndereco_PF(resultado.getString("Endereco_PF"));
            c.setBairro_PF(resultado.getString("Bairro_PF"));
            c.setTelefone_PF(resultado.getString("Telefone_PF"));
            c.setEstado_PF(resultado.getString("Estado_PF"));
            c.setCidade_PF(resultado.getString("Cidade_PF"));
            c.setDataCadastro_PF(resultado.getDate("DataCadastro_PF"));
            retorno.add(c);
        }
        fechandoConexao();
        return retorno;
    }
    
}
