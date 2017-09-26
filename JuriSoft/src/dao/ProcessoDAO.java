/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.*;
import conexoes.ConexaoMysql;
import jurisoft.Mensagens;
import regrasDeNegocio.Processo;
import regrasDeNegocio.Clientes;
/**
 *
 * @author 00733769225
 */
public class ProcessoDAO {
    private ConexaoMysql conex = new ConexaoMysql();
    private PreparedStatement stm;
    private PreparedStatement stm2;
    private PreparedStatement stm3;
    private ResultSet rsDados;
    private Connection con = null;
    
    public void cadastrarProcesso (Processo a){
        String sql = "INSERT INTO processo (assuntoPro, descricaoPro, naturezaPro, "
                + "numeroPro, nivelPro, tipoAcaoPro, \n" +
"classificacaoPro, fasePro, instanciaPro, origemPro, situacaoPro, varaPro, codCli) "
                + "values (?,?,?,?,?,?,?,?,?,?,?,?,?);";
         
        
        Mensagens ms = new Mensagens("JuriSoft");
        try{
            conex.conectar();
            con = conex.getConn();
            stm = con.prepareStatement(sql);
            stm.setString(1, a.getAssuntoPro());
            stm.setString(2, a.getDescricaoPro());
            stm.setString(3, a.getNaturezaPro());
            stm.setString(4, a.getNumeroPro());
            stm.setString(5, a.getNivelPro());
            stm.setString(6, a.getTipoAcaoPro());
            stm.setString(7, a.getClassificacaoPro());
            stm.setString(8, a.getFasePro());
            stm.setString(9, a.getInstanciaPro());
            stm.setString(10, a.getOrigemPro());
            stm.setString(11, a.getSituacaoPro());
            stm.setString(12, a.getVaraPro()); 
            stm.setInt(13, a.getCodCli()); 
            
            
         
            stm.execute();
            ms.informacao("CADASTRADO COM SUCESSO!");
            stm.close();
        }   catch (Exception e){
            throw new RuntimeException(e);
        }
  
    }
    public void editar (Processo a, Clientes c){
            String sql = "update processo set assuntoPro=?, descricaoPro=?, naturezaPro=?, "
                + "numeroPro=?, nivelPro=?, tipoAcaoPro=?, \n" +
                "classificacaoPro=?, fasePro=?, instanciaPro=?, origemPro=?, situacaoPro=?, varaPro=?"
                    + ", codCli=? from processo inner join cliente on cliente.codCli = processo.codCli";
            Mensagens ms = new Mensagens("JuriSoft");
            try{
            stm = con.prepareStatement(sql);
            stm = con.prepareStatement(sql);
            stm.setString(1, a.getAssuntoPro());
            stm.setString(2, a.getDescricaoPro());
            stm.setString(3, a.getNaturezaPro());
            stm.setString(4, a.getNumeroPro());
            stm.setString(5, a.getNivelPro());
            stm.setString(6, a.getTipoAcaoPro());
            stm.setString(7, a.getClassificacaoPro());
            stm.setString(8, a.getFasePro());
            stm.setString(9, a.getInstanciaPro());
            stm.setString(10, a.getOrigemPro());
            stm.setString(11, a.getSituacaoPro());
            stm.setString(12, a.getVaraPro());
            stm.setInt(13, c.getCodCli());
            
            stm.execute();
            stm.close();
            ms.informacao("ALTERADO COM SUCESSO!");
            }
            catch (Exception e){
            throw new RuntimeException(e);
        }
            
    }
    
    public void deletar (Processo a){
            String sql = "delete from processo where codPro=?";
            Mensagens ms = new Mensagens("IFRO");
            try{
            stm = con.prepareStatement(sql);
            stm.setString(1, a.getCodProStr());
            stm.execute();
            stm.close();
            ms.informacao("DELETADO COM SUCESSO!");
            }
            catch (Exception e){
            throw new RuntimeException(e);
        }
            
    }
    
    public void pesquisarNumeroPro (String num){
        String sql = "select * from processo where numeroPro = '"+num+"'";
        Statement st;
        try{
        conex.conectar();
        con = conex.getConn();
        int x = ResultSet.TYPE_SCROLL_SENSITIVE;
        int y = ResultSet.CONCUR_UPDATABLE;
        stm = con.prepareStatement(sql,x,y);
        rsDados = stm.executeQuery();
        }
        catch (Exception e){
        throw new RuntimeException(e);
        }
    }
    
    public void pesquisarCodPro (int codigo){
        String sql = "select * from processo where codPro = '"+codigo+"'";
        Statement st;
        try{
        conex.conectar();
        con = conex.getConn();
        int x = ResultSet.TYPE_SCROLL_SENSITIVE;
        int y = ResultSet.CONCUR_UPDATABLE;
        stm = con.prepareStatement(sql,x,y);
        rsDados = stm.executeQuery();
        }
        catch (Exception e){
        throw new RuntimeException(e);
        }
    }
    
    public void pesquisarDescricaoPro (String desc){
        String sql = "select * from processo where descricaoPro = '"+desc+"'";
        Statement st;
        try{
        conex.conectar();
        con = conex.getConn();
        int x = ResultSet.TYPE_SCROLL_SENSITIVE;
        int y = ResultSet.CONCUR_UPDATABLE;
        stm = con.prepareStatement(sql,x,y);
        rsDados = stm.executeQuery();
        }
        catch (Exception e){
        throw new RuntimeException(e);
        }
    }
    
    public void carregarDados (){
        String sql = "select * from processo";
        Statement st;
        try{
        conex.conectar();
        con = conex.getConn();
        int x = ResultSet.TYPE_SCROLL_SENSITIVE;
        int y = ResultSet.CONCUR_UPDATABLE;
        stm = con.prepareStatement(sql,x,y);
        rsDados = stm.executeQuery();
        }
        catch (Exception e){
        throw new RuntimeException(e);
        }
    }
    
    public Processo getProcesso(){
        Processo a = new Processo();
        Clientes c = new Clientes();
        try{
            a.setCodPro(rsDados.getString("codPro"));
            a.setAssuntoPro(rsDados.getString("assuntoPro"));         
            a.setDescricaoPro(rsDados.getString("descricaoPro"));
            a.setNaturezaPro(rsDados.getString("naturezaPro"));
            a.setNumeroPro(rsDados.getString("numeroPro"));
            a.setNivelPro(rsDados.getString("nivelPro"));
            a.setTipoAcaoPro(rsDados.getString("tipoAcaoPro"));
            a.setClassificacaoPro(rsDados.getString("classificacaoPro"));
            a.setFasePro(rsDados.getString("fasePro"));
            a.setInstanciaPro(rsDados.getString("instanciaPro"));
            a.setOrigemPro(rsDados.getString("origemPro"));
            a.setSituacaoPro(rsDados.getString("situacaoPro"));
            a.setVaraPro(rsDados.getString("varaPro"));
            c.setCodCli(rsDados.getString("codCli"));
           
        }
        catch (Exception e){
        throw new RuntimeException(e);
        }    
        return a;
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
    
        public int carregarCodPro (){
        String sql = "SELECT max(codPro) as 'Código' FROM processo;";
        Statement st;
        int cod;
        try{
        conex.conectar();
        con = conex.getConn();
        int x = ResultSet.TYPE_SCROLL_SENSITIVE;
        int y = ResultSet.CONCUR_UPDATABLE;
        stm = con.prepareStatement(sql,x,y);
        rsDados = stm.executeQuery();
        rsDados.next();
        cod = rsDados.getInt("Código");
        }
        catch (Exception e){
        throw new RuntimeException(e);
        }
        return cod;
    }
}
