package com.mpcz.utility;

import java.sql.Timestamp;

public class DateTimeUtility {

	public static Timestamp getCurrentTimeStamp() {
		return new java.sql.Timestamp(new java.util.Date().getTime());
	}
}
