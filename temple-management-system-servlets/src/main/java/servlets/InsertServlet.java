package servlets;

import Entities.TempleEntity;
import service.TempleService;
import serviceImpl.TempleServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDate;

@WebServlet(urlPatterns = "/templeEntry")
public class InsertServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
                    String name=req.getParameter("name");
                    String location=req.getParameter("location");
                    String vipEntry=req.getParameter("vipEntry");
                    String inaguratedDate = req.getParameter("inauguratedDate");
                    String mainGod=req.getParameter("mainGod");
                    String dimension=req.getParameter("dimension");
                    Double entryFee= Double.valueOf(req.getParameter("entryFee"));

        TempleEntity entity=new TempleEntity();
        entity.setName(name);
        entity.setLocation(location);
        entity.setVipEntry(vipEntry);
        entity.setInaguratedDate(inaguratedDate);
        entity.setMainGod(mainGod);
        entity.setDimension(dimension);
        entity.setEntryFee(entryFee);

        TempleService service=new TempleServiceImpl();
        service.validate(entity);
        PrintWriter writer=resp.getWriter();
        writer.print("Data added successfully go back to see the list");

    }
}
