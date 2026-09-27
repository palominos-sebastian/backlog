package com.mi_proyecto.backlog.auth.repository;

import com.mi_proyecto.backlog.auth.entity.UserRol;
import com.mi_proyecto.backlog.auth.entity.UserRolId;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserRolRepository extends JpaRepository<UserRol, UserRolId> {

    List<UserRol> findByUsuario_Id(Long idUsuario);

    List<UserRol> findByRol_IdRol(Long idRol);

    List<UserRol> findByProyecto_IdProyecto(Long idProyecto);

    boolean existsByUsuario_IdAndRol_IdRolAndProyecto_IdProyecto(Long idUsuario, Long idRol, Long idProyecto);
}