package com.bridgelabz.Studentapp.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentController {
    // CRUD
    //read
    //creating
    //updating
    //deleting

    @Autowired
    private StudentService studentService;

    @GetMapping(value = "/students")
    public List<StudentEntity> students() {
        return studentService.students();
    }

    @GetMapping(value = "/get-student-by-id")
    public StudentEntity getStudentById(@RequestParam int id) {
        return studentService.getStudentById(id);
    }

    @GetMapping(value = "/get-student-by-roll")
    public StudentEntity getStudentByRoll(@RequestParam int roll) {
        return studentService.getStudentByRoll(roll);
    }

    @GetMapping(value = "/get-student-by-Firstname")
    public StudentEntity getStudentByFirstName(@RequestParam String name) {
        return studentService.getStudentByFirstName(name);
    }

    @GetMapping(value = "/get-student-by-Lastname")
    public StudentEntity getStudentByLastName(@RequestParam String name) {
        return studentService.getStudentByLastName(name);
    }

    @PostMapping(value = "/student")
    public StudentEntity addStudent(@RequestBody StudentEntity studentEntity) {
        return studentService.addStudent(studentEntity);
    }

    @PutMapping(value = "/student")
    public StudentEntity updateStudent(@RequestBody StudentEntity studentEntity) {
        return studentService.updateStudent(studentEntity);
    }

    @DeleteMapping(value = "/student")
    public String deleteStudent(@RequestParam int id) {
        return studentService.deleteStudent(id);
    }
}
