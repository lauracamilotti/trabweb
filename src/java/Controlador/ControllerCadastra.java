package Controlador;

import DAO.UsuarioDAO;
import DTO.Erro;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import DTO.UsuarioDTO;
import javax.servlet.RequestDispatcher;

@WebServlet(name = "ControllerCadastra", urlPatterns = {"/ControllerCadastra"})
public class ControllerCadastra extends HttpServlet {

    //controlador para o cadastro, verifica as entradas de acordo com as regras(vazio, maior, menor) 
    //se tudo certo cadastra no banco de dados e vai para a pagina logia
    //se errado volta para a pagina cadastro
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        UsuarioDTO usuario = new UsuarioDTO();
        String pagina = "";
        request.setCharacterEncoding("UTF-8");
        if (request.getParameter("login").isEmpty() || request.getParameter("senha").isEmpty()) {
            Erro erro = new Erro();
            erro.setErro("Usuario e senha nao pode ser vazio");
            erro.setEndereco("cadastra.jsp");
            pagina = "Erro.jsp";
            request.setAttribute("erro", erro);
        } else {
            usuario.setLogin(request.getParameter("login"));
            usuario.setSenha(request.getParameter("senha"));
            if (UsuarioDAO.existeUsuario(usuario)) {
                Erro erro = new Erro();
                erro.setErro("O usuario ja existe");
                erro.setEndereco("cadastra.jsp");
                pagina = "Erro.jsp";
                request.setAttribute("erro", erro);
            } else {
                pagina = "login.jsp";
                request.setAttribute("usuario", usuario);
                UsuarioDAO.insereUsuario(usuario);
            }
        }
        RequestDispatcher rd = request.getRequestDispatcher(pagina);
        rd.forward(request, response);

    }
}
