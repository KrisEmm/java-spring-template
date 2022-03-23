package com.krisemm.shared;

import org.springframework.stereotype.Service;

@Service
public class SharedService {
    private String message;

    public SharedService() {
        this.message = "Hi, I'm the Shared Service";
    }

    public String getMessage() {
        return message;
    }
}
