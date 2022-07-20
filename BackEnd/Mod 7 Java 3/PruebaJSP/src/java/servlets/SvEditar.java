
package servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import logica.ControladoraLogica;
import logica.Persona;


@WebServlet(name = "SvEditar", urlPatterns = {"/SvEditar"})
public class SvEditar extends HttpServlet {

ControladoraLogica control=new ControladoraLogica();

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
    }

    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }
    
     
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
        
        int id_editar = Integer.parseInt(request.getParameter("id_editar"));  
        String dni = request.getParameter("dni2");
        String nombre = request.getParameter("nombre2");
        String apellido = request.getParameter("apellido2");
        String telefono = request.getParameter("telefono2");
    
        Persona per2 = new Persona(id_editar,dni,nombre,apellido,telefono);
        
        control.editarPersona(per2);
        response.sendRedirect("editarPersona.jsp");     
        
    }

   @Override
    public String getServletInfo() {
        return "Short description";
    }

}
