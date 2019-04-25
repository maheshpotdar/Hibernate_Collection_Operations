package com.mahesh.Userdetails.collection;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import javax.transaction.Transaction;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class App {

	public static void main(String[] args) {

		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Userdetails.class)
				.buildSessionFactory();
		Session session = factory.getCurrentSession();
		org.hibernate.Transaction tr = session.beginTransaction();

		Userdetails ud1 = new Userdetails();
		ud1.setUsername("Mahesh Potdar");

		Userdetails ud2 = new Userdetails();
		ud2.setUsername("Ganesh Patel");

		Userdetails ud3 = new Userdetails();
		ud3.setUsername("Manali Nemiste");

		Address ad1 = new Address();
		ad1.setCountryName("India");
		ad1.setStateName("New Delhi");

		Address ad2 = new Address();
		ad2.setCountryName("Uk");
		ad2.setStateName("Lankester");

		Address ad3 = new Address();
		ad3.setCountryName("Usa");
		ad3.setStateName("Shikago");

		Address ad4 = new Address();
		ad4.setCountryName("Usa");
		ad4.setStateName("Washingtone DC");

		Address ad5 = new Address();
		ad5.setCountryName("Austrellia");
		ad5.setStateName("Sydeny");

		Set<Address> addressesUD1 = new HashSet<Address>();
		addressesUD1.add(ad1);// Delhi//Shikago//Washingtone DC
		addressesUD1.add(ad3);
		addressesUD1.add(ad4);

		Set<Address> addressesUD2 = new HashSet<Address>();
		addressesUD2.add(ad2);// uk
		addressesUD2.add(ad5);//sydeny

		Set<Address> addressesUD3 = new HashSet<Address>();
		addressesUD3.add(ad1);

		ud1.setSetOfAddress(addressesUD1);
		ud2.setSetOfAddress(addressesUD2);
		ud3.setSetOfAddress(addressesUD2);

		session.saveOrUpdate(ud1);
		session.saveOrUpdate(ud2);
		session.saveOrUpdate(ud3);

		tr.commit();
	}

}
