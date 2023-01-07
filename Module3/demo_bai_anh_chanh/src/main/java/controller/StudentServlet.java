package controller;

import model.Clazz;
import model.Student1;
import service.IClazzService;
import service.IStudentService;
import service.impl.ClazzService;
import service.impl.StudentService;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "StudentServlet", value = "/student")
public class StudentServlet extends HttpServlet {
    private IStudentService studentService = new StudentService();

    private IClazzService clazzService = new ClazzService();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if (action == null) {
            action = "";
        }
        switch (action) {
            case "create":
                showCreateForm(request,response);
                break;
            default:
                showList(request, response);
                break;
        }
    }

    private void showCreateForm(HttpServletRequest request, HttpServletResponse response) {
            List<Clazz> clazzList = new ArrayList<>();
            clazzList = this.clazzService.findByAll();
            request.setAttribute("classList",clazzList);
        try {
            request.getRequestDispatcher("view/student/create.jsp").forward(request,response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void showList(HttpServletRequest request, HttpServletResponse response) {
        List<Student1> student1List = this.studentService.findAll();
        request.setAttribute("student1List", student1List);
//        List<Clazz> clazzes = this.clazzService.findByAll();
//        request.setAttribute("clazzList",clazzes);
        try {
            request.getRequestDispatcher("view/student/list.jsp").forward(request,response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if (action == null) {
            action = "";
        }
        switch (action) {
            case "create":
                break;
            case "delete":
                break;
            case "search":
                break;
            default:
                break;
        }
    }
}
