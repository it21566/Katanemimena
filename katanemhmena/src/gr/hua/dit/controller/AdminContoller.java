package gr.hua.dit.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import gr.hua.dit.dao.AdminDAO;
import gr.hua.dit.entity.*;

@Controller
@RequestMapping("/admin")
public class AdminContoller {

	@Autowired
	private AdminDAO adminDAO;

	@RequestMapping("/addAdmin")
	public String addAdmin(HttpServletRequest request, Model model) {

		Admin admin = new Admin();
		admin.setAm(request.getParameter("am"));
		admin.setFirst_name(request.getParameter("first_name"));
		admin.setLast_name(request.getParameter("last_name"));
		admin.setEmail(request.getParameter("email"));
		admin.setRole(request.getParameter("role"));

		adminDAO.addAdmin(admin);

		return "done";
	}

	@RequestMapping("/addVeget")
	public String addVeget(HttpServletRequest request, Model model) {

		Veget veget = new Veget();
		veget.setAm(request.getParameter("am"));
		veget.setFirst_name(request.getParameter("first_name"));
		veget.setLast_name(request.getParameter("last_name"));
		veget.setEmail(request.getParameter("email"));
		veget.setRole(request.getParameter("role"));
		veget.setDate_of_birth(request.getParameter("date_of_birth"));

		adminDAO.addVeget(veget);

		return "done";
	}

	@RequestMapping("/addEmployee")
	public String addEmployee(HttpServletRequest request, Model model) {

		Employee employee = new Employee();
		employee.setAm(request.getParameter("am"));
		employee.setFirst_name(request.getParameter("first_name"));
		employee.setLast_name(request.getParameter("last_name"));
		employee.setEmail(request.getParameter("email"));
		employee.setRole(request.getParameter("role"));
		
		adminDAO.addEmployee(employee);

		return "done";
	}

	@RequestMapping("/delVeget")
	public String delVeget(HttpServletRequest request, Model model) {

		adminDAO.deleteVeget(adminDAO.getVeget(Integer.parseInt(request.getParameter("id"))));

		return "done";
	}

	@RequestMapping("/delEmployee")
	public String delEmployee(HttpServletRequest request, Model model) {

		adminDAO.deleteEmployee(adminDAO.getEmployee(Integer.parseInt(request.getParameter("id"))));

		return "done";
	}
}
