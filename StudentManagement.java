import java.util.*;

class Student{
	String name;
	int age;
	String gender;
	String address;
	public void addStudent(String name, int age, String gender, String address){
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.address = address;
	}
}

class Dept{
	String name;
	String hod;
	public void addDept(String dpname, String hod){
		name = dpname;
		this.hod = hod;
	}
}

class StudentManagement{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		List<Student> student = new ArrayList<>();
		List<Dept> dept = new ArrayList<>();
		int choice;
		do{
			System.out.println("1.Add Student\n2.List Student\n3.Add Department\n4.List Department\n5.Remove Student\n6.Remove Department\n7.Exit\nEnter your choice:");
			choice = sc.nextInt();
			switch(choice){
				case 1:
					System.out.println("\n---Add Student selected---");
					sc.nextLine();
					System.out.println("Enter name:");
					String name = sc.nextLine();
					System.out.println("Enter age:");
					int age = sc.nextInt();
					sc.nextLine();
					System.out.println("Enter gender:");
					String gender = sc.nextLine();
					System.out.println("Enter address:");
					String address = sc.nextLine();
					Student st = new Student();
					st.addStudent(name,age,gender,address);
					student.add(st);
					System.out.println("---Student added successfully---\n");
					break;
				
				case 2:
					System.out.println("\n---List Student selected---");
					for(Student s: student){
						System.out.println("Name: "+s.name+" | Age: "+s.age+" | Gender: "+s.gender+" | Address: "+s.address+" |\n");
					}
					break;

				case 3:
					System.out.println("\n---Add Department selected---");
					sc.nextLine();
					System.out.println("Enter name:");
					String dpname = sc.nextLine();
					System.out.println("Enter hod:");
					String hod = sc.nextLine();
					Dept dp = new Dept();
					dp.addDept(dpname,hod);
					dept.add(dp);
					System.out.println("---Department added successfully---\n");
					break;

				case 4:
					System.out.println("\n---List Department selected---");
					for(Dept d: dept){
						System.out.println("Name: "+d.name+" | HOD: "+d.hod+" |\n");
					}
					break;

				case 5:
					System.out.println("\n---Remove Student selected---");
					student.remove(student.size()-1);
					System.out.println("---Removed Last Updated Student successfully---\n");
					break;

				case 6:
					System.out.println("\n---Remove Department selected---");
					dept.remove(dept.size()-1);
					System.out.println("---Removed Last Updated Department successfully---\n");
					break;

				case 7:
					System.out.println("\nExiting...");
					break;

				default:
					System.out.println("Wrong choice");
					break;
			}		
		}while(choice != 7);
		sc.close();
	}
}