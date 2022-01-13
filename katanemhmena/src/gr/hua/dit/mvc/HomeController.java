package gr.hua.dit.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

	@RequestMapping("/")
	public String showfirstpage() {
		return "index";
	}

	@RequestMapping("/showAddAdminForm")
	public String showAddAdminForm() {
		return "addAdminForm";
	}

	@RequestMapping("/showAddVegetForm")
	public String showAddVegetForm() {
		return "addVegetForm";
	}

	@RequestMapping("/showAddEmployeeForm")
	public String showAddEmployeeForm() {
		return "addEmployeeForm";
	}

	@RequestMapping("/showDelEmployee")
	public String showDelEmployee() {
		return "delEmployee";
	}

	@RequestMapping("/showDelVeget")
	public String showDelVeget() {
		return "delVeget";
	}

	@RequestMapping("/showMakeFormForm")
	public String showMakeFormForm() {
		return "makeFormForm";
	}
}
/*
 * @RequestMapping("/processForm") public String processForm() { return
 * "helloworld"; }
 * 
 * @RequestMapping("/processFormv2") public String
 * processFormv2(HttpServletRequest request, Model model) { String theName =
 * request.getParameter("studentName"); theName = theName.toUpperCase(); String
 * result ="Hello " + theName; model.addAttribute("message",result); return
 * "helloworld"; }
 */