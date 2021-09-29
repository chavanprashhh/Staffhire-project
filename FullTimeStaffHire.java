
public class FullTimeStaffHire extends Staffhire{
    private int salary;                         
    private int workingHour;                    
    private String staffName;
    private String joiningDate;
    private String qualification;               
    private String appointedBy;                 
    private boolean joined;                     
    
 
    FullTimeStaffHire(int vacancyNumber, String designation, String jobType, int salary, int workingHour){
        super(vacancyNumber, designation, jobType);
        this.salary = salary;
        this.workingHour = workingHour;
        staffName = "";
        joiningDate = "";
        qualification = "";        
        appointedBy = "";
        joined = false;
        
    }
     //This is a accessor method for all attributes in the above class
      
    public int getSalary(){
        return this.salary;
    }

    public int getWorkingHour(){
        return this.workingHour;
    }

    public String getStaffName(){
        return this.staffName;
    }

    public String getJoiningDate(){
        return this.joiningDate;
    }

    public String getQualification(){
        return this.qualification;
    }

    public String getAppointedBy(){
        return this.appointedBy;
    }

    public boolean getJoined(){
        return this.joined;
    }

    public void setSalary(int salary){
        if (joined==true){
            System.out.println(" ");            
        }else{
            this.salary = salary;
        }
    }

    public void setWorkingHour(int workingHour){
        this.workingHour = workingHour;
    }

    public void hireFullTime(String staffName, String joiningDate, String qualification, String appointedBy){
        if (joined==true){
            //This will be printed if the staff has joined.
            System.out.println(this.staffName+" has already joined");
            System.out.println("Staff's full name: "+this.staffName);
            System.out.println("The staff joined on: "+this.joiningDate);
            System.out.println("---------------------------------------");
        }else{
            this.staffName = staffName;
            this.joiningDate = joiningDate;
            this.qualification = qualification;
            this.appointedBy = appointedBy;
            joined = true;
        }
    }

    public void display(){
        super.display();
        if (joined==true){
            //The following info will be printed if staff has joined.
            System.out.println("Full time Staff's Details");
            System.out.println("Staff's full Name: "+staffName);
            System.out.println("Staff's total Salary:Rs "+salary);
            System.out.println("Working hour(per day): "+workingHour+"hrs");
            System.out.println("Joined date: "+joiningDate);
            System.out.println("Staff's Qualification: "+qualification);
            System.out.println("The staff was appointed by:"+appointedBy);
        }else{
            //The following will be printed id staff has not joined.
            System.out.println("The staff has not been appointed");
            
        }
    }
}