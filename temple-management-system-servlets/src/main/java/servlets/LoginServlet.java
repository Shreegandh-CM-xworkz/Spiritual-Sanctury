package servlets;

import service.AdminService;
import serviceImpl.AdminServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/login")
public class LoginServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String userName=req.getParameter("userName");
        String password=req.getParameter("password");
        AdminService service=new AdminServiceImpl();
        Boolean isFound=service.validateAdmin(userName,password);
        System.out.println(isFound);
        if (isFound==true){
            resp.sendRedirect("index.jsp");
        }else {
            resp.sendRedirect("failure.jsp");
        }

    }
}
