import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Driver {
	public static void main(String[] args) {
		Model studentModel=null;
		char ch;
		List<Model>   model=new ArrayList<Model>();
		int pressedNumber=0;
		List<Integer> markslist=new ArrayList<Integer>();
		List<String> subjectlist=new ArrayList<String>();
		System.out.println("=====Student Management System=====");
		System.out.println("Enter Number of Student");
		Scanner sc=new Scanner(System.in);
		int numberOfStudent=sc.nextInt();
		for(int i=1;i<=numberOfStudent;i++)
		{
			studentModel=new Model();
			System.out.println("Enter "+i+" Student rollNo");
			studentModel.setId(sc.nextInt());
			System.out.println("Enter "+i+" Student name");
			studentModel.setName(sc.next());
			System.out.println("Enter number of sems for "+i+" Student");
			int sems=sc.nextInt();
			studentModel.setSem(sems); 
			for(int j=1;j<=sems;j++)
			{
				System.out.println("Enter number of subjects of "+j+" sem of "+i+" Student");
				int subjects=sc.nextInt();
				for(int k=1;k<=subjects;k++)
				{
					System.out.println("Enter "+k+" subject name of "+j+" sem of "+i+" Student");
					subjectlist.add(sc.next());
					System.out.println("Enter "+k+" subject marks of "+j+" sem of "+i+" Student");
					markslist.add(sc.nextInt());
				}
			}
			studentModel.setSubjects(subjectlist);
			studentModel.setMarks(markslist);
			model.add(studentModel);
		}
		do
		{
			System.out.println("=====Student Search Management=====");
			System.out.println("press 1 to search student by student roll no  OR press 2 to search student by student name ");
			pressedNumber=sc.nextInt();
			if(pressedNumber==1)
			{
				System.out.println("enter rollNo to search student");
				int localrollno=sc.nextInt();
				getStudentModelByRollno(model,localrollno);
			}
			else if(pressedNumber==2)
			{
				System.out.println("enter name to search student");
				String localname=sc.next();
				getStudentModelByName(model,localname);
			}	
			System.out.println("press Y to continue or N to exit");
			ch=sc.next().charAt(0);
		}while(ch=='Y'||ch=='y');
	}
	public static void getStudentModelByRollno(List<Model> model, int rollno)
	{
		for(Model x:model)
		{
			if(x.getId()==rollno)
			{
				displayModel(model);
				break;
			}
		}
	}
	public static void getStudentModelByName(List<Model> model, String name)
	{
		for(Model x:model)
		{
			if(x.getName().equalsIgnoreCase(name))
			{
				displayModel(model);
				break;
			}
		}
	}
	public static void displayModel(List<Model> model)
	{
		for(Model x:model)
		{
			System.out.println("=======================");
			System.out.println("Student rollno "+x.getId());
			System.out.println("student name "+x.getName());
			for(int i=0;i<x.getSem();i++)
			{
				System.out.println("Semester "+(i+1)+" details");
				System.out.print("Subject  ");
				for(String y:x.getSubjects())
				{
					System.out.print("  "+y);
				}
				System.out.println();
				System.out.print("Marks ");
				for(Integer z:x.getMarks())
				{
					System.out.print("     "+z);
				}
				System.out.println();
			}
			System.out.println("=======================");
		}
	}
}