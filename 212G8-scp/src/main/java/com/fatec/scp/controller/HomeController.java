package com.fatec.scp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
	@GetMapping("/")
	public ModelAndView menu() {
		return new ModelAndView("paginaMenu");

	}

	@GetMapping("/clientes")
	public ModelAndView cadastrarCliente() {
		return new ModelAndView("cadastrarCliente");

	}

	@GetMapping("/fornecedores")
	public ModelAndView cadastrarFornecedor() {
		return new ModelAndView("cadastrarFornecedor");

	}

	@GetMapping("/filmes")
	public ModelAndView cadastrarFilems() {
		return new ModelAndView("cadastrarFilmes");

	}

	@GetMapping("/ingressos")
	public ModelAndView cadastrarIngresso() {
		return new ModelAndView("cadastrarIngresso");
	}

	@GetMapping("/animacoes")
	public ModelAndView cadastrarAnimacao() {
		return new ModelAndView("cadastrarAnimacao");
	}

	@GetMapping("/vendas")
	public ModelAndView cadastrarVendas() {
		return new ModelAndView("cadastrarVendas");
	}

	@GetMapping("/login")
	public ModelAndView paginaLogin() {
		return new ModelAndView("paginaLogin");
	}
}
