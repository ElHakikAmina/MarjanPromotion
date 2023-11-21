package com.youcode.Marjan.Repositories;

import com.youcode.Marjan.Models.Entity.GeneralAdmin;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GeneralAdminRepository extends JpaRepository<GeneralAdmin, Long> {

}
