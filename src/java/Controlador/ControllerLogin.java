package Controlador;
import DAO.UsuarioDAO;
import DTO.Erro;
import DTO.UsuarioDTO;
import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

//controlador para o login, o controlador verifica a existencia e vericidade dos dados, se verificado corretamente vai para a pagina 
//inicial do site, senao retorna para a pagina login vazia
@WebServlet(name = "ControllerLogin", urlPatterns = {"/ControllerLogin"})
public class ControllerLogin extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        UsuarioDTO usuario = new UsuarioDTO();
	usuario.setLogin(request.getParameter("login"));
	usuario.setSenha(request.getParameter("senha"));
	request.setCharacterEncoding("UTF-8");
	String pagina = "";
        if (request.getParameter("login").isEmpty() || request.getParameter("senha").isEmpty()) {
        Erro erro = new Erro();
        erro.setErro("Usuario e senha nao pode ser vazio");
        erro.setEndereco("login.jsp");
        pagina = "Erro.jsp";
        request.setAttribute("erro", erro);
        }
	if(UsuarioDAO.existeUsuario(usuario)){
	    System.out.println("Logou");
	    pagina = "BemVindo.jsp";
	    HttpSession session = request.getSession(true);
	    session.setAttribute("loginUsuario", usuario.getLogin());
	    request.setAttribute("usuario", usuario);
	}
	RequestDispatcher rd = request.getRequestDispatcher(pagina);
	rd.forward(request, response);
    }
}