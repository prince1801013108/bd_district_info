package com.prince.bddistrictinfo;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.ScrollView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class EveryDistrictInfo extends AppCompatActivity {
    ImageView imageView;
    TextView textView;
    ScrollView scrollView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.every_district_info);

        imageView=findViewById(R.id.districtMapId);
        textView=findViewById(R.id.districtInfoTextId);
        scrollView=findViewById(R.id.scrollViewZoom);

        Bundle bundle=getIntent().getExtras();
        String name=bundle.getString("name");
        if (bundle!=null){
            districtInfo(name);
        }

    }

    public void districtInfo(String name) {
        if(name.equals("barisal")){
            imageView.setImageResource(R.drawable.barisalmap);
            textView.setText(R.string.barisalInfo);
        }
        if(name.equals("bhola")){
            imageView.setImageResource(R.drawable.bholamap);
            textView.setText(R.string.bholaInfo);
        }
        if(name.equals("borguna")){
            imageView.setImageResource(R.drawable.bogramap);
            textView.setText(R.string.borgunaInfo);
        }
        if(name.equals("jhalokati")){
            imageView.setImageResource(R.drawable.jhalokathimap);
            textView.setText(R.string.jhalokatiInfo);
        }
        if(name.equals("potuakhali")){
            imageView.setImageResource(R.drawable.patuakhalimap);
            textView.setText(R.string.potuakhaliInfo);
        }
        if(name.equals("pirojpur")){
            imageView.setImageResource(R.drawable.perojpurmap);
            textView.setText(R.string.pirogpurInfo);}




        if(name.equals("district7")){
            imageView.setImageResource(R.drawable.bandarbanmap);
            textView.setText(R.string.bandarbanInfo);
        }if(name.equals("district8")){
            imageView.setImageResource(R.drawable.chittagongmap);
            textView.setText(R.string.chittagonInfo);
        }if(name.equals("district9")){
            imageView.setImageResource(R.drawable.coxbazarmap);
            textView.setText(R.string.coxBazarInfo);
        }if(name.equals("district10")){
            imageView.setImageResource(R.drawable.khagracharimap);
            textView.setText(R.string.khagrachoriInfo);
        }if(name.equals("district11")){
            imageView.setImageResource(R.drawable.rangamatimap);
            textView.setText(R.string.rangamatiInfo);
        }if(name.equals("district12")){
            imageView.setImageResource(R.drawable.fenimap);
            textView.setText(R.string.feniInfo);
        }if(name.equals("district13")){
            imageView.setImageResource(R.drawable.noakhalimap);
            textView.setText(R.string.noyakhaliInfo);
        }if(name.equals("district14")){
            imageView.setImageResource(R.drawable.comillamap);
            textView.setText(R.string.cumillaInfo);
        }if(name.equals("district15")){
            imageView.setImageResource(R.drawable.bbariamap);
            textView.setText(R.string.bbariInfo);
        }if(name.equals("district16")){
            imageView.setImageResource(R.drawable.chandpurmap);
            textView.setText(R.string.chadpurInfo);
        }
        if(name.equals("district17")){
            imageView.setImageResource(R.drawable.laxmipurmap);
            textView.setText(R.string.laxmipurInfo);
        }



        if(name.equals("district18")){
            imageView.setImageResource(R.drawable.dhakamap);
            textView.setText(R.string.pirogpurInfo);
        }if(name.equals("district19")){
            imageView.setImageResource(R.drawable.tangailmap);
            textView.setText(R.string.pirogpurInfo);
        }if(name.equals("district20")){
            imageView.setImageResource(R.drawable.gazipurmap);
            textView.setText(R.string.pirogpurInfo);
        }if(name.equals("district21")){
            imageView.setImageResource(R.drawable.kishoreganjmap);
            textView.setText(R.string.pirogpurInfo);
        }if(name.equals("district22")){
            imageView.setImageResource(R.drawable.manikganjmap);
            textView.setText(R.string.pirogpurInfo);
        }if(name.equals("district23")){
            imageView.setImageResource(R.drawable.munshiganjmap);
            textView.setText(R.string.pirogpurInfo);
        }if(name.equals("district24")){
            imageView.setImageResource(R.drawable.narayanganjmap);
            textView.setText(R.string.pirogpurInfo);
        }if(name.equals("district25")){
            imageView.setImageResource(R.drawable.narshingdimap);
            textView.setText(R.string.pirogpurInfo);
        }if(name.equals("district26")){
            imageView.setImageResource(R.drawable.faridpurmap);
            textView.setText(R.string.pirogpurInfo);
        }if(name.equals("district27")){
            imageView.setImageResource(R.drawable.gopalganjmap);
            textView.setText(R.string.pirogpurInfo);
        }
        if(name.equals("district28")){
            imageView.setImageResource(R.drawable.madaripurmap);
            textView.setText(R.string.pirogpurInfo);
        }
        if(name.equals("district29")){
            imageView.setImageResource(R.drawable.rajbarimap);
            textView.setText(R.string.pirogpurInfo);
        }
        if(name.equals("district30")){
            imageView.setImageResource(R.drawable.laxmipurmap);
            textView.setText(R.string.pirogpurInfo);
        }


        if(name.equals("district31")){
            imageView.setImageResource(R.drawable.bagerhatmap);
            textView.setText(R.string.pirogpurInfo);
        }if(name.equals("district32")){
            imageView.setImageResource(R.drawable.chuadangamap);
            textView.setText(R.string.pirogpurInfo);
        }if(name.equals("district33")){
            imageView.setImageResource(R.drawable.jessoremap);
            textView.setText(R.string.pirogpurInfo);
        }if(name.equals("district34")){
            imageView.setImageResource(R.drawable.jhenaidahmap);
            textView.setText(R.string.pirogpurInfo);
        }if(name.equals("district35")){
            imageView.setImageResource(R.drawable.khulnaicon);
            textView.setText(R.string.pirogpurInfo);
        }if(name.equals("district36")){
            imageView.setImageResource(R.drawable.kushtiamap);
            textView.setText(R.string.pirogpurInfo);
        }if(name.equals("district37")){
            imageView.setImageResource(R.drawable.maguramap);
            textView.setText(R.string.pirogpurInfo);
        }
        if(name.equals("district38")){
            imageView.setImageResource(R.drawable.meherpurmap);
            textView.setText(R.string.pirogpurInfo);
        }
        if(name.equals("district39")){
            imageView.setImageResource(R.drawable.narailmap);
            textView.setText(R.string.pirogpurInfo);
        }
        if(name.equals("district40")){
            imageView.setImageResource(R.drawable.satkhiramap);
            textView.setText(R.string.pirogpurInfo);
        }


        if(name.equals("district41")){
            imageView.setImageResource(R.drawable.mymensinghmap);
            textView.setText(R.string.pirogpurInfo);
        }
        if(name.equals("district42")){
           // imageView.setImageResource(R.drawable.);
            //textView.setText(R.string.pirogpurInfo);
        }
        if(name.equals("district43")){
            imageView.setImageResource(R.drawable.jamalpurmap);
            textView.setText(R.string.pirogpurInfo);
        }
        if(name.equals("district44")){
            imageView.setImageResource(R.drawable.netrokonamap);
            textView.setText(R.string.pirogpurInfo);
        }


        if(name.equals("district45")){
            imageView.setImageResource(R.drawable.bogramap);
            textView.setText(R.string.pirogpurInfo);
        }if(name.equals("district46")){
            imageView.setImageResource(R.drawable.pabnamap);
            textView.setText(R.string.pirogpurInfo);
        }if(name.equals("district47")){
            imageView.setImageResource(R.drawable.rajshahimap);
            textView.setText(R.string.pirogpurInfo);
        }if(name.equals("district48")){
            imageView.setImageResource(R.drawable.joypurhatmap);
            textView.setText(R.string.pirogpurInfo);
        }if(name.equals("district49")){
            //imageView.setImageResource(R.drawable.c);
            //textView.setText(R.string.pirogpurInfo);
        }if(name.equals("district50")){
            imageView.setImageResource(R.drawable.naogaonmap);
            textView.setText(R.string.pirogpurInfo);
        }if(name.equals("district51")){
            imageView.setImageResource(R.drawable.natoremap);
            textView.setText(R.string.pirogpurInfo);
        }
        if(name.equals("district52")){
            imageView.setImageResource(R.drawable.serajganjmap);
            textView.setText(R.string.pirogpurInfo);
        }

        if(name.equals("district53")){
            imageView.setImageResource(R.drawable.dinajpurmap);
            textView.setText(R.string.pirogpurInfo);
        }if(name.equals("district54")){
            imageView.setImageResource(R.drawable.gaibandhamap);
            textView.setText(R.string.pirogpurInfo);
        }if(name.equals("district55")){
            imageView.setImageResource(R.drawable.kurigrammap);
            textView.setText(R.string.pirogpurInfo);
        }if(name.equals("district56")){
            imageView.setImageResource(R.drawable.lalmonirhatmap);
            textView.setText(R.string.pirogpurInfo);
        }if(name.equals("district57")){
            imageView.setImageResource(R.drawable.nilphamarimap);
            textView.setText(R.string.pirogpurInfo);
        }if(name.equals("district58")){
            imageView.setImageResource(R.drawable.panchagarhmap);
            textView.setText(R.string.pirogpurInfo);
        }if(name.equals("district59")){
            imageView.setImageResource(R.drawable.rangpurmap);
            textView.setText(R.string.pirogpurInfo);
        }
        if(name.equals("district60")){
            imageView.setImageResource(R.drawable.thakurgaonmap);
            textView.setText(R.string.pirogpurInfo);
        }


        if(name.equals("district61")){
            imageView.setImageResource(R.drawable.habiganjmap);
            textView.setText(R.string.pirogpurInfo);
        }if(name.equals("district62")){
            imageView.setImageResource(R.drawable.moulvibazarmap);
            textView.setText(R.string.pirogpurInfo);
        }if(name.equals("district63")){
            imageView.setImageResource(R.drawable.sunamganjmap);
            textView.setText(R.string.pirogpurInfo);
        }
        if(name.equals("district64")){
            imageView.setImageResource(R.drawable.sylhetmap);
            textView.setText(R.string.pirogpurInfo);
        }


    }
}
