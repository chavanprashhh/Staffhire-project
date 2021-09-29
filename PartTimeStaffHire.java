

public class PartTimeStaffHire extends Staffhire
{
    private int workingHour;                    
    private int wagesPerHour;
    private int salary;
    private String staffName;
    private String joiningDate;
    private String qualification;
    private String appointedBy;
    private String shifts;
    private boolean joined;
    private boolean terminated;

    PartTimeStaffHire(int vacancyNumber,String designation,String jobType,int workingHour,int wagesPerHour, String shifts){
        super(vacancyNumber, designation, jobType);
        this.workingHour = workingHour;
        this.wagesPerHour = wagesPerHour;
        this.shifts = shifts;
        
        staffName = "";
        joiningDate = "";
        qualification = "";        
        appointedBy = "";
        joined = false;
        terminated = false;
    }
    public int getWorkingHour(){
            return this.workingHour;
        }
        
    public int getWagesPerHour(){
            return this.wagesPerHour;
        }
        
    public String getStaffName(){
            return this.staffName;
        }
        
    public String getJoiningDate(){
            return this.joiningDate;
        }
        
   
        
    public String getQualifiaction(){
            return this.qualification;
        }
        
    public String getAppointedBy(){
            return this.appointedBy;
        }
        
    public String getShifts(){
            return this.shifts;
        }
        
    public boolean getJoined(){
            return this.joined;
        }
        
    public boolean getTerminated(){
            return this.terminated;
        }
        
    public void setWorkingShift(int NewShift){
      if (joined == true){
            this.workingHour = NewShift;
        }else{
            /*This will be displayed if staff has already been hired.*/
            System.out.println("This Staff has already been hired");
        }
    }
    
    public void partTime(String staffName, String joiningDate, String qualification, String appointedBy){
        if (joined==true){
            /*This will be displayed if staff has already joined.*/
            System.out.println(this.staffName+" has already joined");
            System.out.println("Staff full name: "+this.staffName);
            System.out.println("The staff joined on: "+this.joiningDate);
            
        }else{
            this.staffName = staffName;
            this.joiningDate = joiningDate;
            this.qualification = qualification;
            this.appointedBy = appointedBy;
            joined = true;
        }
    }
    
    public void terminateStaff(){
      if (terminated == true){
            /* This will be displayed if staff is terminated.*/
            System.out.println("This Staff has already been terminated");
        }
        else {
            this.staffName = "";
            this.joiningDate = "";
            this.qualification = "";
            this.appointedBy = "";
            this.joined = false;
            this.terminated = true;
            System.out.println("Current Staff is Terminated");
        }
    }

    public void displayPartTimeStaff(){
         super.display();
         if (joined == true){
            //This will be displayed if staff has joined.
            System.out.println("Name :" + staffName);
            System.out.println("joining Date :" + joiningDate);
            System.out.println("Qualification :" + qualification);
            System.out.println("Appointed :" + appointedBy );
            System.out.println("wagesperhour :" + wagesPerHour);
            System.out.println("salary :"+ salary );
        }else {
            /*This will be displayed if staff has not joined*/
            System.out.println("Staff has not joined.");
    
    
        }
    }
} 