package com.oasi.genericprogramming.config;

import com.oasi.genericprogramming.model.Perfil;
import com.oasi.genericprogramming.model.Usuario;
import com.oasi.genericprogramming.repository.PerfilRepository;
import com.oasi.genericprogramming.repository.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

/**
 * @project genericProgramming
 * @autor Oscar Alfredo Chafloque Tampeck
 * @date 28/09/2023
 **/
@Component
@AllArgsConstructor
public class Runner implements CommandLineRunner {

    private final PerfilRepository repository;

    private final UserRepository userRepository;
    @Override
    public void run(String... args) throws Exception {
        repository.save(Perfil.builder().idPerfil(1L).descripcion("Admin").build());
        repository.save(Perfil.builder().idPerfil(2L).descripcion("Guess").build());

        userRepository.save(Usuario.builder().idUser(1L).apellidos("Chafloque").nombres("Oscar Alfredo").email("achafloquet@gmail.com").build());
        userRepository.save(Usuario.builder().idUser(2L).apellidos("Chafloque").nombres("Oscar Eduardo").email("echafloquet@gmail.com").build());
    }
}
