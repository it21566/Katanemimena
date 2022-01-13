package gr.hua.dit.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import gr.hua.dit.dao.VegetDAO;
import gr.hua.dit.entity.*;

@Controller
@RequestMapping("/animal")
public class VegetController {
	@Autowired
	private VegetDAO VegetDAO;

	@RequestMapping("/checkForm")
	public String checkForm(HttpServletRequest request, Model model) {

		

		

		Animal animal = new Animal();
		animal.setAnimal(Integer.parseInt(request.getParameter("animal_id")));

		

		return "done";
	}

}
