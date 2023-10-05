package com.oasi.genericprogramming.service.impl;

import com.oasi.genericprogramming.dto.PerfilRequestDto;
import com.oasi.genericprogramming.dto.PerfilResponseDto;
import com.oasi.genericprogramming.model.Perfil;
import com.oasi.genericprogramming.repository.PerfilRepository;
import com.oasi.genericprogramming.service.GenericService;
import com.oasi.genericprogramming.service.PerfilService;
import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

/**
 * @project genericProgramming
 * @autor Oscar Alfredo Chafloque Tampeck
 * @date 28/09/2023
 **/
@Service
@AllArgsConstructor
public class PerfilServiceImpl implements PerfilService {

    private final PerfilRepository perfilRepository;

    @Override
    public PerfilResponseDto findById(Long uuid) {
        return entityToDto(perfilRepository.findById(uuid).get());
    }

    @Override
    public List<PerfilResponseDto> getAll() {
        return perfilRepository.findAll().stream().map(this::entityToDto).collect(Collectors.toList());
    }

    @Override
    @Transactional
    public PerfilResponseDto save(PerfilRequestDto requestDto) {
        return entityToDto(perfilRepository.save(dtoToEntity(requestDto)));
    }

    private PerfilResponseDto entityToDto(Perfil perfil) {
        return PerfilResponseDto.builder().descripcion(perfil.getDescripcion()).build();
    }

    private Perfil dtoToEntity(PerfilRequestDto t){
        return Perfil.builder()
                .idPerfil(t.getIdPerfil() != null ? t.getIdPerfil() : 0)
                .descripcion(t.getDescripcion())
                .build();
    }
}
