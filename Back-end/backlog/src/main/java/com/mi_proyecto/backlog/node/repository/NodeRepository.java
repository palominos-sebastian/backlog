package com.mi_proyecto.backlog.node.repository;

import com.mi_proyecto.backlog.node.entity.Node;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NodeRepository extends JpaRepository<Node, Long> {
}