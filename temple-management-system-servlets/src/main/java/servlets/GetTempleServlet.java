package servlets;

import Entities.TempleEntity;
import service.TempleService;
import serviceImpl.TempleServiceImpl;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(urlPatterns = "/update")
public class GetTempleServlet extends HttpServlet {
    static int id;
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        id = Integer.parseInt(req.getParameter("id"));
        TempleService service=new TempleServiceImpl();
        TempleEntity entity =service.getTemple(id);
        System.out.println(entity);
        req.setAttribute("entity",entity);
        RequestDispatcher dispatcher =req.getRequestDispatcher("updateForm.jsp");
        dispatcher.forward(req,resp);

    }
}
