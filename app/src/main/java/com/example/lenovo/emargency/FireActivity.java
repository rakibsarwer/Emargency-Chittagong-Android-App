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

public class FireActivity extends AppCompatActivity {


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

        images= new String[] {"Bangladesh Fire Service and Civil Defense, Agrabad, Chittagong",
                "Chittagong Fire Service & Civil Defence",
                "Fire Service and Civil Defence",
                "Kalurghat Fire Service & Civil Defence Station",
                "Boalkhali Fire Service Station",
                "Bandar Fire Station",
                "Fire Station of Padma Oil Company Limited",
                "Hathazari Fire Service and Civil Defence",

                "Kumira Fire Service Station",
                "Raozan Fire Station"

        };

        titles= new String[]{"tel: 031-630334",
                "tel: 031-683080",
                "tel: 031-619575",
                "tel: 031-670066", "tel: 01620-336666",
                "tel: 03125-20339", "tel: 03125-01096",
                "tel: 03126-01500",

                "tel: 03125-17699", "tel: 01819-156392"


        };

        details= new String[]{

                "Address: dewan Haat, Sheikh Mujib Rd, Chittagong",
                "Address: Bayazid Bostami Road, Chittagong",
                "Address: Nabab Sirajuddullah Road, Chittagong",
                "Address: Ward No 4, C&B More, BFIDC Rd, Chandgaon Thana, Kalurghat, Chittagong",
                "Address: Thana Rd, Boalkhali",
                "Address: Port Internal Rd, Chittagong",
                "Address: Chittagong",
                "Address: Kacari Road, Hathazari",

                "Address: Dhaka - Chittagong Hwy, Kumira",
                "Address: Chittagong - Rangamati Hwy, Raojan"
        };
        url= new String[]
                {
                        "https://www.google.com/search?client=firefox-b-ab&sa=X&biw=1366&bih=654&q=emergency+Fire+service+location+in+chittagong&npsic=0&rflfq=1&rlha=0&rllag=22363637,91798638,3461&tbm=lcl&ved=2ahUKEwi9k5vNj9neAhUI6Y8KHfVlC8YQjGp6BAgAEDk&tbs=lrf:!2m1!1e2!2m1!1e3!3sIAE,lf:1,lf_ui:2&rldoc=1#rlfi=hd:;si:186619225127122324;mv:!1m2!1d22.509903807315066!2d91.9514621925781!2m2!1d22.18665307612083!2d91.3135685158203!4m2!1d22.348372161415664!2d91.6325153541992!5i11",
                        "https://www.google.com/search?client=firefox-b-ab&tbm=lcl&ei=9M3uW8_0CMvOvgTWkq_oAw&q=emergency+Fire+service+location+in+chittagong&oq=emergency+Fire+service+location+in+chittagong&gs_l=psy-ab.3...1074193.1080763.0.1087042.6.6.0.0.0.0.172.954.0j6.6.0....0...1c.1.64.psy-ab..0.1.166...33i10k1.0.fzwHF6X6UPY#rlfi=hd:;si:6286758279383069113;mv:!1m2!1d22.41390241437564!2d91.82877412976075!2m2!1d22.373509185767308!2d91.74903742016602!4m2!1d22.39370726678656!2d91.78890577496338!5i14",
                        "https://www.google.com/search?client=firefox-b-ab&tbm=lcl&ei=9M3uW8_0CMvOvgTWkq_oAw&q=emergency+Fire+service+location+in+chittagong&oq=emergency+Fire+service+location+in+chittagong&gs_l=psy-ab.3...1074193.1080763.0.1087042.6.6.0.0.0.0.172.954.0j6.6.0....0...1c.1.64.psy-ab..0.1.166...33i10k1.0.fzwHF6X6UPY#rlfi=hd:;si:224443418163095757;mv:!1m2!1d22.52391411403934!2d91.97521955605475!2m2!1d22.200695926171512!2d91.33732587929694!4m2!1d22.36239878616751!2d91.65627271767585!5i11",
                        "https://www.google.com/search?client=firefox-b-ab&tbm=lcl&ei=9M3uW8_0CMvOvgTWkq_oAw&q=emergency+Fire+service+location+in+chittagong&oq=emergency+Fire+service+location+in+chittagong&gs_l=psy-ab.3...1074193.1080763.0.1087042.6.6.0.0.0.0.172.954.0j6.6.0....0...1c.1.64.psy-ab..0.1.166...33i10k1.0.fzwHF6X6UPY#rlfi=hd:;si:12670914253094633243;mv:!1m2!1d22.47531659139672!2d91.93244171904303!2m2!1d22.313744702643415!2d91.61349488066412!4m2!1d22.394554115142693!2d91.77296829985357!5i12",
                        "https://www.google.com/search?client=firefox-b-ab&tbm=lcl&ei=9M3uW8_0CMvOvgTWkq_oAw&q=emergency+Fire+service+location+in+chittagong&oq=emergency+Fire+service+location+in+chittagong&gs_l=psy-ab.3...1074193.1080763.0.1087042.6.6.0.0.0.0.172.954.0j6.6.0....0...1c.1.64.psy-ab..0.1.166...33i10k1.0.fzwHF6X6UPY#rlfi=hd:;si:7168793535643538041;mv:!1m2!1d22.42640649140119!2d91.95795623676759!2m2!1d22.345615571170725!2d91.79848281757813!4m2!1d22.386016896558548!2d91.87821952717286!5i13",
                        "https://www.google.com/search?client=firefox-b-ab&tbm=lcl&ei=9M3uW8_0CMvOvgTWkq_oAw&q=emergency+Fire+service+location+in+chittagong&oq=emergency+Fire+service+location+in+chittagong&gs_l=psy-ab.3...1074193.1080763.0.1087042.6.6.0.0.0.0.172.954.0j6.6.0....0...1c.1.64.psy-ab..0.1.166...33i10k1.0.fzwHF6X6UPY#rlfi=hd:;si:9722050180595015671;mv:!1m2!1d22.401258383302096!2d91.87032777353511!2m2!1d22.239600524847337!2d91.5513809351562!4m2!1d22.320452860967215!2d91.71085435434566!5i12",
                        "https://www.google.com/search?client=firefox-b-ab&tbm=lcl&ei=9M3uW8_0CMvOvgTWkq_oAw&q=emergency+Fire+service+location+in+chittagong&oq=emergency+Fire+service+location+in+chittagong&gs_l=psy-ab.3...1074193.1080763.0.1087042.6.6.0.0.0.0.172.954.0j6.6.0....0...1c.1.64.psy-ab..0.1.166...33i10k1.0.fzwHF6X6UPY#rlfi=hd:;si:9899293511883229766;mv:!1m2!1d22.31120958417395!2d91.84506272089845!2m2!1d22.230351903321058!2d91.685589301709!4m2!1d22.270786585192372!2d91.76532601130373!5i13",
                        "https://www.google.com/search?client=firefox-b-ab&sa=X&biw=1366&bih=654&q=emergency+Fire+service+location+in+chittagong&npsic=0&rflfq=1&rlha=0&rllag=22363637,91798638,3461&tbm=lcl&ved=2ahUKEwi3mYPUk9neAhVBs48KHeY0CV4QjGp6BAgEEDk&tbs=lrf:!2m1!1e2!2m1!1e3!3sIAE,lf:1,lf_ui:2&rldoc=1#rlfi=hd:;si:16162894910265935425;mv:!1m2!1d22.67891906620872!2d91.94790295605469!2m2!1d22.356062219683782!2d91.31000927929688!4m2!1d22.517584920466355!2d91.62895611767578!5i11",

                        "https://www.google.com/search?client=firefox-b-ab&sa=X&biw=1366&bih=654&q=emergency+Fire+service+location+in+chittagong&npsic=0&rflfq=1&rlha=0&rllag=22363637,91798638,3461&tbm=lcl&ved=2ahUKEwi3mYPUk9neAhVBs48KHeY0CV4QjGp6BAgEEDk&tbs=lrf:!2m1!1e2!2m1!1e3!3sIAE,lf:1,lf_ui:2&rldoc=1#rlfi=hd:;si:17410684362299069025;mv:!1m2!1d22.613587840398235!2d91.77187837353517!2m2!1d22.452177186029612!2d91.45293153515627!4m2!1d22.532906095236736!2d91.61240495434572!5i12",
                        "https://www.google.com/search?client=firefox-b-ab&sa=X&biw=1366&bih=654&q=emergency+Fire+service+location+in+chittagong&npsic=0&rflfq=1&rlha=0&rllag=22363637,91798638,3461&tbm=lcl&ved=2ahUKEwiHyMfalNneAhWIPo8KHVF-AvMQjGp6BAgCEDk&tbs=lrf:!2m1!1e2!2m1!1e3!3sIAE,lf:1,lf_ui:2&rldoc=1#rlfi=hd:;si:14829991999901749520;mv:!1m2!1d22.70571077510957!2d92.03909041054692!2m2!1d22.382916624767397!2d91.4011967337891!4m2!1d22.544408065581546!2d91.72014357216801!5i11"

                };

        layoutManager= new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        adapter = new RecyclerAdapterFire(FireActivity.this,images,titles,details,url);
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

