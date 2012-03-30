/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package studentmanagementsystem;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

public class SmsStarter {

	public static void main(String[] args) {
		 XmlBeanFactory beanFactory = new XmlBeanFactory(new ClassPathResource(
"spring.xml"));
        Student st1 = (Student)beanFactory.getBean("stdnt1");
        Student st2 = (Student)beanFactory.getBean("stdnt2");
        Student st3 = (Student)beanFactory.getBean("stdnt3");
        Student st4 = (Student)beanFactory.getBean("stdnt4");

        StudentManagementSystem sms = (StudentManagementSystem)beanFactory.getBean("spring");
        sms.listAllStudents();
        sms.registerStudent(st1);
        sms.registerStudent(st2);
        sms.registerStudent(st3);
        sms.registerStudent(st4);
        sms.listAllStudents();

	}
}
