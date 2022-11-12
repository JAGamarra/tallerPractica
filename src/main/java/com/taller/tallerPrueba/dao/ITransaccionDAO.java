package com.taller.tallerPrueba.dao;

import com.taller.tallerPrueba.models.TransaccionModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ITransaccionDAO extends JpaRepository<TransaccionModel, Integer> {}
