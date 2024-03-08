package servlets;

import Entities.TempleEntity;
import com.sun.org.apache.xpath.internal.operations.Bool;
import service.TempleService;
import serviceImpl.TempleServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/delete")
public class DeleteServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
       int id= Integer.parseInt(req.getParameter("id"));
        TempleService service=new TempleServiceImpl();
        Boolean isDeleted =service.deleteById(id);
        if (isDeleted==true){
            resp.sendRedirect(req.getContextPath()+"/getAllTemples");
        }

    }
}
