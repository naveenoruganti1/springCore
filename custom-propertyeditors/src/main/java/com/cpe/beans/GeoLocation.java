package com.cpe.beans;

public class GeoLocation {
	public NavigationMap navigationMap;

	public void setNavigationMap(NavigationMap navigationMap) {
		this.navigationMap = navigationMap;
	}

	@Override
	public String toString() {
		return "GeoLocation [navigationMap=" + navigationMap + "]";
	}
}
