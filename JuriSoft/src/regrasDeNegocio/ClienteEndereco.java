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
public class ClienteEndereco {
    private int codEnd, codCli, codCliEnd;

    
    public int getClienteEndereco (){
        return codCliEnd;
    }
    public String getCodCliEndStr(){
        return String.valueOf(codCliEnd);
    }
    
    public void setCodCliEnd (String codCliEnd){
        this.codCliEnd = Integer.parseInt(codCliEnd);
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
     * @return the codCli
     */
    public int getCodCli() {
        return codCli;
    }

    /**
     * @param codCli the codCli to set
     */
    public void setCodCli(int codCli) {
        this.codCli = codCli;
    }

    /**
     * @return the codCliEnd
     */
    public int getCodCliEnd() {
        return codCliEnd;
    }

    /**
     * @param codCliEnd the codCliEnd to set
     */
    public void setCodCliEnd(int codCliEnd) {
        this.codCliEnd = codCliEnd;
    }
}
