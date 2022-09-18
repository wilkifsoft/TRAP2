package com.trap2.shop.dto.response;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Getter;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.HttpClientErrorException;

/**
 *
 * @author Charles
 *
 */
@Setter
@Getter
@Slf4j
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ResponseBase<T> {
	@JsonAlias({"responseCode", "ResponseCode"})
	protected String responseCode;
	@JsonAlias({"responseMessage", "ResponseMessage"})
	protected String responseMessage;
	@JsonAlias({"data", "Data", "info"})
	protected T data;


	@Override
	public String toString() {
		return String.format("ResponseBase{responseCode='%s', responseMessage='%s', data=%s}", responseCode, responseMessage, data);
	}

	public static <T> ResponseBase<T> createErrorResponse(Exception e) {
		if (e instanceof HttpClientErrorException.BadRequest) {
			return createBadRequestResponse();
		} else if (e instanceof HttpClientErrorException.MethodNotAllowed) {
			return createMethodNotAllowResponse(e);
		} else {
			return createServerErrorResponse(e);
		}
	}

	public static <T> ResponseBase<T> createBadRequestResponse() {
		return createResponseBase(HttpStatus.BAD_REQUEST, HttpStatus.BAD_REQUEST.getReasonPhrase());
	}

	public static <T> ResponseBase<T> createMethodNotAllowResponse(Exception ex) {
        return createResponseBase(HttpStatus.METHOD_NOT_ALLOWED, getStackTrace(ex));
	}

	public static <T> ResponseBase<T> createServerErrorResponse(Exception e) {
		return createResponseBase(HttpStatus.INTERNAL_SERVER_ERROR, getStackTrace(e));
	}

	private static String getStackTrace(Exception ex) {
		return ex.getMessage();
	}

	public static HttpStatus getStatusCode(Exception e) {
		if (e instanceof HttpClientErrorException.BadRequest) {
			return HttpStatus.BAD_REQUEST;
		} else if (e instanceof HttpClientErrorException.MethodNotAllowed) {
			return HttpStatus.METHOD_NOT_ALLOWED;
		} else {
			return HttpStatus.INTERNAL_SERVER_ERROR;
		}
	}
	public static <T> ResponseBase<T> createSuccessResponse() {
		return createResponseBase(HttpStatus.OK, HttpStatus.OK.getReasonPhrase());
	}

	public static <I> ResponseEntity<ResponseBase<I>> getResponseException(Exception e) {
		ResponseBase<I> response = ResponseBase.createErrorResponse(e);

		return ResponseEntity.status(ResponseBase.getStatusCode(e)).body(response);
	}

	public static <T> ResponseBase<T> createForbiddenResponse() {
		return createResponseBase(HttpStatus.FORBIDDEN, HttpStatus.FORBIDDEN.getReasonPhrase());
	}

	public static <T> ResponseBase<T> createResponseBase(HttpStatus status, String message)  {
		ResponseBase<T> response = new ResponseBase<>();
		response.setResponseCode(String.valueOf(status.value()));
		response.setResponseMessage(message);

		return response;
	}
}
