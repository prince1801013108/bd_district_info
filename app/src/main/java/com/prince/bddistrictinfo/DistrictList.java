package com.prince.bddistrictinfo;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ScrollView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class DistrictList extends AppCompatActivity implements View.OnClickListener {
    TextView textView;
    ScrollView scrollView;
    String info,match;
    Intent intent;
    Button button,button1,button2,button3,button4,button5,button6,button7,button8,button9,button10,button11,button12;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_district_list);

        textView=findViewById(R.id.districtListTextId);
        scrollView=findViewById(R.id.districtScrollId);
        button=findViewById(R.id.districtListBtnId);
        button1=findViewById(R.id.districtListBtnId1);
        button2=findViewById(R.id.districtListBtnId2);
        button3=findViewById(R.id.districtListBtnId3);
        button4=findViewById(R.id.districtListBtnId4);
        button5=findViewById(R.id.districtListBtnId5);
        button6=findViewById(R.id.districtListBtnId6);
        button7=findViewById(R.id.districtListBtnId7);
        button8=findViewById(R.id.districtListBtnId8);
        button9=findViewById(R.id.districtListBtnId9);
        button10=findViewById(R.id.districtListBtnId10);
        button11=findViewById(R.id.districtListBtnId11);
        button12=findViewById(R.id.districtListBtnId12);

        button.setOnClickListener(this);
        button1.setOnClickListener(this);
        button2.setOnClickListener(this);
        button3.setOnClickListener(this);
        button4.setOnClickListener(this);
        button5.setOnClickListener(this);
        button6.setOnClickListener(this);
        button7.setOnClickListener(this);
        button8.setOnClickListener(this);
        button9.setOnClickListener(this);
        button10.setOnClickListener(this);
        button11.setOnClickListener(this);
        button12.setOnClickListener(this);


        Bundle bundle=getIntent().getExtras();
        info=bundle.getString("division");
        if (bundle!=null){
            divisionInfo(info);
        }


    }

    @SuppressLint("ResourceAsColor")
    public void divisionInfo(String info) {
        match=info;
        if (info.equals("barisal")){
            textView.setText("বরিশাল বিভাগের জেলাগুলির তালিকা");
            button.setText("বরিশাল জেলা");
            button1.setText("ভোলা জেলা");
            button2.setText("বরগুনা জেলা");
            button3.setText("ঝালকাঠি জেলা");
            button4.setText("পটুয়াখালী জেলা");
            button5.setText("পিরোজপুর জেলা");

            button6.setVisibility(View.INVISIBLE);
            button7.setVisibility(View.INVISIBLE);
            button8.setVisibility(View.INVISIBLE);
            button9.setVisibility(View.INVISIBLE);
            button10.setVisibility(View.INVISIBLE);
            button11.setVisibility(View.INVISIBLE);
            button12.setVisibility(View.INVISIBLE);


        }
        if (info.equals("chittagong")){
            textView.setText("চট্টগ্রাম বিভাগের জেলাগুলির তালিকা");
            button.setText("বান্দরবান জেলা");
            button1.setText("চট্টগ্রাম জেলা");
            button2.setText("কক্সবাজার জেলা");
            button3.setText("খাগড়াছড়ি জেলা");
            button4.setText("রাঙামাটি জেলা");
            button5.setText("ফেনী জেলা");
            button6.setText("নোয়াখালী জেলা");
            button7.setText("কুমিল্লা জেলা");
            button8.setText("ব্রাহ্মণবাড়ীয়া জেলা");
            button9.setText("চাঁদপুর জেলা");
            button10.setText("লক্ষ্মীপুর জেলা");

            button11.setVisibility(View.INVISIBLE);
            button12.setVisibility(View.INVISIBLE);
        }
        if (info.equals("dhaka")){
            textView.setText("ঢাকা বিভাগের জেলাগুলির তালিকা");

            button.setText("ঢাকা জেলা");
            button1.setText("টাঙ্গাইল জেলা");
            button2.setText("গাজীপুর জেলা");
            button3.setText("কিশোরগঞ্জ জেলা");
            button4.setText("মানিকগঞ্জ জেলা");
            button5.setText("মুন্সিগঞ্জ জেলা");
            button6.setText("নারায়ণগঞ্জ জেলা");
            button7.setText("নরসিংদী জেলা");
            button8.setText("ফরিদপুর জেলা");
            button9.setText("গোপালগঞ্জ জেলা");
            button10.setText("মাদারীপুর জেলা");
            button11.setText("রাজবাড়ী জেলা");
            button12.setText("শরিয়তপুর জেলা");
        }
        if (info.equals("khulna")){
            textView.setText("খুলনা বিভাগের জেলাগুলির তালিকা");
            button.setText("বাগেরহাট জেলা");
            button1.setText("চুয়াডাঙ্গা জেলা");
            button2.setText("যশোর জেলা");
            button3.setText("ঝিনাইদহ জেলা");
            button4.setText("খুলনা জেলা");
            button5.setText("কুষ্টিয়া জেলা");
            button6.setText("মাগুরা জেলা");
            button7.setText("মেহেরপুর জেলা");
            button8.setText("নড়াইল জেলা");
            button9.setText("সাতক্ষীরা জেলা");
            button10.setVisibility(View.INVISIBLE);
            button11.setVisibility(View.INVISIBLE);
            button12.setVisibility(View.INVISIBLE);
        }
        if (info.equals("mymensing")){
            textView.setText("ময়মনসিংহ বিভাগের জেলাগুলির তালিকা");
            button.setText("ময়মনসিংহ জেলা");
            button1.setText("শেরপুর জেলা");
            button2.setText("জামালপুর জেলা");
            button3.setText("নেত্রকোনা জেলা");

            button4.setVisibility(View.INVISIBLE);
            button5.setVisibility(View.INVISIBLE);
            button6.setVisibility(View.INVISIBLE);
            button7.setVisibility(View.INVISIBLE);
            button8.setVisibility(View.INVISIBLE);
            button9.setVisibility(View.INVISIBLE);
            button10.setVisibility(View.INVISIBLE);
            button11.setVisibility(View.INVISIBLE);
            button12.setVisibility(View.INVISIBLE);
        }
        if (info.equals("rajshahi")){
            textView.setText("রাজশাহী বিভাগের জেলাগুলির তালিকা");
            button.setText("বগুড়া জেলা ");
            button1.setText("পাবনা জেলা");
            button2.setText("রাজশাহী জেলা");
            button3.setText("ঝজয়পুরহাট জেলা");
            button4.setText("চাঁপাইনবাবগঞ্জ জেলা");
            button5.setText("নওগাঁ জেলা");
            button6.setText("নাটোর জেলা");
            button7.setText("সিরাজগঞ্জ জেলা");

            button8.setVisibility(View.INVISIBLE);
            button9.setVisibility(View.INVISIBLE);
            button10.setVisibility(View.INVISIBLE);
            button11.setVisibility(View.INVISIBLE);
            button12.setVisibility(View.INVISIBLE);
        }if (info.equals("rongpur")){
            textView.setText("রংপুর বিভাগের জেলাগুলির তালিকা");
            button.setText("দিনাজপুর জেলা");
            button1.setText("গাইবান্ধা জেলা");
            button2.setText("কুড়িগ্রাম জেলা");
            button3.setText("লালমনিরহাট জেলা");
            button4.setText("নিলফামারী জেলা");
            button5.setText("পঞ্চগড় জেলা");
            button6.setText("রংপুর জেলা");
            button7.setText("ঠাকুরগাঁও জেলা");

            button8.setVisibility(View.INVISIBLE);
            button9.setVisibility(View.INVISIBLE);
            button10.setVisibility(View.INVISIBLE);
            button11.setVisibility(View.INVISIBLE);
            button12.setVisibility(View.INVISIBLE);
        }

        if (info.equals("sylet")){
            textView.setText("সিলেট বিভাগের জেলাগুলির তালিকা");
            button.setText("হবিগঞ্জ জেলা");
            button1.setText("মৌলভীবাজার জেলা");
            button2.setText("সুনামগঞ্জ জেলা");
            button3.setText("সিলেট জেলা");

            button4.setVisibility(View.INVISIBLE);
            button5.setVisibility(View.INVISIBLE);
            button6.setVisibility(View.INVISIBLE);
            button7.setVisibility(View.INVISIBLE);
            button8.setVisibility(View.INVISIBLE);
            button9.setVisibility(View.INVISIBLE);
            button10.setVisibility(View.INVISIBLE);
            button11.setVisibility(View.INVISIBLE);
            button12.setVisibility(View.INVISIBLE);
        }


    }

    @Override
    public void onClick(View v) {
        if (info.equals("barisal")){
            if (v.getId()==R.id.districtListBtnId){
                intent=new Intent(DistrictList.this,EveryDistrictInfo.class);
                intent.putExtra("name","barisal");
                startActivity(intent);
            }
            if (v.getId()==R.id.districtListBtnId1){
                intent=new Intent(DistrictList.this,EveryDistrictInfo.class);
                intent.putExtra("name","bhola");
                startActivity(intent);
            }
            if (v.getId()==R.id.districtListBtnId2){
                intent=new Intent(DistrictList.this,EveryDistrictInfo.class);
                intent.putExtra("name","borguna");
                startActivity(intent);
            }
            if (v.getId()==R.id.districtListBtnId3){
                intent=new Intent(DistrictList.this,EveryDistrictInfo.class);
                intent.putExtra("name","jhalokati");
                startActivity(intent);
            }
            if (v.getId()==R.id.districtListBtnId4){
                intent=new Intent(DistrictList.this,EveryDistrictInfo.class);
                intent.putExtra("name","potuakhali");
                startActivity(intent);
            }
            if (v.getId()==R.id.districtListBtnId5){
                intent=new Intent(DistrictList.this,EveryDistrictInfo.class);
                intent.putExtra("name","pirojpur");
                startActivity(intent);
            }
        }
        if (info.equals("chittagong")){
            if (v.getId()==R.id.districtListBtnId){
                intent=new Intent(DistrictList.this,EveryDistrictInfo.class);
                intent.putExtra("name","district7");
                startActivity(intent);
            }
            if (v.getId()==R.id.districtListBtnId1){
                intent=new Intent(DistrictList.this,EveryDistrictInfo.class);
                intent.putExtra("name","district8");
                startActivity(intent);
            }
            if (v.getId()==R.id.districtListBtnId2){
                intent=new Intent(DistrictList.this,EveryDistrictInfo.class);
                intent.putExtra("name","district9");
                startActivity(intent);
            }
            if (v.getId()==R.id.districtListBtnId3){
                intent=new Intent(DistrictList.this,EveryDistrictInfo.class);
                intent.putExtra("name","district10");
                startActivity(intent);
            }
            if (v.getId()==R.id.districtListBtnId4){
                intent=new Intent(DistrictList.this,EveryDistrictInfo.class);
                intent.putExtra("name","district11");
                startActivity(intent);
            }
            if (v.getId()==R.id.districtListBtnId5){
                intent=new Intent(DistrictList.this,EveryDistrictInfo.class);
                intent.putExtra("name","district12");
                startActivity(intent);
            }
            if (v.getId()==R.id.districtListBtnId6){
                intent=new Intent(DistrictList.this,EveryDistrictInfo.class);
                intent.putExtra("name","district13");
                startActivity(intent);
            }if (v.getId()==R.id.districtListBtnId7){
                intent=new Intent(DistrictList.this,EveryDistrictInfo.class);
                intent.putExtra("name","district14");
                startActivity(intent);
            }if (v.getId()==R.id.districtListBtnId8){
                intent=new Intent(DistrictList.this,EveryDistrictInfo.class);
                intent.putExtra("name","district15");
                startActivity(intent);
            }if (v.getId()==R.id.districtListBtnId9){
                intent=new Intent(DistrictList.this,EveryDistrictInfo.class);
                intent.putExtra("name","district16");
                startActivity(intent);
            }if (v.getId()==R.id.districtListBtnId10){
                intent=new Intent(DistrictList.this,EveryDistrictInfo.class);
                intent.putExtra("name","district17");
                startActivity(intent);
            }
        }
        if (info.equals("dhaka")){
            if (v.getId()==R.id.districtListBtnId){
                intent=new Intent(DistrictList.this,EveryDistrictInfo.class);
                intent.putExtra("name","district18");
                startActivity(intent);
            }
            if (v.getId()==R.id.districtListBtnId1){
                intent=new Intent(DistrictList.this,EveryDistrictInfo.class);
                intent.putExtra("name","district19");
                startActivity(intent);
            }
            if (v.getId()==R.id.districtListBtnId2){
                intent=new Intent(DistrictList.this,EveryDistrictInfo.class);
                intent.putExtra("name","district20");
                startActivity(intent);
            }
            if (v.getId()==R.id.districtListBtnId3){
                intent=new Intent(DistrictList.this,EveryDistrictInfo.class);
                intent.putExtra("name","district21");
                startActivity(intent);
            }
            if (v.getId()==R.id.districtListBtnId4){
                intent=new Intent(DistrictList.this,EveryDistrictInfo.class);
                intent.putExtra("name","district22");
                startActivity(intent);
            }
            if (v.getId()==R.id.districtListBtnId5){
                intent=new Intent(DistrictList.this,EveryDistrictInfo.class);
                intent.putExtra("name","district23");
                startActivity(intent);
            }
            if (v.getId()==R.id.districtListBtnId6){
                intent=new Intent(DistrictList.this,EveryDistrictInfo.class);
                intent.putExtra("name","district24");
                startActivity(intent);
            }if (v.getId()==R.id.districtListBtnId7){
                intent=new Intent(DistrictList.this,EveryDistrictInfo.class);
                intent.putExtra("name","district25");
                startActivity(intent);
            }if (v.getId()==R.id.districtListBtnId8){
                intent=new Intent(DistrictList.this,EveryDistrictInfo.class);
                intent.putExtra("name","district26");
                startActivity(intent);
            }if (v.getId()==R.id.districtListBtnId9){
                intent=new Intent(DistrictList.this,EveryDistrictInfo.class);
                intent.putExtra("name","district27");
                startActivity(intent);
            }if (v.getId()==R.id.districtListBtnId10){
                intent=new Intent(DistrictList.this,EveryDistrictInfo.class);
                intent.putExtra("name","district28");
                startActivity(intent);
            }if (v.getId()==R.id.districtListBtnId11){
                intent=new Intent(DistrictList.this,EveryDistrictInfo.class);
                intent.putExtra("name","district29");
                startActivity(intent);
            }if (v.getId()==R.id.districtListBtnId12){
                intent=new Intent(DistrictList.this,EveryDistrictInfo.class);
                intent.putExtra("name","district30");
                startActivity(intent);
            }
        }
        if (info.equals("khulna")){
            if (v.getId()==R.id.districtListBtnId){
                intent=new Intent(DistrictList.this,EveryDistrictInfo.class);
                intent.putExtra("name","district31");
                startActivity(intent);
            }
            if (v.getId()==R.id.districtListBtnId1){
                intent=new Intent(DistrictList.this,EveryDistrictInfo.class);
                intent.putExtra("name","district32");
                startActivity(intent);
            }
            if (v.getId()==R.id.districtListBtnId2){
                intent=new Intent(DistrictList.this,EveryDistrictInfo.class);
                intent.putExtra("name","district33");
                startActivity(intent);
            }
            if (v.getId()==R.id.districtListBtnId3){
                intent=new Intent(DistrictList.this,EveryDistrictInfo.class);
                intent.putExtra("name","district34");
                startActivity(intent);
            }
            if (v.getId()==R.id.districtListBtnId4){
                intent=new Intent(DistrictList.this,EveryDistrictInfo.class);
                intent.putExtra("name","district35");
                startActivity(intent);
            }
            if (v.getId()==R.id.districtListBtnId5){
                intent=new Intent(DistrictList.this,EveryDistrictInfo.class);
                intent.putExtra("name","district36");
                startActivity(intent);
            }
            if (v.getId()==R.id.districtListBtnId6){
                intent=new Intent(DistrictList.this,EveryDistrictInfo.class);
                intent.putExtra("name","district37");
                startActivity(intent);
            }if (v.getId()==R.id.districtListBtnId7){
                intent=new Intent(DistrictList.this,EveryDistrictInfo.class);
                intent.putExtra("name","district38");
                startActivity(intent);
            }if (v.getId()==R.id.districtListBtnId8){
                intent=new Intent(DistrictList.this,EveryDistrictInfo.class);
                intent.putExtra("name","district39");
                startActivity(intent);
            }if (v.getId()==R.id.districtListBtnId9){
                intent=new Intent(DistrictList.this,EveryDistrictInfo.class);
                intent.putExtra("name","district40");
                startActivity(intent);
            }
        }
        if (info.equals("mymensing")){
            if (v.getId()==R.id.districtListBtnId){
                intent=new Intent(DistrictList.this,EveryDistrictInfo.class);
                intent.putExtra("name","district41");
                startActivity(intent);
            }
            if (v.getId()==R.id.districtListBtnId1){
                intent=new Intent(DistrictList.this,EveryDistrictInfo.class);
                intent.putExtra("name","district42");
                startActivity(intent);
            }
            if (v.getId()==R.id.districtListBtnId2){
                intent=new Intent(DistrictList.this,EveryDistrictInfo.class);
                intent.putExtra("name","district43");
                startActivity(intent);
            }
            if (v.getId()==R.id.districtListBtnId3){
                intent=new Intent(DistrictList.this,EveryDistrictInfo.class);
                intent.putExtra("name","district44");
                startActivity(intent);
            }
        }
        if (info.equals("rajshahi")){
            if (v.getId()==R.id.districtListBtnId){
                intent=new Intent(DistrictList.this,EveryDistrictInfo.class);
                intent.putExtra("name","district45");
                startActivity(intent);
            }
            if (v.getId()==R.id.districtListBtnId1){
                intent=new Intent(DistrictList.this,EveryDistrictInfo.class);
                intent.putExtra("name","district46");
                startActivity(intent);
            }
            if (v.getId()==R.id.districtListBtnId2){
                intent=new Intent(DistrictList.this,EveryDistrictInfo.class);
                intent.putExtra("name","district47");
                startActivity(intent);
            }
            if (v.getId()==R.id.districtListBtnId3){
                intent=new Intent(DistrictList.this,EveryDistrictInfo.class);
                intent.putExtra("name","district48");
                startActivity(intent);
            }
            if (v.getId()==R.id.districtListBtnId4){
                intent=new Intent(DistrictList.this,EveryDistrictInfo.class);
                intent.putExtra("name","district49");
                startActivity(intent);
            }
            if (v.getId()==R.id.districtListBtnId5){
                intent=new Intent(DistrictList.this,EveryDistrictInfo.class);
                intent.putExtra("name","district50");
                startActivity(intent);
            }
            if (v.getId()==R.id.districtListBtnId6){
                intent=new Intent(DistrictList.this,EveryDistrictInfo.class);
                intent.putExtra("name","district51");
                startActivity(intent);
            }if (v.getId()==R.id.districtListBtnId7){
                intent=new Intent(DistrictList.this,EveryDistrictInfo.class);
                intent.putExtra("name","district52");
                startActivity(intent);
            }
        }if (info.equals("rongpur")){
            if (v.getId()==R.id.districtListBtnId){
                intent=new Intent(DistrictList.this,EveryDistrictInfo.class);
                intent.putExtra("name","district53");
                startActivity(intent);
            }
            if (v.getId()==R.id.districtListBtnId1){
                intent=new Intent(DistrictList.this,EveryDistrictInfo.class);
                intent.putExtra("name","district54");
                startActivity(intent);
            }
            if (v.getId()==R.id.districtListBtnId2){
                intent=new Intent(DistrictList.this,EveryDistrictInfo.class);
                intent.putExtra("name","district55");
                startActivity(intent);
            }
            if (v.getId()==R.id.districtListBtnId3){
                intent=new Intent(DistrictList.this,EveryDistrictInfo.class);
                intent.putExtra("name","district56");
                startActivity(intent);
            }
            if (v.getId()==R.id.districtListBtnId4){
                intent=new Intent(DistrictList.this,EveryDistrictInfo.class);
                intent.putExtra("name","district57");
                startActivity(intent);
            }
            if (v.getId()==R.id.districtListBtnId5){
                intent=new Intent(DistrictList.this,EveryDistrictInfo.class);
                intent.putExtra("name","district58");
                startActivity(intent);
            }
            if (v.getId()==R.id.districtListBtnId6){
                intent=new Intent(DistrictList.this,EveryDistrictInfo.class);
                intent.putExtra("name","district59");
                startActivity(intent);
            }if (v.getId()==R.id.districtListBtnId7){
                intent=new Intent(DistrictList.this,EveryDistrictInfo.class);
                intent.putExtra("name","district60");
                startActivity(intent);
            }
        }
        if (info.equals("sylet")) {
            if (v.getId() == R.id.districtListBtnId) {
                intent = new Intent(DistrictList.this, EveryDistrictInfo.class);
                intent.putExtra("name", "district61");
                startActivity(intent);
            }
            if (v.getId() == R.id.districtListBtnId1) {
                intent = new Intent(DistrictList.this, EveryDistrictInfo.class);
                intent.putExtra("name", "district62");
                startActivity(intent);
            }
            if (v.getId() == R.id.districtListBtnId2) {
                intent = new Intent(DistrictList.this, EveryDistrictInfo.class);
                intent.putExtra("name", "district63");
                startActivity(intent);
            }
            if (v.getId() == R.id.districtListBtnId3) {
                intent = new Intent(DistrictList.this, EveryDistrictInfo.class);
                intent.putExtra("name", "district64");
                startActivity(intent);
            }
        }

    }
}
