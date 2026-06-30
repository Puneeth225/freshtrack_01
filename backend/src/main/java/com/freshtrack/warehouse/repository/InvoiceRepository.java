package com.freshtrack.warehouse.repository;

import com.freshtrack.warehouse.entity.Invoice;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InvoiceRepository extends JpaRepository<Invoice, Long> {
}
