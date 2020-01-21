package edu.bit.board.controller;

import java.util.ArrayList;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import edu.bit.board.service.EmpService;
import edu.bit.board.vo.EmpVO;

@Controller
@RequestMapping("/emp")
public class EmpController {
	
	@Autowired
	private EmpService empServie;
	
	@RequestMapping("/list")
	public String emp(Model model) {
		
		System.out.println("emp");
		
		ArrayList<EmpVO> empList = empServie.selectAllEmpList();
		
		System.out.println(empList.size());
		
		
		return "redirect:/";
	}
	
	//ë¡œê·¸?•„?›ƒ
	@RequestMapping(value="/logout")
	public String login(HttpSession session) {
		
		System.out.println("login ?˜¸ì¶?");
		
		session.invalidate();
		
		return "redirect:/";
	}

}
