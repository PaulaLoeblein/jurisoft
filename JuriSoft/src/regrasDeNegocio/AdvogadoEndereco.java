/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package regrasDeNegocio;

/**
 *
 * @author Paula Loeblein
 */
public class AdvogadoEndereco {
    private int codEnd, codAdv, codAdvEnd;

    
    public int getAdvogadoEndereco (){
        return codAdvEnd;
    }
    public String getCodAdvEndStr(){
        return String.valueOf(codAdvEnd);
    }
    
    public void setCodAdvEnd (String codAdvEnd){
        this.codAdvEnd = Integer.parseInt(codAdvEnd);
    }
    
    /**
     * @return the codEnd
     */
    public int getCodEnd() {
        return codEnd;
    }

    /**
     * @param codEnd the codEnd to set
     */
    public void setCodEnd(int codEnd) {
        this.codEnd = codEnd;
    }

    /**
     * @return the codAdv
     */
    public int getCodAdv() {
        return codAdv;
    }

    /**
     * @param codAdv the codAdv to set
     */
    public void setCodAdv(int codAdv) {
        this.codAdv = codAdv;
    }

    /**
     * @return the codAdvEnd
     */
    public int getCodAdvEnd() {
        return codAdvEnd;
    }

    /**
     * @param codAdvEnd the codAdvEnd to set
     */
    public void setCodAdvEnd(int codAdvEnd) {
        this.codAdvEnd = codAdvEnd;
    }
}
