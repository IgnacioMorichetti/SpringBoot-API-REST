package com.ignaciomorichettiramal.repositories;


import java.io.Serializable;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;

import com.ignaciomorichettiramal.entities.Base;

@NoRepositoryBean
public interface BaseRepository<E extends Base, Id extends Serializable> extends JpaRepository<E, Id> {

    @Override
    Page<E> findAll(Pageable pageable);
}

