package com.examen_back_alejandra.examen_back_alejandra.domain.usuarios;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
    Page<Usuario> findAll(Pageable paginacion);
}
