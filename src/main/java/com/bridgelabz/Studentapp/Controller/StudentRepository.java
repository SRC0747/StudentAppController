package com.bridgelabz.Studentapp.Controller;

import org.springframework.stereotype.Repository;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface StudentRepository extends JpaRepository<StudentEntity, Integer> {
    Optional<StudentEntity> findByFirstName(String firstName);

    Optional<StudentEntity> findByRollNo(int roll);

    Optional<StudentEntity> findByLastName(String name);
}
