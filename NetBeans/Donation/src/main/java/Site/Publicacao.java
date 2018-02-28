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
public class Publicacao {

    /**
     * @return the cod_publicacao
     */
    public String getCod_publicacao() {
        return cod_publicacao;
    }

    /**
     * @param cod_publicacao the cod_publicacao to set
     */
    public void setCod_publicacao(String cod_publicacao) {
        this.cod_publicacao = cod_publicacao;
    }

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the descricao
     */
    public String getDescricao() {
        return descricao;
    }

    /**
     * @param descricao the descricao to set
     */
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    /**
     * @return the status
     */
    public String getStatus() {
        return status;
    }

    /**
     * @param status the status to set
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * @return the curtidas
     */
    public int getCurtidas() {
        return curtidas;
    }

    /**
     * @param curtidas the curtidas to set
     */
    public void setCurtidas(int curtidas) {
        this.curtidas = curtidas;
    }
    
    private String cod_publicacao;
    private String nome;
    private String descricao;
    private String status;
    private int curtidas;
    
}
