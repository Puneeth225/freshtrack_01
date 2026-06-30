package com.freshtrack.warehouse.repository;

import com.freshtrack.warehouse.entity.AuditLog;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuditRepository extends JpaRepository<AuditLog, Long> {
}
