package com.salakommerceb.common.dto;


import lombok.Data;


/**
 * The type User dto.
 */
@Data
public final class UserDTO implements DataTransfertObject {

    // ======================================
    // =             Attributes             =
    // ======================================
    private String password;
    private String email;
    private String street1;
    private String street2;
    private String city;
    private String state;
    private String zipcode;


    /**
     * Instantiates a new User dto.
     */
// ======================================
    // =            Constructors            =
    // ======================================
    public UserDTO() {
    }


}
