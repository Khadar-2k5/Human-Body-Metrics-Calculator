import java.util.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class nothing extends Exception
{
 nothing(String msg)
 {
  super(msg);
 }
}

class nothing2 extends Exception
{
 nothing2(String ms)
 {
  super(ms);
 }
}

  
class calc extends JFrame implements ActionListener
{
 JLabel banner,l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l11,l12,l13,gender,age,sgen,iwt,ibf,ivf,ibmi,iscf,imm,twt,tbf,tvf,tbmi,tma,tscf,tmm,tf; 
 JTextField iage,t4,t5,t6,t7,t8,t9,t10,t11,t12,t13,it1,it2,it3,it4,it5,it6,tt1,tt2,tt3,tt4,tt5,tt6,tt7,tt8;
 JRadioButton r1,r2;
 JButton b1,b2;
 ButtonGroup bg1;
 int x=1000;
 calc()
 {
  setTitle("CALCULATION SCREEN");
  setSize(1400,1400);
  setDefaultCloseOperation(EXIT_ON_CLOSE);
  
  setLayout(null);
  banner=new JLabel("HUMAN BODY METRICS CALCULATOR");
  banner.setFont(new Font("Arial",Font.BOLD,27));
  banner.setForeground(new Color(0, 100, 0));
  add(banner);
  banner.setBounds(400,0,600,40);
    l1=new JLabel("PRESENT METRICS");
  l1.setFont(new Font("Arial",Font.BOLD,20));
  l1.setForeground(new Color(139, 0, 0));
  add(l1);
  l1.setBounds(100,50,200,50);
  l2=new JLabel("IDEAL");
  l2.setFont(new Font("Arial",Font.BOLD,20));
  l2.setForeground(new Color(139, 0, 0));
  l2.setBounds(600,50,100,50);
  add(l2);
  l3=new JLabel("TARGET");
  l3.setFont(new Font("Arial",Font.BOLD,20));
  l3.setForeground(new Color(139, 0, 0));
  add(l3);
  l3.setBounds(990,50,100,50);
  l4=new JLabel("HEIGHT (in cm):");
  l5=new JLabel("WEIGHT (in kgs):");
  l6=new JLabel("TOTAL BODY FAT (%):");
  l7=new JLabel("VISCERAL FAT (%):");
  l8=new JLabel("BODY MASS INDEX (in Points):");
  l9=new JLabel("BODY METABOLIC AGE:");
  l10=new JLabel("SUBCUTANEOUS FAT (%):");
  l11=new JLabel("MUSCLE MASS (%)  :");
  l12=new JLabel("FAT(IN KGS)      :");
  l13=new JLabel("LEAN BODY WEIGHT(IN KGS)    :");
  add(l4);
  add(l5);
  add(l6);
  add(l7);
  add(l8);
  add(l9);
  add(l10);
  add(l11);
  add(l12);
  add(l13);
  l4.setBounds(5,90,200,50);
  l5.setBounds(5,140,200,50);
  l6.setBounds(5,190,200,50);
  l7.setBounds(5,240,200,50);
  l8.setBounds(5,290,250,50);
  l9.setBounds(5,340,200,50);
  l10.setBounds(5,390,250,50);
  l11.setBounds(5,440,200,50);
  l12.setBounds(5,490,200,50); 
  l13.setBounds(5,540,250,50);
  l4.setFont(new Font("Arial",Font.BOLD,15));
  l5.setFont(new Font("Arial",Font.BOLD,15));
  l6.setFont(new Font("Arial",Font.BOLD,15));
  l7.setFont(new Font("Arial",Font.BOLD,15));
  l8.setFont(new Font("Arial",Font.BOLD,15));
  l9.setFont(new Font("Arial",Font.BOLD,15));
  l10.setFont(new Font("Arial",Font.BOLD,15));
  l11.setFont(new Font("Arial",Font.BOLD,15));
  l12.setFont(new Font("Arial",Font.BOLD,15));
  l13.setFont(new Font("Arial",Font.BOLD,15));
  t4=new JTextField();
  t5=new JTextField();
  t6=new JTextField();
  t7=new JTextField();
  t8=new JTextField();
  t9=new JTextField();
  t10=new JTextField();
  t11=new JTextField();
  t12=new JTextField();
  t13=new JTextField();
  add(t4);
  add(t5);
  add(t6);
  add(t7);
  add(t8);
  add(t9);
  add(t10);
  add(t11);
  add(t12);
  add(t13);
  t4.setBounds(260,100,100,35);
  t5.setBounds(260,150,100,35);
  t6.setBounds(260,200,100,35);
  t7.setBounds(260,250,100,35);
  t8.setBounds(260,300,100,35);
  t9.setBounds(260,350,100,35);
  t10.setBounds(260,400,100,35);
  t11.setBounds(260,450,100,35);
  t12.setBounds(260,500,100,35);
  t13.setBounds(260,550,100,35);
  t4.setFont(new Font("Arial",Font.BOLD,15));
  t5.setFont(new Font("Arial",Font.BOLD,15));
  t6.setFont(new Font("Arial",Font.BOLD,15));
  t7.setFont(new Font("Arial",Font.BOLD,15));
  t8.setFont(new Font("Arial",Font.BOLD,15));
  t9.setFont(new Font("Arial",Font.BOLD,15));
  t10.setFont(new Font("Arial",Font.BOLD,15));
  t11.setFont(new Font("Arial",Font.BOLD,15));
  t12.setFont(new Font("Arial",Font.BOLD,15));
  t13.setFont(new Font("Arial",Font.BOLD,15));
  t12.setEditable(false);
  t13.setEditable(false);
  b1=new JButton("SUBMIT");
  add(b1);
  b1.setBounds(620,590,100,35);
  b2 = new JButton("CLEAR");
  add(b2);
  b2.setBounds(490,590,100,35);

  b2.addActionListener(this);


  gender=new JLabel("GENDER&AGE");
  add(gender);
  gender.setForeground(Color.RED);
  gender.setFont(new Font("Arial",Font.BOLD,20));
  gender.setBounds(550,430,150,50);
  sgen=new JLabel("SELECT GENDER:");
  sgen.setFont(new Font("Arial",Font.BOLD,15));
  add(sgen);
  sgen.setBounds(460,500,150,35);
  r1=new JRadioButton("MALE");
  r2=new JRadioButton("FEMALE");
  bg1=new ButtonGroup();
  bg1.add(r1);
  bg1.add(r2);
  add(r1);
  add(r2);
  r1.setBounds(610,490,60,50);
  r2.setBounds(680,490,80,50);
  age=new JLabel("AGE:");
  add(age);
  age.setFont(new Font("Arial",Font.BOLD,15));
  iage=new JTextField();
  add(iage);
  age.setBounds(550,550,60,25);
  iage.setBounds(600,550,60,30);
  iage.setFont(new Font("Arial",Font.BOLD,15));

  iwt=new JLabel("WEIGHT:");
  ibf=new JLabel("BODY FAT:");
  ivf=new JLabel("VISCERAL FAT:");
  ibmi=new JLabel("BODY MASS INDEX:");
  iscf=new JLabel("SUB CUTANEOUS FAT:");
  imm=new JLabel("MUSCLE MASS:");
  add(iwt);
  add(ibf);
  add(ivf);
  add(ibmi);
  add(iscf);
  add(imm);

  iwt.setFont(new Font("Arial",Font.BOLD,15));
  ibf.setFont(new Font("Arial",Font.BOLD,15));
  ivf.setFont(new Font("Arial",Font.BOLD,15));
  ibmi.setFont(new Font("Arial",Font.BOLD,15));
  iscf.setFont(new Font("Arial",Font.BOLD,15));
  imm.setFont(new Font("Arial",Font.BOLD,15));

  it1=new JTextField();
  it2=new JTextField();
  it3=new JTextField();
  it4=new JTextField();
  it5=new JTextField();
  it6=new JTextField();
  add(it1);
  add(it2);
  add(it3);
  add(it4);
  add(it5);
  add(it6);
  
  it1.setFont(new Font("Arial",Font.BOLD,17));
  it2.setFont(new Font("Arial",Font.BOLD,17));
  it3.setFont(new Font("Arial",Font.BOLD,17));
  it4.setFont(new Font("Arial",Font.BOLD,17));
  it5.setFont(new Font("Arial",Font.BOLD,17));
  it6.setFont(new Font("Arial",Font.BOLD,17));

  iwt.setBounds(500,90,100,50);
  ibf.setBounds(500,140,150,50);
  ivf.setBounds(500,180,150,50);
  ibmi.setBounds(500,220,150,50);
  iscf.setBounds(470,270,180,50);
  imm.setBounds(500,320,150,50);
  it1.setBounds(660,100,100,35);
  it2.setBounds(660,150,100,35);
  it3.setBounds(660,190,100,35);
  it4.setBounds(660,230,100,35);
  it5.setBounds(660,280,100,35);
  it6.setBounds(660,330,100,35);

  it1.setEditable(false);
  it2.setEditable(false);
  it3.setEditable(false);
  it4.setEditable(false);
  it5.setEditable(false);
  it6.setEditable(false);
  
  twt=new JLabel("WEIGHT:");
  tbf=new JLabel("BODY FAT:");
  tvf=new JLabel("VISCERAL FAT:");
  tbmi=new JLabel("BODY MASS INDEX:");
  tma=new JLabel("METABOLIC AGE:");
  tscf=new JLabel("SUBCUTNEOUS FAT:");
  tmm=new JLabel("MUSCLE MASS");
  tf=new JLabel("FAT(in kgs):");

  twt.setFont(new Font("Arial",Font.BOLD,15));
  tbf.setFont(new Font("Arial",Font.BOLD,15));
  tvf.setFont(new Font("Arial",Font.BOLD,15));
  tbmi.setFont(new Font("Arial",Font.BOLD,15));
  tma.setFont(new Font("Arial",Font.BOLD,15));
  tscf.setFont(new Font("Arial",Font.BOLD,15));
  tmm.setFont(new Font("Arial",Font.BOLD,15));
  tf.setFont(new Font("Arial",Font.BOLD,15));
  
  add(twt);
  add(tbf);
  add(tvf);
  add(tbmi);
  add(tma);
  add(tscf);
  add(tmm);
  add(tf);

  
  
  tt1=new JTextField();
  tt2=new JTextField();
  tt3=new JTextField();
  tt4=new JTextField();
  tt5=new JTextField();
  tt6=new JTextField();
  tt7=new JTextField();
  tt8=new JTextField();

  tt1.setFont(new Font("Arial",Font.BOLD,18));
  tt2.setFont(new Font("Arial",Font.BOLD,18));
  tt3.setFont(new Font("Arial",Font.BOLD,18));
  tt4.setFont(new Font("Arial",Font.BOLD,18));
  tt5.setFont(new Font("Arial",Font.BOLD,18));
  tt6.setFont(new Font("Arial",Font.BOLD,18));
  tt7.setFont(new Font("Arial",Font.BOLD,18));
  tt8.setFont(new Font("Arial",Font.BOLD,18));

  add(tt1);
  add(tt2);
  add(tt3);
  add(tt4);
  add(tt5);
  add(tt6);
  add(tt7);
  add(tt8);

  twt.setBounds(860,100,150,50);
  tbf.setBounds(860,150,150,50);
  tvf.setBounds(860,200,150,50);
  tbmi.setBounds(860,250,150,50);
  tma.setBounds(860,300,150,50);
  tscf.setBounds(860,350,180,50);
  tmm.setBounds(860,400,150,50);
  tf.setBounds(860,450,150,50);
   
  tt1.setBounds(1025,110,310,35);
  tt2.setBounds(1025,160,310,35);
  tt3.setBounds(1025,210,310,35);
  tt4.setBounds(1025,260,310,35);
  tt5.setBounds(1025,310,310,35);
  tt6.setBounds(1025,360,310,35);
  tt7.setBounds(1025,410,310,35);
  tt8.setBounds(1025,460,310,35);
  
  tt1.setEditable(false);
  tt2.setEditable(false);
  tt3.setEditable(false);
  tt4.setEditable(false);
  tt5.setEditable(false);
  tt6.setEditable(false);
  tt7.setEditable(false);
  tt8.setEditable(false);
  
  b1.addActionListener(this);
  r1.addActionListener(this);
  r2.addActionListener(this);
  setVisible(true);
 }  

 private String target(double value, String unit)
 {
    if(value < 0)
        return "Reduce by " +
               String.format("%.2f", Math.abs(value))
               + " " + unit;

    if(value > 0)
        return "Increase by " +
               String.format("%.2f", value)
               + " " + unit;

    return "Optimal";
 }
 
 public void actionPerformed(ActionEvent e)
 {
  String comma="";
  Double pht=0.0;
  Double pwt=0.0;
  Double tbf=0.0;
  Double pvf=0.0;
  Double pbmi=0.0;
  Double pbma=0.0;
  Double pscf=0.0;
  Double pmm=0.0;
  String genx="";
  int mage=0;
  int fmage=0;
  comma=e.getActionCommand();
  try
  {


    if(comma.equals("CLEAR"))
   {
    t4.setText("");
    t5.setText("");
    t6.setText("");
    t7.setText("");
    t8.setText("");
    t9.setText("");
    t10.setText("");
    t11.setText("");
    t12.setText("");
    t13.setText("");

    it1.setText("");
    it2.setText("");
    it3.setText("");
    it4.setText("");
    it5.setText("");
    it6.setText("");

    tt1.setText("");
    tt2.setText("");
    tt3.setText("");
    tt4.setText("");
    tt5.setText("");
    tt6.setText("");
    tt7.setText("");
    tt8.setText("");

    iage.setText("");

    bg1.clearSelection();
    }

    if(comma.equals("SUBMIT"))
    {
    if(r1.isSelected())
    {
     genx="MALE";
    }
    else if(r2.isSelected())
    {
     genx="FEMALE";
    }
    else
    {
     throw new nothing("MISSING");
    }
    
    if(t4.getText().equals("")||t4.getText().equals("")||t5.getText().equals("")||t6.getText().equals("")||t7.getText().equals("")||t8.getText().equals("")||t9.getText().equals("")||t10.getText().equals("")||t11.getText().equals("")||iage.getText().equals(""))
   {
 throw new nothing2("MISSSING FIELDS! ENTER ALL FIELDS IN PRESENT FIELDS&AGE TOO");
   }
  
   //calculation part
   

    if(genx.equals("MALE"))
    {
     mage=Integer.parseInt(t9.getText());
     fmage=Integer.parseInt(iage.getText())-mage;
     double ageDiff = Integer.parseInt(iage.getText()) - mage;
     tt5.setText(target(ageDiff,"years"));
     
     pht=Double.parseDouble(t4.getText());
     Double iweight=pht-100;
     float f1=iweight.floatValue();
     it1.setText(String.valueOf(f1));
     Double epwt=Double.parseDouble(t5.getText());
      
     // FAT MASS (kg)
	double bodyFatPercent = Double.parseDouble(t6.getText());

	double fatMass = (epwt * bodyFatPercent) / 100.0;
	t12.setText(String.format("%.2f", fatMass));

	// LEAN BODY WEIGHT (kg)
	double leanMass = epwt - fatMass;
	t13.setText(String.format("%.2f", leanMass));

     Double ftwt=iweight-epwt;
     float f2=ftwt.floatValue();
     tt1.setText(target(ftwt,"kg"));

     if(Integer.parseInt(iage.getText())>50)
     {
      Double ffp=22-Double.parseDouble(t6.getText());
      float f3=ffp.floatValue();
      tt2.setText(target(ffp,"%"));
      it2.setText("22.0");
     }
     else
     {
      it2.setText("19.0");
      Double ffp=19-Double.parseDouble(t6.getText());
      tt2.setText(target(ffp,"%"));
     }
     pvf=Double.parseDouble(t7.getText());
     it3.setText("5");
     Double fpvf=5-pvf;
     
     tt3.setText(target(fpvf,"points"));
     
     it4.setText("21.0");
     pbmi=Double.parseDouble(t8.getText());
     Double fbmi=21.000000000000-pbmi;
     tt4.setText(target(fbmi,"BMI points"));
      
     it5.setText("10.0");
     pscf=Double.parseDouble(t10.getText());
     Double fpscf=10-pscf;
     tt6.setText(target(fpscf,"%"));
     it6.setText("38.0");
     pmm=Double.parseDouble(t11.getText());
     Double fmm=38.000000000000000-pmm;
     tt7.setText(target(fmm,"%"));
     
     double currentFatMass = (epwt * bodyFatPercent) / 100.0;

	double idealFatMass;
	if(Integer.parseInt(iage.getText()) > 50)
	{
    	idealFatMass = (epwt * 22.0) / 100.0;
	}
	else
	{
    	idealFatMass = (epwt * 19.0) / 100.0;
	}

	tt8.setText(target(idealFatMass - fatMass,"kg"));

    }

    else if(genx.equals("FEMALE"))
    {
    mage=Integer.parseInt(t9.getText());
    //fmage=Integer.parseInt(iage.getText())-mage;
    double ageDiff = Integer.parseInt(iage.getText()) - mage;
    tt5.setText(target(ageDiff,"years"));

    pht=Double.parseDouble(t4.getText());

    // Ideal Weight
    Double iweight=pht-105;
    it1.setText(String.format("%.2f",iweight));

    Double epwt=Double.parseDouble(t5.getText());
    Double ftwt=iweight-epwt;
    tt1.setText(target(ftwt,"kg"));

    // Fat Mass & Lean Mass
    double bodyFatPercent=Double.parseDouble(t6.getText());

    double fatMass=(epwt*bodyFatPercent)/100.0;
    t12.setText(String.format("%.2f",fatMass));

    double leanMass=epwt-fatMass;
    t13.setText(String.format("%.2f",leanMass));

    // Ideal Body Fat %
    it2.setText("26.0");
    tt2.setText(target(
        26.0-Double.parseDouble(t6.getText()),"%"));

    // Ideal Visceral Fat
    it3.setText("4.0");
    tt3.setText(target(
        4.0-Double.parseDouble(t7.getText()),"points"));

    // Ideal BMI
    it4.setText("21.0");
    tt4.setText(target(
        21.0-Double.parseDouble(t8.getText()),
        "BMI points"));

    // Ideal Subcutaneous Fat
    it5.setText("18.0");
    tt6.setText(target(
        18.0-Double.parseDouble(t10.getText()),"%"));

    // Ideal Muscle Mass
    it6.setText("30.0");
    tt7.setText(target(
        30.0-Double.parseDouble(t11.getText()),"%"));

    double currentFatMass = (epwt * bodyFatPercent) / 100.0;
    double idealFatMass = (epwt * 26.0) / 100.0;

    tt8.setText(target(idealFatMass-currentFatMass,"kg"));



   }
   
   }
  }
 catch(nothing n)
 {
  JOptionPane.showMessageDialog(null,n.getMessage()+": SELECT GENDER!");
 }
 catch(NumberFormatException nf)
 {
  JOptionPane.showMessageDialog(null,"ONLY ENTER NUMBERS");
 }
 catch(nothing2 n2)
 {
  JOptionPane.showMessageDialog(null,n2.getMessage());
 }
 catch(Exception ee)
 {
  JOptionPane.showMessageDialog(null,ee);
 }


 }


 public static void main(String args[])
 {
  String msg =
        "This application is intended solely for educational and informational purposes.\n\n" +
        "The calculations and results provided are estimates and should not be considered\n" +
        "medical advice, diagnosis, or treatment recommendations.\n\n" +
        "The developer assumes no liability for decisions made based on the results.\n\n" +
        "Click AGREE to continue.";

    int choice = JOptionPane.showOptionDialog(
            null,
            msg,
            "Educational Use Agreement",
            JOptionPane.YES_NO_OPTION,
            JOptionPane.WARNING_MESSAGE,
            null,
            new String[]{"Agree", "Disagree"},
            "Agree");

    if(choice == JOptionPane.YES_OPTION)
    {
        new calc();
    }
    else
    {
        System.exit(0);
    }
 }
}

