package com.mi_proyecto.backlog.node.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.*;
import lombok.experimental.SuperBuilder;

@Entity
@Table(name = "repositorios")
@Getter
@Setter
@NoArgsConstructor
@SuperBuilder
public class Repositorio extends Node {
}