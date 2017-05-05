package ua.a5.remindme.server.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ua.a5.remindme.server.entity.Remind;


public interface RemindRepository extends JpaRepository<Remind, Long>{
}

