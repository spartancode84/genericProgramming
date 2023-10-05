package com.oasi.genericprogramming.controller;

import com.oasi.genericprogramming.dto.PerfilResponseDto;
import com.oasi.genericprogramming.service.PerfilService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @project genericProgramming
 * @autor Oscar Alfredo Chafloque Tampeck
 * @date 28/09/2023
 **/
@RestController
@RequestMapping("v1/perfil")
@AllArgsConstructor
public class PerfilController {

    private final PerfilService perfilService;

    @GetMapping("/findById/{uuid}")
    PerfilResponseDto findById(@PathVariable Long uuid) {
        return perfilService.findById(uuid);
    }
}
