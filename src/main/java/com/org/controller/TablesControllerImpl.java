package com.org.controller;

import com.org.model.Table;
import com.org.service.TablesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/resturant/tables")
public class TablesControllerImpl {
    @Autowired
    private TablesService tablesService;

    @GetMapping
    public ResponseEntity<List<Table>> getAllTables() {
        return new ResponseEntity<>(tablesService.getAllTables(), HttpStatus.OK);
    }

    public ResponseEntity<Table> addTable(@RequestBody Table table) {
        return new ResponseEntity<>(tablesService.addTable(table), HttpStatus.CREATED);
    }
}
