package com.mi_proyecto.backlog.project.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import jakarta.validation.constraints.NotNull;
import lombok.*;

import java.io.Serializable;
import java.util.Objects;

@Embeddable
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ProyectoUsuarioId implements Serializable {

    @NotNull(message = "El id de proyecto es obligatorio")
    @Column(name = "id_proyecto", nullable = false)
    private Long idProyecto;

    @NotNull(message = "El id de usuario es obligatorio")
    @Column(name = "id_usuario", nullable = false)
    private Long idUsuario;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ProyectoUsuarioId that = (ProyectoUsuarioId) o;
        return Objects.equals(idProyecto, that.idProyecto)
                && Objects.equals(idUsuario, that.idUsuario);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idProyecto, idUsuario);
    }
}