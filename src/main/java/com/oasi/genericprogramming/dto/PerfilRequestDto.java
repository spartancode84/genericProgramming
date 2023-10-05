package com.oasi.genericprogramming.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @project genericProgramming
 * @autor Oscar Alfredo Chafloque Tampeck
 * @date 28/09/2023
 **/
@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class PerfilRequestDto {
    private Long idPerfil;
    private String descripcion;
}
