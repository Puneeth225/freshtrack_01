package com.freshtrack.warehouse.repository;

import com.freshtrack.warehouse.entity.InvoiceItem;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface InvoiceItemRepository extends JpaRepository<InvoiceItem, Long> {
    Optional<InvoiceItem> findByInvoiceIdAndSku(String invoiceId, String sku);
}
