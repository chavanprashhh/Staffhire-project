
public class Staffhire
{
    int vancancynumber;
    String Designation;
    String jobtype;


public Staffhire(int vacancynumber,String Designation,String jobtype){
    this.vancancynumber=vacancynumber;
    this.Designation=Designation;
    this.jobtype=jobtype;
    
}

public int getvacancynumber(){
    return vancancynumber;
}
public String getDesignation(){
    return Designation;
}
public String getjobtype(){
    return jobtype;
}

public void display(){
    System.out.println("Vacancy number"+this.getvacancynumber());
    System.out.println("Designation"+this.getDesignation());
    System.out.println("Job type"+this.getjobtype());
    
}

}