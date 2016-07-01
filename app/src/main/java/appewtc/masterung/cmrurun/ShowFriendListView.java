package appewtc.masterung.cmrurun;

import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import com.squareup.okhttp.OkHttpClient;
import com.squareup.okhttp.Request;
import com.squareup.okhttp.Response;

public class ShowFriendListView extends AppCompatActivity {

    //Explicit
    private ListView listView;
    private MyData myData;
    private int[] avataInts;
    private int[] goldInts = new int[]{R.drawable.friend, R.drawable.brnz,
    R.drawable.siver, R.drawable.gold, R.drawable.gold};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_friend_list_view);

        listView = (ListView) findViewById(R.id.listView);

        myData = new MyData();
        avataInts = myData.getAvataInts();

    }   // Main Method

    private class SynGold extends AsyncTask<Void, Void, String> {

        private static final String urlJSON = "http://swiftcodingthai.com/cmru/get_user_master.php";

        @Override
        protected String doInBackground(Void... voids) {

            try {

                OkHttpClient okHttpClient = new OkHttpClient();
                Request.Builder builder = new Request.Builder();
                Request request = builder.url(urlJSON).build();
                Response response = okHttpClient.newCall(request).execute();
                return response.body().string();

            } catch (Exception e) {
                return null;
            }
        }   // doIn

        @Override
        protected void onPostExecute(String s) {
            super.onPostExecute(s);
        }
    }   // SynGold


}   // Main Class
