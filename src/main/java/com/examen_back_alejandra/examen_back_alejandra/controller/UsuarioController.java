package com.examen_back_alejandra.examen_back_alejandra.controller;

import com.examen_back_alejandra.examen_back_alejandra.domain.usuarios.*;
import jakarta.transaction.Transactional;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;

@RestController
@RequestMapping("/usuarios")
public class UsuarioController {

    @Autowired
    UsuarioRepository usuarioRepository;
    @PostMapping
    @Transactional
    public ResponseEntity registrar(@RequestBody @Valid DatosUsuario datos, UriComponentsBuilder uriComponentsBuilder) {
        var user = new Usuario(datos);
        usuarioRepository.save(user);

        var uri = uriComponentsBuilder.path("/usuario/{id}").buildAndExpand(user.getId()).toUri();
        return ResponseEntity.created(uri).body(new RespuestaInfoUsuario(user));
    }

    @GetMapping
    public ResponseEntity<Page<DatosListaUsuario>> listarActivos(@PageableDefault(page = 0, size = 10) Pageable paginacion) {
        var page = usuarioRepository.findAll(paginacion).map(DatosListaUsuario::new);
        return  ResponseEntity.ok(page);
    }





}
