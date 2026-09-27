package com.mi_proyecto.backlog.project.repository;

import com.mi_proyecto.backlog.project.entity.ProyectoUsuario;
import com.mi_proyecto.backlog.project.entity.ProyectoUsuarioId;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProyectoUsuarioRepository extends JpaRepository<ProyectoUsuario, ProyectoUsuarioId> {

    List<ProyectoUsuario> findByProyecto_IdProyecto(Long idProyecto);

    List<ProyectoUsuario> findByUsuario_Id(Long idUsuario);

    boolean existsByProyecto_IdProyectoAndUsuario_Id(Long idProyecto, Long idUsuario);
}