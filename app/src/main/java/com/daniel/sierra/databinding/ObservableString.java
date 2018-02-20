package com.daniel.sierra.databinding;

import android.databinding.BaseObservable;

/**
 * Created by daniel on 18/02/2018.
 */

/*
 * Clase que mira constantemente
 * el valor de las variables
 */
public class ObservableString extends BaseObservable {
    private String value;

    public String get() {
        return value != null ? value : "";
    }

    public void set(String value) {
        if (equals(this.value, value) == false) {
            this.value = value;
            notifyChange();
        }
    }
    //Clase que compara dos objetos
    public static boolean equals(Object a, Object b) {
        return (a == null) ? (b == null) : a.equals(b);
    }
}
