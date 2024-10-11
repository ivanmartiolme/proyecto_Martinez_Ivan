package com.example.tarea1_martinez_ivan.repository;


import com.example.tarea1_martinez_ivan.entity.Encuesta;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EncuestaRepository extends JpaRepository<Encuesta,Long> {
}
