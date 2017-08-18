package com.example.logonpf.notepad.api;

import com.example.logonpf.notepad.model.Nota;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;

public interface NotaAPI {

@GET(value = "/nota/ {titulo}")
    Call<List<Nota>> buscaNota(@Path(value = "titulo") String nota);

    @POST (value = "/nota/")
    Call<Void> salvar(@Body Nota nota);
}
