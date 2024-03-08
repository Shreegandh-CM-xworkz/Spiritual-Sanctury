package servlets;

import Entities.ContactFormEntity;
import service.ContactService;
import serviceImpl.ContactServiceImpl;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/processContactForm")
public class ContactFormServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
       String name= req.getParameter("name");
       String email= req.getParameter("email");
       String subject= req.getParameter("subject");
       String message= req.getParameter("message");
        ContactFormEntity entity=new ContactFormEntity();
        entity.setName(name);
        entity.setEmail(email);
        entity.setSubject(subject);
        entity.setMessage(message);

        ContactService service=new ContactServiceImpl();
        service.validateSave(entity);

        RequestDispatcher dispatcher =req.getRequestDispatcher("contactSubmitted.jsp");
        dispatcher.forward(req,resp);



    }
}
