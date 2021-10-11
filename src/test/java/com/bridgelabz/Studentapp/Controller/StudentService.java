package com.bridgelabz.Studentapp.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

/**
 * Class for the business logic for student service
 *
 * @author Sampriti Roy Chowdhury
 * @version 0.0.1
 * @since 11-10-2021
 */

@Service
public class StudentService {
    @Autowired
    private StudentRepository studentRepository;
    @Autowired
    private ModelMapper modelMapper;

    /**
     * Method for getting all the students from database
     * @return list of {@link StudentEntity}
     */
    public List<StudentEntity> students() {
        return studentRepository.findAll();
    }

    /**
     * Method for getting student by its id
     * @param id unique identifier for record
     * @return singular {@link StudentEntity}
     */
    public StudentEntity getStudentById(int id) {
        Optional<StudentEntity> studentEntity = studentRepository.findById(id);
        if(studentEntity.isPresent()) {
            return studentEntity.get();
        }
        return null;
    }
    public StudentEntity getStudentByRoll(int roll) {
        Optional<StudentEntity> studentEntity = studentRepository.findByRollNo(roll);
        if(studentEntity.isPresent()) {
            return studentEntity.get();
        }
        return null;
    }
    public StudentEntity getStudentByFirstName(String name) {
        Optional<StudentEntity> studentEntity = studentRepository.findByFirstName(name);
        if(studentEntity.isPresent()) {
            return studentEntity.get();
        }
        return null;
    }

    public StudentEntity getStudentByLastName(String name) {
        Optional<StudentEntity> studentEntity = studentRepository.findByLastName(name);
        if(studentEntity.isPresent()) {
            return studentEntity.get();
        }
        return null;
    }

    /**
     *
     * @param StudentDTO
     * @return
     */

    public StudentEntity addStudent(StudentEntity studentEntity) {
        return studentRepository.save(studentEntity);
    }
    public String deleteStudent(int id) {
        Optional<StudentEntity> studentEntity = studentRepository.findById(id);
        if (studentEntity.isPresent()) {
            studentRepository.delete(studentEntity.get());
            return "Record deleted successfully";
        }
        return "Record does not exists with this id : " + id;
    }

    public StudentEntity updateStudent(StudentEntity studentEntity) {
        return studentRepository.save(studentEntity);
    }
}
