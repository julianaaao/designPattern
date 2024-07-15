package com.headfirst.api.chapter5.enumSingleton;

public enum Singleton {
	UNIQUE_INSTANCE;

	public String getDescription() {
		return "ENUM singleton";
	}
}
