package dev.samuelaberra.rest_service.excetion;

import java.time.LocalDateTime;

public class ErrorDetails {
	
	private LocalDateTime timeStamp;
	private String message;
	private String detail;
	
	public ErrorDetails(LocalDateTime timeStamp, String message, String detail) {
		super();
		this.timeStamp = timeStamp;
		this.message = message;
		this.detail = detail;
	}

	public LocalDateTime getTimeStamp() {
		return timeStamp;
	}


	public String getMessage() {
		return message;
	}


	public String getDetail() {
		return detail;
	}


}
