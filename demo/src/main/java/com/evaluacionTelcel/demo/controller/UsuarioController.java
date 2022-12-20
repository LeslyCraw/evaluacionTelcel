package com.evaluacionTelcel.demo.controller;

import com.evaluacionTelcel.demo.entity.Usuario;
import com.evaluacionTelcel.demo.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import java.util.ArrayList;
import java.util.List;

@Controller
public class UsuarioController {

    @Autowired
    private UsuarioService usuarioService;


    @GetMapping("/listarUsuarios")
    public String listarusuario(Model model) {
        List<Usuario> usuarios = new ArrayList<>();
       usuarios = usuarioService.listarUsuarios();
       model.addAttribute("usuarios",usuarios);
        return "listaUsuarios";
    }
    @PostMapping("/crearusuario")
    public String crearUsuario(@Valid @ModelAttribute Usuario usuario, BindingResult result,
                           Model model) throws InterruptedException {
        usuarioService.guardarUsuario(usuario);
        System.out.println("Usuario guardado con exito!");
        attribute.addFlashAttribute("success", "Usuario guardado con exito!");
        return "redirect:listarUsuarios";
    }
}

