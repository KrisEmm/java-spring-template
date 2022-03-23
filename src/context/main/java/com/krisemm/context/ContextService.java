package com.krisemm.context;

import org.springframework.stereotype.Service;

@Service
public class ContextService {
    private String message;

    public ContextService() {
        this.message = "Hi, I'm the ContextService";
    }

    public String getMessage() {
        return message;
    }
}
