package com.ignaciomorichettiramal.repositories;

import com.ignaciomorichettiramal.entities.Libro;
import org.springframework.stereotype.Repository;

@Repository
public interface LibroRepository extends BaseRepository<Libro, Long> {
}

