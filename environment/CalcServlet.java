import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * [description]
 *
 * @author： zhangbo
 * @date: 2021-03-30
 * @time: 20:19
 */
public class CalcServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //1设置编码和返回类型
        response.setCharacterEncoding("utf-8");
        response.setContentType("text/html");
        //2获得前端传递的参数
        String num1=request.getParameter("number1");
        String num2=request.getParameter("number2");
        //3业务逻辑处理
        int total= Integer.parseInt(num1)+ Integer.parseInt(num2);
        //4返回结果给前端
        PrintWriter printWriter= response.getWriter();
        //String.format 包含所有的字符串
        printWriter.println(String.format("<h1>结果为：%d</h1>",total));


    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request,response);
    }
}
