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

public class AmbulanceCardDemoActivity extends AppCompatActivity {


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

        images= new String[] {
                "Chittagong Diabetic General Hospital",
                "Memon Maternity Hospital",
                "Chattogram Metropolitan Hospital Limited",


                "Chittagong Health Point Hospital",

                "Chittagong Square",
                "Mount Elizabeth Hospitals Singapore, Chittagong Office",
                "P.C.Rent-A Car & Ambulance Service",
                "Hasan Chowdhury Ambulancer Office",
                "Medical Centre",
                "Chittagong Eye Infirmary and Training Complex",
                "Imperial Hospital",
                "Southern Medical College",

                "Chittagong Medical College",


                "Delta Health Care Chittagong Limited",
                "Parkview Hospital Ltd",
                "Max Hospital & Diagnostic Ltd",
                "AFC Health Fortis Heart Institute, Chittagong"




        };

        titles= new String[]{ "tel: 01844-041140", "tel: 031-617169",
                "tel: 031-651242", "tel: 01841-005588","tel: 01915-443881",
                "tel: 01977-275929","tel: 0806-8437",
                "tel: 01819-374920", "tel: 031-651054",
                "tel: 031-659017", "tel: 031-659040",
                "tel: 03125-81982", "tel: 01819-637685",
                "tel: 03125-50005",

                "tel: 03125-55072",
        "tel: 031-622519", "tel: 01933-226666"
               };


        details= new String[]{

                "Address: Zakir Hossain Road, Khulsi, Chittagong 4212",
                "Address: 55, sadarghat Road, Chittagong 4000",
                "Address: 698/452 O.R. Nizam Road, Chittagong 4001",
                "Address: 1501, Beside Meristops Clinic, O.R Nizam Road, Panclish, Chittagong",


                "Address: Chittagong Medical Collage Road, Chittagong",
                "Address: Suite C-2, Level 3,1287, O.R. Nizam Road (West Side of CSCR Hospital, 4000",

                "Address: 1637, P.C Road, Noyabazar Mor, Halisohor, Chittagong 4216",
                "Address: 75 , S.S Khaled Road, Kazir Dewri, Chittagong 4000",
                "Address: 953, O.R. Nizam Road, Chittagong",
                "Address: Foy's Lake Approach Rd, Chittagong",
                "Address: Chittagong Eye Infirmary and Training Complex Campus, Zakir Hossain Rd, Chittagong 4202",
                "Address: SMC Road, Chittagong 4209",
                "Address: 57, K.B. Fazlul Kader road, P.S. Panchlaish, P.O, Chittagong 4203",
                "Address: 28, Katalgonj, Mirzapul Road, Panchalish, Chittagong 4212",


                "Address: 94/103, Katalgonj Road Panchlaish, 4000",
                "Address: Late Alhaj Zahur Ahmed Chowdhury Rd, Chittagong",
                "Address: 12/12, Behind Chevron Clinical Laboratory, Chevron Building, O.R. Nizam Rd, Chittagong 4000"


        };
        url= new String[]

                {
                        "https://www.google.com/search?client=firefox-b-ab&sa=X&biw=1366&bih=654&q=emergency+ambulance+services+location+in+chittagong&npsic=0&rflfq=1&rlha=0&rllag=22351123,91808511,2309&tbm=lcl&ved=2ahUKEwiLy5TLmNneAhUKT48KHWNqCfsQjGp6BAgDEDg&tbs=lrf:!2m1!1e2!2m1!1e3!3sIAE,lf:1,lf_ui:2&rldoc=1#rlfi=hd:;si:11269558425817959113;mv:!1m2!1d22.41266081623238!2d91.90784555231346!2m2!1d22.251016176555808!2d91.58306222711815!4m2!1d22.331861912724136!2d91.7454538897158!5i12",
                        "https://www.google.com/search?client=firefox-b-ab&sa=X&biw=1366&bih=654&q=emergency+ambulance+services+location+in+chittagong&npsic=0&rflfq=1&rlha=0&rllag=22351123,91808511,2309&tbm=lcl&ved=2ahUKEwiLy5TLmNneAhUKT48KHWNqCfsQjGp6BAgDEDg&tbs=lrf:!2m1!1e2!2m1!1e3!3sIAE,lf:1,lf_ui:2&rldoc=1#rlfi=hd:;si:15606762330594724510;mv:!1m2!1d22.41266081623238!2d91.90784555231346!2m2!1d22.251016176555808!2d91.58306222711815!4m2!1d22.331861912724136!2d91.7454538897158!5i12",
                        "https://www.google.com/search?client=firefox-b-ab&sa=X&biw=1366&bih=654&q=emergency+ambulance+services+location+in+chittagong&npsic=0&rflfq=1&rlha=0&rllag=22351123,91808511,2309&tbm=lcl&ved=2ahUKEwiLy5TLmNneAhUKT48KHWNqCfsQjGp6BAgDEDg&tbs=lrf:!2m1!1e2!2m1!1e3!3sIAE,lf:1,lf_ui:2&rldoc=1#rlfi=hd:;si:3222943926589520596;mv:!1m2!1d22.41266081623238!2d91.90784555231346!2m2!1d22.251016176555808!2d91.58306222711815!4m2!1d22.331861912724136!2d91.7454538897158!5i12",
                        "https://www.google.com/search?client=firefox-b-ab&sa=X&biw=1366&bih=654&q=emergency+ambulance+services+location+in+chittagong&npsic=0&rflfq=1&rlha=0&rllag=22351123,91808511,2309&tbm=lcl&ved=2ahUKEwiLy5TLmNneAhUKT48KHWNqCfsQjGp6BAgDEDg&tbs=lrf:!2m1!1e2!2m1!1e3!3sIAE,lf:1,lf_ui:2&rldoc=1#rlfi=hd:;si:6937558815513615315;mv:!1m2!1d22.41266081623238!2d91.90784555231346!2m2!1d22.251016176555808!2d91.58306222711815!4m2!1d22.331861912724136!2d91.7454538897158!5i12",
                        "https://www.google.com/search?client=firefox-b-ab&sa=X&biw=1366&bih=654&q=emergency+ambulance+services+location+in+chittagong&npsic=0&rflfq=1&rlha=0&rllag=22351123,91808511,2309&tbm=lcl&ved=2ahUKEwiLy5TLmNneAhUKT48KHWNqCfsQjGp6BAgDEDg&tbs=lrf:!2m1!1e2!2m1!1e3!3sIAE,lf:1,lf_ui:2&rldoc=1#rlfi=hd:;si:14711062873066849815;mv:!1m2!1d22.41266081623238!2d91.90784555231346!2m2!1d22.251016176555808!2d91.58306222711815!4m2!1d22.331861912724136!2d91.7454538897158!5i12",
                        "https://www.google.com/search?client=firefox-b-ab&sa=X&biw=1366&bih=654&q=emergency+ambulance+services+location+in+chittagong&npsic=0&rflfq=1&rlha=0&rllag=22351123,91808511,2309&tbm=lcl&ved=2ahUKEwiLy5TLmNneAhUKT48KHWNqCfsQjGp6BAgDEDg&tbs=lrf:!2m1!1e2!2m1!1e3!3sIAE,lf:1,lf_ui:2&rldoc=1#rlfi=hd:;si:17950737416674648251;mv:!1m2!1d22.41266081623238!2d91.90784555231346!2m2!1d22.251016176555808!2d91.58306222711815!4m2!1d22.331861912724136!2d91.7454538897158!5i12",


                        "https://www.google.com/search?client=firefox-b-ab&q=emergency+ambulance+services+location+in+chittagong&npsic=0&rflfq=1&rlha=0&rllag=22351123,91808511,2309&tbm=lcl&ved=2ahUKEwjjyo6MhtneAhVJ6Y8KHa7IC58QjGp6BAgAEDg&tbs=lrf:!2m1!1e2!2m1!1e3!3sIAE,lf:1,lf_ui:2&rldoc=1#rlfi=hd:;si:17131080535682594822;mv:!1m2!1d23.044642335872453!2d92.33726580625!2m2!1d21.752139256099603!2d89.78569109921875!4m2!1d22.39989296206003!2d91.06147845273438!5i9",
                        "https://www.google.com/search?client=firefox-b-ab&q=emergency+ambulance+services+location+in+chittagong&npsic=0&rflfq=1&rlha=0&rllag=22351123,91808511,2309&tbm=lcl&ved=2ahUKEwjjyo6MhtneAhVJ6Y8KHa7IC58QjGp6BAgAEDg&tbs=lrf:!2m1!1e2!2m1!1e3!3sIAE,lf:1,lf_ui:2&rldoc=1#rlfi=hd:;si:15290263763153974389;mv:!1m2!1d23.044642335872453!2d92.33726580625!2m2!1d21.752139256099603!2d89.78569109921875!4m2!1d22.39989296206003!2d91.06147845273438!5i9",
                        "https://www.google.com/search?client=firefox-b-ab&q=emergency+ambulance+services+location+in+chittagong&npsic=0&rflfq=1&rlha=0&rllag=22351123,91808511,2309&tbm=lcl&ved=2ahUKEwjjyo6MhtneAhVJ6Y8KHa7IC58QjGp6BAgAEDg&tbs=lrf:!2m1!1e2!2m1!1e3!3sIAE,lf:1,lf_ui:2&rldoc=1#rlfi=hd:;si:18039382071267328632;mv:!1m2!1d23.044642335872453!2d92.33726580625!2m2!1d21.752139256099603!2d89.78569109921875!4m2!1d22.39989296206003!2d91.06147845273438!5i9",
                        "https://www.google.com/search?client=firefox-b-ab&q=emergency+ambulance+services+location+in+chittagong&npsic=0&rflfq=1&rlha=0&rllag=22351123,91808511,2309&tbm=lcl&ved=2ahUKEwjjyo6MhtneAhVJ6Y8KHa7IC58QjGp6BAgAEDg&tbs=lrf:!2m1!1e2!2m1!1e3!3sIAE,lf:1,lf_ui:2&rldoc=1#rlfi=hd:;si:3686074080527352415;mv:!1m2!1d23.044642335872453!2d92.33726580625!2m2!1d21.752139256099603!2d89.78569109921875!4m2!1d22.39989296206003!2d91.06147845273438!5i9",
                        "https://www.google.com/search?client=firefox-b-ab&q=emergency+ambulance+services+location+in+chittagong&npsic=0&rflfq=1&rlha=0&rllag=22351123,91808511,2309&tbm=lcl&ved=2ahUKEwjjyo6MhtneAhVJ6Y8KHa7IC58QjGp6BAgAEDg&tbs=lrf:!2m1!1e2!2m1!1e3!3sIAE,lf:1,lf_ui:2&rldoc=1#rlfi=hd:;si:5876153100655354494;mv:!1m2!1d23.046144501946454!2d92.33726580625!2m2!1d21.753641422173608!2d89.78569109921875",
                        "https://www.google.com/search?client=firefox-b-ab&q=emergency+ambulance+services+location+in+chittagong&npsic=0&rflfq=1&rlha=0&rllag=22351123,91808511,2309&tbm=lcl&ved=2ahUKEwjjyo6MhtneAhVJ6Y8KHa7IC58QjGp6BAgAEDg&tbs=lrf:!2m1!1e2!2m1!1e3!3sIAE,lf:1,lf_ui:2&rldoc=1#rlfi=hd:;si:14482220401464948505;mv:!1m2!1d23.046144501946454!2d92.33726580625!2m2!1d21.753641422173608!2d89.78569109921875",
                        "https://www.google.com/search?client=firefox-b-ab&q=emergency+ambulance+services+location+in+chittagong&npsic=0&rflfq=1&rlha=0&rllag=22351123,91808511,2309&tbm=lcl&ved=2ahUKEwjjyo6MhtneAhVJ6Y8KHa7IC58QjGp6BAgAEDg&tbs=lrf:!2m1!1e2!2m1!1e3!3sIAE,lf:1,lf_ui:2&rldoc=1#rlfi=hd:;si:17986694105358260033;mv:!1m2!1d23.046144501946454!2d92.33726580625!2m2!1d21.753641422173608!2d89.78569109921875",

                        "https://www.google.com/search?client=firefox-b-ab&q=emergency+ambulance+services+location+in+chittagong&npsic=0&rflfq=1&rlha=0&rllag=22351123,91808511,2309&tbm=lcl&ved=2ahUKEwjjyo6MhtneAhVJ6Y8KHa7IC58QjGp6BAgAEDg&tbs=lrf:!2m1!1e2!2m1!1e3!3sIAE,lf:1,lf_ui:2&rldoc=1#rlfi=hd:;si:13686363903697413045;mv:!1m2!1d23.046144501946454!2d92.33726580625!2m2!1d21.753641422173608!2d89.78569109921875",
                        "https://www.google.com/search?client=firefox-b-ab&q=emergency+ambulance+services+location+in+chittagong&npsic=0&rflfq=1&rlha=0&rllag=22351123,91808511,2309&tbm=lcl&ved=2ahUKEwjjyo6MhtneAhVJ6Y8KHa7IC58QjGp6BAgAEDg&tbs=lrf:!2m1!1e2!2m1!1e3!3sIAE,lf:1,lf_ui:2&rldoc=1#rlfi=hd:;si:15846101284828327571;mv:!1m2!1d23.046144501946454!2d92.33726580625!2m2!1d21.753641422173608!2d89.78569109921875",
                        "https://www.google.com/search?client=firefox-b-ab&q=emergency+ambulance+services+location+in+chittagong&npsic=0&rflfq=1&rlha=0&rllag=22351123,91808511,2309&tbm=lcl&ved=2ahUKEwjjyo6MhtneAhVJ6Y8KHa7IC58QjGp6BAgAEDg&tbs=lrf:!2m1!1e2!2m1!1e3!3sIAE,lf:1,lf_ui:2&rldoc=1#rlfi=hd:;si:6319981052585710387;mv:!1m2!1d23.046144501946454!2d92.33726580625!2m2!1d21.753641422173608!2d89.78569109921875",
                       "https://www.google.com/search?client=firefox-b-ab&q=emergency+ambulance+services+location+in+chittagong&npsic=0&rflfq=1&rlha=0&rllag=22351123,91808511,2309&tbm=lcl&ved=2ahUKEwjjyo6MhtneAhVJ6Y8KHa7IC58QjGp6BAgAEDg&tbs=lrf:!2m1!1e2!2m1!1e3!3sIAE,lf:1,lf_ui:2&rldoc=1#rlfi=hd:;si:3566817011420913501;mv:!1m2!1d23.046144501946454!2d92.33726580625!2m2!1d21.753641422173608!2d89.78569109921875"

                };

        layoutManager= new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        adapter = new RecyclerAdapterAmbu(AmbulanceCardDemoActivity.this,images,titles,details,url);
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
