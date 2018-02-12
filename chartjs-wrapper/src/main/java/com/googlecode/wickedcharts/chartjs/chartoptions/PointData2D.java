package com.googlecode.wickedcharts.chartjs.chartoptions;

@SuppressWarnings("serial")
public class PointData2D extends Number{
	
	private Double x;
	private Double y;
	
	public String toString() {
		return new String("{ x: " + x + ", y: " + y +" }"); 
	}
	
	public PointData2D setX(double x) {
		this.x = x;
		return this;
	}
	
	public PointData2D setY(double y) {
		this.y = y;
		return this;
	}
	
	@Override
	public double doubleValue() {
		return 0;
	}

	@Override
	public float floatValue() {
		return 0;
	}

	@Override
	public int intValue() {
		return 0;
	}

	@Override
	public long longValue() {
		return 0;
	}

}
