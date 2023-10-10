package com.blc.beans;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Rectangle implements InitializingBean, DisposableBean{
	public int breadth;
	public int length;
	public int area;
	
	public void setBreadth(int breadth) {
		this.breadth = breadth;
	}

	public void setLength(int length) {
		this.length = length;
	}


	public int getArea() {
		return area;
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("afterPropertiesSet()");
		area = length * breadth;
	}

	@Override
	public void destroy() throws Exception {
		System.out.println("destroy()");
		area = 0;
	}

	@Override
	public String toString() {
		return "Rectangle [breadth=" + breadth + ", length=" + length + ", area=" + area + "]";
	}
}
