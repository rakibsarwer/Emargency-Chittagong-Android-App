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

public class BloodActivity extends AppCompatActivity {


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

        images= new String[] {"Bangladesh Red Crescent Society",
                "Fatema Begum Red Crescent Blood Center",
                "Landsteiner Blood Bank And Transfusion Medicine Center",
                "B4ALL (Blood for All)",
                "Chittagong Medical College",
                "Red Crescent Maternity Hospital",
                "Islami Bank Hospital",
                "Blood Donation",

                "Unique Blood Bank & Transfusion Centre",
                "MONI BLOOD BANK"};

        titles= new String[]{"tel: 01712-298204",
                "tel: 031-612395",
                "tel: 01857-529998",
                "tel: 01625-524255",
                "tel: 01819-637685",
                "tel: 031-639540",
                "tel: 01731-253990",
                "tel: 01815-000123",

                "tel: 01875-742622",
                "tel: 01819-171757"

        };

        details= new String[]{
                "Address: 395 Kata Pahar Ln, Chittagong",
                "Address: 395, Kata Pahar Lane, kotwali, Chittagong",
                "Address: Chittagong",
                "Address: 5B, Ten Star Corporation, 314 Sheikh Mujib Rd, Chittagong 4100",
                "Address: 57, K.B. Fazlul Kader road, P.S. Panchlaish, P.O, Chittagong 4203",
                "Address: Chittagong Development Authority Buildings, Station Road, Chittagong",
                "AAddress: 03 Sheikh Mujib Rd, Chittagong",
                "Address: Hill view 2 no road, Block c, Jamal Building, Chittagong 4209",

                "Address: Unique Unique Blood Bank & Transfusion Centre",
                "Address: South Kulshi Road, Chittagong"
        };
        url= new String[]
                {
                        "https://www.google.com/search?client=firefox-b-ab&q=emergency+blood+banks+location+in+chittagong&npsic=0&rflfq=1&rlha=0&rllag=22346789,91824966,1886&tbm=lcl&ved=2ahUKEwi-8fz_mdneAhWHLo8KHdQdAPoQjGp6BAgAEDw&tbs=lrf:!2m1!1e2!2m1!1e3!3sIAE,lf:1,lf_ui:2&rldoc=1#rlfi=hd:;si:125391095399562195;mv:!1m2!1d22.3728212!2d91.849031!2m2!1d22.3192219!2d91.78557769999999",
                        "https://www.google.com/search?client=firefox-b-ab&q=emergency+blood+banks+location+in+chittagong&npsic=0&rflfq=1&rlha=0&rllag=22346789,91824966,1886&tbm=lcl&ved=2ahUKEwi-8fz_mdneAhWHLo8KHdQdAPoQjGp6BAgAEDw&tbs=lrf:!2m1!1e2!2m1!1e3!3sIAE,lf:1,lf_ui:2&rldoc=1#rlfi=hd:;si:6506131924457287778;mv:!1m2!1d22.3728212!2d91.849031!2m2!1d22.3192219!2d91.78557769999999",
                        "https://www.google.com/search?client=firefox-b-ab&q=emergency+blood+banks+location+in+chittagong&npsic=0&rflfq=1&rlha=0&rllag=22346789,91824966,1886&tbm=lcl&ved=2ahUKEwi-8fz_mdneAhWHLo8KHdQdAPoQjGp6BAgAEDw&tbs=lrf:!2m1!1e2!2m1!1e3!3sIAE,lf:1,lf_ui:2&rldoc=1#rlfi=hd:;si:658211221598617473;mv:!1m2!1d22.3728212!2d91.849031!2m2!1d22.3192219!2d91.78557769999999",
                        "https://www.google.com/search?client=firefox-b-ab&q=emergency+blood+banks+location+in+chittagong&npsic=0&rflfq=1&rlha=0&rllag=22346789,91824966,1886&tbm=lcl&ved=2ahUKEwi-8fz_mdneAhWHLo8KHdQdAPoQjGp6BAgAEDw&tbs=lrf:!2m1!1e2!2m1!1e3!3sIAE,lf:1,lf_ui:2&rldoc=1#rlfi=hd:;si:1299155568233606070;mv:!1m2!1d22.3728212!2d91.849031!2m2!1d22.3192219!2d91.78557769999999",
                        "https://www.google.com/search?client=firefox-b-ab&q=emergency+blood+banks+location+in+chittagong&npsic=0&rflfq=1&rlha=0&rllag=22346789,91824966,1886&tbm=lcl&ved=2ahUKEwi-8fz_mdneAhWHLo8KHdQdAPoQjGp6BAgAEDw&tbs=lrf:!2m1!1e2!2m1!1e3!3sIAE,lf:1,lf_ui:2&rldoc=1#rlfi=hd:;si:17986694105358260033;mv:!1m2!1d22.3728212!2d91.849031!2m2!1d22.3192219!2d91.78557769999999",
                        "https://www.google.com/search?client=firefox-b-ab&q=emergency+blood+banks+location+in+chittagong&npsic=0&rflfq=1&rlha=0&rllag=22346789,91824966,1886&tbm=lcl&ved=2ahUKEwi-8fz_mdneAhWHLo8KHdQdAPoQjGp6BAgAEDw&tbs=lrf:!2m1!1e2!2m1!1e3!3sIAE,lf:1,lf_ui:2&rldoc=1#rlfi=hd:;si:8258316953757519643;mv:!1m2!1d22.3728212!2d91.849031!2m2!1d22.3192219!2d91.78557769999999",
                        "https://www.google.com/search?client=firefox-b-ab&q=emergency+blood+banks+location+in+chittagong&npsic=0&rflfq=1&rlha=0&rllag=22346789,91824966,1886&tbm=lcl&ved=2ahUKEwi-8fz_mdneAhWHLo8KHdQdAPoQjGp6BAgAEDw&tbs=lrf:!2m1!1e2!2m1!1e3!3sIAE,lf:1,lf_ui:2&rldoc=1#rlfi=hd:;si:7061031058635149225;mv:!1m2!1d22.3728212!2d91.849031!2m2!1d22.3192219!2d91.78557769999999;start:0",
                        "https://www.google.com/search?client=firefox-b&q=ctg+blood+bank&npsic=0&rflfq=1&rlha=0&rllag=22347667,91824966,1955&tbm=lcl&ved=2ahUKEwi7lOmzoNneAhUGbo8KHVAtC6IQjGp6BAgAEDw&tbs=lrf:!2m1!1e2!2m1!1e3!3sIAE,lf:1,lf_ui:2&rldoc=1#rlfi=hd:;si:10011231292791611981;mv:!1m2!1d22.379182999999998!2d91.8396448!2m2!1d22.332404!2d91.8102873",

                        "https://www.google.com/search?client=firefox-b&biw=1366&bih=654&q=unique+blood+bank+chittagong&npsic=0&rflfq=1&rlha=0&rllag=22355793,91819975,2466&tbm=lcl&ved=2ahUKEwjXqJ2podneAhUbSo8KHff7DPAQjGp6BAgDEDc&tbs=lrf:!2m1!1e2!2m1!1e3!3sIAE,lf:1,lf_ui:2&rldoc=1#rlfi=hd:;si:8653736500810559939;mv:!1m2!1d22.509107200000003!2d91.84143519999999!2m2!1d22.3159031!2d91.7786577",
                        "https://www.google.com/search?client=firefox-b&biw=1366&bih=654&q=unique+blood+bank+chittagong&npsic=0&rflfq=1&rlha=0&rllag=22355793,91819975,2466&tbm=lcl&ved=2ahUKEwjXqJ2podneAhUbSo8KHff7DPAQjGp6BAgDEDc&tbs=lrf:!2m1!1e2!2m1!1e3!3sIAE,lf:1,lf_ui:2&rldoc=1#rlfi=hd:;si:13587231560821272779;mv:!1m2!1d22.509107200000003!2d91.84143519999999!2m2!1d22.3159031!2d91.7786577"
                };

        layoutManager= new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        adapter = new RecyclerAdapterBlod(BloodActivity.this,images,titles,details,url);
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


