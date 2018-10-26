package com.bplead.cad.bean.client;

import priv.lee.cad.model.ClientTemporary;

public class CaxaTemporary implements ClientTemporary {

	private static final long serialVersionUID = -2920420379604912729L;
	private String cache;

	public CaxaTemporary() {

	}

	public CaxaTemporary(String cache) {
		this.cache = cache;
	}

	public String getCache() {
		return cache;
	}

	public void setCache(String cache) {
		this.cache = cache;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("CaxaTemporary [cache=");
		builder.append(cache);
		builder.append("]");
		return builder.toString();
	}
}
