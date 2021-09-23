package com.quest.exceptionhandling;
import java.util.Date;

import org.springframework.web.bind.annotation.ControllerAdvice;
@ControllerAdvice
public class ErrorException {

		private Date timestamp;
		private String message;
		private String details;

		public ErrorException(Date timestamp, String message, String details) {
			super();
			this.timestamp = timestamp;
			this.message = message;
			this.details = details;
		}

		public Date getTimestamp() {
			return timestamp;
		}

		public String getMessage() {
			return message;
		}

		public String getDetails() {
			return details;
		}
	}

