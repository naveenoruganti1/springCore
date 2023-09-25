package com.cpe.beans;

public class NavigationMap {
	public int longitude;
	public int latitude;

	public int getLongitude() {
		return longitude;
	}
	public void setLongitude(int longitude) {
		this.longitude = longitude;
	}
	public int getLatitude() {
		return latitude;
	}
	public void setLatitude(int latitude) {
		this.latitude = latitude;
	}
	@Override
	public String toString() {
		return "NavigationMap [longitude=" + longitude + ", latitude=" + latitude + "]";
	}
}
