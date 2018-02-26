
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author aluno
 */
public class Usuario {

    
    
@Entity
@Table(name "Username")
public Usuario(String nomeCompleto) implement serializable{
       String.nomes[]=nomeCompleto.split(" ");
       this.nome= nomes[0];
       for (int i=i;i<nomes.length; i++);ub
   }
    /**
     * @return the cod_usuario
     */
    public String getCod_usuario() {
        return cod_usuario;
    }

    /**
     * @param cod_usuario the cod_usuario to set
     */
    public void setCod_usuario(String cod_usuario) {
        this.cod_usuario = cod_usuario;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return the nome_completo
     */
    public String getNome_completo() {
        return nome_completo;
    }

    /**
     * @param nome_completo the nome_completo to set
     */
    public void setNome_completo(String nome_completo) {
        this.nome_completo = nome_completo;
    }

    /**
     * @return the nome_social
     */
    public String getNome_social() {
        return nome_social;
    }

    /**
     * @param nome_social the nome_social to set
     */
    public void setNome_social(String nome_social) {
        this.nome_social = nome_social;
    }

    /**
     * @return the cpf
     */
    public int getCpf() {
        return cpf;
    }

    /**
     * @param cpf the cpf to set
     */
    public void setCpf(int cpf) {
        this.cpf = cpf;
    }

    /**
     * @return the rg
     */
    public int getRg() {
        return rg;
    }

    /**
     * @param rg the rg to set
     */
    public void setRg(int rg) {
        this.rg = rg;
    }

    /**
     * @return the senha
     */
    public String getSenha() {
        return senha;
    }

    /**
     * @param senha the senha to set
     */
    public void setSenha(String senha) {
        this.senha = senha;
    }

    /**
     * @return the tipo_logradouro
     */
    public String getTipo_logradouro() {
        return tipo_logradouro;
    }

    /**
     * @param tipo_logradouro the tipo_logradouro to set
     */
    public void setTipo_logradouro(String tipo_logradouro) {
        this.tipo_logradouro = tipo_logradouro;
    }

    /**
     * @return the complemento
     */
    public String getComplemento() {
        return complemento;
    }

    /**
     * @param complemento the complemento to set
     */
    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    /**
     * @return the bairro
     */
    public String getBairro() {
        return bairro;
    }

    /**
     * @param bairro the bairro to set
     */
    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    /**
     * @return the municipio
     */
    public String getMunicipio() {
        return municipio;
    }

    /**
     * @param municipio the municipio to set
     */
    public void setMunicipio(String municipio) {
        this.municipio = municipio;
    }

    /**
     * @return the uf
     */
    public String getUf() {
        return uf;
    }

    /**
     * @param uf the uf to set
     */
    public void setUf(String uf) {
        this.uf = uf;
    }

    /**
     * @return the cep
     */
    public int getCep() {
        return cep;
    }

    /**
     * @param cep the cep to set
     */
    public void setCep(int cep) {
        this.cep = cep;
    }

    /**
     * @return the banco
     */
    public String getBanco() {
        return banco;
    }

    /**
     * @param banco the banco to set
     */
    public void setBanco(String banco) {
        this.banco = banco;
    }

    /**
     * @return the agencia
     */
    public int getAgencia() {
        return agencia;
    }

    /**
     * @param agencia the agencia to set
     */
    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }

    /**
     * @return the conta
     */
    public String getConta() {
        return conta;
    }

    /**
     * @param conta the conta to set
     */
    public void setConta(String conta) {
        this.conta = conta;
    }
    
    
  
    @Id
    @GeneratedValue
    @Colun(name="cod_usuario")
    private String cod_usuario;
    private String email;    
    private String nome_completo;
    private String nome_social;
    private int cpf;
    private int rg;
    private String senha;
    private String tipo_logradouro;
    private String complemento;
    private String bairro;
    private String municipio;
    private String uf;
    private int cep;
    private String banco;
    private int agencia;
    private String conta;

}
