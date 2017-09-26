/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.*;
import conexoes.ConexaoMysql;
import regrasDeNegocio.Endereco;
/**
 *
 * @author 00733769225
 */
public class EnderecoDAO {
    private ConexaoMysql conex = new ConexaoMysql();
    private PreparedStatement stm2;
    private PreparedStatement stm3;
    private ResultSet rsDados;
    private Connection con = null;
    
    public void cadastrarEndereco(Endereco e){
        String sql2 = "INSERT INTO endereco (ruaEnd, numeroEnd, bairroEnd, cidadeEnd, ufEnd) values (?,?,?,?,?);";
      
            try{
            conex.conectar();
            con = conex.getConn();
            
            stm2 = con.prepareStatement(sql2);
            
            stm2.setString(1, e.getRuaEnd());
            stm2.setString(2, e.getNumeroEnd());
            stm2.setString(3, e.getBairroEnd());
            stm2.setString(4, e.getCidadeEnd());
            stm2.setString(5, e.getUfEnd());
            stm2.execute();
            
            stm2.close();
        }   catch (Exception ex){
            throw new RuntimeException(ex);
        }
  
    }
    public void editar (Endereco e){
            String sql = "update endereco set ruaEnd=?, numeroEnd=?, bairroEnd=?, cidadeEnd=?, ufEnd=? where codEnd=?";
            
            try{
            stm2.setString(1, e.getRuaEnd());
            stm2.setString(2, e.getNumeroEnd());
            stm2.setString(3, e.getBairroEnd());
            stm2.setString(4, e.getCidadeEnd());
            stm2.setString(5, e.getUfEnd());
            stm2.execute();
            stm2.close();
            }
            catch (Exception ex){
            throw new RuntimeException(ex);
        }
            
    }
    
    public void deletar (Endereco e){
            String sql = "delete from endereco where codEnd=?";
            try{
            stm2 = con.prepareStatement(sql);
            stm2.setString(1, e.getCodEndStr());
            stm2.execute();
            stm2.close();
            }
            catch (Exception ex){
            throw new RuntimeException(ex);
        }
            
    }
    
    public void carregarDados (){
        String sql = "select * from clientes";
        PreparedStatement st;
        try{
        conex.conectar();
        con = conex.getConn();
        int x = ResultSet.TYPE_SCROLL_SENSITIVE;
        int y = ResultSet.CONCUR_UPDATABLE;
        stm2 = con.prepareStatement(sql,x,y);
        rsDados = stm2.executeQuery();
        }
        catch (Exception e){
        throw new RuntimeException(e);
        }
    }
    
    public Endereco getEnderecos(){
        Endereco e = new Endereco();
        try{
            e.setRuaEnd(rsDados.getString("ruaEnd"));
            e.setBairroEnd(rsDados.getString("bairroEnd"));
            e.setCidadeEnd(rsDados.getString("cidadeEnd"));
            e.setUfEnd(rsDados.getString("ufEnd"));
            e.setNumeroEnd(rsDados.getString("numeroEnd"));
        }
        catch (Exception ex){
        throw new RuntimeException(ex);
        }    
        return e;
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
    
    public int carregarCodEnd (){
        String sql = "SELECT max(codEnd) as 'Código' FROM endereco;";
        Statement st;
        int cod;
        try{
        conex.conectar();
        con = conex.getConn();
        int x = ResultSet.TYPE_SCROLL_SENSITIVE;
        int y = ResultSet.CONCUR_UPDATABLE;
        stm2 = con.prepareStatement(sql,x,y);
        rsDados = stm2.executeQuery();
        rsDados.next();
        cod = rsDados.getInt("Código");
        }
        catch (Exception e){
        throw new RuntimeException(e);
        }
        return cod;
    }
}
