package com.org.service;

import com.org.model.Table;
import com.org.repository.TablesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TablesServiceImpl implements TablesService {

    @Autowired
    private TablesRepository tablesRepository;

    @Override
    public List<Table> getAllTables() {
        return tablesRepository.findAll();
    }

    @Override
    public Table addTable(Table table) {
        return tablesRepository.save(table);
    }
}
