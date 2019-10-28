package com.mkyong.config;

import org.springframework.data.domain.AuditorAware;

import java.util.Optional;

import static java.util.Optional.*;

class AuditorAwareImpl implements AuditorAware<String> {

    @Override
    public Optional<String> getCurrentAuditor() {

        // Can use Spring Security to return currently logged in user
        // return ((User) SecurityContextHolder.getContext().getAuthentication().getPrincipal()).getUsername()
        Optional<String> albumOptional = of("lgaray");
        return albumOptional;
    }
}