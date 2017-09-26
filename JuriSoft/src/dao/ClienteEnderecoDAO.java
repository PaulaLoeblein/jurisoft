/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

/**
 *
 * @author Paula Loeblein
 */
import java.sql.*;
import conexoes.ConexaoMysql;
import regrasDeNegocio.ClienteEndereco;
/**
 *
 * @author 00733769225
 */
public class ClienteEnderecoDAO {
    private ConexaoMysql conex = new ConexaoMysql();
    private PreparedStatement stm3;
    private ResultSet rsDados;
    private Connection con = null;
    private int codCli, codEnd;
    
    public void vincularClienteEndereco(ClienteEndereco ce){
        String sql3 = "INSERT INTO cliente_endereco (codCli, codEnd) values (?,?);";
         
            try{
            conex.conectar();
            con = conex.getConn();
            
            stm3 = con.prepareStatement(sql3);

            stm3.setInt(1, ce.getCodCli());
            stm3.setInt(2, ce.getCodEnd());
            stm3.execute();
            stm3.close();
        }   catch (Exception e){
            throw new RuntimeException(e);
        }
  
    }
    public void editar (ClienteEndereco ce){
            String sql3 = "update cliente_endereco set codCli=?, codEnd=? where codCliEnd=?";
           
            try{
            stm3 = con.prepareStatement(sql3);
            stm3.setInt(1, ce.getCodEnd());
            stm3.setInt(2, ce.getCodCli());
            stm3.setString(3, ce.getCodCliEndStr());
            stm3.execute();
            stm3.close();
            }
            catch (Exception e){
            throw new RuntimeException(e);
        }
            
    }
    
    public void deletar (ClienteEndereco ce){
            String sql = "delete from cliente_endereco where codCliEnd=?";
           
            try{
            stm3 = con.prepareStatement(sql);
            stm3.setString(1, ce.getCodCliEndStr());
            stm3.execute();
            stm3.close();
            }
            catch (Exception e){
            throw new RuntimeException(e);
        }
            
    }
    
    public void carregarDados (){
        String sql = "select * from cliente_endereco";
        PreparedStatement st;
        try{
        conex.conectar();
        con = conex.getConn();
        int x = ResultSet.TYPE_SCROLL_SENSITIVE;
        int y = ResultSet.CONCUR_UPDATABLE;
        stm3 = con.prepareStatement(sql,x,y);
        rsDados = stm3.executeQuery();
        }
        catch (Exception e){
        throw new RuntimeException(e);
        }
    }
    
    public ClienteEndereco getCliente(){
        ClienteEndereco ce = new ClienteEndereco();
        try{
            ce.setCodCli(rsDados.getInt("codCli"));
            ce.setCodEnd(rsDados.getInt("codEnd"));
            ce.setCodCliEnd(rsDados.getInt("codCliEnd"));
        }
        catch (Exception e){
        throw new RuntimeException(e);
        }    
        return ce;
    }
    
    public boolean proximo(){
        boolean fim;
        try{
            fim = !rsDados.isLast();
            if (fim) rsDados.next();
        }
        catch (Exception e){
        throw new RuntimeException(e);
        } 
        return fim;
    }
    
    public boolean anterior(){
        boolean inicio;
        try{
            inicio = !rsDados.isFirst();
            if (inicio) rsDados.previous();
        }
        catch (Exception e){
        throw new RuntimeException(e);
        } 
        return inicio;
    }
    
    public void ultimo(){
        try{
           rsDados.last();
        }
        catch (Exception e){
        throw new RuntimeException(e);
        } 
    }
    
    public void primeiro(){
        try{
           rsDados.first();
        }
        catch (Exception e){
        throw new RuntimeException(e);
        } 
    }
}
