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
public class Clientes {
    private int codCli;
    private String nomeCli, sexoCli, estadoCivilCli, naturalidadeCli, nacionalidadeCli, 
            filiacaoPaiCli, filiacaoMaeCli, cpfCli, rgCli, telefoneCli, telefone2Cli, emailCli, cnhCli, 
            dataNascCli, dataCadastroCli, observacoesCli;
    private double rendaCli;
 
    public int getCliente (){
        return codCli;
    }
    public String getCodCliStr(){
        return String.valueOf(codCli);
    }
    
    public void setCodCliStr (int codCli){
        this.codCli = codCli;
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
     
    /**
     * @return the nomeCli
     */
    public String getNomeCli() {
        return nomeCli;
    }

    /**
     * @param nomeCli the nomeCli to set
     */
    public void setNomeCli(String nomeCli) {
        this.nomeCli = nomeCli;
    }

    /**
     * @return the cpfCli
     */
    public String getCpfCli() {
        return cpfCli;
    }

    /**
     * @param cpfCli the cpfCli to set
     */
    public void setCpfCli(String cpfCli) {
        this.cpfCli = cpfCli;
    }

    /**
     * @return the rgCli
     */
    public String getRgCli() {
        return rgCli;
    }

    /**
     * @param rgCli the rgCli to set
     */
    public void setRgCli(String rgCli) {
        this.rgCli = rgCli;
    }

    /**
     * @return the telefoneCli
     */
    public String getTelefoneCli() {
        return telefoneCli;
    }

    /**
     * @param telefoneCli the telefoneCli to set
     */
    public void setTelefoneCli(String telefoneCli) {
        this.telefoneCli = telefoneCli;
    }

    /**
     * @return the emailCli
     */
    public String getEmailCli() {
        return emailCli;
    }

    /**
     * @param emailCli the emailCli to set
     */
    public void setEmailCli(String emailCli) {
        this.emailCli = emailCli;
    }

    /**
     * @return the dataNascCli
     */
    public String getDataNascCli() {
        return String.valueOf(dataNascCli);
    }

    /**
     * @param dataNascCli the dataNascCli to set
     */
    public void setDataNascCli(String dataNascCli) {
        String dia = dataNascCli.substring(0, 2);
        String mes = dataNascCli.substring(3, 5);
        String ano = dataNascCli.substring(6, 10);
        this.dataNascCli = ano + "-" + mes + "-" + dia;
    }

    /**
     * @return the sexoCli
     */
    public String getSexoCli() {
        return sexoCli;
    }

    /**
     * @param sexoCli the sexoCli to set
     */
    public void setSexoCli(String sexoCli) {
        this.sexoCli = sexoCli;
    }

    /**
     * @return the rendaCli
     */
    public String getRendaCliStr() {
        return String.valueOf(rendaCli);
    }

    /**
     * @param rendaCli the rendaCli to set
     */
    public void setRendaCli(String rendaCli) {
        this.rendaCli = Double.parseDouble(rendaCli);
    }
    
    public void setRendaCli(double rendaCli) {
        this.rendaCli = rendaCli;
    }

    /**
     * @return the estadoCivilCli
     */
    public String getEstadoCivilCli() {
        return estadoCivilCli;
    }

    /**
     * @param estadoCivilCli the estadoCivilCli to set
     */
    public void setEstadoCivilCli(String estadoCivilCli) {
        this.estadoCivilCli = estadoCivilCli;
    }

    /**
     * @return the naturalidadeCli
     */
    public String getNaturalidadeCli() {
        return naturalidadeCli;
    }

    /**
     * @param naturalidadeCli the naturalidadeCli to set
     */
    public void setNaturalidadeCli(String naturalidadeCli) {
        this.naturalidadeCli = naturalidadeCli;
    }

    /**
     * @return the nacionalidadeCli
     */
    public String getNacionalidadeCli() {
        return nacionalidadeCli;
    }

    /**
     * @param nacionalidadeCli the nacionalidadeCli to set
     */
    public void setNacionalidadeCli(String nacionalidadeCli) {
        this.nacionalidadeCli = nacionalidadeCli;
    }

    /**
     * @return the filiacaoPaiCli
     */
    public String getFiliacaoPaiCli() {
        return filiacaoPaiCli;
    }

    /**
     * @param filiacaoPaiCli the filiacaoPaiCli to set
     */
    public void setFiliacaoPaiCli(String filiacaoPaiCli) {
        this.filiacaoPaiCli = filiacaoPaiCli;
    }

    /**
     * @return the filiacaoMaeCli
     */
    public String getFiliacaoMaeCli() {
        return filiacaoMaeCli;
    }

    /**
     * @param filiacaoMaeCli the filiacaoMaeCli to set
     */
    public void setFiliacaoMaeCli(String filiacaoMaeCli) {
        this.filiacaoMaeCli = filiacaoMaeCli;
    }

    /**
     * @return the telefone2Cli
     */
    public String getTelefone2Cli() {
        return telefone2Cli;
    }

    /**
     * @param telefone2Cli the telefone2Cli to set
     */
    public void setTelefone2Cli(String telefone2Cli) {
        this.telefone2Cli = telefone2Cli;
    }

    /**
     * @return the cnhCli
     */
    public String getCnhCli() {
        return cnhCli;
    }

    /**
     * @param cnhCli the cnhCli to set
     */
    public void setCnhCli(String cnhCli) {
        this.cnhCli = cnhCli;
    }

    /**
     * @return the dataCadastroCli
     */
    public String getDataCadastroCli() {
        return String.valueOf(dataCadastroCli);
    }

    /**
     * @param dataCadastroCli the dataCadastroCli to set
     */
    public void setDataCadastroCli(String dataCadastroCli) {
        String dia = dataCadastroCli.substring(0, 2);
        String mes = dataCadastroCli.substring(3, 5);
        String ano = dataCadastroCli.substring(6, 10);
        this.dataCadastroCli = ano + "-" + mes + "-" + dia;
    }


    /**
     * @return the observacoesCli
     */
    public String getObservacoesCli() {
        return observacoesCli;
    }

    /**
     * @param observacoesCli the observacoesCli to set
     */
    public void setObservacoesCli(String observacoesCli) {
        this.observacoesCli = observacoesCli;
    }
    
}
