/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package studentmanagementsystem;

public class StudentManagementSystem {

	private StudentRepository repo;

	public void listAllStudents() {
            repo.findAllStudents();
	}

	public void registerStudent(Student stu){
		repo.saveStudent(stu);
	}
}
