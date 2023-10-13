package com.mrplcr.beans;

import java.lang.reflect.Method;
import java.util.Arrays;

import org.springframework.beans.factory.support.MethodReplacer;

public class PlanFinderReplacer implements MethodReplacer{

	@Override
	public Object reimplement(Object obj, Method method, Object[] args) throws Throwable {
		if(method.getName().equals("planFinder")) {
			String ageGroup = (String) args[0];
			int copay = (int) args[1];
			String planType = (String) args[2];
			boolean cashless = (boolean) args[3];
			
			System.out.println("reimplement: ageGroup"+ageGroup+ " copay "+copay+" planType "+planType
					+" cashless "+cashless);
			return Arrays.asList("plan3","plan4");
		}
		return null;
	}
}
