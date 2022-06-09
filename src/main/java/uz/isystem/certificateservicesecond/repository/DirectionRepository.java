package uz.isystem.certificateservicesecond.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import uz.isystem.certificateservicesecond.model.Direction;

@Repository
public interface DirectionRepository extends JpaRepository<Direction, Integer> {
}
