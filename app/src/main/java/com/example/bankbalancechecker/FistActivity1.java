package com.example.bankbalancechecker;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

public class FistActivity1 extends AppCompatActivity {

    ListView l1;
    ImageView b1;

    public static String[] lists= {"State Bank of India", "Bank of Baroda", "HDFC Bank", "Bank of India", "Dena Bank", "Kotak Mahindra Bank", "Canara Bank", "Citi Bank", "Punjab National Bank", "Union Bank of India", "UCO Bank", "Vijaya Bank", "HSBC Bank", "Yes Bank", "South Indian Bank", "Corporation Bank", "Allahabad Bank", "American Express", "Andhra Bank", "Central Bank of Inadia", "Indian Bank", "Deutsche Bank", "Dhanlaxmi Bank", "United Bank of India", "Karnataka Bank", "State Bank of Bikaner & Jaipur", "ABN Amro Bank", "ANZ Bank", "Bharatiya Mahila Bank", "Casehnet Bank-Member Bank", "Tamilnad Mercantile Bank", "Varachha Cooperative Bank Limited", "Royal Bank of Scotland", "State Bank of Hyderabad", "State Bank of Mysore", "State Bank of Patiala", "State Bank of Travancore", "Syndicate Bank", "Federal Bank", "DCB Bank", "Bank of Maharashtra", "Lakshmi Vilas Bank", "Induslnd Bank", "Indian Overseas Bank", "RBL Bank", "Bandhan Bank"};

   public static Integer[] imgid = {R.drawable.sbi, R.drawable.bob, R.drawable.hdfc, R.drawable.boi, R.drawable.denabank, R.drawable.kotak, R.drawable.canarabank, R.drawable.citibank, R.drawable.panjabbank, R.drawable.unionbankofindia, R.drawable.ucobank, R.drawable.vijayabank, R.drawable.hsbcbank, R.drawable.yesbank, R.drawable.southindianbank, R.drawable.corporationbank, R.drawable.ab, R.drawable.americanexpressbank, R.drawable.andhrabank, R.drawable.centralbank, R.drawable.indianbank, R.drawable.deutschebank, R.drawable.dhanlaxmibank, R.drawable.unitedbankofindia, R.drawable.karnatakabank, R.drawable.bikaner, R.drawable.abn, R.drawable.anzbank, R.drawable.bhartiyamahilabank, R.drawable.casnet, R.drawable.taab, R.drawable.varachabank, R.drawable.rbc, R.drawable.sbh, R.drawable.mysore, R.drawable.patiala, R.drawable.travancore, R.drawable.syndicate, R.drawable.fedralbank, R.drawable.dcb, R.drawable.bankofmaharashtra, R.drawable.laxmivilasbank, R.drawable.induslandbank, R.drawable.indianoverseasbank, R.drawable.rblbanklogo, R.drawable.bandhanbank};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fist1);

        b1 = findViewById(R.id.back);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        l1=findViewById(R.id.idListView);
        NameAdapter1 adapter = new NameAdapter1();
        l1.setAdapter(adapter);
        l1.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                Intent intent=new Intent(FistActivity1.this,SecondActivity.class);
                intent.putExtra("name",lists[position]);
                intent.putExtra("pos",position);
                startActivity(intent);

            }
        });

    }

    private class NameAdapter1 extends BaseAdapter {
        @Override
        public int getCount() {
            return imgid.length;
        }

        @Override
        public Object getItem(int position) {
            return null;
        }

        @Override
        public long getItemId(int position) {
            return 0;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            View view1=getLayoutInflater().inflate(R.layout.option,null);
            ImageView imageView=view1.findViewById(R.id.l6);
            TextView textView=view1.findViewById(R.id.k1);

            imageView.setImageResource(imgid[position]);
            textView.setText(lists[position]);
            return view1;
        }
    }
}
