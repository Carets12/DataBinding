package com.daniel.sierra.databinding;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.daniel.sierra.databinding.databinding.ActivityDataBindingBinding;

/**
 * Created by daniel on 18/02/2018.
 */

/**
 * Clase principal
 */
public class DataBinding extends AppCompatActivity {
    private ActivityDataBindingBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //Creo una vista del layout principal con binding
        binding = DataBindingUtil.setContentView(this, R.layout.activity_data_binding);
        //Añadimos vistaModelo
        binding.setViewModel(new ViewModel());
    }
}
