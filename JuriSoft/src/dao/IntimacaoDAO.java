package dao;

import java.sql.*;
import conexoes.ConexaoMysql;
import jurisoft.Mensagens;
import regrasDeNegocio.Intimacao;
/**
 *
 * @author 00733769225
 */
public class IntimacaoDAO {
    private ConexaoMysql conex = new ConexaoMysql();
    private PreparedStatement stm;
    private PreparedStatement stm2;
    private PreparedStatement stm3;
    private ResultSet rsDados;
    private Connection con = null;
    
    public void cadastrarIntimacao(Intimacao a){
        String sql = "INSERT INTO intimacao (dataAudInt, dataRecebInt, prazoInt, resultado,\n" +
        "numeroInt, atoInt, processoInt, descricaoInt, rascunhoInt) "
                + "values (?,?,?,?,?,?,?,?,?,?);";
         
        
        Mensagens ms = new Mensagens("JuriSoft");
        try{
            conex.conectar();
            con = conex.getConn();
            stm = con.prepareStatement(sql);
            stm.setString(1, a.getDataAudInt());
            stm.setString(2, a.getDataRecebInt());
            stm.setString(3, a.getPrazoInt());
            stm.setString(4, a.getResultado());
            stm.setString(5, a.getNumeroInt());
            stm.setString(6, a.getAtoInt());
            stm.setString(7, a.getProcessoInt());
            stm.setString(8, a.getDescricaoInt());
            stm.setString(9, a.getRascunhoInt());         
            
            
         
            stm.execute();
            ms.informacao("CADASTRADO COM SUCESSO!");
            stm.close();
        }   catch (Exception e){
            throw new RuntimeException(e);
        }
  
    }
    
public void editar (Intimacao a){
            String sql = "update intimacao set dataAudInt=?, dataRecebInt=?, "
                    + "prazoInt=?, resultado=?,\n" +
                    "numeroInt, atoInt=?, processoInt=?, descricaoInt=?, rascunhoInt=?";
            Mensagens ms = new Mensagens("JuriSoft");
            try{
            stm = con.prepareStatement(sql);
            stm = con.prepareStatement(sql);
            stm.setString(1, a.getDataAudInt());
            stm.setString(2, a.getDataRecebInt());
            stm.setString(3, a.getPrazoInt());
            stm.setString(4, a.getResultado());
            stm.setString(5, a.getNumeroInt());
            stm.setString(6, a.getAtoInt());
            stm.setString(7, a.getProcessoInt());
            stm.setString(8, a.getDescricaoInt());
            stm.setString(9, a.getResultado());
            
            stm.execute();
            stm.close();
            ms.informacao("ALTERADO COM SUCESSO!");
            }
            catch (Exception e){
            throw new RuntimeException(e);
        }
            
    }
    
    public void deletar (Intimacao a){
            String sql = "delete from intimacao where codInt=?";
            Mensagens ms = new Mensagens("IFRO");
            try{
            stm = con.prepareStatement(sql);
            stm.setString(1, a.getCodIntStr());
            stm.execute();
            stm.close();
            ms.informacao("DELETADO COM SUCESSO!");
            }
            catch (Exception e){
            throw new RuntimeException(e);
        }
            
    }
    
    public void pesquisarDescricaoInt (String desc){
        String sql = "select * from intimacao where descricaoInt = '"+desc+"'";
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
    
    public void pesquisarDataInt (String data){
        String sql = "select * from intimacao where dataAudInt = '"+data+"'";
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
    
    public void pesquisarResultadoInt (String result){
        String sql = "select * from intimacao where resultado = '"+result+"'";
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
        String sql = "select * from intimacao";
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
    
    public Intimacao getIntimacao(){
        Intimacao a = new Intimacao();
        try{
            a.setCodInt(rsDados.getString("codInt"));
            a.setDataAudInt(rsDados.getString("dataAudInt"));
            a.setDataRecebInt(rsDados.getString("dataRecebInt"));           
            a.setPrazoInt(rsDados.getString("prazoInt"));
            a.setResultado(rsDados.getString("resultado"));
            a.setNumeroInt(rsDados.getString("numeroInt"));
            a.setAtoInt(rsDados.getString("atoInt"));
            a.setProcessoInt(rsDados.getString("processoInt"));
            a.setDescricaoInt(rsDados.getString("descricaoInt"));
            a.setRascunhoInt(rsDados.getString("rascunhoInt"));
           
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
        String sql = "SELECT max(codInt) as 'Código' FROM intimacao;";
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