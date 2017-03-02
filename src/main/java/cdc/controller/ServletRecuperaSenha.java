package cdc.controller;

import cdc.ado.UsuarioAdo;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author cesar
 */
public class ServletRecuperaSenha extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        HttpSession session = request.getSession(true);
        String cmd = request.getParameter("cmd");

        if (cmd == null) {
            cmd = "principal";
        }

        try {
            
            UsuarioAdo usuario = new UsuarioAdo(); 

            if (cmd.equalsIgnoreCase("recSenha")) {
                String nomeDeUsuario = request.getParameter("userLogin");
                String emailUsuario = request.getParameter("userEmail");
                
                boolean existeUsuarioEmail = usuario.verificaUsuarioEmail(nomeDeUsuario, emailUsuario); 
                
                if(existeUsuarioEmail){
                    // implementar o envio do email aqui; 
                    
                    String mensagemDeInformacao = "Foi enviado um email para " + emailUsuario + "contendo seus dados de recuperação de senha.";
                    request.setAttribute("mensagemDeInformacao", mensagemDeInformacao);
                } else{
                    String mensagemErro = "Não existe nenhum usuário com esse nome e email. Por favor, insira Login e Email corretamente."; 
                    request.setAttribute("mensagemDeErro", mensagemErro);
                }
                
                

               
                request.getRequestDispatcher("/Carrinho.jsp").forward(request, response);
          
            } else if (cmd.equalsIgnoreCase("del")) {
                
            } else if (cmd.equalsIgnoreCase("finalizaCompra")) {
               

            }
    }
    catch (Exception ex) {
            request.getRequestDispatcher("/LoginDeUsuarios.jsp").forward(request, response);
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
