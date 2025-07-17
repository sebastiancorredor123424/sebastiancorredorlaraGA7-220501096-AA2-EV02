package com.tuempresa.login;

import java.io.IOException;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(name = "LoginServlet", urlPatterns = {"/LoginServlet"})
public class LoginServlet extends HttpServlet {

    // Usuario y contraseña válidos (por ejemplo)
    private final String validUser = "sebastian";
    private final String validPass = "sebastian";

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String user = request.getParameter("user");
        String pass = request.getParameter("pass");
        
        if (validUser.equals(user) && validPass.equals(pass)) {
            // Si es correcto, pasar el usuario a JSP y redirigir a bienvenida
            request.setAttribute("usuario", user);
            request.getRequestDispatcher("bienvenida.jsp").forward(request, response);
        } else {
            // Si es incorrecto, enviar a página de error
            request.getRequestDispatcher("error.jsp").forward(request, response);
        }
    }
    
    // Opcional: si quieren soportar GET para probar
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.sendRedirect("index.html");
    }
}
