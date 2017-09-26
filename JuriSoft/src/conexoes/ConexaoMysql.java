/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conexoes;

import jurisoft.Mensagens;
import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author 00733769225
 */
public class ConexaoMysql {
    private Connection con;
    private String url = "jdbc:mysql://localhost:3306/jurisoft?useSSL=false",
            usuario = "root",
            senha = "root";
    
    public void conectar(){
        Mensagens ms = new Mensagens ("JuriSoft");
        
        try {
            Class.forName("com.mysql.jdbc.Driver");
            this.con = DriverManager.getConnection(url, usuario, senha);
        } catch (Exception e) {
            ms.erro("A conexão falhou!");
        }
        }
     public Connection getConn(){
                return con;
            }
    }
