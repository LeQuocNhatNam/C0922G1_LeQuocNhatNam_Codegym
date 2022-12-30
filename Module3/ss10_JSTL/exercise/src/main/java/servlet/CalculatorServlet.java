package servlet;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "CalculatorServlet", value = "/calculator")
public class CalculatorServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Double firstOperand = Double.valueOf(request.getParameter("firstOperand"));
        String operator = request.getParameter("operator");
        Double secondOperand = Double.valueOf(request.getParameter("secondOperand"));
        double result = 0;
        request.setAttribute("exception", 0);
        switch (operator) {
            case "add": {
                result = firstOperand + secondOperand;
            }
            break;
            case "sub": {
                result = firstOperand - secondOperand;
            }
            break;
            case "mul": {
                result = firstOperand * secondOperand;
            }
            break;
            case "div": {
                try {
                    result = firstOperand / secondOperand;
                    if (result == Double.POSITIVE_INFINITY || result == Double.NEGATIVE_INFINITY) {
                        throw new ArithmeticException();
                    }

                } catch (ArithmeticException e) {
                    request.setAttribute("exception", 1);
                }
            }
            break;
        }
        request.setAttribute("result", result);
        request.getRequestDispatcher("result.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
