package com.company.api.usuarios;

import jakarta.validation.constraints.NotNull;

public record CheckDTO(Long id, String login, String senha) {

}
