

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class GuardaEmpresas
 */
@WebServlet("/novaEmpresa")
public class GuardaEmpresas extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {
		
		String name = req.getParameter("nome");
		RequestDispatcher rd = null;
		
		PrintWriter out = resp.getWriter();
		out.println("<html>");
		out.println("<body>");
		out.println("O NOME DA EMPRESA: " + name);
		out.println("</body>");
		out.println("</html>");
		
		System.out.println("O NOME DA EMPRESA: " + name);
	}
}
