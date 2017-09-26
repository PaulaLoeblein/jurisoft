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
import regrasDeNegocio.AdvogadoEndereco;
/**
 *
 * @author 00733769225
 */
public class AdvogadoEnderecoDAO {
    private ConexaoMysql conex = new ConexaoMysql();
    private PreparedStatement stm3;
    private ResultSet rsDados;
    private Connection con = null;
    private int codCli, codEnd;
    
    public void vincularAdvogadoEndereco(AdvogadoEndereco ae){
        String sql3 = "INSERT INTO advogado_endereco (codAdv, codEnd) values (?,?);";
         
            try{
            conex.conectar();
            con = conex.getConn();
            
            stm3 = con.prepareStatement(sql3);

            stm3.setInt(1, ae.getCodAdv());
            stm3.setInt(2, ae.getCodEnd());
            stm3.execute();
            stm3.close();
        }   catch (Exception e){
            throw new RuntimeException(e);
        }
  
    }
    public void editar (AdvogadoEndereco ae){
            String sql3 = "update advogado_endereco set codAdv=?, codEnd=? where codAdvEnd=?";
           
            try{
            stm3 = con.prepareStatement(sql3);
            stm3.setInt(1, ae.getCodEnd());
            stm3.setInt(2, ae.getCodAdv());
            stm3.setString(3, ae.getCodAdvEndStr());
            stm3.execute();
            stm3.close();
            }
            catch (Exception e){
            throw new RuntimeException(e);
        }
            
    }
    
    public void deletar (AdvogadoEndereco ae){
            String sql = "delete from advogado_endereco where codAdvEnd=?";
           
            try{
            stm3 = con.prepareStatement(sql);
            stm3.setString(1, ae.getCodAdvEndStr());
            stm3.execute();
            stm3.close();
            }
            catch (Exception e){
            throw new RuntimeException(e);
        }
            
    }
    
    public void carregarDados (){
        String sql = "select * from advogado_endereco";
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
    
    public AdvogadoEndereco getAdvogado(){
        AdvogadoEndereco ae = new AdvogadoEndereco();
        try{
            ae.setCodAdv(rsDados.getInt("codAdv"));
            ae.setCodEnd(rsDados.getInt("codEnd"));
            ae.setCodAdvEnd(rsDados.getInt("codAdvEnd"));
        }
        catch (Exception e){
        throw new RuntimeException(e);
        }    
        return ae;
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
