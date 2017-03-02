package cdc.ado;

import cdc.model.ClienteModel;
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
public class ClienteAdo implements DAO {
    
    Connection conn;

    public ClienteAdo() throws Exception {
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
        ClienteModel cli = (ClienteModel) ob;
        PreparedStatement ps = null;
        Connection conn = ConnectionDAO.getConnection();

        if (cli == null) {
            throw new Exception("O valor passado não pode ser vazio.");
        }

        try {
            String sql = "INSERT INTO Cliente (nomeCliente, rgCliente, cpfCliente,"
                         + " enderecoCliente, telefone1Cliente, telefone2Cliente, telefoneResidenciaCliente "
                         + "VALUES (?,?,?,?,?,?,?)";
            ps = conn.prepareStatement(sql);

            ps.setString(1, cli.getNomeCliente());
            ps.setString(2, cli.getRgCliente());
            ps.setString(3, cli.getCpfCliente());
            ps.setString(4, cli.getEnderecoCliente());
            ps.setString(5, cli.getTelefone1Cliente());
            ps.setString(6, cli.getTelefone2Cliente());
            ps.setString(7, cli.getTelefoneResidencialCliente());
            ps.executeUpdate();

        } catch (SQLException e) {
            throw new Exception("Erro ao inserir Cliente: " + e);
        } finally {
            ConnectionDAO.closeConnection(conn, ps);
        }
    }
    
}
