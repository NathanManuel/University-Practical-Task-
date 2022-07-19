import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner myObj = new Scanner(System.in);
		//create university
		University Emanuel = new University("Emanule", "Oradea");
		
		//create faculties
		Faculty management = new Faculty("Management");
		Faculty art = new Faculty("Art");
		//add speciality to faculty
		management.addSpeciality("Management");
		management.addSpeciality("IT");

		//add speciality to faculty
		art.addSpeciality("Paper Art");
		art.addSpeciality("3D Art");
		art.addSpeciality("2D Art");


		//add faculty to university
		Emanuel.addFaculty(art);
		Emanuel.addFaculty(management);
		
		//remove faculty from university
//		Emanuel.removeFaculty(management);


		
		//create university group 
		UniversityGroup groupA = new UniversityGroup("Group A");
		UniversityGroup groupB = new UniversityGroup("Group B");
		UniversityGroup groupC = new UniversityGroup("Group C");
		UniversityGroup groupD = new UniversityGroup("Group D");
		UniversityGroup groupE = new UniversityGroup("Group E");
		
		//add group to university, selecting faculty and speciality
		Emanuel.addGroup(groupA, art, "2D Art");
		Emanuel.addGroup(groupB, management, "IT");
		Emanuel.addGroup(groupC, management, "Management");
		Emanuel.addGroup(groupD, art, "3D Art");
		Emanuel.addGroup(groupE, art, "Paper Art");
		
		//create students
		Student s1 = new Student("Nathan","Van Velden", 3535622);
		Student s2 = new Student("David","Van Velden", 23521321);
		Student s3 = new Student("Alex","Something", 43129674);
		Student s4 = new Student("Mirinda","Else", 52422313);
		
		//add students to university
		Emanuel.addStudent(s1);
		Emanuel.addStudent(s2);
		Emanuel.addStudent(s3);
		Emanuel.addStudent(s4);
		
		//add student to group
		groupA.addStudent(s1);
		groupA.addStudent(s2);
		groupB.addStudent(s3);
		groupE.addStudent(s4);
		groupC.addStudent(s2);
		groupC.addStudent(s2);

		
		//show information about university
		System.out.println(Emanuel.toString());
		
		System.out.println("--------------------------");
		
		//show information about speciality
		Emanuel.detailedInfo();
		
		System.out.println("--------------------------");

		//show all specialities of a faculty
		 String input = myObj.nextLine();
		System.out.println(art.toString());
		
		System.out.println("--------------------------");

		//show all groups of a faculty
		Emanuel.getGroupList(art);
		
		System.out.println("--------------------------");
		
		//show students part of the group
		System.out.println("Selected group participants (" + groupA.groupName + "):" );
		groupA.groupParticipants();
		
	
	}

}
