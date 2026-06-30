package com.freshtrack.warehouse.repository;

import com.freshtrack.warehouse.entity.WareHouse;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WarehouseRepository extends JpaRepository<WareHouse, Long> {
}
