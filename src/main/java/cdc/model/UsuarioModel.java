package cdc.model;

import java.sql.Date;

/**
 *
 * @author cesar
 */
public class UsuarioModel {
    private Integer idUsuario; 
    private String nomeUsuario; 
    private String nomeDeUsuario; 
    private String emailUsuario; 
    private String telefoneUsuario; 
    private Date dataNascimento; 
    private String senhaUsuario; 
    private String cpfUsuario; 

    public UsuarioModel() {
    }

    public UsuarioModel(Integer idUsuario, String nomeUsuario, String nomeDeUsuario, String emailUsuario, String telefoneUsuario, Date dataNascimento, String senhaUsuario, String cpfUsuario) {
        this.idUsuario = idUsuario;
        this.nomeUsuario = nomeUsuario;
        this.nomeDeUsuario = nomeDeUsuario;
        this.emailUsuario = emailUsuario;
        this.telefoneUsuario = telefoneUsuario;
        this.dataNascimento = dataNascimento;
        this.senhaUsuario = senhaUsuario;
        this.cpfUsuario = cpfUsuario;
    }

    public UsuarioModel(String nomeUsuario, String nomeDeUsuario, String emailUsuario, String telefoneUsuario, Date dataNascimento, String senhaUsuario, String cpfUsuario) {
        this.nomeUsuario = nomeUsuario;
        this.nomeDeUsuario = nomeDeUsuario;
        this.emailUsuario = emailUsuario;
        this.telefoneUsuario = telefoneUsuario;
        this.dataNascimento = dataNascimento;
        this.senhaUsuario = senhaUsuario;
        this.cpfUsuario = cpfUsuario;
    }

    public Integer getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(Integer idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getNomeUsuario() {
        return nomeUsuario;
    }

    public void setNomeUsuario(String nomeUsuario) {
        this.nomeUsuario = nomeUsuario;
    }

    public String getNomeDeUsuario() {
        return nomeDeUsuario;
    }

    public void setNomeDeUsuario(String nomeDeUsuario) {
        this.nomeDeUsuario = nomeDeUsuario;
    }

    public String getEmailUsuario() {
        return emailUsuario;
    }

    public void setEmailUsuario(String emailUsuario) {
        this.emailUsuario = emailUsuario;
    }

    public String getTelefoneUsuario() {
        return telefoneUsuario;
    }

    public void setTelefoneUsuario(String telefoneUsuario) {
        this.telefoneUsuario = telefoneUsuario;
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getSenhaUsuario() {
        return senhaUsuario;
    }

    public void setSenhaUsuario(String senhaUsuario) {
        this.senhaUsuario = senhaUsuario;
    }

    public String getCpfUsuario() {
        return cpfUsuario;
    }

    public void setCpfUsuario(String cpfUsuario) {
        this.cpfUsuario = cpfUsuario;
    }

   
    
}
