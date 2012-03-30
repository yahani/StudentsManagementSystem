/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package studentmanagementsystem;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class SimpleStudentRepository implements StudentRepository {

	private Map<Long, Student> studentsDb = new HashMap<Long, Student>();

	@Override
	public void saveStudent(Student stu) {
	 studentsDb.put(stu.getRegNumber(), stu);

	}

	@Override
	public void deleteStudent(Student stu) {
		studentsDb.remove(stu.getRegNumber());

	}

	@Override
	public Student findStudent(long regNumber) {
		return studentsDb.get(regNumber);
		
	}

	@Override
	public void updateStudent(Student stu) {
		saveStudent(stu);

	}

	@Override
	public List<Student> findAllStudents() {

            List<Student> students=new LinkedList<Student>();
            Iterator entries=studentsDb.entrySet().iterator();
            while(entries.hasNext()){
                students.add((Student) entries.next());

            }
            return students;
		
	}

}
