package com.marcelocalegare.meu_primeiro_springboot.repository;

import com.marcelocalegare.meu_primeiro_springboot.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface userRepository extends JpaRepository<User, Long> {
}
