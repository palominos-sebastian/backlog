package com.mi_proyecto.backlog.project.repository;

import com.mi_proyecto.backlog.project.entity.Proyecto;
import com.mi_proyecto.backlog.project.model.ProjectStatus;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProyectoRepository extends JpaRepository<Proyecto, Long> {

    List<Proyecto> findByEstado(ProjectStatus estado);

    boolean existsByTitulo(String titulo);
}