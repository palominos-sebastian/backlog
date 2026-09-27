package com.mi_proyecto.backlog.node.entity;

import com.mi_proyecto.backlog.node.model.HuStatus;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.*;
import lombok.experimental.SuperBuilder;

@Entity
@Table(name = "historias_usuario")
@Getter
@Setter
@NoArgsConstructor
@SuperBuilder
public class HistoriaUsuario extends Node {

    @Column(columnDefinition = "TEXT")
    private String reglasNegocio;

    @Column(columnDefinition = "TEXT")
    private String criteriosAceptacion;

    @NotNull(message = "El estado de la historia de usuario es obligatorio")
    @Enumerated(EnumType.STRING)
    @Column(nullable = false, length = 20)
    private HuStatus estadoHU;
}