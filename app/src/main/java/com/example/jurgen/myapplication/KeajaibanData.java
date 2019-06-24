package com.example.jurgen.myapplication;

import java.util.ArrayList;

public class KeajaibanData {
    public static String[][] data = new String[][]{
            {"Christ the Redeemer", "Rio de Janeiro Brasil", "Christ the Redeemer atau Patung Kristus Penebus adalah sebuah Patung Yesus yang berada di atas gunung Corcovado Kota Rio de Janeiro, Brasil. Patung Yesus ini memiliki ketinggian sekitar 38 meter dan memerlukan 5 tahun untuk menyelesaikannya.  Patung Christ the Redeemer atau Patung Kristus Penebus ini diresmikan pada tanggal 12 Oktober 1931 dan merupakan salah satu dari 5 monumen terbaik di dunia ini. Tangan Patung yang terbuka sebagai tanda kehangatan penduduk Brasil dalam menerima para pendatang ataupun wisatawan.", "https://upload.wikimedia.org/wikipedia/commons/thumb/a/a0/Rio_de_Janeiro_Helicoptero_47_Feb_2006.jpg/640px-Rio_de_Janeiro_Helicoptero_47_Feb_2006.jpg"},
            {"The Great Wall of China", "China", "The Great Wall of China atau Tembok Besar China (ada juga yang menyebutnya Tembok Raksasa China) adalah sebuah Tembok besar yang dibangun untuk menghubungkan benteng-benteng pertahanan dengan tujuan untuk  melindungi wilayah China dari penyerangan suku Mongol. Tembok Besar China yang dibangun mulai tahun 722 SM di Zaman Musim Semi Gugur hingga Dinasti Ming pada Tahun 1655 ini merupakan bangunan terbesar sepanjang sejarah peradaban manusia yang membentang di atas gurun, pengunungan dan dataran bagaikan seekor Naga Raksasa. Menurut pengukuran yang dilakukan oleh Badan Survei dan Pemetaan dan Badan Administrasi Warisan Budaya Republik Rakyat China pada tahun 2009, panjang keseluruhan Tembok Besar China adalah 8.850km. Tembok Besar China ini telah dimasukan sebagai Situs Warisan Dunia oleh UNESCO pada tahun 1987 dan merupakan satu-satunya bangunan buatan manusia yang dapat dilihat dari Angkasa luar meskipun masih adanya perdebatan tentang pernyataan ini.", "https://upload.wikimedia.org/wikipedia/commons/thumb/2/23/The_Great_Wall_of_China_at_Jinshanling-edit.jpg/640px-The_Great_Wall_of_China_at_Jinshanling-edit.jpg"},
            {"Machu Picchu", "Peru", "Machu Picchu adalah reruntuhan Inka yang terletak di wilayah lembah penggunungan Urubamba, Peru.   Machu Picchu merupakan sebuah kota yang dibangun pada tahun 1450 oleh kerajaan Inka , tetapi ditinggalkan seratus tahun kemudian ketika Kerajaan Inka ditaklukan oleh bangsa Spanyol. Istilah Machu Picchu jika diterjemahkan langsung ke bahasa Indonesia dapat diartikan menjadi “Gunung Tua”. Situs ini kemudian ditemukan kembali oleh arkeolog Hiram Bingham dari Universitas Yale pada tahun 1911. Machu Pichu termasuk salah satu situs warisan dunia UNESCO pada tahun 1983.", "https://upload.wikimedia.org/wikipedia/commons/thumb/0/01/80_-_Machu_Picchu_-_Juin_2009_-_edit.2.jpg/492px-80_-_Machu_Picchu_-_Juin_2009_-_edit.2.jpg"},
            {"Petra", "Yordania", "Petra adalah sebuah kota yang didirikan dengan ukiran dinding-dinding pada tebing berbatu di Yordania. Kata Petra berasal dari bahasa Yunani yang artinya adalah Batu. Petra merupakan ibukota kerajaan Nabatean yang dibangun oleh Raja Aretas IV pada tahun 9 SM hingga tahun 40 Masehi. Situs ini ditemukan oleh penggelana Swiss yang bernama Johann Ludwig Burckhardt pada tahun 1812. Petra Yordania ini ditetapkan sebagai Warisan Dunia oleh UNESCO pada tanggal 6 Desember 1985. Petra Yordania merupakan simbol dari Teknik dan Perlindungan.", "https://upload.wikimedia.org/wikipedia/commons/thumb/f/f5/Petra_Jordan_BW_21.JPG/302px-Petra_Jordan_BW_21.JPG"},
            {"Pyramid at Chichén Itzá", "Meksiko", "Pyramid at Chichén Itzá adalah sebuah bangunan yang berbentuk Piramida dan dipercayai sebagai pusat kegiatan politik dan ekonomi bangsa Maya yang terletak di Semenanjung Yucatan Meksiko.  Di sekitar Chichen Itza terdapat beberapa bangunan seperti Piramida Kulkucan, Candi Chac Mool, dan bangunan seribu tiang. Chichen Itza yang dibangun sekitar tahun 800 Sebelum Masehi ini ditetapkan sebagai Situs Warisan Dunia oleh UNESCO pada tahun 1988.", "https://upload.wikimedia.org/wikipedia/commons/thumb/5/51/Chichen_Itza_3.jpg/640px-Chichen_Itza_3.jpg"},
            {"Roman Colosseum", "Roma Italia", "Roman Colosseum merupakan sebuah bangunan yang diperuntukkan sebagai tempat penyelenggaran pertunjukan yang spektakuler seperti pertarungan antara binatang, pertarungan antara tahanan dan binatang serta pertarungan gladiator.  Situs Colosseum yang berada di Kota Roma Italia ini dibangun oleh Kaisar Vespasian pada masa Domitianus pada tahun 72 Masehi dan diselesaikan oleh anaknya yang bernama Titus pada tahun 80 Masehi. Colosseum yang berbentuk elips ini juga disebut dengan Flavian Amphitheatre. UNESCO menetapkan Colosseum sebagai Situs Warisan Dunia pada tahun 1980.", "https://upload.wikimedia.org/wikipedia/commons/thumb/5/53/Colosseum_in_Rome%2C_Italy_-_April_2007.jpg/640px-Colosseum_in_Rome%2C_Italy_-_April_2007.jpg"},
            {"Taj Mahal Agra", "India", "Taj Mahal merupakan sebuah Monumen yang didirikan oleh Kaisar Mughal kelima yang bernama Shah Jahan untuk mengenang istri tercintanya Mumtaz Mahal yang wafat saat melahirkan putrinya Gauhara Begum (anak mereka yang ke-14). Monumen yang terletak di Agra India ini merupakan sebuah adi karya arsitektur Mughal yang dibangun pada tahun 1630 dan selesai pada tahun 1653. Taj Mahal ditetapkan sebagai Situs Warisan Dunia oleh UNESCO pada tahun 1983.", "https://upload.wikimedia.org/wikipedia/commons/thumb/1/1d/Taj_Mahal_%28Edited%29.jpeg/640px-Taj_Mahal_%28Edited%29.jpeg"}
    };
    public static ArrayList<Keajaiban> getListData(){
        Keajaiban keajaiban = null;
        ArrayList<Keajaiban> list = new ArrayList<>();
        for (String[] aData : data) {
            keajaiban = new Keajaiban();
            keajaiban.setName(aData[0]);
            keajaiban.setRemarks(aData[1]);
            keajaiban.setDesc(aData[2]);
            keajaiban.setPhoto(aData[3]);

            list.add(keajaiban);
        }

        return list;
    }
}
