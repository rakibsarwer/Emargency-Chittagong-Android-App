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

public class PoliceActivity extends AppCompatActivity {


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

        images= new String[] {"Bandar Police Station",

                "Chawkbazar Police Station",
                "Kotwali Police Station",
                "Panchlaish Model Police Station",
                "Akbar Shah Police Station",
                "EPZ Police Station",
                "Bayazid Bostami Police Station ",
                "Pahartali Police Station",
                "Halishahar Police Station",

                "Office of the Deputy Police Commissioner (Port)",
                "Sadarghat Thana",

                "City Gate Police Box",
                "Sadarghat Police Station",


                "Patenga Model Thana",

                "Alongkar Police Box",
                "Pahartali Police Outpost",
                "Police Station",
                "Bahaddarhat Police Box",
                "Police Bit",
                "Airport Police Fari",
                "Chandgaon Thana",
                "dewandhighirpar"

        };

        titles= new String[]{"tel: 031-722240",

                "tel: 03128-60133",
                "tel: 031-619922",
                "tel: 031-652797",
                "tel: 03127-73855",
                "tel: 031-741100",
                "tel: 01713-373262",
                "tel: 031-751335",
                "tel: 031-715790",
                "tel: 03125-14281",
                "tel: 031-631414",
                "tel: 01739-715093",
                "tel: 031-631414",


                "tel: 03125-00026",

                "tel: 031-740213",
                "tel: 01820-809947",
                "tel: 01713-658951",
                "tel: 031-654879",
                "tel: 01817-639262",

                "tel: 01769-724154",
                "tel: 03125-51313",
                "tel: 031-715782"
        };

        details= new String[]{"Address: Chittagong",
                "Address: Lal Chand Road, Chawk Bazar, Chittagong 4003",
                "Address: Abdur Rahman Road, Chittagong 4300",
                "Address: O.R. Nizam Rd, Chittagong 4203",
                "Address: Block C, Khulsi, Chittagong 4207",
                "Address: M. A Aziz Road, Chittagong 4218",
                "Address: Baizid Thana road, Chittagong 4210",
                "Address: থানা রোড, Chittagongc",
                "Address: Block B, Lane No. 6, ডাক্তার জাহাঙ্গীর কবির সড়ক, Chittagong",
                "Address: Agrabad Access Rd, Chittagong",
                "Address: Address: Strand Road, Chittagong 4000",
                "Address: Dhaka - Chittagong Highway, Chittagong 4217",
                "Address: Strand Road, Chittagong 4000",


                "Address: Chittagong",
                "Address: Dhaka - Chittagong Highway, Near Alankar Circle, Chittagong 4217",
                "Address: Shahid Ln, Chittagong",
                "Address: চট্রগ্রাম - রাঙামাটি-খাগড়াছড়ি মহাসড়ক, Chittagong",
                "Address: N1, Chittagong 4212",
                "Address: Chittagong",
                "Address: Chittagong",
                "Address: Chittagong",
                "Address: ঢাকা ট্রাঙ্ক রোড, Chittagong"
               };
        url= new String[]

                        {"https://www.google.com/search?client=firefox-b-ab&q=police+station+in+chittagong&npsic=0&rflfq=1&rlha=0&rllag=22335753,91821174,3037&tbm=lcl&ved=2ahUKEwiF55DbjdneAhXFLI8KHXDUAScQjGp6BAgFEB4&tbs=lrf:!2m1!1e16!3sIAE,lf:1,lf_ui:3&rldoc=1#rldoc=1&rlfi=hd:;si:12608248060549920139;mv:!1m2!1d22.427377658658475!2d91.92968667343757!2m2!1d22.213951603611907!2d91.49504006699226!4m2!1d22.32070543021428!2d91.71236337021492!5i12",

                                "https://www.google.com/search?client=firefox-b-ab&q=police+station+in+chittagong&npsic=0&rflfq=1&rlha=0&rllag=22335753,91821174,3037&tbm=lcl&ved=2ahUKEwiF55DbjdneAhXFLI8KHXDUAScQjGp6BAgFEB4&tbs=lrf:!2m1!1e16!3sIAE,lf:1,lf_ui:3&rldoc=1#rldoc=1&rlfi=hd:;si:14053139792533300763;mv:!1m2!1d22.4213477800648!2d91.95406258896492!2m2!1d22.207912497652234!2d91.5194159825196!4m2!1d22.31467092923437!2d91.73673928574226!5i12",
                                "https://www.google.com/search?client=firefox-b-ab&tbm=lcl&ei=_NHuW5XTN4bGvwT8mZC4DQ&q=police+station+in+chittagong&oq=police+station+in+chittagong&gs_l=psy-ab.12...0.0.0.1991390.0.0.0.0.0.0.0.0..0.0....0...1c..64.psy-ab..0.0.0....0.z_x8jRBtpSQ#rlfi=hd:;si:2843857372445951468;mv:!1m2!1d22.4036457!2d91.8736158!2m2!1d22.225157!2d91.7684596",
                                "https://www.google.com/search?client=firefox-b-ab&tbm=lcl&ei=_NHuW5XTN4bGvwT8mZC4DQ&q=police+station+in+chittagong&oq=police+station+in+chittagong&gs_l=psy-ab.12...0.0.0.1991390.0.0.0.0.0.0.0.0..0.0....0...1c..64.psy-ab..0.0.0....0.z_x8jRBtpSQ#rlfi=hd:;si:14394971330056907104;mv:!1m2!1d22.4036457!2d91.8736158!2m2!1d22.225157!2d91.7684596",
                                "https://www.google.com/search?client=firefox-b-ab&tbm=lcl&ei=_NHuW5XTN4bGvwT8mZC4DQ&q=police+station+in+chittagong&oq=police+station+in+chittagong&gs_l=psy-ab.12...0.0.0.1991390.0.0.0.0.0.0.0.0..0.0....0...1c..64.psy-ab..0.0.0....0.z_x8jRBtpSQ#rlfi=hd:;si:197055349624884823;mv:!1m2!1d22.4036457!2d91.8736158!2m2!1d22.225157!2d91.7684596",
                                "https://www.google.com/search?client=firefox-b-ab&tbm=lcl&ei=_NHuW5XTN4bGvwT8mZC4DQ&q=police+station+in+chittagong&oq=police+station+in+chittagong&gs_l=psy-ab.12...0.0.0.1991390.0.0.0.0.0.0.0.0..0.0....0...1c..64.psy-ab..0.0.0....0.z_x8jRBtpSQ#rlfi=hd:;si:6780506139502354067;mv:!1m2!1d22.4036457!2d91.8736158!2m2!1d22.225157!2d91.7684596",
                                "https://www.google.com/search?client=firefox-b-ab&tbm=lcl&ei=_NHuW5XTN4bGvwT8mZC4DQ&q=police+station+in+chittagong&oq=police+station+in+chittagong&gs_l=psy-ab.12...0.0.0.1991390.0.0.0.0.0.0.0.0..0.0....0...1c..64.psy-ab..0.0.0....0.z_x8jRBtpSQ#rlfi=hd:;si:14994827127511963269;mv:!1m2!1d22.4036457!2d91.8736158!2m2!1d22.225157!2d91.7684596",
                                "https://www.google.com/search?client=firefox-b-ab&tbm=lcl&ei=_NHuW5XTN4bGvwT8mZC4DQ&q=police+station+in+chittagong&oq=police+station+in+chittagong&gs_l=psy-ab.12...0.0.0.1991390.0.0.0.0.0.0.0.0..0.0....0...1c..64.psy-ab..0.0.0....0.z_x8jRBtpSQ#rlfi=hd:;si:5333468148975127122;mv:!1m2!1d22.4036457!2d91.8736158!2m2!1d22.225157!2d91.7684596",
                                "https://www.google.com/search?client=firefox-b-ab&tbm=lcl&ei=_NHuW5XTN4bGvwT8mZC4DQ&q=police+station+in+chittagong&oq=police+station+in+chittagong&gs_l=psy-ab.12...0.0.0.1991390.0.0.0.0.0.0.0.0..0.0....0...1c..64.psy-ab..0.0.0....0.z_x8jRBtpSQ#rlfi=hd:;si:3151252215070909191;mv:!1m2!1d22.4036457!2d91.8736158!2m2!1d22.225157!2d91.7684596",
                                "https://www.google.com/search?client=firefox-b-ab&tbm=lcl&ei=_NHuW5XTN4bGvwT8mZC4DQ&q=police+station+in+chittagong&oq=police+station+in+chittagong&gs_l=psy-ab.12...0.0.0.1991390.0.0.0.0.0.0.0.0..0.0....0...1c..64.psy-ab..0.0.0....0.z_x8jRBtpSQ#rlfi=hd:;si:11784520441276923598;mv:!1m2!1d22.4036457!2d91.8736158!2m2!1d22.225157!2d91.7684596",
                                "https://www.google.com/search?client=firefox-b-ab&tbm=lcl&ei=_NHuW5XTN4bGvwT8mZC4DQ&q=police+station+in+chittagong&oq=police+station+in+chittagong&gs_l=psy-ab.12...0.0.0.1991390.0.0.0.0.0.0.0.0..0.0....0...1c..64.psy-ab..0.0.0....0.z_x8jRBtpSQ#rlfi=hd:;si:17267074128386646714;mv:!1m2!1d22.4036457!2d91.8736158!2m2!1d22.225157!2d91.7684596",
                                "https://www.google.com/search?client=firefox-b-ab&tbm=lcl&ei=_NHuW5XTN4bGvwT8mZC4DQ&q=police+station+in+chittagong&oq=police+station+in+chittagong&gs_l=psy-ab.12...0.0.0.1991390.0.0.0.0.0.0.0.0..0.0....0...1c..64.psy-ab..0.0.0....0.z_x8jRBtpSQ#rlfi=hd:;si:15273241057280574510;mv:!1m2!1d22.4036457!2d91.8736158!2m2!1d22.225157!2d91.7684596",
                                "https://www.google.com/search?client=firefox-b-ab&tbm=lcl&ei=_NHuW5XTN4bGvwT8mZC4DQ&q=police+station+in+chittagong&oq=police+station+in+chittagong&gs_l=psy-ab.12...0.0.0.1991390.0.0.0.0.0.0.0.0..0.0....0...1c..64.psy-ab..0.0.0....0.z_x8jRBtpSQ#rlfi=hd:;si:1141711846083285195;mv:!1m2!1d22.4036457!2d91.8736158!2m2!1d22.225157!2d91.7684596",


                                "https://www.google.com/search?client=firefox-b-ab&tbm=lcl&ei=_NHuW5XTN4bGvwT8mZC4DQ&q=police+station+in+chittagong&oq=police+station+in+chittagong&gs_l=psy-ab.12...0.0.0.1991390.0.0.0.0.0.0.0.0..0.0....0...1c..64.psy-ab..0.0.0....0.z_x8jRBtpSQ#rlfi=hd:;si:361293531541448307;mv:!1m2!1d22.4096822!2d91.8661991!2m2!1d22.236143000000002!2d91.75075199999999;start:20",

                                "https://www.google.com/search?client=firefox-b-ab&tbm=lcl&ei=_NHuW5XTN4bGvwT8mZC4DQ&q=police+station+in+chittagong&oq=police+station+in+chittagong&gs_l=psy-ab.12...0.0.0.1991390.0.0.0.0.0.0.0.0..0.0....0...1c..64.psy-ab..0.0.0....0.z_x8jRBtpSQ#rlfi=hd:;si:12825518576296414789;mv:!1m2!1d22.4096822!2d91.8661991!2m2!1d22.236143000000002!2d91.75075199999999;start:20",
                                "https://www.google.com/search?client=firefox-b-ab&tbm=lcl&ei=_NHuW5XTN4bGvwT8mZC4DQ&q=police+station+in+chittagong&oq=police+station+in+chittagong&gs_l=psy-ab.12...0.0.0.1991390.0.0.0.0.0.0.0.0..0.0....0...1c..64.psy-ab..0.0.0....0.z_x8jRBtpSQ#rlfi=hd:;si:5001591527223392352;mv:!1m2!1d22.4096822!2d91.8661991!2m2!1d22.236143000000002!2d91.75075199999999;start:20",
                                "https://www.google.com/search?client=firefox-b-ab&tbm=lcl&ei=_NHuW5XTN4bGvwT8mZC4DQ&q=police+station+in+chittagong&oq=police+station+in+chittagong&gs_l=psy-ab.12...0.0.0.1991390.0.0.0.0.0.0.0.0..0.0....0...1c..64.psy-ab..0.0.0....0.z_x8jRBtpSQ#rlfi=hd:;si:15595109592686323234;mv:!1m2!1d22.4096822!2d91.8661991!2m2!1d22.236143000000002!2d91.75075199999999;start:20",
                                "https://www.google.com/search?client=firefox-b-ab&tbm=lcl&ei=_NHuW5XTN4bGvwT8mZC4DQ&q=police+station+in+chittagong&oq=police+station+in+chittagong&gs_l=psy-ab.12...0.0.0.1991390.0.0.0.0.0.0.0.0..0.0....0...1c..64.psy-ab..0.0.0....0.z_x8jRBtpSQ#rlfi=hd:;si:15963104908285167544;mv:!1m2!1d22.4096822!2d91.8661991!2m2!1d22.236143000000002!2d91.75075199999999;start:20",
                                "https://www.google.com/search?client=firefox-b-ab&tbm=lcl&ei=_NHuW5XTN4bGvwT8mZC4DQ&q=police+station+in+chittagong&oq=police+station+in+chittagong&gs_l=psy-ab.12...0.0.0.1991390.0.0.0.0.0.0.0.0..0.0....0...1c..64.psy-ab..0.0.0....0.z_x8jRBtpSQ#rlfi=hd:;si:2075445697518110090;mv:!1m2!1d22.4096822!2d91.8661991!2m2!1d22.236143000000002!2d91.75075199999999;start:20",
                                "https://www.google.com/search?client=firefox-b-ab&tbm=lcl&ei=_NHuW5XTN4bGvwT8mZC4DQ&q=police+station+in+chittagong&oq=police+station+in+chittagong&gs_l=psy-ab.12...0.0.0.1991390.0.0.0.0.0.0.0.0..0.0....0...1c..64.psy-ab..0.0.0....0.z_x8jRBtpSQ#rlfi=hd:;si:16817493111307288291;mv:!1m2!1d22.4096822!2d91.8661991!2m2!1d22.236143000000002!2d91.75075199999999;start:20",
                                "https://www.google.com/search?client=firefox-b-ab&tbm=lcl&ei=_NHuW5XTN4bGvwT8mZC4DQ&q=police+station+in+chittagong&oq=police+station+in+chittagong&gs_l=psy-ab.12...0.0.0.1991390.0.0.0.0.0.0.0.0..0.0....0...1c..64.psy-ab..0.0.0....0.z_x8jRBtpSQ#rlfi=hd:;si:17632835507706703267;mv:!1m2!1d22.4096822!2d91.8661991!2m2!1d22.236143000000002!2d91.75075199999999;start:20",
                                "https://www.google.com/search?client=firefox-b-ab&tbm=lcl&ei=_NHuW5XTN4bGvwT8mZC4DQ&q=police+station+in+chittagong&oq=police+station+in+chittagong&gs_l=psy-ab.12...0.0.0.1991390.0.0.0.0.0.0.0.0..0.0....0...1c..64.psy-ab..0.0.0....0.z_x8jRBtpSQ#rlfi=hd:;si:15341719006607416325;mv:!1m2!1d22.4096822!2d91.8661991!2m2!1d22.236143000000002!2d91.75075199999999;start:20"

                        };

        layoutManager= new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        adapter = new RecyclerAdapterPoli(PoliceActivity.this,images,titles,details,url);
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


