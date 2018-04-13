package servlets;

import jaxb.Entry;
import model.ParserModel;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class ChangeServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Entry changeEntry = ParserModel.getInstance().getFeed().getEntry().get(Integer.parseInt(req.getParameter("index_id")));
        req.setAttribute("entry", changeEntry);
        req.setAttribute("index_id", req.getParameter("index_id"));
        req.getRequestDispatcher("views/change.jsp").forward(req,resp);
    }
}
