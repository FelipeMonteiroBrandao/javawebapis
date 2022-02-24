package com.example.imc.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.imc.models.Imc;

public interface ImcRepository extends JpaRepository<Imc, Long> {

}
