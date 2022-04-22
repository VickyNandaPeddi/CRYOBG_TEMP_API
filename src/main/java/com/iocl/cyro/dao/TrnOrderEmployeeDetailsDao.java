package com.iocl.cyro.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.iocl.cyro.model.TrnOrderEmployeeDetails;
@Repository
public interface TrnOrderEmployeeDetailsDao extends JpaRepository<TrnOrderEmployeeDetails, Integer>{

}
