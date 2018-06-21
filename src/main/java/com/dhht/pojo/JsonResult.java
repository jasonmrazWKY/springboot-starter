package com.dhht.pojo;
/**
 * 自定义封装类
 * 200 ：表示成功
 * 500：表示错误，信息在msg字段中
 * 555：异常信息
 * @author Administrator
 *
 */

import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonResult {
	// 定义jackson对象
	private static final ObjectMapper MAPPER = new ObjectMapper();

	// 响应业务状态
	private Integer status;

	// 响应信息
	private String msg;

	// 响应数据
	private Object data;

	//
	private String ok;

	
	public JsonResult() {
	}

	public JsonResult(Integer status, String msg, Object data) {
		this.status = status;
		this.data = data;
		this.msg = msg;
	}

	public JsonResult(Object data) {
		this.status = 200;
		this.msg = "ok";
		this.data = data;
	}

//	public Boolean isOk() {
//		
//	}
	
	public static JsonResult bulid(Integer status, String msg, Object data) {
		return new JsonResult(status, msg, data);
	}
	
	public static JsonResult errorMsg(String msg) {
		return new JsonResult(500,msg,null);
	}
	
	public static JsonResult errorMap(Object data) {
		return new JsonResult(501,"error",data);
	}
	
	public static JsonResult errorTokenMsg(String msg) {
		return new JsonResult(502,msg,null);
	}
	
	public static JsonResult errorException(String msg) {
		return new JsonResult(555,msg,null);
	}

	public static JsonResult ok(Object data) {
		return new JsonResult(data);
	}
	
	public static JsonResult ok() {
		return new JsonResult(null);
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public Object getData() {
		return data;
	}

	public void setData(Object data) {
		this.data = data;
	}

	public String getOk() {
		return ok;
	}

	public void setOk(String ok) {
		this.ok = ok;
	}
}
