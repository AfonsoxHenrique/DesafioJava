/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Data;

import Class.Contas;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author Pichau
 */
public class DadosContas extends ConexãoSGBD implements Interfaces.InterfaceContas{

    @Override
    public void cadastrarConta(Contas contas) throws Exception {
        abrindoConexao();

        String SQL = " Insert Into Contas (Numero_Conta, CPFDONO, NOMEDONOCONTA, MOVIMENTACAO) ";
        SQL += " Values (?,?,?,?) ";

        PreparedStatement preparedStatement = conn.prepareStatement(SQL);

        preparedStatement.setInt(1, contas.getNumeroConta());
        preparedStatement.setString(2, contas.getCpfDonoConta());
        preparedStatement.setString(3, contas.getNomeDonoConta());
        preparedStatement.setDouble(4, contas.getMovimentacao());

        preparedStatement.executeUpdate();

        fechandoConexao();   
    }

    @Override
    public void editarConta(Contas contas) throws Exception {
        abrindoConexao();
        String SQL = " Update Contas set  MOVIMENTACAO = ?";
        SQL += " Where Numero_Conta = ? ";
        PreparedStatement preparedStatement = conn.prepareStatement(SQL);
        
        preparedStatement.setDouble(1, contas.getMovimentacao());
        preparedStatement.setInt(2, contas.getNumeroConta());

        preparedStatement.executeUpdate(); 
       
        fechandoConexao();
    }

    @Override
    public void excluirConta(Contas contas) throws Exception {
        abrindoConexao();

        String SQL = " Delete From Contas Where Numero_Conta = ? ";

        PreparedStatement preparedStatement = conn.prepareStatement(SQL);

        preparedStatement.setDouble(1, contas.getNumeroConta());

        preparedStatement.executeUpdate();

        fechandoConexao();
    }

    @Override
    public ArrayList<Contas> listarConta(Contas contas) throws Exception {
        abrindoConexao();
        ArrayList<Contas> retorno = new ArrayList<>();
        String sql = " Select Numero_Conta, CNPJDONOCONTA, RAZAOSOCIALDONOCONTA, MOVIMENTACAO ";
        sql += " From Contas ";
        sql+= " Where CNPJDONOCONTA Is Not Null";
        
        if (contas.getNumeroConta()!= 0) {
            sql += " and Numero_Conta Like ? ";
        }
        if (contas.getCnpjDonoConta()!= null && contas.getCnpjDonoConta().trim().equals("") == false) {
            sql += " and CNPJDONOCONTA Like ? ";
        }
        if (contas.getRazaoSocialDonoConta()!= null && contas.getRazaoSocialDonoConta().trim().equals("") == false) {
            sql += " and RAZAOSOCIALDONOCONTA Like ? ";
        }
        if (contas.getMovimentacao()!=  0) {
            sql += " and MOVIMENTACAO Like ? ";
        }
        
        PreparedStatement preparedStatement = conn.prepareStatement(sql);
        
        int pos = 1;
        
        if (contas.getNumeroConta()!= 0) {
            preparedStatement.setDouble(pos, contas.getNumeroConta()) ;
            pos++;
        }
        if (contas.getCnpjDonoConta()!= null && contas.getCnpjDonoConta().trim().equals("") == false) {
            preparedStatement.setString(pos, "%" +contas.getCnpjDonoConta()+"%");
            pos++;
        }
        if (contas.getRazaoSocialDonoConta()!= null && contas.getRazaoSocialDonoConta().trim().equals("") == false) {
            preparedStatement.setString(pos, "%" + contas.getRazaoSocialDonoConta()+"%");
            pos++;
        }
        if (contas.getMovimentacao()!= 0) {
            preparedStatement.setDouble(pos, contas.getMovimentacao()) ;
            pos++;
        }
        
        ResultSet resultado = preparedStatement.executeQuery();
        while (resultado.next()) {
            Contas c = new Contas();
            c.setNumeroConta(resultado.getInt("Numero_Conta"));
            c.setCnpjDonoConta(resultado.getString("CNPJDONOCONTA"));
            c.setRazaoSocialDonoConta(resultado.getString("RAZAOSOCIALDONOCONTA"));
            c.setMovimentacao(resultado.getDouble("MOVIMENTACAO"));
            retorno.add(c);
        }
        fechandoConexao();
        return retorno;
    }

    @Override
    public ArrayList<Contas> listarContasPF(Contas contas) throws Exception {
        abrindoConexao();
        ArrayList<Contas> retorno = new ArrayList<>();
        String sql = "SELECT * FROM TABLE(FN_CONTASPF())";

        
        if (contas.getNumeroConta()!= 0) {
            sql += " and Numero_Conta Like ? ";
        }
        if (contas.getCpfDonoConta()!= null && contas.getCpfDonoConta().trim().equals("") == false) {
            sql += " and CPFDONO Like ? ";
        }
        if (contas.getNomeDonoConta()!= null && contas.getNomeDonoConta().trim().equals("") == false) {
            sql += " and NOMEDONOCONTA Like ? ";
        }
        if (contas.getMovimentacao()!=  0) {
            sql += " and MOVIMENTACAO Like ? ";
        }
        
        PreparedStatement preparedStatement = conn.prepareStatement(sql);
        
        int pos = 1;
        
        if (contas.getNumeroConta()!= 0) {
            preparedStatement.setDouble(pos, contas.getNumeroConta()) ;
            pos++;
        }
        if (contas.getCpfDonoConta()!= null && contas.getCpfDonoConta().trim().equals("") == false) {
            preparedStatement.setString(pos, "%" +contas.getCpfDonoConta()+"%");
            pos++;
        }
        if (contas.getNomeDonoConta()!= null && contas.getNomeDonoConta().trim().equals("") == false) {
            preparedStatement.setString(pos, "%" + contas.getNomeDonoConta()+"%");
            pos++;
        }
        if (contas.getMovimentacao()!= 0) {
            preparedStatement.setDouble(pos, contas.getMovimentacao()) ;
            pos++;
        }
        
        ResultSet resultado = preparedStatement.executeQuery();
        while (resultado.next()) {
            Contas c = new Contas();
            c.setNumeroConta(resultado.getInt("Numero_Conta"));
            c.setCpfDonoConta(resultado.getString("CPFDONO"));
            c.setNomeDonoConta(resultado.getString("NOMEDONOCONTA"));
            c.setMovimentacao(resultado.getDouble("MOVIMENTACAO"));
            retorno.add(c);
        }
        fechandoConexao();
        return retorno;
    }

    @Override
    public void cadastrarContaPJ(Contas contas) throws Exception {
        abrindoConexao();

        String SQL = " Insert Into Contas (Numero_Conta, CNPJDONOCONTA, RAZAOSOCIALDONOCONTA, MOVIMENTACAO) ";
        SQL += " Values (?,?,?,?) ";

        PreparedStatement preparedStatement = conn.prepareStatement(SQL);

        preparedStatement.setInt(1, contas.getNumeroConta());
        preparedStatement.setString(2, contas.getCnpjDonoConta());
        preparedStatement.setString(3, contas.getRazaoSocialDonoConta());
        preparedStatement.setDouble(4, contas.getMovimentacao());

        preparedStatement.executeUpdate();

        fechandoConexao(); 
    }

    @Override
    public void editarContaPJ(Contas contas) throws Exception {
        abrindoConexao();
        String SQL = " Update Contas set MOVIMENTACAO = ?";
        SQL += " Where Numero_Conta = ? ";
        PreparedStatement preparedStatement = conn.prepareStatement(SQL);

        preparedStatement.setDouble(1, contas.getMovimentacao());
        preparedStatement.setInt(2, contas.getNumeroConta());

        preparedStatement.executeUpdate(); 
       
        fechandoConexao();
    }
    
}
