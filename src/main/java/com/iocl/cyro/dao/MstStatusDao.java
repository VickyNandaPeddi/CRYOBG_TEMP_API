package com.iocl.cyro.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.iocl.cyro.model.MstStatus;
@Repository
public interface MstStatusDao  extends JpaRepository<MstStatus, Integer>{

}
