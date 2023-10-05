package com.oasi.genericprogramming.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
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
public class Perfil {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long idPerfil;
    private String descripcion;
}
