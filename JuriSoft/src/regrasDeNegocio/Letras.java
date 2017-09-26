/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package regrasDeNegocio;

import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.PlainDocument;

/**
 *
 * @author Paula Loeblein
 */
public class Letras extends PlainDocument{

    @Override
    public void insertString(int offs, String str, AttributeSet a) throws BadLocationException {
        super.insertString(offs, str.replaceAll("[^a-z, ^A-Z, ^ã-õ, ^á-ú, ^ä-ü, ^Á-Ú, ^Â-Û, ^â-û, ^-]", ""), a); //To change body of generated methods, choose Tools | Templates.
    }
    
}
