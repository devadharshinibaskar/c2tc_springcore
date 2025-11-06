
package com.tnsif.springprojectscollege;

public class Student {
    private int id;

    private String name;
    private String gender;

    private double totalMarks;

    private boolean check;
    public boolean isCheck() {
		return check;
	}

	public void setCheck(boolean check) {
		this.check = check;
	}

	
    private Department department;

    
    public int getId() {
        return id;
    }

    
    public void setId(int id) {
        this.id = id;
    }

    
    public String getName() {
        return name;
    }

    
    public void setName(String name) {
        this.name = name;
    }
    public String getGender() {
        return gender;
    }

    
    public void setGender(String gender) {
        this.gender = gender;
    }


   
    public double getTotalMarks() {
        return totalMarks;
    }

    
    public void setTotalMarks(double totalMarks) {
        this.totalMarks = totalMarks;
    }

    
    public Department getDepartment() {
        return department;
    }

   
    public void setDepartment(Department department) {
        this.department = department;
    }

	@Override
	public String toString() {
		return "Student[id=" + id + ", name=" + name + ", gender=" + gender+ ",totalMarks=+" + totalMarks+", check=" + check + ", department="
				+ department + "]";
	}

   
}
