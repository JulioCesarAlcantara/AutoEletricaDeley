package cdc.model;

/**
 *
 * @author cesar
 */
public class ClienteModel {
    private Integer idCliente; 
    private String nomeCliente;
    private String rgCliente;
    private String cpfCliente;
    private String enderecoCliente;
    private String telefone1Cliente;
    private String telefone2Cliente;
    private String telefoneResidencialCliente;
    

    public ClienteModel() {
    }

    public ClienteModel(Integer idCliente, String nomeCliente, String rgCliente, String cpfCliente, String enderecoCliente, String telefone1Cliente, String telefone2Cliente, String telefoneResidencialCliente) {
        this.idCliente = idCliente;
        this.nomeCliente = nomeCliente;
        this.rgCliente = rgCliente;
        this.cpfCliente = cpfCliente;
        this.enderecoCliente = enderecoCliente;
        this.telefone1Cliente = telefone1Cliente;
        this.telefone2Cliente = telefone2Cliente;
        this.telefoneResidencialCliente = telefoneResidencialCliente;
    }

    public Integer getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(Integer idCliente) {
        this.idCliente = idCliente;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public String getRgCliente() {
        return rgCliente;
    }

    public void setRgCliente(String rgCliente) {
        this.rgCliente = rgCliente;
    }

    public String getCpfCliente() {
        return cpfCliente;
    }

    public void setCpfCliente(String cpfCliente) {
        this.cpfCliente = cpfCliente;
    }

    public String getEnderecoCliente() {
        return enderecoCliente;
    }

    public void setEnderecoCliente(String enderecoCliente) {
        this.enderecoCliente = enderecoCliente;
    }

    public String getTelefone1Cliente() {
        return telefone1Cliente;
    }

    public void setTelefone1Cliente(String telefone1Cliente) {
        this.telefone1Cliente = telefone1Cliente;
    }

    public String getTelefone2Cliente() {
        return telefone2Cliente;
    }

    public void setTelefone2Cliente(String telefone2Cliente) {
        this.telefone2Cliente = telefone2Cliente;
    }

    public String getTelefoneResidencialCliente() {
        return telefoneResidencialCliente;
    }

    public void setTelefoneResidencialCliente(String telefoneResidencialCliente) {
        this.telefoneResidencialCliente = telefoneResidencialCliente;
    }

    
   
}
