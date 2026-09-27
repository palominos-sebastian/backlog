package com.mi_proyecto.backlog.project.entity;

import com.mi_proyecto.backlog.auth.entity.User;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "proyecto_usuarios")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ProyectoUsuario {

    @EmbeddedId
    private ProyectoUsuarioId id;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @MapsId("idProyecto")
    @JoinColumn(name = "id_proyecto", nullable = false)
    private Proyecto proyecto;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @MapsId("idUsuario")
    @JoinColumn(name = "id_usuario", nullable = false, updatable = false)
    private User usuario;
}