package com.example.tugas5recycleview

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    private lateinit var wisataRecyclerView: RecyclerView
    private lateinit var wisataList: ArrayList<Image>
    private lateinit var wisataAdapter: ImageAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        wisataList = ArrayList()
        wisataList.add(
            Image(R.drawable.danau_love, "Danau Love", "Danau Love atau Danau Imfote " +
                    "salah satu objek wisata yang memukau di Jayapura, Provinsi Papua yang menarik dijelajahi. " +
                    "Telaga Cinta yang menyuguhkan pemandangan yang indah dikelilingi padang savana.")
        )

        wisataList.add(
            Image(R.drawable.danau_sentani, "Danau Sentani", "Danau Sentani ibarat ikon " +
                    "Kota Jayapura yang sudah " + "tenar eksotismenya di kalangan pelancong. " +
                    "Danau Sentani menawarkan suasana damai paripurna yang sangat cocok untuk refreshing " +
                    "dan menghilangkan stres.")
        )

        wisataList.add(
            Image(R.drawable.kali_biru, "Kali Biru", "Papua adalah salah satu provinsi yang berada di " +
                    "paling timur Indonesia. Provinsi ini mempunyai kekayaan dan potensi wisata yang menarik dan alami dan salah " +
                    "satunya yang berlokasi di kota Jayapura, yaitu Kali Genyem. Lokasinya ada di Berab, Nimbokrang, Jayapura, " +
                    "Papua dan sering disebut Kalibiru atau Kali Biru Genyem.")
        )
        wisataList.add(
            Image(R.drawable.bukit3, "Bukit Jokowi", "Bukit Jokowi salah satu objek " +
                    "wisata alam yang populer di Kota Jayapura, Papua. " +
                    "Bukit yang menyuguhkan pemandangan perbukitan hijau, teluk Youtefa.")
        )
        wisataList.add(
            Image(R.drawable.air_terjun_cyclop, "Air Terjun Cyclop", "Jayapura juga memiliki wisata " +
                    "alam berupa air terjun alami, salah satunya Air Terjun Cyclop yang terletak di Pegunungan Cyclop." +
                    " Untuk menuju tempat ini kamu harus siap secara fisik karena akses yang melintasi batuan besar " +
                    "dan tanjakan.")
        )

        wisataList.add(
            Image(R.drawable.jayapuracity, "Jayapura City", "Jayapura City Tower adalah " +
                    "salah satu wisata eksotik di Jayapura. Disini kita dapat menikmati panorama Kota Jayapura" +
                    " dari ketinggian.")
        )
        wisataList.add(
            Image(R.drawable.jembatan_merah, "Jembatan Merah/Youtefa", "Jembatan Youtefa adalah " +
                    "salah satu jembatan di Provinsi Papua yang menghubungkan Holtekamp dengan Hamadi. " +
                    "Jembatan Youtefa memiliki panjang 732 meter dengan lebar 21 meter. " +
                    "Jembatan ini tergolong sebagai jembatan tipe pelengkung baja yang pertama kali dibangun di Papua.")
        )

        wisataList.add(
            Image(R.drawable.pasir6, "Pasir Enam Jayapura", "Pantai yang terletak di Jayapura" +
                    " Utara ini menawarkan panorama pantai dan dunia bawah laut yang  menakjubkan. " +
                    "Tempat ini mungkin belum banyak dikenal kalangan wisatawan, namun justru itu membuatnya masih " +
                    "sangat alami dan terjaga.")
        )

        wisataList.add(
            Image(R.drawable.teletubes, "Bukit Teletubbes", "Bukit Tungkuwiri atau " +
                    "yang lebih dikenal dengan Bukit Teletubbies adalah daerah perbukitan di Kampung Doyo Lama, " +
                    "Distrik Waibu, Kabupaten Jayapura. Sering disebut sebagai Bukit Teletubbies karena bukit yang" +
                    " bersebelahan dengan Danau Sentani di kawasan Pegunungan Cycloop ini, " +
                    "bentuknya hampir sama dengan perbukitan yang ada di serial film anak Teletubbies. ")
        )
        wisataList.add(
            Image(R.drawable.teluk_youtefa, "Teluk Youtefa", "Satu lagi tempat " +
                    "yang menawarkan keindahan alam di Jayapura yaitu Teluk Youtefa yang berada di Abepura. " +
                    "Teluk Youtefa sejatinya merupakan area konservasi sekaligus dibuka untuk objek wisata. " +
                    "Saat air laut surut, bagian teluk akan menampakkan daratan yang bisa kamu gunakan bermain.")
        )

        wisataList.add(
            Image(R.drawable.bukit_salib, "Bukit Salib", "Bukit Salib terletak di daerah Doyo Lama " +
                    "yang berada di ketinggian. Dinamakan Bukit Salib karena terdapat tanda salib berukuran besar " +
                    "di atas bukit tersebut. Di sini pengunjung bisa menikmati kesejukan udara yang segar." +
                    "Bukit Salib juga menjadi spot foto favorit para kalangan muda karena lanskapnya yang sangat indah. Dari atas bukit kamu bisa menyaksikan panorama Danau Sentani, perkampungan penduduk serta padang rerumputan yang hijau menyegarkan mata.")
        )

        wisataRecyclerView = findViewById(R.id.MyRecyclerView)
        wisataRecyclerView.setHasFixedSize(true)
        wisataRecyclerView.layoutManager = LinearLayoutManager(this)

        wisataAdapter = ImageAdapter(wisataList)
        wisataRecyclerView.adapter = wisataAdapter
        wisataAdapter.onItemClick = {
            val intent = Intent(this, DetailActivity::class.java)
            intent.putExtra("wisata", it)
            startActivity(intent)
        }
    }
}