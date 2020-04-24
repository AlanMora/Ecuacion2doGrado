package com.practica2.web.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.practica2.web.models.dao.ICalcularPojo;
import com.practica2.web.models.entity.Pojo;

@Controller
public class PojoController {
	@Autowired
	ICalcularPojo pojoCalcular;
	@GetMapping("/index")	
	public String datos(Model model) {
		model.addAttribute("datos", new Pojo());
		return "datos";
	}
	@PostMapping("/index")
	public String total(@ModelAttribute Pojo pojo, Model model) {
		model.addAttribute("total", pojoCalcular.CalcularPojo(pojo.getA(), pojo.getB(), pojo.getC()));
		model.addAttribute("total2", pojoCalcular.CalcularPojo2(pojo.getA(), pojo.getB(), pojo.getC()));
		return "resultado";
	}
}
