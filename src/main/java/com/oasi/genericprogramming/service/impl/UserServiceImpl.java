package com.oasi.genericprogramming.service.impl;

import com.oasi.genericprogramming.dto.UserRequestDto;
import com.oasi.genericprogramming.dto.UserResponseDto;
import com.oasi.genericprogramming.model.Usuario;
import com.oasi.genericprogramming.repository.UserRepository;
import com.oasi.genericprogramming.service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

/**
 * @project genericProgramming
 * @autor Oscar Alfredo Chafloque Tampeck
 * @date 28/09/2023
 **/
@Service
@AllArgsConstructor
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    @Override
    public UserResponseDto findById(Long uuid) {
        return entityToDto(userRepository.findById(uuid).get());
    }

    @Override
    public List<UserResponseDto> getAll() {
        return userRepository.findAll().stream().map(this::entityToDto).collect(Collectors.toList());
    }

    @Override
    public UserResponseDto save(UserRequestDto t) {
        return entityToDto(userRepository.save(dtoToEntity(t)));
    }

    private UserResponseDto entityToDto(Usuario usuario){
        return UserResponseDto.builder()
                .apellidos(usuario.getApellidos())
                .nombres(usuario.getNombres())
                .email(usuario.getEmail())
                .build();
    }

    private Usuario dtoToEntity(UserRequestDto requestDto){
        return Usuario.builder()
                .idUser(requestDto.getIdUser() != null ? requestDto.getIdUser() : 0)
                .apellidos(requestDto.getApellidos())
                .nombres(requestDto.getNombres())
                .email(requestDto.getEmail())
                .build();
    }
}
