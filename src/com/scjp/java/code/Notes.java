package com.scjp.java.code;

public class Notes {

	private String tagName;
	private Long tagId;

	public String getTagName() {
		return tagName;
	}

	public void setTagName(String tagName) {
		this.tagName = tagName;
	}

	public Long getTagId() {
		return tagId;
	}

	public void setTagId(Long tagId) {
		this.tagId = tagId;
	}

	public Notes(String tagName) {
		super();
		this.tagName = tagName;
	}

	public Notes(String tagName, Long tagId) {
		super();
		this.tagName = tagName;
		this.tagId = tagId;
	}

}