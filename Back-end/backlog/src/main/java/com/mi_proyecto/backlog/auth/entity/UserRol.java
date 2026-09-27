package com.mi_proyecto.backlog.auth.entity;

import com.mi_proyecto.backlog.project.entity.Proyecto;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "usuarios_roles")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class UserRol {

    @EmbeddedId
    private UserRolId id;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @MapsId("idUsuario")
    @JoinColumn(name = "id_usuario", nullable = false, updatable = false)
    private User usuario;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @MapsId("idRol")
    @JoinColumn(name = "id_rol", nullable = false, updatable = false)
    private Rol rol;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @MapsId("idProyecto")
    @JoinColumn(name = "id_proyecto", nullable = false, updatable = false)
    private Proyecto proyecto;
}