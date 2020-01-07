package com.example.listviewproyecto_imagen.models;

import java.util.ArrayList;

public class products {

    public String imagen;
    public String name;
    public String cantidad;


    public products(String _imagen,String _name, String _cant){
        this.imagen = _imagen;
        this.name = _name;
        this.cantidad = _cant;


    }

    public String toString(){
        return this.name;
    }


    //datos ficticios
    public  static ArrayList<products> getData(){
        ArrayList<products> products = new ArrayList<>();
        products.add(new products("https://comidasperuanas.net/wp-content/uploads/2016/11/Arroz-Chaufa.jpg",
                                    "Chaufa de Pollo",
                                    "3"));

        products.add(new products("https://lomosaltado.org/wp-content/uploads/2017/12/02.-tallarin-saltado.jpg",
                                    "Tallarin de Pollo",
                                    "3"));

        products.add(new products("https://i.pinimg.com/originals/84/f4/3f/84f43f3d5242bc6128a518fc4c9582be.jpg",
                                    "Chaufa de Piña",
                                    "3"));

        return products;
    }
    public String getSmallImage(){
        return this.imagen;
    }
}

