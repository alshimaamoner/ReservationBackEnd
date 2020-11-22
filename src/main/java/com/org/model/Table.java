package com.org.model;

import com.fasterxml.jackson.annotation.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@javax.persistence.Table(name = "tables")
public class Table {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private int numberOfPersons;

    @JsonIgnore
    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(
            name = "tables_reservation",
            joinColumns = {
                    @JoinColumn(name = "table_id")
            },
            inverseJoinColumns = {
                    @JoinColumn(name = "reservation_id")
            }
    )
    private Set<Reservation> reservations = new HashSet<>();
}
