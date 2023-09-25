package com.cpe.registring;

import org.springframework.beans.PropertyEditorRegistrar;
import org.springframework.beans.PropertyEditorRegistry;

import com.cpe.beans.GeoLocation;
import com.cpe.beans.NavigationMap;

public class NavigationPropertyRegistarer implements PropertyEditorRegistrar{

	@Override
	public void registerCustomEditors(PropertyEditorRegistry registry) {
		registry.registerCustomEditor(NavigationMap.class, new NavigationPropertyEditor());
	}
}
