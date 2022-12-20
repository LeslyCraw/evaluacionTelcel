package com.evaluacionTelcel.demo.service;

import com.evaluacionTelcel.demo.entity.Usuario;

import java.util.List;

public interface UsuarioService {

    public List<Usuario> listarUsuarios();
    public void guardarUsuario(Usuario usuario);




}
