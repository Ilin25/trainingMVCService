package ru;

public abstract class ResponseCollector<R,V> {

	public abstract R makeResponse(V v);

}

