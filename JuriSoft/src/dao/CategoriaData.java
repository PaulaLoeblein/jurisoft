/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import conexoes.ConexaoMysql;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;
import regrasDeNegocio.Intimacao;
import regrasDeNegocio.Processo;
import regrasDeNegocio.Clientes;
import regrasDeNegocio.Advogados;

/**
 *
 * @author 00733769225
 */
public class CategoriaData extends ConexaoMysql{
    
    public CategoriaData() throws Exception{
        
    }
    private ConexaoMysql conex = new ConexaoMysql();
    private PreparedStatement stm;
    private ResultSet rs;
    private Connection con = null;
   
    
    
    
    
    public Vector pesquisar(String arg) throws SQLException{
        Vector linhas = new Vector();
        stm = conex.getConn().prepareStatement("select * from pesquisaIntimacao where (descricaoInt like '%"+arg+"%') or (dataAudInt like '%"+arg+"%') or (resultado like '%"+arg+"%')");
        rs = stm.executeQuery();
    
        
        while(rs.next()){
            Vector v = new Vector();
            
            v.addElement(rs.getInt("codInt"));
            v.addElement(rs.getString("dataAudInt"));
            v.addElement(rs.getString("dataRecebInt"));
            v.addElement(rs.getString("prazoInt"));
            v.addElement(rs.getString("resultado"));
            v.addElement(rs.getString("numeroInt"));
            v.addElement(rs.getString("atoInt"));
            v.addElement(rs.getString("processoInt"));
            v.addElement(rs.getString("descricaoInt"));
            v.addElement(rs.getString("rascunhoInt"));
            linhas.addElement(v);
            
        }
       return linhas;
    } 

    public Vector pesquisar2(String arg) throws SQLException{
        ConexaoMysql conexao = new ConexaoMysql();
        Vector linhas = new Vector();
        PreparedStatement pstmt = conexao.getConn().prepareStatement("select * from pesquisaProcesso where (cpfCli like '%"+arg+"%') or (assuntoPro like '%"+arg+"%') or (descricaoPro "
                + "like '%"+arg+"%') or (situacaoPro like '%"+arg+"%') or (naturezaPro like '%"+arg+"%')");
        ResultSet rs = pstmt.executeQuery();
        
        while(rs.next()){
            Vector v = new Vector();
            //Processo objProcesso = new Processo();
            v.addElement(rs.getInt("codPro"));
            v.addElement(rs.getString("assuntoPro"));
            v.addElement(rs.getString("descricaoPro"));
            v.addElement(rs.getString("naturezaPro"));
            v.addElement(rs.getString("numeroPro"));
            v.addElement(rs.getString("nivelPro"));
            v.addElement(rs.getString("tipoAcaoPro"));
            v.addElement(rs.getString("classificacaoPro"));
            v.addElement(rs.getString("fasePro"));
            v.addElement(rs.getString("instanciaPro"));
            v.addElement(rs.getString("origemPro"));
            v.addElement(rs.getString("situacaoPro"));
            v.addElement(rs.getString("varaPro"));
            v.addElement(rs.getString("cpfCli"));
            linhas.addElement(v);
            
        }
       return linhas;
    } 
    
    public Vector pesquisar3(String arg) throws SQLException{
        ConexaoMysql conexao = new ConexaoMysql();
        Vector linhas = new Vector();
        PreparedStatement pstmt = conexao.getConn().prepareStatement("select * from pesquisaCliente where (cpfCli like '%"+arg+"%') or (nomeCli like '%"+arg+"%')");
        ResultSet rs = pstmt.executeQuery();
        
        while(rs.next()){
            Vector v = new Vector();
            //Cliente objCliente = new Cliente();
            v.addElement(rs.getInt("codCli"));
            v.addElement(rs.getString("nomeCli"));
            v.addElement(rs.getString("sexoCli"));
            v.addElement(rs.getDouble("rendaCli"));
            v.addElement(rs.getString("estadoCivilCli"));
            v.addElement(rs.getString("naturalidadeCli"));
            v.addElement(rs.getString("nacionalidadeCli"));
            v.addElement(rs.getString("filiacaoPaiCli"));
            v.addElement(rs.getString("filiacaoMaeCli"));
            v.addElement(rs.getString("cpfCli"));
            v.addElement(rs.getString("rgCli"));
            v.addElement(rs.getString("telefoneCli"));
            v.addElement(rs.getString("telefone2Cli"));
            v.addElement(rs.getString("emailCli"));
            v.addElement(rs.getString("cnhCli"));
            v.addElement(rs.getString("dataNascCli"));
            v.addElement(rs.getString("dataCadastroCli"));
            linhas.addElement(v);
        }
       return linhas;
    } 
    
    public Vector pesquisar4(String arg) throws SQLException{
        ConexaoMysql conexao = new ConexaoMysql();
        Vector linhas = new Vector();
        PreparedStatement pstmt = conexao.getConn().prepareStatement("select * from pesquisaAdvogado where (cpfAdv like '%"+arg+"%') or (nomeAdv like '%"+arg+"%') or (rgAdv "
                + "like '%"+arg+"%') or (dataInsOAB like '%"+arg+"%') or (inscricaoAdv like '%"+arg+"%')");
        ResultSet rs = pstmt.executeQuery();
        
        while(rs.next()){
            Vector v = new Vector();
            //Advogado objAdvogado = new Advogado();
            v.addElement(rs.getInt("codAdv"));
            v.addElement(rs.getString("nomeAdv"));
            v.addElement(rs.getString("sexoAdv"));
            v.addElement(rs.getString("estadoCivilAdv"));
            v.addElement(rs.getString("naturalidadeAdv"));
            v.addElement(rs.getString("nacionalidadeAdv"));
            v.addElement(rs.getString("cpfAdv"));
            v.addElement(rs.getString("rgAdv"));
            v.addElement(rs.getString("telefoneAdv"));
            v.addElement(rs.getString("telefone2Adv"));
            v.addElement(rs.getString("emailAdv"));
            v.addElement(rs.getString("cnhAdv"));
            v.addElement(rs.getString("dataNascAdv"));
            v.addElement(rs.getString("dataCadastroAdv"));
            v.addElement(rs.getString("dataInsOAB"));
            v.addElement(rs.getString("tipoInsAdv"));
            v.addElement(rs.getString("seccionalAdv"));
            v.addElement(rs.getString("letraAdv"));
            v.addElement(rs.getString("inscricaoAdv"));
            v.addElement(rs.getDouble("rendaAdv"));
            linhas.addElement(v);
        }
       return linhas;
    } 
    
    
}
