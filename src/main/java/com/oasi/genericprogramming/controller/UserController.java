package com.oasi.genericprogramming.controller;

import com.oasi.genericprogramming.dto.UserResponseDto;
import com.oasi.genericprogramming.service.UserService;
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
@RequestMapping("v1/user")
@AllArgsConstructor
public class UserController {

    private final UserService userService;

    @GetMapping("/findById/{uuid}")
    UserResponseDto findById(@PathVariable Long uuid) {
        return userService.findById(uuid);
    }
}
