package com.xworkz.Inheritnace.Runner;

import com.xworkz.Inheritnace.things.*;

public class Example2Runner {
    public static void main(String[] args) {
        Bowler bow=new Bowler("virat",35,45,"sports","cricket","karnataka","India","Right handed","fast bowler");
        bow.printPerson();
        bow.printEmployee();
        bow.printGovtEmployee();
        bow.printPlayer();
        bow.printStatePlayer();
        bow.printNationalPlayer();
        bow.printCricketPlayer();
        bow.printbowler();
        System.out.println("____________");

        CricketPlayer cp=new CricketPlayer("Doni",67,78,"sports","cricket","karnataka","India","left handed");
        cp.printPerson();
        cp.printEmployee();
        cp.printGovtEmployee();
        cp.printPlayer();
        cp.printStatePlayer();
        cp.printNationalPlayer();
        cp.printCricketPlayer();
        System.out.println("____________");

        NationalPlayer np=new NationalPlayer("kapil",67,89,"cricket","sport","karnataka","India");
        np.printPerson();
        np.printEmployee();
        np.printGovtEmployee();
        np.printPlayer();
        np.printStatePlayer();
        np.printNationalPlayer();
        System.out.println("__________");

        StatePlayer sp=new StatePlayer("seeraj",78,87,"sports","karnataka","karnataka");
        sp.printPerson();
        sp.printEmployee();
        sp.printGovtEmployee();
        sp.printPlayer();
        sp.printStatePlayer();
        System.out.println("__________");

        Player player=new Player("pandya",78,88,"sports","cricket");
        player.printPerson();
        player.printEmployee();
        player.printGovtEmployee();
        player.printPlayer();
        System.out.println("__________");

        GovtEmployee ge=new GovtEmployee("shami",55,78,"cricket");
        ge.printPerson();
        ge.printEmployee();
        ge.printGovtEmployee();
        System.out.println("__________");

        Employee employee=new Employee("rajath",76,90);
        employee.printPerson();
        employee.printEmployee();
        System.out.println("__________");

        Person person=new Person("Rahul",56);
        person.printPerson();
    }
}
