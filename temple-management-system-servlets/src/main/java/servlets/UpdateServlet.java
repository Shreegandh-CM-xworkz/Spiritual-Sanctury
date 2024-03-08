package servlets;

import service.TempleService;
import serviceImpl.TempleServiceImpl;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.time.LocalDate;

@WebServlet(urlPatterns = "/updateInfoForm")
public class UpdateServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String name=req.getParameter("name");
        String location=req.getParameter("location");
        String vipEntry=req.getParameter("vipEntry");
        String inaguratedDate =req.getParameter("inaguratedDate");
        String mainGod=req.getParameter("mainGod");
        String dimension=req.getParameter("dimension");
        Double entryFee= Double.valueOf(req.getParameter("entryFee"));
        int id= GetTempleServlet.id;
        TempleService service=new TempleServiceImpl();
        service.validateUpdate(id,name,location,vipEntry,inaguratedDate,mainGod,dimension, entryFee);

        RequestDispatcher dispatcher =req.getRequestDispatcher("updatedMsg.jsp");
        dispatcher.forward(req,resp);
    }
}
