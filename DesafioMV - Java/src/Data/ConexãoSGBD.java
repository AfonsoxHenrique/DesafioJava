/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Data;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Pichau
 */
public class ConexãoSGBD {
        public Connection conn;
        private String Driver_Oracle = "oracle.jdbc.driver.OracleDriver";
        private String Local_Server = "localhost";
        private String BCD = "MV - Desafio";
        private String Porta = "1521";
        private String Usuario = "system";
        private String Senha = "13011995";
        
        public void abrindoConexao() throws Exception
        {
            Class.forName(Driver_Oracle).newInstance();

            String url = "jdbc:oracle:thin:@localhost:1521:XE";

            conn =  (Connection) DriverManager.getConnection(url, Usuario, Senha);
        }
        public void fechandoConexao() throws Exception
        {
            conn.close();
        }
}
