package com.example.bankbalancechecker;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    ImageView i1,call1,call2,call3,b1,btn,btn2,btn3;
    TextView text1,text2,text3,text4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        btn = findViewById(R.id.idbtn);
        btn2 = findViewById(R.id.idbtn2);
        btn3 = findViewById(R.id.idbtn3);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent myIntent = new Intent(Intent.ACTION_SEND);
                myIntent.setType("text/plain");
                String body = "Your body here";
                String sub = "Your Subject";
                myIntent.putExtra(Intent.EXTRA_SUBJECT,sub);
                myIntent.putExtra(Intent.EXTRA_TEXT,body);
                startActivity(Intent.createChooser(myIntent, "Share Using"));

            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent myIntent = new Intent(Intent.ACTION_SEND);
                myIntent.setType("text/plain");
                String body = "Your body here";
                String sub = "Your Subject";
                myIntent.putExtra(Intent.EXTRA_SUBJECT,sub);
                myIntent.putExtra(Intent.EXTRA_TEXT,body);
                startActivity(Intent.createChooser(myIntent, "Share Using"));

            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent myIntent = new Intent(Intent.ACTION_SEND);
                myIntent.setType("text/plain");
                String body = "Your body here";
                String sub = "Your Subject";
                myIntent.putExtra(Intent.EXTRA_SUBJECT,sub);
                myIntent.putExtra(Intent.EXTRA_TEXT,body);
                startActivity(Intent.createChooser(myIntent, "Share Using"));

            }
        });


//        btn.setOnClickListner(new View.OnClickListner () {

//            @Override
//            protected void onClick(View v){
//                Intent myIntent = new Intent(Intent.ACTION_SEND);
//                myIntent.setType("text/plain");
//                String body = "Your body here";
//                String sub = "Your Subject";
//                myIntent.putExtra(Intent.EXTRA_SUBJECT,sub);
//                myIntent.putExtra(Intent.EXTRA_TEXT,body);
//                startActivity(Intent.createChooser(myIntent, "Share Using"))
//
//            }
//        });

        b1 = findViewById(R.id.back);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        text1 = findViewById(R.id.t1);

        i1 = findViewById(R.id.p1);

        text2 = findViewById(R.id.t2);
        text3 = findViewById(R.id.t3);
        text4 = findViewById(R.id.t4);

        String n = getIntent().getStringExtra("name");
        int pos = getIntent().getIntExtra("pos",0);

       i1.setImageResource(FistActivity1.imgid[pos]);
       text1.setText(FistActivity1.lists[pos]);

        if (pos == 0) {
            String name = getIntent().getStringExtra("lists");
            int imgid = getIntent().getIntExtra("imgid", R.drawable.sbi);


            if(pos==0){

                text2.setText("09223766666");
                text3.setText("09223866666");
                text4.setText("18004253800");
            }

        }


        if (pos == 1) {
            String name = getIntent().getStringExtra("lists");
            int imgid = getIntent().getIntExtra("imgid", R.drawable.bob);


            if(pos==1){

                text2.setText("09223011311");
                text3.setText("5616150");
                text4.setText("18001024455");
            }

        }
        if (pos == 2) {
            String name = getIntent().getStringExtra("lists");
            int imgid = getIntent().getIntExtra("imgid", R.drawable.hdfc);


            if(pos==2){

                text2.setText("18002703333");
                text3.setText("18002703355");
                text4.setText("18004254332");
            }

        }

        if (pos == 3) {
            String name = getIntent().getStringExtra("lists");
            int imgid = getIntent().getIntExtra("imgid", R.drawable.boi);


            if(pos==3){

                text2.setText("09015135135");
                text3.setText("09810558585");
                text4.setText("1800220229");
            }

        }

        if (pos == 4) {
            String name = getIntent().getStringExtra("lists");
            int imgid = getIntent().getIntExtra("imgid", R.drawable.denabank);


            if(pos==4){

                text2.setText("09289356677");
                text3.setText("09278656677");
                text4.setText("18002336427");
            }

        }

        if (pos == 5) {
            String name = getIntent().getStringExtra("lists");
            int imgid = getIntent().getIntExtra("imgid", R.drawable.kotak);


            if(pos==5){

                text2.setText("18002740110");
                text3.setText("5676788");
                text4.setText("18602662666");
            }

        }

        if (pos == 6) {
            String name = getIntent().getStringExtra("lists");
            int imgid = getIntent().getIntExtra("imgid", R.drawable.canarabank);


            if(pos==6){

                text2.setText("09015483483");
                text3.setText("09015734734");
                text4.setText("18004250018");
            }

        }

        if (pos == 7) {
            String name = getIntent().getStringExtra("lists");
            int imgid = getIntent().getIntExtra("imgid", R.drawable.citibank);


            if(pos==7){

                text2.setText("09880752484");
                text3.setText("NO");
                text4.setText("NO");
            }

        }

        if (pos == 8) {
            String name = getIntent().getStringExtra("lists");
            int imgid = getIntent().getIntExtra("imgid", R.drawable.panjabbank);


            if(pos==8){

                text2.setText("5607040");
                text3.setText("56077040");
                text4.setText("18001802222");
            }

        }

        if (pos == 9) {
            String name = getIntent().getStringExtra("lists");
            int imgid = getIntent().getIntExtra("imgid", R.drawable.unionbankofindia);


            if(pos==9){

                text2.setText("09223008586");
                text3.setText("09223008486");
                text4.setText("18002082244");
            }

        }

        if (pos == 10) {
            String name = getIntent().getStringExtra("lists");
            int imgid = getIntent().getIntExtra("imgid", R.drawable.ucobank);


            if(pos==10){

                text2.setText("09278792787");
                text3.setText("09213125125");
                text4.setText("18001030123");
            }

        }

        if (pos == 11) {
            String name = getIntent().getStringExtra("lists");
            int imgid = getIntent().getIntExtra("imgid", R.drawable.vijayabank);


            if(pos==11){

                text2.setText("18002665555");
                text3.setText("18001035535");
                text4.setText("18004255885");
            }

        }
        if (pos == 12) {
            String name = getIntent().getStringExtra("lists");
            int imgid = getIntent().getIntExtra("imgid", R.drawable.hsbcbank);


            if(pos==12){

                text2.setText("18001034722");
                text3.setText("09611124722");
                text4.setText("18001034722");
            }

        }

        if (pos == 13) {
            String name = getIntent().getStringExtra("lists");
            int imgid = getIntent().getIntExtra("imgid", R.drawable.yesbank);


            if(pos==13){

                text2.setText("09840909000");
                text3.setText("09223921111");
                text4.setText("18002000");
            }

        }

        if (pos == 14) {
            String name = getIntent().getStringExtra("lists");
            int imgid = getIntent().getIntExtra("imgid", R.drawable.southindianbank);


            if(pos==14){

                text2.setText("09223008488");
                text3.setText("09840777222");
                text4.setText("18008431800");
            }

        }

        if (pos == 15) {
            String name = getIntent().getStringExtra("lists");
            int imgid = getIntent().getIntExtra("imgid", R.drawable.corporationbank);


            if(pos==15){

                text2.setText("09268892688");
                text3.setText("5667716");
                text4.setText("18004253555");
            }

        }

        if (pos == 16) {
            String name = getIntent().getStringExtra("lists");
            int imgid = getIntent().getIntExtra("imgid", R.drawable.ab);


            if(pos==16){

                text2.setText("09224150150");
                text3.setText("09224150150");
                text4.setText("1800226061");
            }

        }

        if (pos == 17) {
            String name = getIntent().getStringExtra("lists");
            int imgid = getIntent().getIntExtra("imgid", R.drawable.americanexpressbank);


            if(pos==17){

                text2.setText("1800446630");
                text3.setText("NO");
                text4.setText("1800446630");
            }

        }

        if (pos == 18) {
            String name = getIntent().getStringExtra("lists");
            int imgid = getIntent().getIntExtra("imgid", R.drawable.andhrabank);


            if(pos==18){

                text2.setText("09223011300");
                text3.setText("09223173924");
                text4.setText("18004251515");
            }

        }

        if (pos == 19) {
            String name = getIntent().getStringExtra("lists");
            int imgid = getIntent().getIntExtra("imgid", R.drawable.centralbank);


            if(pos==19){

                text2.setText("09222250000");
                text3.setText("09555144441");
                text4.setText("18002001911");
            }

        }

        if (pos == 20) {
            String name = getIntent().getStringExtra("lists");
            int imgid = getIntent().getIntExtra("imgid", R.drawable.indianbank);


            if(pos==20){

                text2.setText("09289592895");
                text3.setText("09444394443");
                text4.setText("180042500000");
            }

        }

        if (pos == 21) {
            String name = getIntent().getStringExtra("lists");
            int imgid = getIntent().getIntExtra("imgid", R.drawable.deutschebank);


            if(pos==21){

                text2.setText("561615");
                text3.setText("561615");
                text4.setText("18001236601");
            }

        }

        if (pos == 22) {
            String name = getIntent().getStringExtra("lists");
            int imgid = getIntent().getIntExtra("imgid", R.drawable.dhanlaxmibank);


            if(pos==22){

                text2.setText("08067747700");
                text3.setText("56161");
                text4.setText("18004251747");
            }

        }

        if (pos == 23) {
            String name = getIntent().getStringExtra("lists");
            int imgid = getIntent().getIntExtra("imgid", R.drawable.unionbankofindia);


            if(pos==23){

                text2.setText("56161");
                text3.setText("56161");
                text4.setText("18003450345");
            }

        }

        if (pos == 24) {
            String name = getIntent().getStringExtra("lists");
            int imgid = getIntent().getIntExtra("imgid", R.drawable.karnatakabank);


            if(pos==24){

                text2.setText("18004251445");
                text3.setText("18004251446");
                text4.setText("18004251444");
            }

        }

        if (pos == 25) {
            String name = getIntent().getStringExtra("lists");
            int imgid = getIntent().getIntExtra("imgid", R.drawable.bikaner);


            if(pos==25){

                text2.setText("09223866666");
                text3.setText("09223866666");
                text4.setText("18001806005");
            }

        }

        if (pos == 26) {
            String name = getIntent().getStringExtra("lists");
            int imgid = getIntent().getIntExtra("imgid", R.drawable.abn);


            if(pos==26){

                text2.setText("1800112224");
                text3.setText("NO");
                text4.setText("1800112224");
            }

        }


        if (pos == 27) {
            String name = getIntent().getStringExtra("lists");
            int imgid = getIntent().getIntExtra("imgid", R.drawable.anzbank);


            if(pos==27){

                text2.setText("18002000269");
                text3.setText("NO");
                text4.setText("18002000269");
            }

        }

        if (pos == 28) {
            String name = getIntent().getStringExtra("lists");
            int imgid = getIntent().getIntExtra("imgid", R.drawable.bhartiyamahilabank);


            if(pos==28){

                text2.setText("09212438888");
                text3.setText("09212438888");
                text4.setText("01147472100");
            }

        }

        if (pos == 29) {
            String name = getIntent().getStringExtra("lists");
            int imgid = getIntent().getIntExtra("imgid", R.drawable.casnet);


            if(pos==29){

                text2.setText("1800225087");
                text3.setText("NO");
                text4.setText("1800225087");
            }

        }

        if (pos == 30) {
            String name = getIntent().getStringExtra("lists");
            int imgid = getIntent().getIntExtra("imgid", R.drawable.taab);


            if(pos==30){

                text2.setText("09211937373");
                text3.setText("NO");
                text4.setText("18004250426");
            }

        }

        if (pos == 31) {
            String name = getIntent().getStringExtra("lists");
            int imgid = getIntent().getIntExtra("imgid", R.drawable.varachabank);


            if(pos==31){

                text2.setText("02614008080");
                text3.setText("NO");
                text4.setText("02614008000");
            }

        }

        if (pos == 32) {
            String name = getIntent().getStringExtra("lists");
            int imgid = getIntent().getIntExtra("imgid", R.drawable.rbc);


            if(pos==32){

                text2.setText("09227148472");
                text3.setText("NO");
                text4.setText("1800112224");
            }

        }


        if (pos == 33) {
            String name = getIntent().getStringExtra("lists");
            int imgid = getIntent().getIntExtra("imgid", R.drawable.sbh);


            if(pos==33){

                text2.setText("09223766666");
                text3.setText("NO");
                text4.setText("18004251825");
            }

        }

        if (pos == 34) {
            String name = getIntent().getStringExtra("lists");
            int imgid = getIntent().getIntExtra("imgid", R.drawable.mysore);


            if(pos==34){

                text2.setText("18004252244");
                text3.setText("NO");
                text4.setText("18004252244");
            }

        }

        if (pos == 35) {
            String name = getIntent().getStringExtra("lists");
            int imgid = getIntent().getIntExtra("imgid", R.drawable.patiala);


            if(pos==35){

                text2.setText("18001802010");
                text3.setText("NO");
                text4.setText("18001802010");
            }

        }

        if (pos == 36) {
            String name = getIntent().getStringExtra("lists");
            int imgid = getIntent().getIntExtra("imgid", R.drawable.travancore);


            if(pos==36){

                text2.setText("09223866666");
                text3.setText("NO");
                text4.setText("18004255566");
            }

        }

        if (pos == 37) {
            String name = getIntent().getStringExtra("lists");
            int imgid = getIntent().getIntExtra("imgid", R.drawable.syndicate);


            if(pos==37){

                text2.setText("09664552255");
                text3.setText("09664552255");
                text4.setText("08026639966");
            }

        }

        if (pos == 38) {
            String name = getIntent().getStringExtra("lists");
            int imgid = getIntent().getIntExtra("imgid", R.drawable.fedralbank);


            if(pos==38){

                text2.setText("8431900900");
                text3.setText("08431600600");
                text4.setText("18004251199");
            }

        }

        if (pos == 39) {
            String name = getIntent().getStringExtra("lists");
            int imgid = getIntent().getIntExtra("imgid", R.drawable.dcb);


            if(pos==39){

                text2.setText("7506660011");
                text3.setText("07506660022");
                text4.setText("18002095363");
            }

        }

        if (pos == 40) {
            String name = getIntent().getStringExtra("lists");
            int imgid = getIntent().getIntExtra("imgid", R.drawable.bankofmaharashtra);


            if(pos==40){

                text2.setText("09222281818");
                text3.setText("09223181818");
                text4.setText("18002334526");
            }

        }

        if (pos == 41) {
            String name = getIntent().getStringExtra("lists");
            int imgid = getIntent().getIntExtra("imgid", R.drawable.laxmivilasbank);


            if(pos==41){

                text2.setText("09282441155");
                text3.setText("09282441155");
                text4.setText("18004252233");
            }

        }

        if (pos == 42) {
            String name = getIntent().getStringExtra("lists");
            int imgid = getIntent().getIntExtra("imgid", R.drawable.induslandbank);


            if(pos==42){

                text2.setText("18002741000");
                text3.setText("09212299955");
                text4.setText("18605005004");
            }

        }

        if (pos == 43) {
            String name = getIntent().getStringExtra("lists");
            int imgid = getIntent().getIntExtra("imgid", R.drawable.indianoverseasbank);


            if(pos==43){

                text2.setText("18004254445");
                text3.setText("NO");
                text4.setText("18004254445");
            }

        }

        if (pos == 44) {
            String name = getIntent().getStringExtra("lists");
            int imgid = getIntent().getIntExtra("imgid", R.drawable.rblbanklogo);


            if(pos==44){

                text2.setText("18004190610");
                text3.setText("09223366333");
                text4.setText("18001238040");
            }

        }

        if (pos == 45) {
            String name = getIntent().getStringExtra("lists");
            int imgid = getIntent().getIntExtra("imgid", R.drawable.bandhanbank);


            if(pos==45){

                text2.setText("18002588181");
                text3.setText("09223008777");
                text4.setText("18002588181");
            }

        }

        call1=findViewById(R.id.call1);
        call2=findViewById(R.id.call2);
        call3=findViewById(R.id.call3);

        call1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String phonenumber = text2.getText().toString();
                Intent intent = new Intent(Intent.ACTION_CALL);
                intent.setData(Uri.parse("tel:"+phonenumber));
                startActivity(intent);

            }
        });

        call2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String phonenumber2 = text3.getText().toString();
                Intent intent = new Intent(Intent.ACTION_CALL);
                intent.setData(Uri.parse("tel:"+phonenumber2));
                startActivity(intent);

            }
        });

        call3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String phonenumber3 = text4.getText().toString();
                Intent intent = new Intent(Intent.ACTION_CALL);
                intent.setData(Uri.parse("tel:"+phonenumber3));
                startActivity(intent);

            }
        });

    }


}