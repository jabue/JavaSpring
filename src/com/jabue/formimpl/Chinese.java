package com.jabue.formimpl;

import com.jabue.form.Person;
/**
 * a Chinese class
 * @author Kris
 *
 */
public class Chinese implements Person {

	private SteelAxe steelAxe;
	
	public void setSteelAxe(SteelAxe steelAxe) {
		this.steelAxe = steelAxe;
	}
	
	@Override
	public void sayHello() {
		// TODO Auto-generated method stub
		System.out.println("Hello by Chinese.");
		steelAxe.chop();
	}

}
