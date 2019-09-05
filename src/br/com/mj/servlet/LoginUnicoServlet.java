package br.com.mj.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginUnicoServlet
 */
@WebServlet("/LoginUnicoServlet")
public class LoginUnicoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginUnicoServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		response.getWriter().append("Served at: ").append(request.getContextPath());
		
		System.out.println(response.getHeader("Autorization"));
		
		System.out.println(request.getParameter("code"));
		
		response.sendRedirect("https://sso.staging.acesso.gov.br" + 
		System.lineSeparator() + 
		"autorize?" + "response_type=code&client_id=tstmigranteweb.fsw.ctis.com.br/migrante-web&scope=openid+profile+phone+email+govbr_empresa&redirect_uri=http://tstmigranteweb.fsw.ctis.com.br&nonce=123132&state=12312312");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
