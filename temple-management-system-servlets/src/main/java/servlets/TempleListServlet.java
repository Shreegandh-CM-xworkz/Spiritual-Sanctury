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
import java.util.List;

@WebServlet(urlPatterns = "/getAllTemples")
public class TempleListServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        TempleService service=new TempleServiceImpl();
        List<TempleEntity> list =service.validateList();
      req.setAttribute("list",list);
    RequestDispatcher dispatcher =req.getRequestDispatcher("list.jsp");
    dispatcher.forward(req,resp);
    }
}
