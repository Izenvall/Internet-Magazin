package Dynamics;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.ServletException;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;




public class PageServlet extends HttpServlet {

    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        req.setAttribute("todo", "10");

       // List list = context.getBean(List.class);
       // req.setAttribute("list", list);

        req.getRequestDispatcher("/FlappyBird/index.jsp").forward(req, resp);
    }
}
