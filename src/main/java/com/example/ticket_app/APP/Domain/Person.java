package com.example.ticket_app.APP.Domain;

import com.example.ticket_app.BASE.BaseEntity;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "PERSON")
@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = false)
public class Person extends BaseEntity {

    @Column(name = "sys_data_id", nullable = false)
    private Long sysDataId;

    @Column(name = "first_name", length = 100, nullable = false)
    private String firstName;

    @Column(name = "last_name", length = 100, nullable = false)
    private String lastName;

    @Column(name = "phone_number", length = 20, nullable = false)
    private String phoneNumber;

    @Column(name = "gender", length = 10)
    private String gender;

    @OneToOne(mappedBy = "person")
    private User user;
}
