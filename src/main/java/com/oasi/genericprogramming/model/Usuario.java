package com.oasi.genericprogramming.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @project genericProgramming
 * @autor Oscar Alfredo Chafloque Tampeck
 * @date 28/09/2023
 **/
@Entity
@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Usuario {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long idUser;
    private String apellidos;
    private String nombres;
    @Column(unique = true)
    private String email;
}
