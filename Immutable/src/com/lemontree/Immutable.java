package com.lemontree;

public class Immutable {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Time clock = new Time(5,35);
		clock.newTime(9);
		System.out.println(clock.getHr());
	}
}
