package servlets;


import model.ParserModel;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.xml.bind.JAXBException;
import java.io.IOException;

public class ParserXmlServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("views/parser.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        try {
            ParserModel parserModel = ParserModel.getInstance();
            parserModel.setFeed(req.getParameter("url"));
            req.setAttribute("feed", parserModel.getFeed());
            req.getRequestDispatcher("views/parser.jsp").forward(req,resp);
        } catch (JAXBException e) {
            e.printStackTrace();
        }



    }
}
