package com.salakommerceb.common.dto;


import lombok.Data;


/**
 * The type User connect dto.
 */
@Data
public final class UserConnectDTO implements DataTransfertObject {

    // ======================================
    // =             Attributes             =
    // ======================================
    private String email;
    private String password;

    /**
     * Instantiates a new User connect dto.
     */
// ======================================
    // =            Constructors            =
    // ======================================
    public UserConnectDTO() {
    }


}
