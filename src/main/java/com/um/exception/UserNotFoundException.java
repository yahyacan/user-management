package com.um.exception;

import java.util.function.Supplier;

public class UserNotFoundException extends RuntimeException implements Supplier<UserNotFoundException> {

    private static final long serialVersionUID = 4085107021669430892L;

    @Override
    public UserNotFoundException get() {
        return new UserNotFoundException();
    }
}