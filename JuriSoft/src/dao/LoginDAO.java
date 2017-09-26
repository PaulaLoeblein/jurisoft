/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import conexoes.ConexaoMysql;
import conexoes.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import regrasDeNegocio.Login;

/**
 *
 * @author 00733769225
 */
public class LoginDAO {
    
    private ConexaoMysql conex = new ConexaoMysql();
    private PreparedStatement stm;
    private ResultSet rsDados;
    private Connection con = null;
	private String NOMEUSU;
	private String SENHA;
 
     public String getSENHA() {
		return SENHA;
	}

	public void setSENHA(String sENHA) {
		SENHA = sENHA;
	}

	public String getNOMEUSU() {
		return NOMEUSU;
	}

	public void setNOMEUSU(String USU) {
		NOMEUSU = USU;
	}
    
    public int buscaUsuario(String senha_valida, String nomeusu_valida){
 		setNOMEUSU(nomeusu_valida);
 		setSENHA(senha_valida);
 		int quantidade = 0;
 		String sql = "select count(codUsu) as ok from usuario where senhaUsu = '"+getSENHA()+"' and nomeUsu = '"+getNOMEUSU()+"' limit 1;";
 		
 		
 		try {
 			conex.conectar();
            con = conex.getConn();
            stm = con.prepareStatement(sql);
            rsDados = stm.executeQuery();
 			
 			while (rsDados.next()) {
 				quantidade = rsDados.getInt("ok");
 			}
 			
            stm.close();
 		} catch (Exception e) {
 			
 		}
 		return quantidade;
 		
    }
     
      
}
