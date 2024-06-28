package com.ramjava.ultimate.jpa.ruhezustand.models;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@Entity
@Table(name = "BAND_TBL")
public class Band {
    @Id
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "band_sequence"
    )
//    @SequenceGenerator(
//            name = "band_sequence",
//            sequenceName = "band_sequence",
//            allocationSize = 1
//    )
    @TableGenerator(
            name = "band_id_gen",
            table = "id_generator",
            pkColumnName = "id_name",
            valueColumnName = "id_value",
            allocationSize = 1
    )
    private Integer id;
    @Column(
            name = "f_band",
            length = 35
    )
    private String firstBand;
    @Column(
            name = "l_band",
            length = 35
    )
    private String lastBand;
    @Column(
            unique = true,
            nullable = false
    )
    private String email;
    private int age;
    @Column(
            updatable = false,
            nullable = false
    )
    private LocalDateTime createdAt;
    @Column(
            insertable = false
    )
    private LocalDateTime lastModified;

}
