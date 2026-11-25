package Week4;

public class Student {
	private String name;
	private int[] grades;

    public Student(String name,int[] grades) {
    	this.name = name;
    	this.grades = grades;	
    }
    public String getName() {
    	return name;
    }
    public void setName(String name) {
    }
    public int getAverage() {
    	int sum = 0 ;
    	for(int i = 0 ; i < 5; i ++) {
    		sum += grades[i];
    }
    return sum/5;
    }
    public void printStInfo() {
    	System.out.println(name+ " "+getAverage());
    
    }
    }
