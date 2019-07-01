package com.example.lenovo.emargency;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class CardDemoActivity extends AppCompatActivity {


    RecyclerView recyclerView;
    RecyclerView.LayoutManager layoutManager;
    RecyclerView.Adapter adapter;
    String[] images;
    String[] titles;
    String[] details;
    String[] url;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_card_demo);
        // Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        // setSupportActionBar(toolbar);



        recyclerView = (RecyclerView) findViewById(R.id.recycler_view);

        images= new String[] {"Chattogram Metropolitan Hospital Limited",
                "National Hospital Pvt. Ltd.",
                "Chittagong Medical College",
                "Royal Hospital (Pvt.) Limited",
                "Islami Bank Hospital",
                "CSCR (Pvt.) Ltd.",
                "Chittagong Eye Infirmary and Training Complex",
                "Medical Centre"};

        titles= new String[]{"tel:01797-425030",
                "tel:031-623713", "tel:01819-637685",
                "tel: 031-658842", "tel:01731-253990",
                "tel: 031-656565", "tel: 031-659017",
                "tel: 031-651054"};

        details= new String[]{"Address: 698/452 O.R. Nizam Road, Chittagong 4001",
                "Address: 14/15, Dampara Lane, Mehedibug, Chittagong 4000", "Address: 57, K.B. Fazlul Kader road, P.S. Panchlaish, P.O, Chittagong 4203",
                "Address: O.R. Nizam Rd, Chittagong 4001", "Address: 03 Sheikh Mujib Rd, Chittagong",
                "Address: 1675, CSCR Bhaban, O.R. Nizam Road, Chittagong 4000", "Address: Foy's Lake Approach Rd, Chittagong",
                "Address: 953, O.R. Nizam Road, Chittagong"};
        url= new String[]{"https://www.google.com/search?client=firefox-b-ab&q=hospital+in+chittagong&npsic=0&rflfq=1&rldoc=1&rlha=0&rllag=22349972,91816518,2412&tbm=lcl&sa=X&ved=2ahUKEwiWkYrcy9neAhUVdysKHdeyDcYQjGp6BAgAEEA#rlfi=hd:;si:3222943926589520596;mv:!1m2!1d22.3773235!2d91.8408773!2m2!1d22.296381399999998!2d91.7863369",
                "https://www.google.com/search?client=firefox-b-ab&q=hospital+in+chittagong&npsic=0&rflfq=1&rldoc=1&rlha=0&rllag=22349972,91816518,2412&tbm=lcl&sa=X&ved=2ahUKEwiWkYrcy9neAhUVdysKHdeyDcYQjGp6BAgAEEA#rlfi=hd:;si:834767241933094801;mv:!1m2!1d22.3773235!2d91.8408773!2m2!1d22.296381399999998!2d91.7863369",
                "https://www.google.com/search?client=firefox-b-ab&q=hospital+in+chittagong&npsic=0&rflfq=1&rldoc=1&rlha=0&rllag=22349972,91816518,2412&tbm=lcl&sa=X&ved=2ahUKEwiWkYrcy9neAhUVdysKHdeyDcYQjGp6BAgAEEA#rlfi=hd:;si:17986694105358260033;mv:!1m2!1d22.3773235!2d91.8408773!2m2!1d22.296381399999998!2d91.7863369",
                "https://www.google.com/search?client=firefox-b-ab&q=hospital+in+chittagong&npsic=0&rflfq=1&rldoc=1&rlha=0&rllag=22349972,91816518,2412&tbm=lcl&sa=X&ved=2ahUKEwiWkYrcy9neAhUVdysKHdeyDcYQjGp6BAgAEEA#rlfi=hd:;si:12999403543668046325;mv:!1m2!1d22.3895232!2d91.84830830000001!2m2!1d22.278635299999998!2d91.78040899999999;start:20",
                "https://www.google.com/search?client=firefox-b-ab&tbm=lcl&ei=DBPvW-2rNc_69QPN1KnYDg&q=islami+bank+hospital+chittagong&oq=Is&gs_l=psy-ab.1.2.35i39k1l2j0i67k1l8.180621.181114.0.183832.2.2.0.0.0.0.355.493.0j1j0j1.2.0....0...1c.1.64.psy-ab..0.2.491...0j0i131k1.0.OhN4XTcPmLc#rlfi=hd:;si:7061031058635149225;mv:!1m2!1d22.3385747!2d91.81305599999999!2m2!1d22.3211604!2d91.81172319999999",
                "https://www.google.com/search?client=firefox-b-ab&tbm=lcl&ei=DBPvW-2rNc_69QPN1KnYDg&q=cscr+chittagong&oq=csc&gs_l=psy-ab.1.1.0i67k1l5j0l5.8981.9681.0.12001.3.3.0.0.0.0.140.406.0j3.3.0....0...1c.1.64.psy-ab..0.3.405...35i39k1j0i131k1.0.xP_shsJuECc#rlfi=hd:;si:17176804757855455811;mv:!1m2!1d22.363183!2d91.8304928!2m2!1d22.359880699999998!2d91.8274838",
                "https://www.google.com/search?client=firefox-b-ab&tbm=lcl&ei=ARTvW5nHJoK5rQG6m49I&q=Chittagong+Eye+Infirmary+and+Training+Complex&oq=Chittagong+Eye+Infirmary+and+Training+Complex&gs_l=psy-ab.3..35i39k1j0i22i30k1l2j38.32814.33612.0.33933.2.2.0.0.0.0.234.397.0j1j1.2.0....0...1c.2.64.psy-ab..0.2.396...0i20i263k1.0.XcTKtxz-Y_A#rlfi=hd:;si:3686074080527352415;mv:!1m2!1d22.360649277319027!2d91.79598081031592!2m2!1d22.36028932268097!2d91.79559158968408",
                "https://www.google.com/search?client=firefox-b-ab&tbm=lcl&ei=JBTvW7_sIov4rQHUioKoAQ&q=medical+center+chittagong&oq=medica&gs_l=psy-ab.1.2.35i39k1l2j0i67k1l5j0i20i263k1j0l2.32883.38492.0.40897.6.6.0.0.0.0.228.1025.0j5j1.6.0....0...1c.1.64.psy-ab..0.6.1022...0i131k1.0.oPRedDhp10g#rlfi=hd:;si:18039382071267328632;mv:!1m2!1d22.3676864!2d91.8736401!2m2!1d22.261867!2d91.7830455"
        };


        layoutManager= new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        adapter = new RecyclerAdapter(CardDemoActivity.this,images,titles,details,url);
        recyclerView.setAdapter(adapter);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_card_demo, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }


}
