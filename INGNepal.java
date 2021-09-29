
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

public class INGNepal implements ActionListener
{
    private JFrame frm;
    private JLabel labelFullTimeStaffHire,labelPartTimeStaffHire, labelVacancyNumberFT, labelVacancyNumberFTtt,
            labelDesignationFT,  labelJobTypeFT, labelSalaryFT,labelStaffNameFT,labelWorkingHourFT,
            labelQualificationFT,
            labelJoinDateFT, labelAppointedByFT, labelWorkingShiftFT, labelWagesPerHourFT,
            labelGenderFT,labelDateOfBirthFT,
            
            labelVacancyNumberPT, labelVacancyNumberPTapt, labelVacancyNumberPTtmt,
            labelDesignationPT, labelJobTypePT, labelSalaryPT,labelStaffNamePT,labelWorkingHourPT,
            labelQualificationPT,
            labelJoinDatePT, labelAppointedByPT,labelWorkingShiftPT, labelWagesPerHourPT,
            labelGenderPT,labelDateOfBirthPT;
           
    private JTextField textVacancyNumberFT, textVacancyNumberFTapt, textDesignationFT, textJobTypeFT, textSalaryFT, 
                textStaffNameFT, textWorkingHourFT, textQualificationFT, textWagesPerHourFT,
                textYearFT, textMonthFT, textDayFT,textworkingshiftFT,
                textAppointedByFT,
                textVacancyNumberPT, textVacancyNumberPTapt, textDesignationPT, textJobTypePT, textSalaryPT, 
                textStaffNamePT, textWorkingHourPT, textQualificationPT, textWagesPerHourPT,
                textWorkingShiftPT, textYearPT, textMonthPT, textDayPT,
                textVacancyNumberPTtmt, textJoinDatePT, textAppointedByPT;
                
    private JComboBox cmbYear , cmbMonth, cmbDay, cmbJobType;
               String Year,Month,Day,Shift,JoinDate,appoined;
    
    int VacancyNumberFT;
    int SalaryFT, WorkingHourFT;
    String JobTypeFT, DesignationFT;
    
    int VacancyNumberPT;
    int WagesPerHourPT, WorkingHourPT;
    String JobTypePT, DesignationPT;
    String WorkingShiftPT;
    
    int VacancyNumberPTapt;
    String StaffNamePT;
    String JoinDatePT;
    String QualificationPT;
    String AppointedByPT;
    
    int VacancyNumberFTapt;
    String StaffNameFT;
    String JoinDateFT;
    String QualificationFT;
    String AppointedByFT;
    
    int VacancyNumberPTtmt;
    
    PartTimeStaffHire p;
               
    private JRadioButton radMale, radFemale;
    
    private JRadioButton radMale2, radFemale2;
               
    private JButton buttonAddVacancyFullTime, buttonAddVacancyPartTime, buttonAppointFullTime, 
            buttonAppointPartTime,
            buttonTerminatePartTime,
            buttonDisplay, buttonClear,
            buttonDisplay2, buttonClear2;
    
      ArrayList<Staffhire> list=new ArrayList<Staffhire>();
    
    public static void main(String [] args){
        new INGNepal().StaffHireForm();
    }
          public void StaffHireForm(){
          JFrame frm=new JFrame("Staff Hire");
        
        Color c=new Color(99, 148, 194);
        frm.getContentPane().setBackground(c);
        
        labelFullTimeStaffHire=new JLabel("Full Time Staff Hire");
        Font f=new Font("Times New Roman",Font.PLAIN,25);
        labelFullTimeStaffHire.setBounds(200,10,400,50);
        labelFullTimeStaffHire.setLayout(null);
        frm.add(labelFullTimeStaffHire);
        labelFullTimeStaffHire.setFont(f);
        
        labelVacancyNumberFT=new JLabel("Vacancy Number:");
        labelVacancyNumberFT.setBounds(20,70,170,30);
        frm.add(labelVacancyNumberFT);
        
        textVacancyNumberFT=new JTextField();
        textVacancyNumberFT.setBounds(130,75,50,20);
        frm.add(textVacancyNumberFT);
        
        labelDesignationFT=new JLabel("Designation:");
        labelDesignationFT.setBounds(20,120,120,30);
        frm.add(labelDesignationFT);
        
        textDesignationFT=new JTextField();
        textDesignationFT.setBounds(130,125,100,20);
        frm.add(textDesignationFT);
        
        labelJobTypeFT=new JLabel("Job Type:");
        labelJobTypeFT.setBounds(20,170,120,30);
        frm.add(labelJobTypeFT);
        
        textJobTypeFT=new JTextField();
        textJobTypeFT.setBounds(130,175,80,20);
        frm.add(textJobTypeFT);
        
        labelSalaryFT=new JLabel("Salary:");
        labelSalaryFT.setBounds(20,220,120,30);
        frm.add(labelSalaryFT);
        
        textSalaryFT=new JTextField();
        textSalaryFT.setBounds(130,225,80,20);
        frm.add(textSalaryFT);
        
        labelWorkingHourFT=new JLabel("Working Hour:");
        labelWorkingHourFT.setBounds(20,270,120,30);
        frm.add(labelWorkingHourFT);
        
        textWorkingHourFT=new JTextField();
        textWorkingHourFT.setBounds(130,275,50,20);
        frm.add(textWorkingHourFT);
        
        buttonAddVacancyFullTime=new JButton("Add FullTime Vacancy");
        buttonAddVacancyFullTime.setBounds(20,320,180,30);
        frm.add(buttonAddVacancyFullTime);
        buttonAddVacancyFullTime.addActionListener(this);
        
        labelStaffNameFT=new JLabel("Staff Name:");
        labelStaffNameFT.setBounds(780,70,120,30);
        frm.add(labelStaffNameFT);
        
        textStaffNameFT=new JTextField();
        textStaffNameFT.setBounds(890,75,120,20);
        frm.add(textStaffNameFT);
        
         labelVacancyNumberFTtt=new JLabel("Vacancy No:");
         labelVacancyNumberFTtt.setBounds(400,70,120,30);
        frm.add( labelVacancyNumberFTtt);
        
        textVacancyNumberFTapt=new JTextField();
        textVacancyNumberFTapt.setBounds(510,75,50,20);
        frm.add(textVacancyNumberFTapt);
        
        labelQualificationFT=new JLabel("Qualification:");
        labelQualificationFT.setBounds(780,120,120,30);
        frm.add(labelQualificationFT);
        
        textQualificationFT=new JTextField();
        textQualificationFT.setBounds(890,125,80,20);
        frm.add(textQualificationFT);
        
        buttonDisplay=new JButton("Display");
        buttonDisplay.setBounds(1100,130,180,30);
        frm.add(buttonDisplay);
        buttonDisplay.addActionListener(this);
        
        labelGenderFT=new JLabel("Gender:");
        labelGenderFT.setBounds(780,170,120,30);
        frm.add(labelGenderFT);
        
        JPanel radPanel=new JPanel();
        radPanel.setLayout(new FlowLayout());
        radPanel.setBounds(890,170,150,30);
        frm.add(radPanel);
        
        ButtonGroup radGroup=new ButtonGroup();
        
        radMale=new JRadioButton("Male");
        radFemale=new JRadioButton("Female");
        
        radPanel.add(radMale);
        radPanel.add(radFemale);
        
        radGroup.add(radMale);
        radGroup.add(radFemale);
        
        
        labelJoinDateFT=new JLabel("Joining Date:");
        labelJoinDateFT.setBounds(400,220,120,30);
        frm.add(labelJoinDateFT);
        String Year[]={"2000", "2001", "2002", "2003", "2004", "2005", "2006", "2007",
            "2008", "2009", "2010", "2011", "2012", "2013","2014","2015","2016","2017",
            "2018","2019","2020"};
        cmbYear=new JComboBox(Year);
        cmbYear.setBounds(510,225,120,20);
        frm.add(cmbYear);
        
        String Month[]={"January","February","March","April","May","June","July",
            "August","September","October","November","December"};
        cmbMonth=new JComboBox(Month);
        cmbMonth.setBounds(645,225,80,20);
        frm.add(cmbMonth);
            
        String Day[]={"1","2","3","4","5","6","7","8","9","10","11","12","13","14","15",
            "16","17","18","19","20","21","22","23","24","25","26","27","28","29",
            "30","31"};
        cmbDay=new JComboBox(Day);
        cmbDay.setBounds(745,225,80,20);
        frm.add(cmbDay);
        
        buttonClear=new JButton("Clear");
        buttonClear.setBounds(1100,230,180,30);
        frm.add(buttonClear);
        buttonClear.addActionListener(this);
        
        labelAppointedByFT=new JLabel("Appointed By:");
        labelAppointedByFT.setBounds(400,270,120,30);
        frm.add(labelAppointedByFT);
        
        textAppointedByFT=new JTextField();
        textAppointedByFT.setBounds(510,275,150,20);
        frm.add(textAppointedByFT);
        
        
        buttonAppointFullTime=new JButton("Appoint FullTime");
        buttonAppointFullTime.setBounds(400,320,180,30);
        frm.add(buttonAppointFullTime);
        buttonAppointFullTime.addActionListener(this);
        
        labelWorkingShiftFT=new JLabel("Working Shift:");
        labelWorkingShiftFT.setBounds(400,120,120,30);
        textworkingshiftFT=new JTextField();
        textworkingshiftFT.setBounds(890,75,120,20);
        frm.add(textworkingshiftFT);
       
        
        
        //PartTime Staff
        
        
        labelPartTimeStaffHire=new JLabel("Part Time Staff Hire");
        labelPartTimeStaffHire.setBounds(200,400,400,50);
        labelPartTimeStaffHire.setLayout(null);
        frm.add(labelPartTimeStaffHire);
        labelPartTimeStaffHire.setFont(f);
        
        labelVacancyNumberPT=new JLabel("Vacancy Number:");
        labelVacancyNumberPT.setBounds(20,460,170,30);
        frm.add(labelVacancyNumberPT);
        
        textVacancyNumberPT=new JTextField();
        textVacancyNumberPT.setBounds(130,465,50,20);
        frm.add(textVacancyNumberPT);
        
        labelDesignationPT=new JLabel("Designation:");
        labelDesignationPT.setBounds(20,510,120,30);
        frm.add(labelDesignationPT);
        
        textDesignationPT=new JTextField();
        textDesignationPT.setBounds(130,515,100,20);
        frm.add(textDesignationPT);
        
        labelJobTypePT=new JLabel("Job Type:");
        labelJobTypePT.setBounds(20,560,120,30);
        frm.add(labelJobTypePT);
        
        textJobTypePT=new JTextField();
        textJobTypePT.setBounds(130,565,80,20);
        frm.add(textJobTypePT);
        
        labelWorkingHourPT=new JLabel("Working Hour:");
        labelWorkingHourPT.setBounds(20,610,120,30);
        frm.add(labelWorkingHourPT);
        
        textWorkingHourPT=new JTextField();
        textWorkingHourPT.setBounds(130,615,80,20);
        frm.add(textWorkingHourPT);
        
        labelWorkingShiftPT=new JLabel("Working Shift:");
        labelWorkingShiftPT.setBounds(20,660,120,30);
        frm.add(labelWorkingShiftPT);
        
        textWorkingShiftPT=new JTextField();
        textWorkingShiftPT.setBounds(130,665,80,20);
        frm.add(textWorkingShiftPT);
        
        buttonAddVacancyPartTime=new JButton("Add PartTime Vacancy");
        buttonAddVacancyPartTime.setBounds(1100,470,180,30);
        frm.add(buttonAddVacancyPartTime);
        buttonAddVacancyPartTime.addActionListener(this);
        
        labelStaffNamePT=new JLabel("Staff Name:");
        labelStaffNamePT.setBounds(780,460,120,30);
        frm.add(labelStaffNamePT);
        
        textStaffNamePT=new JTextField();
        textStaffNamePT.setBounds(890,465,120,20);
        frm.add(textStaffNamePT);
        
        
        labelQualificationPT=new JLabel("Qualification:");
        labelQualificationPT.setBounds(780,510,120,30);
        frm.add(labelQualificationPT);
        
        textQualificationPT=new JTextField();
        textQualificationPT.setBounds(890,515,80,20);
        frm.add(textQualificationPT);
        
        labelVacancyNumberPTapt=new JLabel("Vacancy Number:");
        labelVacancyNumberPTapt.setBounds(400,460,120,30);
        frm.add(labelVacancyNumberPTapt);
        
        textVacancyNumberPTapt=new JTextField();
        textVacancyNumberPTapt.setBounds(510,465,50,20);
        frm.add(textVacancyNumberPTapt);
        
        labelWagesPerHourPT=new JLabel("Wages Per Hour:");
        labelWagesPerHourPT.setBounds(20,710,120,30);
        frm.add(labelWagesPerHourPT);
        
        textWagesPerHourPT=new JTextField();
        textWagesPerHourPT.setBounds(130,715,80,20);
        frm.add(textWagesPerHourPT);
        
        labelJoinDatePT=new JLabel("Join Date:");
        labelJoinDatePT.setBounds(400,610,120,30);
        frm.add(labelJoinDatePT);
        
        textJoinDatePT=new JTextField();
        textJoinDatePT.setBounds(510,615,150,20);
        frm.add(textJoinDatePT);
        
        labelAppointedByPT=new JLabel("Appointed By:");
        labelAppointedByPT.setBounds(400,660,120,30);
        frm.add(labelAppointedByPT);
       
        textAppointedByPT=new JTextField();
        textAppointedByPT.setBounds(510,665,150,20);
        frm.add(textAppointedByPT);
        
        buttonAppointPartTime=new JButton("Appoint PartTime");
        buttonAppointPartTime.setBounds(1100,510,180,30);
        frm.add(buttonAppointPartTime);
        buttonAppointPartTime.addActionListener(this);
        
        labelGenderPT=new JLabel("Gender:");
        labelGenderPT.setBounds(780,560,120,30);
        frm.add(labelGenderPT);
        
        JPanel radPanel2=new JPanel();
        radPanel2.setLayout(new FlowLayout());
        radPanel2.setBounds(890,560,150,30);
        frm.add(radPanel2);
        
        ButtonGroup radGroup2=new ButtonGroup();
        
        radMale2=new JRadioButton("Male");
        radFemale2=new JRadioButton("Female");
        
        radPanel2.add(radMale2);
        radPanel2.add(radFemale2);
        
        radGroup2.add(radMale2);
        radGroup2.add(radFemale2);
        
        labelVacancyNumberPTtmt=new JLabel("Vacancy no:");
        labelVacancyNumberPTtmt.setBounds(680,710,120,30);
        frm.add(labelVacancyNumberPTtmt);
        
        textVacancyNumberPTtmt=new JTextField();
        textVacancyNumberPTtmt.setBounds(790,710,50,20);
        frm.add(textVacancyNumberPTtmt);
        
        
        
        buttonTerminatePartTime=new JButton("Terminate");
        buttonTerminatePartTime.setBounds(710,710,180,30);
        frm.add(buttonTerminatePartTime);
        buttonTerminatePartTime.addActionListener(this);
        
        frm.setSize(1500,900);
        frm.setLayout(null);
        frm.setVisible(true);
        frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}
@Override
        public void actionPerformed(ActionEvent events){
           if(events.getSource()==buttonAddVacancyFullTime){
                VacancyNumberFT=0;
                SalaryFT=0; WorkingHourFT=0;
                JobTypeFT=""; DesignationFT="";
                try{
                    VacancyNumberFT=Integer.parseInt(textVacancyNumberFT.getText());
                    DesignationFT=textDesignationFT.getText();
                    SalaryFT=Integer.parseInt(textSalaryFT.getText());
                    WorkingHourFT=Integer.parseInt(textWorkingHourFT.getText());
                    JobTypeFT=textJobTypeFT.getText();
                    
                    boolean isDuplicateVacancyNumberFT=false;
                for(Staffhire vr:list){
                    if(vr.getvacancynumber()==VacancyNumberFT){
                        isDuplicateVacancyNumberFT=true;
                        break;
                    }
                }
                if(isDuplicateVacancyNumberFT==false){
                    FullTimeStaffHire obj=new FullTimeStaffHire(VacancyNumberFT, DesignationFT,
                    JobTypeFT, SalaryFT, WorkingHourFT);
                    list.add(obj);
                    JOptionPane.showMessageDialog(frm,"Full Time Vacancy Added"
                    +list.size());
                } 
                else{
                    JOptionPane.showMessageDialog(frm,"The Vacancy Number is already been added."
                    +list.size());
                    }
                }
                catch(Exception expected){
                    JOptionPane.showMessageDialog(frm,"Error.Please Enter appropriate Values!");
                }
                }
                
                
                if(events.getSource()==buttonAddVacancyPartTime){
                VacancyNumberPT=0;
                WagesPerHourPT=0; WorkingHourPT=0;
                JobTypePT=""; DesignationPT=""; WorkingShiftPT="";
                try{
                    VacancyNumberPT=Integer.parseInt(textVacancyNumberPT.getText());
                    WorkingShiftPT=textWorkingShiftPT.getText();
                    DesignationPT=textDesignationPT.getText();
                    WagesPerHourPT=Integer.parseInt(textWagesPerHourPT.getText());
                    WorkingHourPT=Integer.parseInt(textWorkingHourPT.getText());
                    JobTypePT=textJobTypePT.getText();
                    
                    boolean isDuplicateVacancyNumberPT=false;
                for(Staffhire var:list){
                    if(var.getvacancynumber()==VacancyNumberPT){
                        isDuplicateVacancyNumberPT=true;
                        break;
                    }
                }
                if(isDuplicateVacancyNumberPT==false){
                    PartTimeStaffHire obj=new PartTimeStaffHire( VacancyNumberPT,
                    DesignationPT, JobTypePT,
                    WorkingHourPT, WagesPerHourPT, WorkingShiftPT);
                    list.add(obj);
                    JOptionPane.showMessageDialog(frm,"Part Time Vacancy Added"
                    +list.size());
                }
                else{
                    JOptionPane.showMessageDialog(frm,"The Vacancy Number is already been added."
                    +list.size());
                    }
                }
                catch(Exception expected){
                    JOptionPane.showMessageDialog(frm,"Invalid. Please Enter appropriate Values!");
                }
            }try{
            if(events.getSource()==buttonAppointFullTime){
                VacancyNumberFTapt=Integer.parseInt(textVacancyNumberFTapt.getText());
                StaffNameFT=textStaffNameFT.getText();
                Year=(cmbYear.getSelectedItem()).toString();
                Month=(cmbMonth.getSelectedItem()).toString();
                Day=(cmbDay.getSelectedItem()).toString();
                QualificationFT=textQualificationFT.getText();
                AppointedByFT=textAppointedByFT.getText();
                
                JoinDate=Year+Month+Day;
                
                boolean VacancyNumberFTaptFound=false;
                for(Staffhire obj:list){
                    if(obj.getvacancynumber()==VacancyNumberFTapt){
                        VacancyNumberFTaptFound=true;
                        if(obj instanceof FullTimeStaffHire){
                            FullTimeStaffHire a=(FullTimeStaffHire)obj;
                            if(a.getJoined()==true){
                                JOptionPane.showMessageDialog(frm,"Staff already Hired");
                            }else{
                                a.hireFullTime(StaffNameFT,JoinDate,QualificationFT,
                                AppointedByFT);
                                JOptionPane.showMessageDialog(frm,"Staff Has been Hired");
                                list.add(a);
                                break;
                            }
                        }else{
                            JOptionPane.showMessageDialog(frm,"not for Full Time");
                            break;
                        }
                    }
                }
            }
       
        }catch(Exception expected){
            JOptionPane.showMessageDialog(frm,"Please Enter All The Fields!");
        }
        try{
                if(events.getSource()==buttonAppointPartTime){
                    VacancyNumberPTapt=Integer.parseInt(textVacancyNumberPTapt.getText());
                    StaffNamePT=textStaffNamePT.getText();
                    JoinDatePT=textJoinDatePT.getText();
                    QualificationPT=textQualificationPT.getText();
                    AppointedByPT=textAppointedByPT.getText();
                    
                    boolean VacancyNumberPTaptFound=false;
                    for(Staffhire obj:list){
                        if(obj.getvacancynumber()==VacancyNumberPTapt){
                            VacancyNumberPTaptFound=true;
                            if(obj instanceof PartTimeStaffHire){
                                PartTimeStaffHire b=(PartTimeStaffHire)obj;
                                if(b.getJoined()==true){
                                    JOptionPane.showMessageDialog(frm,"Staff already Hired");
                                }else{
                                    b.partTime(StaffNamePT,JoinDatePT,QualificationPT,
                                    AppointedByPT);
                                    JOptionPane.showMessageDialog(frm,"Staff Has been Hired");
                                    list.add(b);
                                    break;
                                }
                            }else{
                                JOptionPane.showMessageDialog(frm,"not for Part Time");
                                break;
                            }
                        }
                    }
                }
                }catch(Exception expected){
            JOptionPane.showMessageDialog(frm,"Please Enter All The Fields!");
            }
           
                if(events.getSource()==buttonTerminatePartTime){
                    VacancyNumberPTtmt=Integer.parseInt(textVacancyNumberPTapt.getText());
                    
                    for(Staffhire ob:list){
                        if(ob.getvacancynumber()==VacancyNumberPTtmt){
                            if(ob instanceof PartTimeStaffHire){
                                p=(PartTimeStaffHire)ob;
                                if(p.getTerminated()==false){
                                    p.terminateStaff();
                                    JOptionPane.showMessageDialog(frm,"Staff Terminated");
                                    break;
                                }else if(p.getTerminated()==true){
                                    JOptionPane.showMessageDialog(frm,"Staff already Terminated");
                                    break;
                                }
                            }
                        }
                    }
                }
            
                
            
            if(events.getSource()==buttonDisplay){
                for(Staffhire jj:list){
                    if(jj instanceof FullTimeStaffHire){
                        FullTimeStaffHire obj=(FullTimeStaffHire)jj;
                        jj.display();
                    }else if(jj instanceof PartTimeStaffHire){
                        PartTimeStaffHire obj=(PartTimeStaffHire)jj;
                        jj.display();
                    }
            }
            
            
            if(events.getSource()==buttonClear){
            textVacancyNumberFT.setText("");
            textVacancyNumberFTapt.setText("");
            textDesignationFT.setText("");
            textJobTypeFT.setText("");
            textSalaryFT.setText("");
            textStaffNameFT.setText("");
            textWorkingHourFT.setText("");
            textQualificationFT.setText("");
            textWagesPerHourFT.setText("");
            textYearFT.setText("");
            textMonthFT.setText("");
            textDayFT.setText("");
            textAppointedByFT.setText("");
            textVacancyNumberPT.setText("");
            textVacancyNumberPTapt.setText("");
            textDesignationPT.setText("");
            textJobTypePT.setText("");
            textSalaryPT.setText("");
            textStaffNamePT.setText("");
            textWorkingHourPT.setText("");
            textQualificationPT.setText("");
            textWagesPerHourPT.setText("");
            textWorkingShiftPT.setText("");
            textYearPT.setText("");
            textMonthPT.setText("");
            textDayPT.setText("");
            textVacancyNumberPTtmt.setText("");
            textJoinDatePT.setText("");
            textAppointedByPT.setText("");
             
           }
       
    }
    
}
}