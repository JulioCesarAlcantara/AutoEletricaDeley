package cdc.ado;

import cdc.model.ClienteModel;
import cdc.model.CompraModel;
import cdc.util.ConnectionDAO;
import cdc.util.DAO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author cesar
 */
public class CompraAdo implements DAO {
    
     Connection conn;

    public CompraAdo() throws Exception {
        try {
            this.conn = ConnectionDAO.getConnection();
        } catch (Exception e) {
            throw new Exception("Erro: " + e.getMessage());
        }
    }

    @Override
    public void atualizar(Object ob) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void excluir(Object ob) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List listaTodos() throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List procura(Object ob) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void salvar(Object ob) throws Exception {
      CompraModel compra = (CompraModel) ob;
        PreparedStatement ps = null;
        Connection conn = ConnectionDAO.getConnection();

        if (compra == null) {
            throw new Exception("O valor passado não pode ser vazio.");
        }

        try {
            String query = "INSERT INTO Compra (valorCompra, dataCompra, descricaoCompra, "
                         + "parcelasCompra, formaPagamentoCompra, statusCompra, idClienteCompra, idUsuarioCompra"
                         + "VALUES (?,?,?,?,?,?,?)";
            ps = conn.prepareStatement(query);

            ps.setFloat(1, compra.getValorCompra());
            ps.setDate(2, compra.getDataCompra());
            ps.setString(3, compra.getDescricaoCompra());
            ps.setInt(4, compra.getParcelas());
            ps.setString(5, compra.getFormaPagamentoCompra());
            ps.setString(6, compra.getStatusCompra());
            ps.setInt(7, compra.getIdClientesCompra());
            ps.setInt(8, compra.getIdUsuarioCompra());
            ps.executeUpdate();

        } catch (SQLException e) {
            throw new Exception("Erro ao cadastrar Compra: " + e);
        } finally {
            ConnectionDAO.closeConnection(conn, ps);
        }
    }
    
}
