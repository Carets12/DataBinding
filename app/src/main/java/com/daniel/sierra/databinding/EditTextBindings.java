package com.daniel.sierra.databinding;

import android.databinding.BindingAdapter;
import android.databinding.BindingConversion;
import android.support.design.widget.Snackbar;
import android.widget.EditText;

/**
 * Created by daniel on 18/02/2018.
 */

/*
* Clase que notifica si el texto
* ha sido modificado, si es así
* añade el nuevo valor
*/

public class EditTextBindings
{
    @BindingAdapter({"binding"})
    public static void bindEditText(final EditText view, final ObservableString observableString){

            view.addTextChangedListener(new TextWatcherAdapter(){
                @Override
                public void onTextChanged(CharSequence s, int start, int before, int count) {
                    observableString.set(s.toString());

                    Snackbar.make(view, "EL RESULTADO HA SIDO CAMBIADO", Snackbar.LENGTH_LONG).show();

                }
            });

        String newValue = observableString.get();
        if (!view.getText().toString().equals(newValue))
        {
            view.setText(newValue);
        }
    }

    @BindingConversion
    public static String convertObservableStringToString(ObservableString observableString)
    {
        return observableString.get();
    }
}