/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.*;
import conexoes.ConexaoMysql;
import jurisoft.Mensagens;
import regrasDeNegocio.Clientes;
/**
 *
 * @author 00733769225
 */
public class ClientesDAO {
    private ConexaoMysql conex = new ConexaoMysql();
    private PreparedStatement stm;
    private PreparedStatement stm2;
    private PreparedStatement stm3;
    private ResultSet rsDados;
    private Connection con = null;
    
    public void cadastrarClientes(Clientes c){
        String sql = "INSERT INTO cliente (nomeCli, sexoCli, rendaCli, estadoCivilCli, naturalidadeCli, nacionalidadeCli, \n" +
                     "filiacaoPaiCli, filiacaoMaeCli, cpfCli, rgCli, telefoneCli, telefone2Cli, emailCli, cnhCli, dataNascCli, \n" +
                     "dataCadastroCli) values (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?);";
         
        
        Mensagens ms = new Mensagens("JuriSoft");
        try{
            conex.conectar();
            con = conex.getConn();
            stm = con.prepareStatement(sql);
            stm.setString(1, c.getNomeCli());
            stm.setString(2, c.getSexoCli());
            stm.setString(3, c.getRendaCliStr());
            stm.setString(4, c.getEstadoCivilCli());
            stm.setString(5, c.getNaturalidadeCli());
            stm.setString(6, c.getNacionalidadeCli());
            stm.setString(7, c.getFiliacaoPaiCli());
            stm.setString(8, c.getFiliacaoMaeCli());
            stm.setString(9, c.getCpfCli());
            stm.setString(10, c.getRgCli());
            stm.setString(11, c.getTelefoneCli());
            stm.setString(12, c.getTelefone2Cli());
            stm.setString(13, c.getEmailCli());
            stm.setString(14, c.getCnhCli());
            stm.setString(15, c.getDataNascCli());
            stm.setString(16, c.getDataCadastroCli());
         
            stm.execute();
            ms.informacao("CADASTRADO COM SUCESSO!");
            stm.close();
        }   catch (Exception e){
            throw new RuntimeException(e);
        }
  
    }
    public void editar (Clientes c){
            String sql = "update cliente set nomeCli=?, sexoCli=?, rendaCli=?, estadoCivilCli=?, "
                    + "naturalidadeCli=?, nacionalidadeCli=?, filiacaoPaiCli=?, "
                    + "filiacaoMaeCli=?, cpfCli=?, rgCli=?, telefoneCli=?, telefone2Cli=?, "
                    + "emailCli=? cnhCli=?, dataNascCli=?,dataCadastroCli=? where codCli=?";
            Mensagens ms = new Mensagens("JuriSoft");
            try{
            stm = con.prepareStatement(sql);
            stm.setString(1, c.getNomeCli());
            stm.setString(2, c.getSexoCli());
            stm.setString(3, c.getRendaCliStr());
            stm.setString(4, c.getEstadoCivilCli());
            stm.setString(5, c.getNaturalidadeCli());
            stm.setString(6, c.getNacionalidadeCli());
            stm.setString(7, c.getFiliacaoPaiCli());
            stm.setString(8, c.getFiliacaoMaeCli());
            stm.setString(9, c.getCpfCli());
            stm.setString(10, c.getRgCli());
            stm.setString(11, c.getTelefoneCli());
            stm.setString(12, c.getTelefone2Cli());
            stm.setString(13, c.getEmailCli());
            stm.setString(14, c.getCnhCli());
            stm.setString(15, c.getDataNascCli());
            stm.setString(16, c.getDataCadastroCli());
            
            stm.execute();
            stm.close();
            ms.informacao("ALTERADO COM SUCESSO!");
            }
            catch (Exception e){
            throw new RuntimeException(e);
        }
            
    }
    
    public void deletar (Clientes c){
            String sql = "delete from cliente where codCli=?";
            Mensagens ms = new Mensagens("IFRO");
            try{
            stm = con.prepareStatement(sql);
            stm.setString(1, c.getCodCliStr());
            stm.execute();
            stm.close();
            ms.informacao("DELETADO COM SUCESSO!");
            }
            catch (Exception e){
            throw new RuntimeException(e);
        }
            
    }
    
    public void carregarDados (){
        String sql = "select * from cliente";
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
    
    public void pesquisarCpf (String cpf){
        String sql = "select * from cliente where cpfCli = '"+cpf+"'";
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
        String sql = "select * from cliente where nomeCli = '"+nome+"'";
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
    
    public void pesquisarCodCli (int cod){
        String sql = "select * from cliente where codCli = '"+cod+"'";
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
    
    public Clientes getCliente(){
        Clientes c = new Clientes();
        try{
            c.setCodCli(rsDados.getString("codCli"));
            c.setNomeCli(rsDados.getString("nomeCli"));
            c.setSexoCli(rsDados.getString("sexoCli"));
            c.setRendaCli(rsDados.getString("rendaCli"));
            c.setEstadoCivilCli(rsDados.getString("estadoCivilCli"));
            c.setNaturalidadeCli(rsDados.getString("naturalidadeCli"));
            c.setNacionalidadeCli(rsDados.getString("nacionalidadeCli"));
            c.setFiliacaoPaiCli(rsDados.getString("filiacaoPaiCli"));
            c.setFiliacaoMaeCli(rsDados.getString("filiacaoMaeCli"));
            c.setCpfCli(rsDados.getString("cpfCli"));
            c.setRgCli(rsDados.getString("rgCli"));
            c.setTelefoneCli(rsDados.getString("telefoneCli"));
            c.setTelefone2Cli(rsDados.getString("telefone2Cli"));
            c.setEmailCli(rsDados.getString("emailCli"));
            c.setCnhCli(rsDados.getString("cnhCli"));
            c.setDataNascCli(rsDados.getString("dataNascCli"));
            c.setDataCadastroCli(rsDados.getString("dataCadastroCli"));
        }
        catch (Exception e){
        throw new RuntimeException(e);
        }    
        return c;
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
    
        public int carregarCodCli (){
        String sql = "SELECT max(codCli) as 'Código' FROM cliente;";
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
