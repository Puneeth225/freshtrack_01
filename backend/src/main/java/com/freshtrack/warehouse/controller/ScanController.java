package com.freshtrack.warehouse.controller;

import com.freshtrack.warehouse.dto.ScanRequestDto;
import com.freshtrack.warehouse.service.ScanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/hub")
@CrossOrigin("*")
public class ScanController {

    @Autowired
    private ScanService scanService;

    @PostMapping("/scan")
    public String scan(@RequestBody ScanRequestDto request) {
        return scanService.scan(
                request.getInvoiceId(),
                request.getSku(),
                request.getUserId()
        );
    }
}
