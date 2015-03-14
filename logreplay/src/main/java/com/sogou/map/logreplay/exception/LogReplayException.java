package com.sogou.map.logreplay.exception;

import com.sogou.map.mengine.common.bo.UncheckedApiException;

@SuppressWarnings("serial")
public class LogReplayException extends UncheckedApiException {

	public LogReplayException(int errorId, String errorMsg) {
		super(errorId, errorMsg);
	}
	
	public static NotExistException notExistException(String errorMsg) {
		return new NotExistException(errorMsg);
	}
	
	public static OperationFailedException operationFailedException(String errorMsg) {
		return new OperationFailedException(errorMsg);
	}
	
	public static InvalidParameterException invalidParameterException(String errorMsg) {
		return new InvalidParameterException(errorMsg);
	}
	
	public static UnauthorizedException unauthorizedException(String errorMsg) {
		return new UnauthorizedException(errorMsg);
	}
	
	// ----------------------------------- //
	
	public static class NotExistException extends LogReplayException {
		protected NotExistException(String errorMsg) {
			super(10001, errorMsg);
		}
	}
	
	public static class OperationFailedException extends LogReplayException {
		protected OperationFailedException(String errorMsg) {
			super(10002, errorMsg);
		}
	}
	
	public static class InvalidParameterException extends LogReplayException {
		protected InvalidParameterException(String errorMsg) {
			super(10003, errorMsg);
		}
	}
	
	public static class UnauthorizedException extends LogReplayException {
		protected UnauthorizedException(String errorMsg) {
			super(10004, errorMsg);
		}
	}

}
