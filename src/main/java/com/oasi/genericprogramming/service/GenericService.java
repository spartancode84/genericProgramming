package com.oasi.genericprogramming.service;

import java.util.List;

/**
 * @project genericProgramming
 * @autor Oscar Alfredo Chafloque Tampeck
 * @date 28/09/2023
 **/
public interface GenericService<T, O> {
    T findById(Long uuid);
    List<T> getAll();
    T save(O t);
}
