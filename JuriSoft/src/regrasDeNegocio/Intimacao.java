/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package regrasDeNegocio;

/**
 *
 * @author Cliente
 */
public class Intimacao {
    
    private int codInt;
    private String dataAudInt, dataRecebInt, prazoInt, resultado, numeroInt, atoInt, processoInt, descricaoInt, rascunhoInt;
    int codPro;
    
    public int getIntimacao (){
        return codInt;
    }
    
    public String getCodIntStr(){
        return String.valueOf(codInt);
    }
    
    public void setCodIntStr (int codInt){
        this.codInt = codInt;
    }
    
    public void setCodInt(String codInt) {
        this.codInt = Integer.parseInt(codInt);
    }

    /**
     * @return the codInt
     */
    public int getCodInt() {
        return codInt;
    }

    /**
     * @param codInt the codInt to set
     */
    public void setCodInt(int codInt) {
        this.codInt = codInt;
    }

    /**
     * @return the dataAudInt
     */
    public String getDataAudInt() {
        return String.valueOf(dataAudInt);
    }

    /**
     * @param dataAudInt the dataAudInt to set
     */
    public void setDataAudInt(String dataAudInt) {
        String dia = dataAudInt.substring(0, 2);
        String mes = dataAudInt.substring(3, 5);
        String ano = dataAudInt.substring(6, 10);
        this.dataAudInt = ano + "-" + mes + "-" + dia;
    }

    /**
     * @return the dataRecebInt
     */
    public String getDataRecebInt() {
        return String.valueOf(dataRecebInt);
    }

    /**
     * @param dataRecebInt the dataRecebInt to set
     */
    public void setDataRecebInt(String dataRecebInt) {
        String dia = dataRecebInt.substring(0, 2);
        String mes = dataRecebInt.substring(3, 5);
        String ano = dataRecebInt.substring(6, 10);
        this.dataRecebInt = ano + "-" + mes + "-" + dia;
    }

    /**
     * @return the prazoInt
     */
    public String getPrazoInt() {
        return String.valueOf(prazoInt);
    }

    /**
     * @param prazoInt the prazoInt to set
     */
    public void setPrazoInt(String prazoInt) {
        String dia = prazoInt.substring(0, 2);
        String mes = prazoInt.substring(3, 5);
        String ano = prazoInt.substring(6, 10);
        this.prazoInt = ano + "-" + mes + "-" + dia;
    }

    /**
     * @return the resultado
     */
    public String getResultado() {
        return resultado;
    }

    /**
     * @param resultado the resultado to set
     */
    public void setResultado(String resultado) {
        this.resultado = resultado;
    }

    /**
     * @return the numeroInt
     */
    public String getNumeroInt() {
        return numeroInt;
    }

    /**
     * @param numeroInt the numeroInt to set
     */
    public void setNumeroInt(String numeroInt) {
        this.numeroInt = numeroInt;
    }

    /**
     * @return the atoInt
     */
    public String getAtoInt() {
        return atoInt;
    }

    /**
     * @param atoInt the atoInt to set
     */
    public void setAtoInt(String atoInt) {
        this.atoInt = atoInt;
    }

    /**
     * @return the processoInt
     */
    public String getProcessoInt() {
        return processoInt;
    }

    /**
     * @param processoInt the processoInt to set
     */
    public void setProcessoInt(String processoInt) {
        this.processoInt = processoInt;
    }

    /**
     * @return the descricaoInt
     */
    public String getDescricaoInt() {
        return descricaoInt;
    }

    /**
     * @param descricaoInt the descricaoInt to set
     */
    public void setDescricaoInt(String descricaoInt) {
        this.descricaoInt = descricaoInt;
    }

    /**
     * @return the rascunhoInt
     */
    public String getRascunhoInt() {
        return rascunhoInt;
    }

    /**
     * @param rascunhoInt the rascunhoInt to set
     */
    public void setRascunhoInt(String rascunhoInt) {
        this.rascunhoInt = rascunhoInt;
    }

    /**
     * @return the codPro
     */
    public int getCodPro() {
        return codPro;
    }

    /**
     * @param codPro the codPro to set
     */
    public void setCodPro(int codPro) {
        this.codPro = codPro;
    }

    
}
