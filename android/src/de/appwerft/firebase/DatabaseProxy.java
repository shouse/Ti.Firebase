/**
 * This file was auto-generated by the Titanium Module SDK helper for Android
 * Appcelerator Titanium Mobile
 * Copyright (c) 2009-2010 by Appcelerator, Inc. All Rights Reserved.
 * Licensed under the terms of the Apache Public License
 * Please see the LICENSE included with this distribution for details.
 *
 */
package de.appwerft.firebase;

import org.appcelerator.kroll.KrollProxy;
import org.appcelerator.kroll.annotations.Kroll;

import com.google.firebase.database.FirebaseDatabase;

// This proxy can be created by calling Tifirebase.createExample({message: "hello world"})
@Kroll.proxy(creatableInModule = FirebaseModule.class)
public class DatabaseProxy extends KrollProxy {
	FirebaseDatabase database;
	private static final String LCAT = "FiBaProx";
	private KrollProxy proxy;

	public DatabaseProxy(KrollProxy proxy) {
		super();
		this.proxy = proxy;
		this.database = FirebaseDatabase.getInstance();
	}

	@Kroll.method
	public DatabaseReferenceProxy createReference(String ref) {
		DatabaseReferenceProxy databaserefproxy = new DatabaseReferenceProxy(
				this.proxy);
		return databaserefproxy.createReference(this, ref);
	}

}