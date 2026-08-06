package com.davidqtran.infrastructure.persistence.repository;

import com.davidqtran.domain.repository.HiDomainRepository;
import org.springframework.stereotype.Service;

@Service
public class HiInfraRepositoryImpl implements HiDomainRepository {
    @Override
    public String sayHi(String who) {
        return "Hi Infrastructure";
    }
}
