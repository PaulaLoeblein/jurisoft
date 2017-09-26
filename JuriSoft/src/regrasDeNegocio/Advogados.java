/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package regrasDeNegocio;

import java.sql.Date;

/**
 *
 * @author 00733769225
 */
public class Advogados {
    private int codAdv;
    private String nomeAdv, sexoAdv, estadoCivilAdv, naturalidadeAdv, nacionalidadeAdv, 
            cpfAdv, rgAdv, telefoneAdv, telefone2Adv, emailAdv, cnhAdv, 
            dataNascAdv, dataCadastroAdv, observacoesAdv, dataInsOAB, tipoInsAdv, seccionalAdv,
            letraAdv, inscricaoAdv;
    private double rendaAdv;
    
    public int getAdvogado (){
        return codAdv;
    }

    /**
     * @return the codAdv
     */
    public int getCodAdv() {
        return codAdv;
    }
    
    public String getCodAdvStr(){
        return String.valueOf(codAdv);
    }

    /**
     * @param codAdv the codAdv to set
     */
    public void setCodAdv(int codAdv) {
        this.codAdv = codAdv;
    }
    
    public void setCodAdv(String codAdv) {
        this.codAdv = Integer.parseInt(codAdv);
    }

    /**
     * @return the nomeAdv
     */
    public String getNomeAdv() {
        return nomeAdv;
    }

    /**
     * @param nomeAdv the nomeAdv to set
     */
    public void setNomeAdv(String nomeAdv) {
        this.nomeAdv = nomeAdv;
    }

    /**
     * @return the sexoAdv
     */
    public String getSexoAdv() {
        return sexoAdv;
    }

    /**
     * @param sexoAdv the sexoAdv to set
     */
    public void setSexoAdv(String sexoAdv) {
        this.sexoAdv = sexoAdv;
    }

    /**
     * @return the estadoCivilAdv
     */
    public String getEstadoCivilAdv() {
        return estadoCivilAdv;
    }

    /**
     * @param estadoCivilAdv the estadoCivilAdv to set
     */
    public void setEstadoCivilAdv(String estadoCivilAdv) {
        this.estadoCivilAdv = estadoCivilAdv;
    }

    /**
     * @return the naturalidadeAdv
     */
    public String getNaturalidadeAdv() {
        return naturalidadeAdv;
    }

    /**
     * @param naturalidadeAdv the naturalidadeAdv to set
     */
    public void setNaturalidadeAdv(String naturalidadeAdv) {
        this.naturalidadeAdv = naturalidadeAdv;
    }

    /**
     * @return the nacionalidadeAdv
     */
    public String getNacionalidadeAdv() {
        return nacionalidadeAdv;
    }

    /**
     * @param nacionalidadeAdv the nacionalidadeAdv to set
     */
    public void setNacionalidadeAdv(String nacionalidadeAdv) {
        this.nacionalidadeAdv = nacionalidadeAdv;
    }

    /**
     * @return the cpfAdv
     */
    public String getCpfAdv() {
        return cpfAdv;
    }

    /**
     * @param cpfAdv the cpfAdv to set
     */
    public void setCpfAdv(String cpfAdv) {
        this.cpfAdv = cpfAdv;
    }

    /**
     * @return the rgAdv
     */
    public String getRgAdv() {
        return rgAdv;
    }

    /**
     * @param rgAdv the rgAdv to set
     */
    public void setRgAdv(String rgAdv) {
        this.rgAdv = rgAdv;
    }

    /**
     * @return the telefoneAdv
     */
    public String getTelefoneAdv() {
        return telefoneAdv;
    }

    /**
     * @param telefoneAdv the telefoneAdv to set
     */
    public void setTelefoneAdv(String telefoneAdv) {
        this.telefoneAdv = telefoneAdv;
    }

    /**
     * @return the telefone2Adv
     */
    public String getTelefone2Adv() {
        return telefone2Adv;
    }

    /**
     * @param telefone2Adv the telefone2Adv to set
     */
    public void setTelefone2Adv(String telefone2Adv) {
        this.telefone2Adv = telefone2Adv;
    }

    /**
     * @return the emailAdv
     */
    public String getEmailAdv() {
        return emailAdv;
    }

    /**
     * @param emailAdv the emailAdv to set
     */
    public void setEmailAdv(String emailAdv) {
        this.emailAdv = emailAdv;
    }

    /**
     * @return the cnhAdv
     */
    public String getCnhAdv() {
        return cnhAdv;
    }

    /**
     * @param cnhAdv the cnhAdv to set
     */
    public void setCnhAdv(String cnhAdv) {
        this.cnhAdv = cnhAdv;
    }

    /**
     * @return the dataNascAdv
     */
    public String getDataNascAdv() {
        return String.valueOf(dataNascAdv);
    }

    /**
     * @param dataNascAdv the dataNascAdv to set
     */
    public void setDataNascAdv(String dataNascAdv) {
        String dia = dataNascAdv.substring(0, 2);
        String mes = dataNascAdv.substring(3, 5);
        String ano = dataNascAdv.substring(6, 10);
        this.dataNascAdv = ano + "-" + mes + "-" + dia;
    }

    /**
     * @return the dataCadastroAdv
     */
    public String getDataCadastroAdv() {
        return String.valueOf(dataCadastroAdv);
    }

    /**
     * @param dataCadastroAdv the dataNascAdv to set
     */
    public void setDataCadastroAdv(String dataCadastroAdv) {
        String dia = dataCadastroAdv.substring(0, 2);
        String mes = dataCadastroAdv.substring(3, 5);
        String ano = dataCadastroAdv.substring(6, 10);
        this.dataCadastroAdv = ano + "-" + mes + "-" + dia;
    }

    /**
     * @return the observacoesAdv
     */
    public String getObservacoesAdv() {
        return observacoesAdv;
    }

    /**
     * @param observacoesAdv the observacoesAdv to set
     */
    public void setObservacoesAdv(String observacoesAdv) {
        this.observacoesAdv = observacoesAdv;
    }

    /**
     * @return the dataInsOAB
     */
   public String getDataInsOAB() {
        return String.valueOf(dataInsOAB);
    }

    /**
     * @param dataInsOAB the dataNascAdv to set
     */
    public void setDataInsOAB(String dataInsOAB) {
        String dia = dataInsOAB.substring(0, 2);
        String mes = dataInsOAB.substring(3, 5);
        String ano = dataInsOAB.substring(6, 10);
        this.dataInsOAB = ano + "-" + mes + "-" + dia;
    }

    /**
     * @return the tipoInsADV
     */
    public String getTipoInsAdv() {
        return tipoInsAdv;
    }

    /**
     * @param tipoInsAdv the tipoInsADV to set
     */
    public void setTipoInsAdv(String tipoInsAdv) {
        this.tipoInsAdv = tipoInsAdv;
    }

    /**
     * @return the seccionalADV
     */
    public String getSeccionalAdv() {
        return seccionalAdv;
    }

    /**
     * @param seccionalAdv the seccionalAdv to set
     */
    public void setSeccionalAdv(String seccionalADV) {
        this.seccionalAdv = seccionalADV;
    }

    /**
     * @return the letraAdv
     */
    public String getLetraAdv() {
        return letraAdv;
    }

    /**
     * @param letraAdv the letraAdv to set
     */
    public void setLetraAdv(String letraADV) {
        this.letraAdv = letraADV;
    }

    /**
     * @return the inscricaoAdv
     */
    public String getInscricaoAdv() {
        return inscricaoAdv;
    }

    /**
     * @param inscricaoAdv the inscricaoADV to set
     */
    public void setInscricaoAdv(String inscricaoADV) {
        this.inscricaoAdv = inscricaoADV;
    }

    /**
     * @return the rendaAdv
     */
    public String getRendaAdvStr() {
        return String.valueOf(rendaAdv);
    }

    /**
     * @param rendaAdv the rendaAdv to set
     */
    public void setRendaAdv(String rendaAdv) {
        this.rendaAdv = Double.parseDouble(rendaAdv);
    }

    /**
     * @param rendaAdv the rendaAdv to set
     */
    public void setRendaAdv(double rendaAdv) {
        this.rendaAdv = rendaAdv;
    }
    
}
