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
public class Endereco {
    private int codEnd;
    private String ruaEnd, numeroEnd, bairroEnd, cidadeEnd, ufEnd;

     public int getEndereco (){
        return codEnd;
    }
    public String getCodEndStr(){
        return String.valueOf(codEnd);
    }
    
    public void setCodEnd (String codEnd){
        this.codEnd = Integer.parseInt(codEnd);
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
     * @return the ruaEnd
     */
    public String getRuaEnd() {
        return ruaEnd;
    }

    /**
     * @param ruaEnd the ruaEnd to set
     */
    public void setRuaEnd(String ruaEnd) {
        this.ruaEnd = ruaEnd;
    }

    /**
     * @return the numeroEnd
     */
    public String getNumeroEnd() {
        return numeroEnd;
    }

    /**
     * @param numeroEnd the numeroEnd to set
     */
    public void setNumeroEnd(String numeroEnd) {
        this.numeroEnd = numeroEnd;
    }

    /**
     * @return the bairroEnd
     */
    public String getBairroEnd() {
        return bairroEnd;
    }

    /**
     * @param bairroEnd the bairroEnd to set
     */
    public void setBairroEnd(String bairroEnd) {
        this.bairroEnd = bairroEnd;
    }

    /**
     * @return the cidadeEnd
     */
    public String getCidadeEnd() {
        return cidadeEnd;
    }

    /**
     * @param cidadeEnd the cidadeEnd to set
     */
    public void setCidadeEnd(String cidadeEnd) {
        this.cidadeEnd = cidadeEnd;
    }

    /**
     * @return the ufEnd
     */
    public String getUfEnd() {
        return ufEnd;
    }

    /**
     * @param ufEnd the ufEnd to set
     */
    public void setUfEnd(String ufEnd) {
        this.ufEnd = ufEnd;
    }
    
}
