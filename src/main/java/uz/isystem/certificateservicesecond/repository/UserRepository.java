package uz.isystem.certificateservicesecond.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import uz.isystem.certificateservicesecond.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer>{
}
