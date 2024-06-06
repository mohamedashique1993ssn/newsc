package com.sc.service;

import org.springframework.stereotype.Service;

import com.sc.domain.Ransom;
import com.sc.repository.RansomRepository;

import java.util.List;

@Service
public class RansomService {

    private final RansomRepository ransomRepository;

    public RansomService(RansomRepository ransomRepository) {
        this.ransomRepository = ransomRepository;
    }

    public Iterable<Ransom> list() {
        return ransomRepository.findAll();
    }

    public Ransom save(Ransom ransom) {
        return ransomRepository.save(ransom);
    }

    public void save(List<Ransom> ransom) {
    	ransomRepository.saveAll(ransom);
    }
}
