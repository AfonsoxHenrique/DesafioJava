/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Data;


import Class.ClientePJ;
import Interfaces.InterfaceClientePJ;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author Pichau
 */
public class DadosClientePJ extends ConexãoSGBD implements InterfaceClientePJ{

    @Override
    public void cadastrarClientePJ(ClientePJ clientepj) throws Exception {
        abrindoConexao();
        String SQL = " Insert Into Cliente_PJ (RazaoSocial, CPNJ, NomeEmpresa, Endereço_PJ, Bairro_PJ, Telefone_PJ, DataCadastro_PJ, Estado_PJ, Cidade_PJ) ";
        SQL += " Values (?,?,?,?,?,?,?,?,?) ";
        PreparedStatement preparedStatement = conn.prepareStatement(SQL);

        preparedStatement.setString(1, clientepj.getRazaoSocial());
        preparedStatement.setString(2, clientepj.getCnpj());
        preparedStatement.setString(3, clientepj.getNomeEmpresa());
        preparedStatement.setString(4, clientepj.getEndereco_PJ());
        preparedStatement.setString(5, clientepj.getBairro_PJ());
        preparedStatement.setString(6, clientepj.getTelefone_PJ());
        preparedStatement.setDate(7, (Date) clientepj.getDataCadastro_PJ());
        preparedStatement.setString(8, clientepj.getEstado_PJ());
        preparedStatement.setString(9, clientepj.getCidade_PJ());

        preparedStatement.executeUpdate();
        fechandoConexao();
    }

    @Override
    public void editarClientePJ(ClientePJ clientepj) throws Exception {
        abrindoConexao();
        String SQL = " Update cliente_PJ set RazaoSocial = ?, NomeEmpresa = ?, Endereço_PJ = ?, Bairro_PJ = ?, Telefone_PJ = ?, Estado_PJ = ?, Cidade_PJ = ? ";
        SQL += " Where CPNJ = ? ";
        PreparedStatement preparedStatement = conn.prepareStatement(SQL);

        preparedStatement.setString(1, clientepj.getRazaoSocial());
        preparedStatement.setString(2, clientepj.getNomeEmpresa());
        preparedStatement.setString(3, clientepj.getEndereco_PJ());
        preparedStatement.setString(4, clientepj.getBairro_PJ());
        preparedStatement.setString(5, clientepj.getTelefone_PJ());
        preparedStatement.setString(6, clientepj.getEstado_PJ());
        preparedStatement.setString(7, clientepj.getCidade_PJ());
        preparedStatement.setString(8, clientepj.getCnpj());

        preparedStatement.executeUpdate(); 
       
        fechandoConexao();
    }

    @Override
    public void excluirClientePJ(ClientePJ clientepj) throws Exception {
        abrindoConexao();

        String SQL = " Delete From cliente_PJ Where CPNJ = ? ";

        PreparedStatement preparedStatement = conn.prepareStatement(SQL);

        preparedStatement.setString(1, clientepj.getCnpj());

        preparedStatement.executeUpdate();

        fechandoConexao();
    }

    @Override
    public ArrayList<ClientePJ> listarClientePJ(ClientePJ clientePj) throws Exception {
        abrindoConexao();
        ArrayList<ClientePJ> retorno = new ArrayList<>();
        String sql = " Select RazaoSocial, CPNJ, NomeEmpresa, Endereço_PJ, Bairro_PJ, Telefone_PJ, Estado_PJ, Cidade_PJ, DataCadastro_PJ ";
        sql += " From cliente_PJ ";
        sql += " Where 0 = 0";
        
        if (clientePj.getCnpj()!= null && clientePj.getCnpj().trim().equals("") == false) {
            sql += " and CPNJ Like  ? " ;
        }
        if (clientePj.getRazaoSocial()!= null && clientePj.getRazaoSocial().trim().equals("") == false) {
            sql += " and RazaoSocial Like  ? " ;
        }
        if (clientePj.getNomeEmpresa()!= null && clientePj.getNomeEmpresa().trim().equals("") == false) {
            sql += " and NomeEmpresa Like  ? " ;
        }
        if (clientePj.getEndereco_PJ()!= null && clientePj.getEndereco_PJ().trim().equals("") == false) {
            sql += " and Endereço_PJ Like  ? " ;
        }
        if (clientePj.getBairro_PJ()!= null && clientePj.getBairro_PJ().trim().equals("") == false) {
            sql += " and Bairro_PJ Like  ? " ;
        }
        if (clientePj.getTelefone_PJ()!= null && clientePj.getTelefone_PJ().trim().equals("") == false) {
            sql += " and Telefone_PJ Like  ? " ;
        }
        if (clientePj.getEstado_PJ()!= null && clientePj.getEstado_PJ().trim().equals("") == false) {
            sql += " and Estado_PJ Like  ? " ;
        }
        if (clientePj.getCidade_PJ()!= null && clientePj.getCidade_PJ().trim().equals("") == false) {
            sql += " and Cidade_PJ Like  ? " ;
        }
        if (clientePj.getDataCadastro_PJ()!= null && clientePj.getDataCadastro_PJ().equals("") == false) {
            sql += " and Cidade_PJ Like  ? " ;
        }
        
        PreparedStatement preparedStatement = conn.prepareStatement(sql);
        
        int pos = 1;
        
        if (clientePj.getCnpj()!= null && clientePj.getCnpj().trim().equals("") == false) {
            preparedStatement.setString(pos, "%" + clientePj.getCnpj()+"%") ;
            pos++;
        }
        if (clientePj.getRazaoSocial()!= null && clientePj.getRazaoSocial().trim().equals("") == false) {
            preparedStatement.setString(pos, "%" +clientePj.getRazaoSocial()+"%");
            pos++;
        }
        if (clientePj.getNomeEmpresa()!= null && clientePj.getNomeEmpresa().trim().equals("") == false) {
            preparedStatement.setString(pos, "%" + clientePj.getNomeEmpresa()+"%");
            pos++;
        }
        if (clientePj.getEndereco_PJ()!= null && clientePj.getEndereco_PJ().trim().equals("") == false) {
            preparedStatement.setString(pos, "%" + clientePj.getEndereco_PJ()+"%") ;
            pos++;
        }
        if (clientePj.getBairro_PJ()!= null && clientePj.getBairro_PJ().trim().equals("") == false) {
            preparedStatement.setString(pos, "%" +clientePj.getBairro_PJ()+"%");
            pos++;
        }
        if (clientePj.getTelefone_PJ()!= null && clientePj.getTelefone_PJ().trim().equals("") == false) {
            preparedStatement.setString(pos, "%" + clientePj.getTelefone_PJ()+"%");
            pos++;
        }
        if (clientePj.getEstado_PJ()!= null && clientePj.getEstado_PJ().trim().equals("") == false) {
            preparedStatement.setString(pos, "%" +clientePj.getEstado_PJ()+"%");
            pos++;
        }
        if (clientePj.getCidade_PJ()!= null && clientePj.getCidade_PJ().trim().equals("") == false) {
            preparedStatement.setString(pos, "%" + clientePj.getCidade_PJ()+"%");
            pos++;
        }
        if (clientePj.getDataCadastro_PJ()!= null && clientePj.getDataCadastro_PJ().equals("") == false) {
            preparedStatement.setString(pos, "%" + clientePj.getDataCadastro_PJ()+"%");
            pos++;
        }
        
        ResultSet resultado = preparedStatement.executeQuery();
        while (resultado.next()) {
            ClientePJ c = new ClientePJ();
            c.setCnpj(resultado.getString("CPNJ"));
            c.setRazaoSocial(resultado.getString("RazaoSocial"));
            c.setNomeEmpresa(resultado.getString("NomeEmpresa"));
            c.setEndereco_PJ(resultado.getString("Endereço_PJ"));
            c.setBairro_PJ(resultado.getString("Bairro_PJ"));
            c.setTelefone_PJ(resultado.getString("Telefone_PJ"));
            c.setEstado_PJ(resultado.getString("Estado_PJ"));
            c.setCidade_PJ(resultado.getString("Cidade_PJ"));
            c.setDataCadastro_PJ(resultado.getDate("DataCadastro_PJ"));
            retorno.add(c);
        }
        fechandoConexao();
        return retorno;
    }    
}
