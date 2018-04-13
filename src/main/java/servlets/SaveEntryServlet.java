package servlets;

import jaxb.Entry;
import jaxb.Feed;
import model.ParserModel;

import javax.jws.WebService;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebService(name = "/saveEntry")
public class SaveEntryServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Feed feed = ParserModel.getInstance().getFeed();
        Entry entry = feed.getEntry().get(Integer.parseInt(req.getParameter("index_id")));

        entry.setId(req.getParameter("Id"));
        entry.setTitle(req.getParameter("Title"));
        entry.setGoogleProductCategory(req.getParameter("GoogleProductCategory"));
        entry.setProductType(req.getParameter("ProductType"));
        entry.setLink(req.getParameter("Link"));
        entry.setImageLink(req.getParameter("ImageLink"));
        entry.setCondition(req.getParameter("Condition"));
        entry.setAvailability(req.getParameter("Availability"));
        entry.setPrice(req.getParameter("Price"));
        entry.setGtin(req.getParameter("Gtin"));
        entry.setMpn(req.getParameter("Mpn"));
        entry.setBrand(req.getParameter("Brand"));

        req.setAttribute("feed", feed);
        req.getRequestDispatcher("views/parser.jsp").forward(req,resp);


    }
}
