package com.reni.universeitas.ui.university

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.reni.universeitas.R
import com.reni.universeitas.data.ListDataUniversitas
import com.reni.universeitas.data.UniversityAdapter

class UniversityFragment : Fragment() {

    private lateinit var recyclerView: RecyclerView
    private lateinit var universityList:ArrayList<ListDataUniversitas>
    private lateinit var universityAdapter:UniversityAdapter

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_university, container, false)
        recyclerView = view.findViewById(R.id.recycle_view_list_mahasiswa)
        recyclerView.setHasFixedSize(true)
        recyclerView.layoutManager=LinearLayoutManager(requireContext())

        universityList = ArrayList()

        universityList.add(
            ListDataUniversitas(
                "Universitas Indonesia",
                R.drawable.image_ui,
                R.drawable.logo_ui,
                "Jl. Margonda Raya, Pondok Cina, Kec. Beji, Kota Depok, Jawa Barat",
                "Universitas Indonesia adalah kampus modern, komprehensif, terbuka, multi budaya, dan humanis yang mencakup disiplin ilmu yang luas." +
                        "\n" +
                        "UI saat ini secara simultan selalu berusaha menjadi salah satu universitas riset atau institusi akademik terkemuka di dunia. Sebagai universitas riset, upaya-upaya pencapaian tertinggi dalam hal penemuan, pengembangan dan difusi pengetahuan secara regional dan global selalu dilakukan.",
                "Menjadi pusat ilmu pengetahuan, teknologi, dan kebudayaan yang unggul dan berdaya saing, melalui upaya mencerdasakan kehidupan bangsa untuk meningkatkan kesejahteraan masyarakat, sehingga berkontribusi bagi pembangunan masyarakat Indonesia dan dunia",
                "1. Menyediakan akses yang luas dan adil, serta pendidikan dan pengajaran yang berkualitas.\n" +
                        "2. Menyelenggarakan kegiatan Tridharma yang bermutu dan relevan dengan tantangan nasional serta global.\n" +
                        "3. Menciptakan lulusan yang berintelektualitas tinggi, berbudi luhur dan mampu bersaing secara global.\n" +
                        "4. Menciptakan iklim akademik yang mampu mendukung perwujudan visi UI"
                )
        )
        universityList.add(
            ListDataUniversitas(
                "Universitas Gadjah Mada",
                R.drawable.image_ugm,
                R.drawable.logo_ugm,
                "Bulaksumur, Caturtunggal, Kec. Depok, Kab.Sleman, DI Yogyakarta",
                "UGM memiliki jati diri sebagai universitas nasional, universitas perjuangan, universitas pancasila, universitas kerakyatan, dan universitas pusat kebudayaan.\n"+
                        "Universitas Gadjah Mada lahir dari kancah perjuangan revolusi kemerdekaan bangsa Indonesia. Didirikan pada periode awal kemerdekaan, UGM didaulat sebagai Balai Nasional Ilmu Pengetahuan dan Kebudayaan bagi penyelenggaraan pendidikan tinggi nasional.",
                "Universitas Gadjah Mada sebagai pelopor perguruan tinggi nasional berkelas dunia yang unggul dan inovatif, mengabdi kepada kepentingan bangsa dan kemanusiaan dijiwai nilai-nilai budaya bangsa berdasarkan Pancasila.",
                "Menjalankan pendidikan, penelitian, dan pengabdian kepada masyarakat serta pelestarian dan pengembangan ilmu yang unggul dan bermanfaat bagi masyarakat"
            )
        )
        universityList.add(
            ListDataUniversitas(
                "Institut Teknologi Bandung",
                R.drawable.image_itb,
                R.drawable.logo_itb,
                "Jl. Ganesa No.10, Lb. Siliwangi, Kec. Coblong, Kota Bandung, Jawa Barat",
                "Institut Teknologi Bandung (ITB) merupakan sekolah tinggi teknik pertama di Indonesia yang didirikan pada tanggal 2 Maret 1959 di Jawa Barat yang mengemban misi pengabdian ilmu pengetahuan dan teknologi untuk memajukan Indonesia. Lahir dalam suasana penuh dinamika yang dilandasi dengan semangat perjuangan Proklamasi Kemerdekaan, ITB hadir untuk mengoptimalkan pembangunan bangsa yang maju dan bermartabat.",
                "Menjadi Perguruan Tinggi yang unggul, bermartabat, mandiri, dan diakui dunia serta memandu perubahan yang mampu meningkatkan kesejahteraan bangsa Indonesia dan dunia.",
                "Menciptakan, berbagi dan menerapkan ilmu pengetahuan, teknologi, seni dan kemanusiaan serta menghasilkan sumber daya insani yang unggul untuk menjadikan Indonesia dan dunia lebih baik."
                )
            )

        universityAdapter = UniversityAdapter(universityList)
        recyclerView.adapter = universityAdapter

        return view
    }


}