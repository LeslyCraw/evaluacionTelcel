package com.evaluacionTelcel.demo.service;

import com.evaluacionTelcel.demo.entity.Usuario;
import com.evaluacionTelcel.demo.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class UsuarioServiceImplements implements UsuarioService {

    @Autowired
    private UsuarioRepository usuarioRepository;


    @Override
    public List<Usuario> listarUsuarios() {
        return (List<Usuario>) usuarioRepository.findAll();
    }

    @Override
    public void guardarUsuario(Usuario usuario) {
        usuarioRepository.save(usuario);

    }
}
