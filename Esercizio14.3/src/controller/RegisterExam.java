package controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import model.Exam;
import model.Student;

/**
 * Servlet implementation class RegisterExam
 */
@WebServlet("/restricted/RegisterExam")
public class RegisterExam extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RegisterExam() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	*/
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.sendRedirect("RegisterExam.html");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		Date d = null;
		try {
			d = new SimpleDateFormat("yyyy-MM-dd").parse(request.getParameter("examDate"));
			
			Exam ex = new Exam(request.getParameter("courseName"), request.getParameter("teacherName"), d);
			HttpSession session = request.getSession();
			Student s = (Student) session.getAttribute("user");
			s.setExam(ex);
			response.setContentType("text/html");
			PrintWriter pw = response.getWriter();
			pw.print("<h3> Inserimento avvenuto con successo </h3> <br> <a href=\"/Esercizio14.3/Authentication\">Torna al profilo</a>");
		} catch(Exception e) { 
			response.setContentType("text/html");
			PrintWriter pw = response.getWriter();
			pw.print("<h3> Formato data errato: yyyy-MM-dd. </h3> <br> <a href=\"/Esercizio14.3/Authentication\">Torna indietro.</a>");
		}
	}

}
