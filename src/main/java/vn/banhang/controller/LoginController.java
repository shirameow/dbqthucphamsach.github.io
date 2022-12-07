package vn.banhang.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import vn.banhang.dao.LoginDAO;
import vn.banhang.model.AccountModel;

/**
 * Servlet implementation class LoginController
 */
@WebServlet("/dang-nhap")
public class LoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//		Chuyen huong trang trả về trang cần trả
		RequestDispatcher rq= req.getRequestDispatcher("/login.jsp");
		rq.forward(req, resp);
	}


	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String username =req.getParameter("user");
		String password =req.getParameter("pass");
		
		LoginDAO lgDao=new LoginDAO();
		AccountModel acc= lgDao.dangNhap(username, password);
		if(acc == null) {
			req.setAttribute("mess", "Tài khoản không tồn tại");
			req.getRequestDispatcher("/login.jsp").forward(req, resp);
		}
		else {
//			Gọi ses để lưu dữ liệu 
			HttpSession session=req.getSession();
			session.setAttribute("acc", acc);
//			session.getMaxInactiveInterval();
			resp.sendRedirect("trang-chu");
		}
		
		
		
		String dkTen=req.getParameter("ten");
		String dkDiaChi=req.getParameter("diaChi");
		String dkSDT=req.getParameter("SDT");
		String dkMK=req.getParameter("pswd");
		AccountModel acc2=lgDao.dangKi(dkSDT, dkMK, dkTen, dkDiaChi);
		
	}

}
