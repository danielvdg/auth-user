package com.auth.authuser.model.core.enumTypes;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum RoleEnum {
    ADMIN(1, "Administrador", "Usuário com privilégios administrativos"),
    USER(2, "Usuário", "Usuário regular do sistema"),
    GUEST(3, "Convidado", "Usuário com acesso limitado");

    private final int numero;
    private final String tipo;
    private final String descricao;

}
