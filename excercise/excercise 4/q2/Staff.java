class Staff {
	private String name, staffID;
	private double salary;
	private int workingDay;
	public void setStaffInfo(String nm, String id, int wDay){
		name=nm;
staffID=id;
workingDay=wDay;
	}
	public void calculateSalary(){
		salary = workingDay * 35.0;
	}
	public double getSalary(){
		return salary;
	}
	public String getName(){
		return name;
	}
	public String getStaffID(){
		return staffID;
	}
}//end class
