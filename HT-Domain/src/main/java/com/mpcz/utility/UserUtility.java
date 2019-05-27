package com.mpcz.utility;

import java.sql.Timestamp;
import java.util.Objects;

import com.mpcz.domain.User;

public class UserUtility {

	public static User getUserRecordUpdateDetail(final User user) {
		Timestamp currentDate=DateTimeUtility.getCurrentTimeStamp();
		if(Objects.isNull(currentDate))
			return null;
		else {
			user.setCreated(currentDate);
			user.setUpdated(currentDate);
		}		
		user.setCreatedBy(1L);		
		user.setUpdatedBy(1L);
		return user;

	}
}
