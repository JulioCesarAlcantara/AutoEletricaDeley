package cdc.controller;

import cdc.ado.UsuarioAdo;
import cdc.model.UsuarioModel;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author cesar
 */
public class ServletUsuario extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String cmd = request.getParameter("cmd");

        if (cmd == null) {
            cmd = "principal";
        }

        try {

            UsuarioAdo usuario = new UsuarioAdo();

            if (cmd.equalsIgnoreCase("saveAdd")) {
                String nomeUsuario = request.getParameter("nomeUsuario");
                String nomeDeUsuario = request.getParameter("nomeDeUsuario");
                String emailUsuario = request.getParameter("emailUsuario");
                String telefoneUsuario = request.getParameter("telefoneUsuario");
                String dataNascimentoUsuario = request.getParameter("dataNascimentoUsuario");
                String cpfUsuario = request.getParameter("cpfUsuario");
                String senhaUsuario = request.getParameter("senhaUsuario");
                String senhaConfUsuario = request.getParameter("senhaConfUsuario");

                SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
                java.sql.Date data = new java.sql.Date(format.parse(dataNascimentoUsuario).getTime());

                if (senhaUsuario.equalsIgnoreCase(senhaConfUsuario)) {
                    UsuarioModel usua = new UsuarioModel(nomeUsuario, nomeDeUsuario, emailUsuario, telefoneUsuario, data, senhaUsuario, cpfUsuario);
                    System.out.println("MODEL: " + usua);
                    usuario.salvar(usua);
                    request.getRequestDispatcher("/LoginDeUsuarios.jsp").forward(request, response);
                }

            }

        } catch (Exception ex) {
            //request.getRequestDispatcher("/LoginDeUsuarios.jsp").forward(request, response);
            //Logger.getLogger(ServletTelaDeProdutos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
