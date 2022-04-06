package com.proyecto_thymeleaf.springboot.webapp.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.proyecto_thymeleaf.springboot.webapp.model.Cliente;


// localhost:8080

@Controller
@RequestMapping(path = "/principal")
public class IndexController {
	
	// localhost:8080/index
	@RequestMapping(method = RequestMethod.GET, value = {"/index", "/"})
	public String index() {
		
		return "index";
	}
	
	@RequestMapping(method = RequestMethod.GET, value = "/cliente")
	public String datosDeCliente(Model model) { // Map, Set, HashMap
		// tiene que se publica para traer datos desde la vista
		model.addAttribute("titulo", "Vista de clientes");
		String ciudad = "Oklahoma";
		Cliente cliente = new Cliente();
		cliente.setId(1);
		cliente.setNombre("Saul");
		cliente.setApellido("Fernandez");
		cliente.setCorreo("saul_fe@mail.com");
		model.addAttribute("datos", "Datos del cliente");
		model.addAttribute("cliente", cliente);
		model.addAttribute("ciudad", ciudad);
		
		return "cliente";
	}
	
	@RequestMapping(method = RequestMethod.GET, value = "/listar")
	public String listraClientes(Model model) {
		
		List<Cliente> clientes = new ArrayList<>();
		clientes.add(new Cliente(2, "Pamela", "Hernandez", "pame@mail.com"));
		clientes.add(new Cliente(3, "Fernando", "Gomez", "fer@mail.com"));
		clientes.add(new Cliente(4, "Lizbeth", "Hernandez", "liz@mail.com"));
		clientes.add(new Cliente(5, "Mauricio", "Perez", "mau@mail.com"));
		
		model.addAttribute("titulo", "Listado de clientes");
		model.addAttribute("clientes", clientes);
		return "listar";
	}
	
	

}
