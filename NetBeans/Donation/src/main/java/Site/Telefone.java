package Site;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author aluno
 */
public class Telefone {

    /**
     * @return the numero
     */
    public int getNumero() {
        return numero;
    }

    /**
     * @param numero the numero to set
     */
    public void setNumero(int numero) {
        this.numero = numero;
    }

    /**
     * @return the cod_pais
     */
    public int getCod_pais() {
        return cod_pais;
    }

    /**
     * @param cod_pais the cod_pais to set
     */
    public void setCod_pais(int cod_pais) {
        this.cod_pais = cod_pais;
    }

    /**
     * @return the ddd
     */
    public int getDdd() {
        return ddd;
    }

    /**
     * @param ddd the ddd to set
     */
    public void setDdd(int ddd) {
        this.ddd = ddd;
    }
    
    private int numero;
    private int cod_pais;
    private int ddd;
   
}
