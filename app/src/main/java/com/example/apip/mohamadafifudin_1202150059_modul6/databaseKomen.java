package com.example.apip.mohamadafifudin_1202150059_modul6;

import com.google.firebase.database.IgnoreExtraProperties;


@IgnoreExtraProperties
public class databaseKomen {
    String sikomen, komen, fotokomen;

    public databaseKomen(){

    }
    public databaseKomen(String sikomen, String komen, String fotokomen){
        this.sikomen = sikomen;
        this.komen = komen;
        this.fotokomen = fotokomen;
    }

    public String getSikomen() {
        return sikomen;
    }

    public String getKomen() {
        return komen;
    }

    public String getFotokomen() {
        return fotokomen;
    }
}
