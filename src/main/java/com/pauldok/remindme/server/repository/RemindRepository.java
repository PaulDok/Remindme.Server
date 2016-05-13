package com.pauldok.remindme.server.repository;

import com.pauldok.remindme.server.entity.Remind;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RemindRepository extends JpaRepository<Remind, Long>{
}
