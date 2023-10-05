package com.oasi.genericprogramming.repository;

import com.oasi.genericprogramming.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @project genericProgramming
 * @autor Oscar Alfredo Chafloque Tampeck
 * @date 28/09/2023
 **/
@Repository
public interface UserRepository extends JpaRepository<Usuario, Long> {
}
