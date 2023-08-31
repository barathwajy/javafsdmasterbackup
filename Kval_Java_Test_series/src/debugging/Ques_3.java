package debugging;

import java.util.Scanner;

interface MenuItem{

    

    double trioitems(double p1,double p2,double p3);

 

    void trioitems(String s1);

}

 

class Sandwich implements MenuItem{

 

    @Override

    public double trioitems(double p1, double p2, double p3) {

        // TODO Auto-generated method stub

        return 0;

    }

 

    @Override

    public void trioitems(String s1) {

        // TODO Auto-generated method stub

        System.out.print(s1+"/");

        

    }

 

    

    

}

class Salad implements MenuItem{

 

    @Override

    public double trioitems(double p1, double p2, double p3) {

        // TODO Auto-generated method stub

        return 0;

    }

 

    @Override

    public void trioitems(String s1) {

        // TODO Auto-generated method stub

        System.out.print(s1+"/");

        

    }

    

}

 

class Drink implements MenuItem{

 

    @Override

    public double trioitems(double p1, double p2, double p3) {

        // TODO Auto-generated method stub

        return 0;

    }

 

    @Override

    public void trioitems(String s1) {

        // TODO Auto-generated method stub

        System.out.print(s1);

        

    }

        

}

class Trio  implements MenuItem{

 

    @Override

    public double trioitems(double p1, double p2, double p3) {

        // TODO Auto-generated method stub

        if(p1>=p2 && p2>=p3) {

            return p1+p2;

        }else if(p3>=p2 && p1>=p2) {

            return p3+p2;

        }else {

            return p3+p2;

        }

        

    }

 

    @Override

    public void trioitems(String s1) {

        // TODO Auto-generated method s

        return;

        

    }

 

    

}

public class Ques_3 {

 

    public static void main(String[] args) {

        // TODO Auto-generated method stub

        Scanner sc=new Scanner(System.in);

        

        System.out.println("Enter Sandwich Details: ");

        String s1=sc.next();

        //System.out.println(s1);

        double p1=sc.nextDouble();

        

        Sandwich m1=new Sandwich();

        m1.trioitems(s1);

        String s2=sc.next();

        double p2=sc.nextDouble();

        

        Salad m2=new Salad();

        m2.trioitems(s2);

        String s3=sc.next();

        double p3=sc.nextDouble();

        

        Drink m3=new Drink();

        m3.trioitems(s3);

        Trio m4=new Trio();

        //

        System.out.println(m4.trioitems(p1,p2,p3));

    }

 

}

 