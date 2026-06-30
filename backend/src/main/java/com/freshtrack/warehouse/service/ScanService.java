package com.freshtrack.warehouse.service;

import com.freshtrack.warehouse.entity.AuditLog;
import com.freshtrack.warehouse.entity.InvoiceItem;
import com.freshtrack.warehouse.repository.AuditRepository;
import com.freshtrack.warehouse.repository.InvoiceItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class ScanService {

    @Autowired
    private InvoiceItemRepository invoiceItemRepository;

    @Autowired
    private AuditRepository auditRepository;

    public String scan(String invoiceId, String sku, Long userId) {
        InvoiceItem item = invoiceItemRepository
                .findByInvoiceIdAndSku(invoiceId, sku)
                .orElseThrow();

        item.setReceivedQuantity(item.getReceivedQuantity() + 1);
        invoiceItemRepository.save(item);

        AuditLog log = new AuditLog();
        log.setInvoiceId(invoiceId);
        log.setSku(sku);
        log.setUserId(userId);
        log.setAction("SCAN");
        log.setTimestamp(LocalDateTime.now());

        auditRepository.save(log);

        return "Scanned Successfully";
    }
}
