package com.mi_proyecto.backlog.auth.entity;

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
public class UserRolId implements Serializable {

    @NotNull(message = "El id de usuario es obligatorio")
    @Column(name = "id_usuario", nullable = false)
    private Long idUsuario;

    @NotNull(message = "El id de rol es obligatorio")
    @Column(name = "id_rol", nullable = false)
    private Long idRol;

    @NotNull(message = "El id de proyecto es obligatorio")
    @Column(name = "id_proyecto", nullable = false)
    private Long idProyecto;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UserRolId that = (UserRolId) o;
        return Objects.equals(idUsuario, that.idUsuario)
                && Objects.equals(idRol, that.idRol)
                && Objects.equals(idProyecto, that.idProyecto);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idUsuario, idRol, idProyecto);
    }
}