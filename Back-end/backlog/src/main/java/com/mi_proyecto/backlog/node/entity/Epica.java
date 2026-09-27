package com.mi_proyecto.backlog.node.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.*;
import lombok.experimental.SuperBuilder;

@Entity
@Table(name = "epicas")
@Getter
@Setter
@NoArgsConstructor
@SuperBuilder
public class Epica extends Node {

    @Column(columnDefinition = "TEXT")
    private String descripcion;
}