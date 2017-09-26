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
public class Processo {
    private int codPro, codCli;
    private String assuntoPro, naturezaPro, tipoAcaoPro, numeroPro, 
            nivelPro, classificacaoPro, instanciaPro, origemPro, varaPro, 
            fasePro, descricaoPro, situacaoPro;
    
    public int getProcesso (){
        return codPro;
    }
    
    public String getCodProStr(){
        return String.valueOf(codPro);
    }
    
    public void setCodProStr (int codPro){
        this.codPro = codPro;
    }
    
    public void setCodPro(String codPro) {
        this.codPro = Integer.parseInt(codPro);
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

    /**
     * @return the assuntoPro
     */
    public String getAssuntoPro() {
        return assuntoPro;
    }

    /**
     * @param assuntoPro the assuntoPro to set
     */
    public void setAssuntoPro(String assuntoPro) {
        this.assuntoPro = assuntoPro;
    }

    /**
     * @return the naturezaPro
     */
    public String getNaturezaPro() {
        return naturezaPro;
    }

    /**
     * @param naturezaPro the naturezaPro to set
     */
    public void setNaturezaPro(String naturezaPro) {
        this.naturezaPro = naturezaPro;
    }

    /**
     * @return the tipoAcaoPro
     */
    public String getTipoAcaoPro() {
        return tipoAcaoPro;
    }

    /**
     * @param tipoAcaoPro the tipoAcaoPro to set
     */
    public void setTipoAcaoPro(String tipoAcaoPro) {
        this.tipoAcaoPro = tipoAcaoPro;
    }

    /**
     * @return the numeroPro
     */
    public String getNumeroPro() {
        return numeroPro;
    }

    /**
     * @param numeroPro the numeroPro to set
     */
    public void setNumeroPro(String numeroPro) {
        this.numeroPro = numeroPro;
    }

    /**
     * @return the nivelPro
     */
    public String getNivelPro() {
        return nivelPro;
    }

    /**
     * @param nivelPro the nivelPro to set
     */
    public void setNivelPro(String nivelPro) {
        this.nivelPro = nivelPro;
    }

    /**
     * @return the classificacaoPro
     */
    public String getClassificacaoPro() {
        return classificacaoPro;
    }

    /**
     * @param classificacaoPro the classificacaoPro to set
     */
    public void setClassificacaoPro(String classificacaoPro) {
        this.classificacaoPro = classificacaoPro;
    }

    /**
     * @return the instanciaPro
     */
    public String getInstanciaPro() {
        return instanciaPro;
    }

    /**
     * @param instanciaPro the instanciaPro to set
     */
    public void setInstanciaPro(String instanciaPro) {
        this.instanciaPro = instanciaPro;
    }

    /**
     * @return the origemPro
     */
    public String getOrigemPro() {
        return origemPro;
    }

    /**
     * @param origemPro the origemPro to set
     */
    public void setOrigemPro(String origemPro) {
        this.origemPro = origemPro;
    }

    /**
     * @return the varaPro
     */
    public String getVaraPro() {
        return varaPro;
    }

    /**
     * @param varaPro the varaPro to set
     */
    public void setVaraPro(String varaPro) {
        this.varaPro = varaPro;
    }

    /**
     * @return the fasePro
     */
    public String getFasePro() {
        return fasePro;
    }

    /**
     * @param fasePro the fasePro to set
     */
    public void setFasePro(String fasePro) {
        this.fasePro = fasePro;
    }

    /**
     * @return the descricaoPro
     */
    public String getDescricaoPro() {
        return descricaoPro;
    }

    /**
     * @param descricaoPro the descricaoPro to set
     */
    public void setDescricaoPro(String descricaoPro) {
        this.descricaoPro = descricaoPro;
    }

    /**
     * @return the situacaoPro
     */
    public String getSituacaoPro() {
        return situacaoPro;
    }

    /**
     * @param situacaoPro the situacaoPro to set
     */
    public void setSituacaoPro(String situacaoPro) {
        this.situacaoPro = situacaoPro;
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
    
    public void setCodCli(String codCli) {
        this.codCli = Integer.parseInt(codCli);
    }
    
    
}
