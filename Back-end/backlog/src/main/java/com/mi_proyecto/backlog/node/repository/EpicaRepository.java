package com.mi_proyecto.backlog.node.repository;

import com.mi_proyecto.backlog.node.entity.Epica;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EpicaRepository extends JpaRepository<Epica, Long> {
}