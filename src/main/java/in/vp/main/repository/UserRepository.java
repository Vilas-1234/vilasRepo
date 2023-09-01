package in.vp.main.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import in.vp.main.entity.User;

public interface UserRepository extends JpaRepository<User, Integer>{

}
