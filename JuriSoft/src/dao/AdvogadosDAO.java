/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.*;
import conexoes.ConexaoMysql;
import jurisoft.Mensagens;
import regrasDeNegocio.Advogados;
/**
 *
 * @author 00733769225
 */
public class AdvogadosDAO {
    private ConexaoMysql conex = new ConexaoMysql();
    private PreparedStatement stm;
    private PreparedStatement stm2;
    private PreparedStatement stm3;
    private ResultSet rsDados;
    private Connection con = null;
    
    public void cadastrarAdvogados(Advogados a){
        String sql = "INSERT INTO advogado (nomeAdv, sexoAdv, estadoCivilAdv, naturalidadeAdv, nacionalidadeAdv, \n" +
"            cpfAdv, rgAdv, telefoneAdv, telefone2Adv, emailAdv, cnhAdv, \n" +
"            dataNascAdv, dataCadastroAdv, dataInsOAB, tipoInsAdv, seccionalAdv,\n" +
"            letraAdv, inscricaoAdv, rendaAdv) values (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?);";
         
        
        Mensagens ms = new Mensagens("JuriSoft");
        try{
            conex.conectar();
            con = conex.getConn();
            stm = con.prepareStatement(sql);
            stm.setString(1, a.getNomeAdv());
            stm.setString(2, a.getSexoAdv());
            stm.setString(3, a.getEstadoCivilAdv());
            stm.setString(4, a.getNaturalidadeAdv());
            stm.setString(5, a.getNacionalidadeAdv());
            stm.setString(6, a.getCpfAdv());
            stm.setString(7, a.getRgAdv());
            stm.setString(8, a.getTelefoneAdv());
            stm.setString(9, a.getTelefone2Adv());
            stm.setString(10, a.getEmailAdv());
            stm.setString(11, a.getCnhAdv());
            stm.setString(12, a.getDataNascAdv());
            stm.setString(13, a.getDataCadastroAdv());
            stm.setString(14, a.getDataInsOAB());
            stm.setString(15, a.getTipoInsAdv());
            stm.setString(16, a.getSeccionalAdv());
            stm.setString(17, a.getLetraAdv());
            stm.setString(18, a.getInscricaoAdv());
            stm.setString(19, a.getRendaAdvStr());
         
            stm.execute();
            ms.informacao("CADASTRADO COM SUCESSO!");
            stm.close();
        }   catch (Exception e){
            throw new RuntimeException(e);
        }
  
    }
    public void editar (Advogados a){
            String sql = "update advogado set nomeAdv=?, sexoAdv=?, estadoCivilAdv=?, naturalidadeAdv=?, nacionalidadeAdv=?, \n" +
"            cpfAdv=?, rgAdv=?, telefoneAdv=?, telefone2Adv=?, emailAdv=?, cnhAdv=?, \n" +
"            dataNascAdv=?, dataCadastroAdv=?, dataInsOAB=?, tipoInsAdv=?, seccionalAdv=?,\n" +
"            letraAdv=?, inscricaoAdv=?, rendaAdv=?";
            Mensagens ms = new Mensagens("JuriSoft");
            try{
            stm = con.prepareStatement(sql);
            stm = con.prepareStatement(sql);
            stm.setString(1, a.getNomeAdv());
            stm.setString(2, a.getSexoAdv());
            stm.setString(3, a.getEstadoCivilAdv());
            stm.setString(4, a.getNaturalidadeAdv());
            stm.setString(5, a.getNacionalidadeAdv());
            stm.setString(6, a.getCpfAdv());
            stm.setString(7, a.getRgAdv());
            stm.setString(8, a.getTelefoneAdv());
            stm.setString(9, a.getTelefone2Adv());
            stm.setString(10, a.getEmailAdv());
            stm.setString(11, a.getCnhAdv());
            stm.setString(12, a.getDataNascAdv());
            stm.setString(13, a.getDataCadastroAdv());
            stm.setString(14, a.getDataInsOAB());
            stm.setString(15, a.getTipoInsAdv());
            stm.setString(16, a.getSeccionalAdv());
            stm.setString(17, a.getLetraAdv());
            stm.setString(18, a.getInscricaoAdv());
            stm.setString(19, a.getRendaAdvStr());
            
            stm.execute();
            stm.close();
            ms.informacao("ALTERADO COM SUCESSO!");
            }
            catch (Exception e){
            throw new RuntimeException(e);
        }
            
    }
    
    public void deletar (Advogados a){
            String sql = "delete from advogado where codAdv=?";
            Mensagens ms = new Mensagens("IFRO");
            try{
            stm = con.prepareStatement(sql);
            stm.setString(1, a.getCodAdvStr());
            stm.execute();
            stm.close();
            ms.informacao("DELETADO COM SUCESSO!");
            }
            catch (Exception e){
            throw new RuntimeException(e);
        }
            
    }
    
    public void pesquisarCpf (String cpf){
        String sql = "select * from advogado where cpfAdv = '"+cpf+"'";
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
    
    public void pesquisarNome (String nome){
        String sql = "select * from advogado where nomeAdv = '"+nome+"'";
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
    
    public void pesquisarCodAdv (int cod){
        String sql = "select * from advogado where codAdv = '"+cod+"'";
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
    
    public void pesquisarInscricaoAdv (String insc){
        String sql = "select * from advogado where inscricaoAdv = '"+insc+"'";
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
        String sql = "select * from advogado";
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
    
    public Advogados getAdvogado(){
        Advogados a = new Advogados();
        try{
            a.setCodAdv(rsDados.getString("codAdv"));
            a.setNomeAdv(rsDados.getString("nomeAdv"));
            a.setSexoAdv(rsDados.getString("sexoAdv"));           
            a.setEstadoCivilAdv(rsDados.getString("estadoCivilAdv"));
            a.setNaturalidadeAdv(rsDados.getString("naturalidadeAdv"));
            a.setNacionalidadeAdv(rsDados.getString("nacionalidadeAdv"));
            a.setCpfAdv(rsDados.getString("cpfAdv"));
            a.setRgAdv(rsDados.getString("rgAdv"));
            a.setTelefoneAdv(rsDados.getString("telefoneAdv"));
            a.setTelefone2Adv(rsDados.getString("telefone2Adv"));
            a.setEmailAdv(rsDados.getString("emailAdv"));
            a.setCnhAdv(rsDados.getString("cnhAdv"));
            a.setDataNascAdv(rsDados.getString("dataNascAdv"));
            a.setDataCadastroAdv(rsDados.getString("dataCadastroAdv"));
            a.setDataInsOAB(rsDados.getString("dataInsOAB"));
            a.setTipoInsAdv(rsDados.getString("tipoInsAdv"));
            a.setSeccionalAdv(rsDados.getString("seccionalAdv"));
            a.setLetraAdv(rsDados.getString("letraAdv"));
            a.setInscricaoAdv(rsDados.getString("inscricaoAdv"));            
            a.setRendaAdv(rsDados.getString("rendaAdv"));
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
    
        public int carregarCodAdv (){
        String sql = "SELECT max(codAdv) as 'Código' FROM advogado;";
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
