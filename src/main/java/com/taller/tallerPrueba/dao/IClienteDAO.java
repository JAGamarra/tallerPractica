package com.taller.tallerPrueba.dao;

import com.taller.tallerPrueba.models.ClienteModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface IClienteDAO extends JpaRepository<ClienteModel, Integer> {

    @Query(value = "SELECT * FROM CLIENTES CL " +
            "WHERE CL.NUMERO_DOCUMENTO = :NUMERO_DOCUMENTO " +
            "INNER JOIN CUENTAS CU ON CL.ID = CU.ID"
            , nativeQuery = true)
    ClienteModel getClienteByCedula(@Param("NUMERO_DOCUMENTO") String documento);

}
