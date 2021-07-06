package com.qbo.appkea5materialdesignfragments.datos

import com.qbo.appkea5materialdesignfragments.R
import com.qbo.appkea5materialdesignfragments.model.Android

class DatosAndroid {

    public fun listaVersionesAndroid(): ArrayList<Android>{
        val listAndroid: ArrayList<Android> = ArrayList();
        listAndroid.add(Android(
            listAndroid.size + 1,
            R.drawable.image1,
            "Apple Pie",
            "Android 1.0"
        ))
        listAndroid.add(Android(
            listAndroid.size + 1,
            R.drawable.image2,
            "Banana Bread",
            "Android 1.1"
        ))
        listAndroid.add(Android(
            listAndroid.size + 1,
            R.drawable.image3,
            "Cupcake",
            "Android 1.5"
        ))
        listAndroid.add(Android(
            listAndroid.size + 1,
            R.drawable.image4,
            "Donut",
            "Android 1.6"
        ))
        listAndroid.add(Android(
            listAndroid.size + 1,
            R.drawable.image5,
            "Eclair",
            "Android 2.0 - 2.1"
        ))
        listAndroid.add(Android(
            listAndroid.size + 1,
            R.drawable.image6,
            "Froyo",
            "Android 2.2"
        ))
        listAndroid.add(Android(
            listAndroid.size + 1,
            R.drawable.image7,
            "Gingerbread",
            "Android 2.3"
        ))
        listAndroid.add(Android(
            listAndroid.size + 1,
            R.drawable.image8,
            "Honeycomb",
            "Android 3.0"
        ))
        listAndroid.add(Android(
            listAndroid.size + 1,
            R.drawable.image9,
            "Jelly Bean",
            "Android 4.1 - 4.3"
        ))
        listAndroid.add(Android(
            listAndroid.size + 1,
            R.drawable.image10,
            "Mashmellow",
            "Android 4.5"
        ))
        return listAndroid
    }

}