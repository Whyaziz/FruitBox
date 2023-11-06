package com.android.fruitbox

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import com.android.fruitbox.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        var adapterBuah = BuahAdapter(generateBuahData()) { buah ->
            val intent = Intent(this@MainActivity, DetailActivity::class.java)
            intent.putExtra("buah_name", buah.name)
            intent.putExtra("buah_description", buah.description)
            intent.putExtra("buah_price", buah.price)
            intent.putExtra("buah_pict", buah.pict)
            startActivity(intent)
        }

        with(binding) {
            rycItem.apply {
                adapter = adapterBuah
                layoutManager = LinearLayoutManager(this@MainActivity)
            }
        }
    }
    fun generateBuahData(): List<Buah> {
        return listOf(
            Buah(name = "Lime", price = "10", pict = R.drawable.jeruknipis, description = "Lime adalah buah kecil berwarna hijau yang memiliki rasa asam segar. Biasanya digunakan untuk memberi rasa pada makanan dan minuman."),
            Buah(name = "Cucumber", price = "15", pict = R.drawable.timunsuri, description = "Timun adalah buah yang biasanya digunakan dalam salad dan memiliki rasa segar dan renyah."),
            Buah(name = "Salak", price = "12", pict = R.drawable.salak, description = "Salak adalah buah eksotis dengan kulit berkerut yang harus dikupas. Dagingnya manis dan sedikit berair."),
            Buah(name = "Starfruit", price = "18", pict = R.drawable.starfruit, description = "Starfruit, juga dikenal sebagai belimbing, memiliki bentuk bintang dan rasa manis dengan rasa asam yang ringan."),
            Buah(name = "Dragon Fruit", price = "22", pict = R.drawable.dragonfruit, description = "Dragon fruit memiliki kulit berduri dengan daging berwarna putih atau merah. Rasanya manis dan segar."),
            Buah(name = "Watermelon", price = "25", pict = R.drawable.watermelon, description = "Semangka adalah buah musim panas yang besar, berwarna merah dengan daging merah yang manis dan berair."),
            Buah(name = "Apple", price = "20", pict = R.drawable.apple, description = "Apel adalah buah yang sangat umum dan memiliki rasa manis atau asam tergantung pada jenisnya."),
            Buah(name = "Blueberry", price = "30", pict = R.drawable.blueberry, description = "Blueberry adalah buah kecil berwarna biru yang kaya akan antioksidan dan memiliki rasa manis."),
            Buah(name = "Melon", price = "18", pict = R.drawable.melon, description = "Melon adalah buah yang memiliki daging oranye atau hijau dengan rasa manis dan segar."),
            Buah(name = "Mango", price = "15", pict = R.drawable.mangga, description = "Mangga adalah buah tropis yang manis dan berair, sering digunakan dalam hidangan penutup."),
            Buah(name = "Guava", price = "14", pict = R.drawable.jambu, description = "Jambu adalah buah yang berkulit tipis dengan daging merah atau putih yang beraroma dan berdaging."),
            Buah(name = "Durian", price = "40", pict = R.drawable.durian, description = "Durian adalah buah yang memiliki bau yang kuat dan rasa yang kuat. Disukai oleh beberapa orang, tetapi tidak semua."),
            Buah(name = "Kiwi", price = "28", pict = R.drawable.kiwi, description = "Kiwi adalah buah kecil berkulit berbulu dengan daging hijau yang manis dan asam."),
            Buah(name = "Mangosteen", price = "22", pict = R.drawable.manggis, description = "Manggis adalah buah eksotis dengan kulit tebal dan daging putih yang manis."),
            Buah(name = "Peach", price = "26", pict = R.drawable.peach, description = "Peach adalah buah dengan kulit halus dan daging yang sangat manis."),
            Buah(name = "Raspberry", price = "30", pict = R.drawable.rasberry, description = "Raspberry adalah buah kecil berwarna merah yang memiliki rasa manis dan asam."),
            Buah(name = "Grapes", price = "15", pict = R.drawable.anggur, description = "Anggur adalah buah berbentuk bola yang tersedia dalam berbagai varietas dengan rasa manis."),
            Buah(name = "Strawberry", price = "28", pict = R.drawable.strawberry, description = "Strawberry adalah buah merah manis yang sering digunakan dalam hidangan pencuci mulut."),
            Buah(name = "Lemon", price = "10", pict = R.drawable.lemon, description = "Lemon adalah buah berwarna kuning dengan rasa asam yang kuat, sering digunakan dalam minuman dan hidangan."),
            Buah(name = "Pineapple", price = "14", pict = R.drawable.nanas, description = "Nanas adalah buah tropis dengan rasa manis dan asam, sering digunakan dalam salad dan hidangan lainnya."),
            Buah(name = "Banana", price = "12", pict = R.drawable.pisang, description = "Pisang adalah buah yang sangat umum dengan kulit kuning dan daging manis."),
            Buah(name = "Orange", price = "10", pict = R.drawable.jeruk, description = "Jeruk adalah buah berkulit tebal berwarna oranye dengan rasa manis dan asam."),
            Buah(name = "Avocado", price = "18", pict = R.drawable.alpukat, description = "Alpukat adalah buah yang berkulit hijau dengan daging lembut dan kaya lemak."),
            Buah(name = "Pear", price = "22", pict = R.drawable.pear, description = "Pir adalah buah dengan kulit tipis dan daging manis yang sering digunakan dalam salad dan hidangan pencuci mulut."),
            Buah(name = "Cherry", price = "24", pict = R.drawable.cherry, description = "Cherry adalah buah kecil berwarna merah yang memiliki rasa manis dan asam.")
        )
    }


}