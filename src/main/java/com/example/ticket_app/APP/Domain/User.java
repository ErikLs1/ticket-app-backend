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
public class User extends BaseEntity {

    @Column(name = "sys_data_id", nullable = false)
    private Long sysDataId;

    @Column(name = "email", nullable = false, unique = true )
    private String email;

    @Column(name = "normalized_email", nullable = false, unique = true )
    private String normalizedEmail;

    @Column(name = "password_hash", length = 350, nullable = false, unique = true )
    private String passwordHash;

    @OneToOne
    @JoinColumn(name = "person_id", nullable = false,
            foreignKey = @ForeignKey(name = "person_id"))
    private Person person;
}
