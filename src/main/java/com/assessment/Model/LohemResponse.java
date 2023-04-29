package com.assessment.Model;

import lombok.Data;

@Data
public class LohemResponse<T> {

	private int status;
	private String message;
	private T data;

}
