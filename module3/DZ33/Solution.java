package module3.DZ33;

/**
 * Created by Свят on 19.02.2017.
 */
public class Solution {


    Course course1 = new Course("goJava", 10, "Pavlo");
    Course course2 = new Course("goJava1", 20, "Angriy");
    Course course3 = new Course("PHP", 40, "Anna");
    Course course4 = new Course(15 / 2 / 17, "Symfony");
    Course course5 = new Course(23 / 2 / 17, "Symfony");
    Course[] coursesTaken ={course1,course2,course3,course4,course5};


    CollegeStudent collegeStudent1 = new CollegeStudent("Fedya", "Lovley", 1, "kpi", 85, 34);
    CollegeStudent collegeStudent2 = new CollegeStudent("dfd",coursesTaken);
    CollegeStudent collegeStudent3 = new CollegeStudent ("fh",coursesTaken);
    SpecialStudent specialStudent1 = new SpecialStudent("Vita", "Filiptchuk", 4, "hpi", 6, 90);
    SpecialStudent specialStudent2 = new SpecialStudent("lena", "kitchenko", 2, "hpi", 4, 86, 568448);
    SpecialStudent specialStudent3 = new SpecialStudent("Petro", coursesTaken);
    Student student1 = new Student("Alina", "Yoga", 5);
    Student student2 = new Student("Albina","fhh",3);
Course special = collegeStudent2.getCoursesTaken()[0];
}
