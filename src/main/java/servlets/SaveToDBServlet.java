package servlets;

import database.DBService;
import jaxb.Entry;
import jaxb.Feed;
import model.ParserModel;

import javax.jws.WebService;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebService(name = "/done")
public class SaveToDBServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        DBService dbService = new DBService();
        Feed feed = ParserModel.getInstance().getFeed();

        for (Entry e: feed.getEntry()) {
            dbService.addEntry(e);
        }

        req.setAttribute("doneSave", "done");
        req.setAttribute("feed", feed);
        req.getRequestDispatcher("views/parser.jsp").forward(req,resp);
    }

}
