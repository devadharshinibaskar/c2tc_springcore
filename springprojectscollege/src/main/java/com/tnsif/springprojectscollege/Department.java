
package com.tnsif.springprojectscollege;

import java.util.List;

public class Department {
    // Name of the department
    private String departmentName; 

    
    private List<Student> studentList;

    // Getter for the departmentName
    public String getDepartmentName() {
        return departmentName;
    }

    // Setter for the departmentName
    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    
    public List<Student> getstudentList() {
        return studentList;
    }

    
    public void setstudentList(List<Student> studentList) {
        this.studentList = studentList;

        
        for (Student student : studentList) {
            student.setDepartment(this);
        }
    }

    
}
