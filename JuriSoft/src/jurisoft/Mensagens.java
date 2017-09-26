/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jurisoft;

import javax.swing.JOptionPane;

/**
 *
 * @author 00733769225
 */
public class Mensagens {
    private String titulo;
    
    public Mensagens (String titulo){
        this.titulo = titulo;
    }
    
    public void alerta (String texto){
        JOptionPane.showMessageDialog(null, texto, this.titulo, JOptionPane.WARNING_MESSAGE);
    }
    
    public void informacao (String texto){
        JOptionPane.showMessageDialog(null, texto, this.titulo, JOptionPane.INFORMATION_MESSAGE);
    }
    
    public void erro (String texto){
        JOptionPane.showMessageDialog(null, texto, this.titulo, JOptionPane.ERROR_MESSAGE);
    }
    
    public void pergunta (String texto){
        JOptionPane.showMessageDialog(null, texto, this.titulo, JOptionPane.YES_NO_OPTION);
    }
}
