/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package regrasDeNegocio;

import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import java.sql.*;
import javax.swing.JOptionPane;
/**
 *
 * @author PaulaLoeblein
 */
public class TabelaConsulta extends JTable {
    private DefaultTableModel modelo = (DefaultTableModel)getModel();
    private Connection con = null;
    private ResultSet rs;
    
    public void setConexao(Connection con){
        this.con = con;
    }
    
    public void setConsulta(int categoria, String arg){
        String sql = "call chamarViews('"+categoria+"', '"+arg+"');";
        try {
            PreparedStatement stm = con.prepareStatement(sql);
            rs = stm.executeQuery();
        } catch (Exception e) {
            
        }
    }
    public void gerarTabela(){
        int totalColunas, totalLinhas;
        try {
            rs.last();
            totalLinhas = rs.getRow();
            totalColunas = rs.getMetaData().getColumnCount()+1;
            
            for (int i = 1; i < totalColunas; i++) {
                modelo.addColumn(rs.getMetaData().getColumnName(i));
            }
            
            modelo.setNumRows(totalLinhas);
            for (int i = 1; i < totalColunas; i++) {
                rs.first();
                int linhas = 0;
                
                do {                    
                    modelo.setValueAt(rs.getString(i), linhas, i-1);
                    linhas++;
                } while (rs.next());
            }
            
            setModel(modelo);
        } catch (Exception e) {
        }
        
    }
        
        
}
    
    
