package com.mi_proyecto.backlog.node.repository;

import com.mi_proyecto.backlog.node.entity.HistoriaUsuario;
import com.mi_proyecto.backlog.node.model.HuStatus;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface HistoriaUsuarioRepository extends JpaRepository<HistoriaUsuario, Long> {

    List<HistoriaUsuario> findByEstadoHU(HuStatus estadoHU);
}