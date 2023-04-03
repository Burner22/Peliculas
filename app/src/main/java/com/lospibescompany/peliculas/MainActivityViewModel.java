package com.lospibescompany.peliculas;

import android.app.Application;
import android.content.Context;
import android.content.Intent;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;

import com.lospibescompany.peliculas.Modelo.Pelicula;

import java.util.Arrays;
import java.util.List;

public class MainActivityViewModel extends AndroidViewModel {

    private Context context;
    private Intent intent;
    private MutableLiveData<List<Pelicula>> listaPeliculas= new MutableLiveData<>();

    public MainActivityViewModel(@NonNull Application application) {
        super(application);
        listaPeliculas.setValue(Arrays.asList(
                new Pelicula("Avengers", "Un equipo compuesto por personas extraordinarias, que se encargaba de proteger la Tierra de las amenazas internacionales o alienígenas", "R.drawable.avengers.png", "Joe y Anthony Russo", "R.D. JR, Chris Evans, Jeremy Renner"),
                new Pelicula("Sinsajo", "es una novela de ciencia ficción distópica para jóvenes adultos de 2010 y el tercer libro de la trilogía de Los juegos del Hambre", "R.drawable.sinsajo.png", "Francis Lawrence", "Jenifer Lawrence , Josh Hutchenrson, Julianne Moore"),
                new Pelicula("El Gran Hotel Budapest", "Un conserje y su protegido intentan recuperar una obra de arte", "R.drawable.hotel.png", "Gerald Sullivan","Ralph Fiennes, Bill Murray, Tilda Swinton")
        ));
    }

    public LiveData<List<Pelicula>> getListaPeliculas() {
        return listaPeliculas;
    }

}
