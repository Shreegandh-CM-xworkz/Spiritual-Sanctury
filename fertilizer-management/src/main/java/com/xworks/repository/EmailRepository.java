package com.xworks.repository;

import com.xworks.dto.EmailEntity;

public interface EmailRepository {
    Integer save(EmailEntity email);
}
