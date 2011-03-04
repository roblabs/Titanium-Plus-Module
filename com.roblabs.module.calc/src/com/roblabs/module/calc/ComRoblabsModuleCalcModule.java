/**
 * This file was auto-generated by the Titanium Module SDK helper for Android
 * Appcelerator Titanium Mobile
 * Copyright (c) 2009-2010 by Appcelerator, Inc. All Rights Reserved.
 * Licensed under the terms of the Apache Public License
 * Please see the LICENSE included with this distribution for details.
 *
 */
package com.roblabs.module.calc;

import org.appcelerator.kroll.KrollModule;
import org.appcelerator.kroll.annotations.Kroll;

import org.appcelerator.titanium.TiContext;
import org.appcelerator.titanium.util.Log;
import org.appcelerator.titanium.util.TiConfig;

@Kroll.module(name="ComRoblabsModuleCalc", id="com.roblabs.module.calc")
public class ComRoblabsModuleCalcModule extends KrollModule
{

	// Standard Debugging variables
	private static final String LCAT = "ComRoblabsModuleCalcModule";
	private static final boolean DBG = TiConfig.LOGD;

	// You can define constants with @Kroll.constant, for example:
	// @Kroll.constant public static final String EXTERNAL_NAME = value;
	
	public ComRoblabsModuleCalcModule(TiContext tiContext) {
		super(tiContext);
	}

	// Methods
	@Kroll.method
	public String example() {
		Log.d(LCAT, "example called");
		return "hello world";
	}
	
	// Properties
	@Kroll.getProperty
	public String getExampleProp() {
		Log.d(LCAT, "You just called the get method, getExampleProp ");
		return "You just called the get method, getExampleProp";
	}
	
	
	@Kroll.setProperty
	public void setExampleProp(String value) {
		Log.d(LCAT, "set example property: " + value);
	}

}
