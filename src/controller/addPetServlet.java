package controller;

import java.io.IOException;
import java.sql.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Owners;
import model.Pets;

/**
 * Servlet implementation class addPetServlet
 */
@WebServlet("/addPetServlet")
public class addPetServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public addPetServlet() {
        super();
        // TODO Auto-generated constructor stub
    }


	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String name = request.getParameter("name");
		String breed = request.getParameter("breed");
		String date = request.getParameter("gotchadate");
		int oname = 1;
		String last = request.getParameter("ownername");
		
		Date gotchaDate = Date.valueOf(date);
		
		Owners yikes = new Owners(oname,last);
		
		// Inserts Pet
		Pets meow = new Pets(name, breed, gotchaDate, yikes);
		petHelper ph = new petHelper();
		ph.insertPet(meow);
		
		
		getServletContext().getRequestDispatcher("/index.jsp").forward(request, response);
	}

}
