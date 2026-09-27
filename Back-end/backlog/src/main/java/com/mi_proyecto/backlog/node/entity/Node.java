package com.mi_proyecto.backlog.node.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.*;
import lombok.experimental.SuperBuilder;

import java.time.LocalDateTime;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
@DiscriminatorColumn(name = "tipo_node", discriminatorType = DiscriminatorType.STRING, length = 20)
@Getter
@Setter
@NoArgsConstructor
@SuperBuilder
public abstract class Node {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idNode;

    @NotNull
    @Column(nullable = false, updatable = false)
    private LocalDateTime fechaCreacionNode;

    @NotBlank(message = "El titulo es obligatorio")
    @Size(max = 120)
    @Column(nullable = false, length = 120)
    private String titulo;

    @PrePersist
    protected void onCreate() {
        if (fechaCreacionNode == null) {
            fechaCreacionNode = LocalDateTime.now();
        }
    }
}