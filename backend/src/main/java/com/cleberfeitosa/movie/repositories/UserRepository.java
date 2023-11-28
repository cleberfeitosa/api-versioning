package com.cleberfeitosa.movie.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cleberfeitosa.movie.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

	User findByEmail(String email);
}
