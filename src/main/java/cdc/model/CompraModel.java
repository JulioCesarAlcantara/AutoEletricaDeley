package cdc.model;

import java.sql.Date;

/**
 *
 * @author cesar
 */
public class CompraModel {
    private Integer idCompra; 
    private Float valorCompra; 
    private Date dataCompra; 
    private String descricaoCompra; 
    private Integer Parcelas; 
    private String formaPagamentoCompra; 
    private String statusCompra; 
    private Integer idClientesCompra; 
    private Integer idUsuarioCompra; 

    public CompraModel() {
    }

    public CompraModel(Integer idCompra, Float valorCompra, Date dataCompra, String descricaoCompra, Integer Parcelas, String formaPagamentoCompra, String statusCompra, Integer idClientesCompra, Integer idUsuarioCompra) {
        this.idCompra = idCompra;
        this.valorCompra = valorCompra;
        this.dataCompra = dataCompra;
        this.descricaoCompra = descricaoCompra;
        this.Parcelas = Parcelas;
        this.formaPagamentoCompra = formaPagamentoCompra;
        this.statusCompra = statusCompra;
        this.idClientesCompra = idClientesCompra;
        this.idUsuarioCompra = idUsuarioCompra;
    }

    public Integer getIdCompra() {
        return idCompra;
    }

    public void setIdCompra(Integer idCompra) {
        this.idCompra = idCompra;
    }

    public Float getValorCompra() {
        return valorCompra;
    }

    public void setValorCompra(Float valorCompra) {
        this.valorCompra = valorCompra;
    }

    public Date getDataCompra() {
        return dataCompra;
    }

    public void setDataCompra(Date dataCompra) {
        this.dataCompra = dataCompra;
    }

    public String getDescricaoCompra() {
        return descricaoCompra;
    }

    public void setDescricaoCompra(String descricaoCompra) {
        this.descricaoCompra = descricaoCompra;
    }

    public Integer getParcelas() {
        return Parcelas;
    }

    public void setParcelas(Integer Parcelas) {
        this.Parcelas = Parcelas;
    }

    public String getFormaPagamentoCompra() {
        return formaPagamentoCompra;
    }

    public void setFormaPagamentoCompra(String formaPagamentoCompra) {
        this.formaPagamentoCompra = formaPagamentoCompra;
    }

    public String getStatusCompra() {
        return statusCompra;
    }

    public void setStatusCompra(String statusCompra) {
        this.statusCompra = statusCompra;
    }

    public Integer getIdClientesCompra() {
        return idClientesCompra;
    }

    public void setIdClientesCompra(Integer idClientesCompra) {
        this.idClientesCompra = idClientesCompra;
    }

    public Integer getIdUsuarioCompra() {
        return idUsuarioCompra;
    }

    public void setIdUsuarioCompra(Integer idUsuarioCompra) {
        this.idUsuarioCompra = idUsuarioCompra;
    }

    
}
