package com.example.baseservice.repository;

import com.example.baseservice.model.Email;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.Instant;
import java.util.List;

@Repository
public interface EmailRepository extends JpaRepository<Email, Long> {

    List<Email> findEmailByReceivedGreaterThanEqual(Instant received);

}
