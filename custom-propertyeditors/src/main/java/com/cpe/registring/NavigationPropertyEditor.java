package com.cpe.registring;

import java.beans.PropertyEditorSupport;

import com.cpe.beans.NavigationMap;

public class NavigationPropertyEditor extends PropertyEditorSupport{

	@Override
	public void setAsText(String text) throws IllegalArgumentException {
		String[] navigationArray = text.split(",");
		NavigationMap map = new NavigationMap();
		map.setLatitude(Integer.parseInt(navigationArray[0].toString()));
		map.setLongitude(Integer.parseInt(navigationArray[1].toString()));
		setValue(map);
	}
}
