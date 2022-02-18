

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ListaEmpresas
 */
@WebServlet("/ListaEmpresas")
public class ListaEmpresas extends HttpServlet {
	private static final long serialVersionUID = 1L;
    private ArrayList<Empresa> empresas = new ArrayList<Empresa>();  
	
	
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ListaEmpresas() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		
		out.println("<html><body>");
		out.println("<H1>EMPRESAS CADASTRADAS</H1>");
        out.println("<ul>");
        for (Empresa empresa: empresas) {
        	out.println("<li>"+ empresa.getNome() +"</li>");
        }
        out.println("</ul>");
        out.println("</body></html>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		Empresa empresa = new Empresa();
		empresa.setNome(request.getParameter("nome"));
		empresa.setCnpj(request.getParameter("cnpj"));
		
		empresas.add(empresa);
		
		response.sendRedirect("CadastraEmpresa");
	}

}
