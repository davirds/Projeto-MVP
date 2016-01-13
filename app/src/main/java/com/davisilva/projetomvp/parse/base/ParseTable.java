package com.davisilva.projetomvp.parse.base;

import com.parse.ParseObject;
import com.parse.SaveCallback;

import java.util.List;

/**
 * Created by davi.silva on 1/8/16.
 */
public abstract class ParseTable<T> extends ParseObject {

    public abstract void add(T object, SaveCallback callback);

    public abstract void addAll(List<T> object, SaveCallback callback);
}
