import model.Customer;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "CustomerServlet", value = "/customer-servlet")
public class CustomerServlet extends HttpServlet {
    private static List<Customer> customerList = new ArrayList<>();

    static {
        customerList.add(new Customer("Mai Văn Hoàng", "1983-08-20", "Hà Nội", "https://photo-cms-plo.epicdn.me/460x298/Uploaded/2022/yqjvzdjwp/2022_09_22/david-beckham-world-cup-2022-6438.png"));
        customerList.add(new Customer("Nguyễn Văn Nam", "1983-08-21", "Bắc Giang", "https://photo-cms-plo.epicdn.me/460x298/Uploaded/2022/yqjvzdjwp/2022_09_22/david-beckham-world-cup-2022-6438.png"));
        customerList.add(new Customer("Nguyễn Thái Hoà", "1983-08-22", "Nam Định", "https://photo-cms-plo.epicdn.me/460x298/Uploaded/2022/yqjvzdjwp/2022_09_22/david-beckham-world-cup-2022-6438.png"));
        customerList.add(new Customer("Trần Đăng Khoa", "1983-08-17", "Hà Tây", "https://photo-cms-plo.epicdn.me/460x298/Uploaded/2022/yqjvzdjwp/2022_09_22/david-beckham-world-cup-2022-6438.png"));
        customerList.add(new Customer("Nguyễn Đình Thi", "1983-08-19", "Hà Nội", "https://photo-cms-plo.epicdn.me/460x298/Uploaded/2022/yqjvzdjwp/2022_09_22/david-beckham-world-cup-2022-6438.png"));
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setAttribute("list", customerList);
        request.getRequestDispatcher("list.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
