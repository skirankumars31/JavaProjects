package com.lemontree;

public class Time {
	
	int hr;
	int min;
	
	
	public Time(int hr, int min) {
		super();
		this.hr = hr;
		this.min = min;
	}
	
	public Time newTime(int hr)
	{
		/* This makes it normal - change the current object
		 * this.hr = hr;
		return this;*/
//		This line makes it immutable
		return new Time(hr, min);
	}
	
	public int getHr() {
		return hr;
	}
	public void setHr(int hr) {
		this.hr = hr;
	}
	public int getMin() {
		return min;
	}
	public void setMin(int min) {
		this.min = min;
	}

}
