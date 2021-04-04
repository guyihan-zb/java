import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.xml.ws.Response;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * [description]
 *
 * @author： zhangbo
 * @date: 2021-03-29
 * @time: 21:39
 */
public class HelloServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doPost(req, resp);
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //1. 获得写入流

        /*防止中文乱码
        * 在方法开头设置通用属性，编码和数据类型
        * response.setCharaccterEncoding("utf-8");
        *
        * */
        resp.setCharacterEncoding("utf-8");
        resp.setContentType("text/html");

        PrintWriter printWriter = resp.getWriter();
        printWriter.println("<h1 style='color:red'>你好,servlet</h1>");

    }
}
