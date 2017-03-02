package cdc.ado;

import cdc.model.UsuarioModel;
import cdc.util.ConnectionDAO;
import cdc.util.DAO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author cesar
 */
public class UsuarioAdo implements DAO {
    
    Connection conn;

    public UsuarioAdo() throws Exception {
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
        UsuarioModel usu = (UsuarioModel) ob;
        PreparedStatement ps = null;
        Connection conn = null;

        if (usu == null) {
            throw new Exception("O valor passado não pode ser vazio.");
        }

        try {
            String sql = "INSERT INTO `Usuario` (`nomeUsuario`, `nomeDeUsuario`, "
                    + " `emailUsuario`, `telefoneUsuario`, `dataNascimentoUsuario`, `senhaUsuario`, `cpfUsuario`) "
                    + " VALUES (?, ?, ?, ?, ?, ?, ?)";
            conn = this.conn;
            ps = conn.prepareStatement(sql);
            System.out.println("SQL: " + sql);

            ps.setString(1, usu.getNomeUsuario());
            ps.setString(2, usu.getNomeDeUsuario());
            ps.setString(3, usu.getEmailUsuario());
            ps.setString(4, usu.getTelefoneUsuario());
            ps.setDate(5, usu.getDataNascimento());
            ps.setString(6, usu.getSenhaUsuario());
            ps.setString(7, usu.getCpfUsuario());
            System.out.println("Aqui 1");
            ps.executeUpdate();

            
        } catch (SQLException e) {
            throw new Exception("Erro ao inserir Usuário: " + e);
        } 
    }
    
    public boolean verificaUsuarioEmail(String nomeDeUsuario, String emailUsuario) throws Exception {
        String username = nomeDeUsuario;
        String email = emailUsuario;
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;

        try {
            String sql = "SELECT emailUsuario FROM Usuario WHERE nomeDeUsuario = ? AND emailUsuario = ?";
            conn = this.conn;
            ps = conn.prepareStatement(sql);

            ps.setString(1, username);
            ps.setString(2, email);
            rs = ps.executeQuery();
            rs.last();
            int size = rs.getRow();
            rs.beforeFirst();

            return size >= 1;

        } catch (SQLException e) {
            throw new Exception(e);
        } finally {
            ConnectionDAO.closeConnection(conn, ps);
        }
    }
    
}
