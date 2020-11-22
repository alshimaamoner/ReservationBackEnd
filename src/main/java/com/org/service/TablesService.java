package com.org.service;

import com.org.model.Table;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface TablesService {
    List<Table> getAllTables();

    Table addTable(Table table);
}
