package com.example.test.entity;


import lombok.Data;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.Date;

@Entity
@Data
//@MappedSuperclass
//@EntityListeners(AuditingEntityListener.class)
public class Board {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY )
    private Integer id;
    private String title;
    private String content;
    private String filename;
    private String filepath;
    private String name;
    private LocalDateTime board_date;
    private Integer hit;
//    private Date create_date;
//    private Date update_date;

}
