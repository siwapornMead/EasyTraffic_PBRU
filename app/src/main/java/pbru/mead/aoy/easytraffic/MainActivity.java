package pbru.mead.aoy.easytraffic;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;


public class MainActivity extends ActionBarActivity {


    //Explicit ประกาศตัวแปร
    private ListView trafficListView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        // Initail Widget
        initailwidget();

        // Create ListView
        createListView();
    }//เมดตอดหลัก

    private void createListView() {
        String[] strTitle = new String[20];
        strTitle[0] = "ห้ามเลี้ยวซ้าย";
        strTitle[1] = "ห้ามเลี้ยวขวา";
        strTitle[2] = "ตรงไป";
        strTitle[3] = "เลี้ยวขวา";
        strTitle[4] = "เลี้ยวซ้าย";
        strTitle[5] = "ออก";
        strTitle[6] = "เข้า";
        strTitle[7] = "ออก";
        strTitle[8] = "หยุด";
        strTitle[9] = "จำกัดความสูง";
        strTitle[10] = "ทางแยก";
        strTitle[11] = "ห้ามกลับรถ";
        strTitle[12] = "ห้ามจอด";
        strTitle[13] = "รถสวน";
        strTitle[14] = "ห้ามแซง";
        strTitle[15] = "เข้า";
        strTitle[16] = "หยุดตรวจ";
        strTitle[17] = "จำกัดความเร็ว";
        strTitle[18] = "จำกัดความกว้าง";
        strTitle[19] = "จำกัดความสูง";

        int [] intImage={R.drawable.traffic_01,R.drawable.traffic_02,
                R.drawable.traffic_03,R.drawable.traffic_04,
                R.drawable.traffic_05,R.drawable.traffic_06,
                R.drawable.traffic_07,R.drawable.traffic_08,
                R.drawable.traffic_09,R.drawable.traffic_10,
                R.drawable.traffic_11,R.drawable.traffic_12,
                R.drawable.traffic_13,R.drawable.traffic_14,
                R.drawable.traffic_15,R.drawable.traffic_16,
                R.drawable.traffic_17,R.drawable.traffic_18,
                R.drawable.traffic_19,R.drawable.traffic_20,        };

        Myadater objMyAdater = new Myadater(MainActivity.this, intImage, strTitle);
        trafficListView.setAdapter(objMyAdater);

        //Active onclick on Listview
        trafficListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                //Intent to detail
                Intent objIntent = new Intent(MainActivity.this, DetailActivity.class);
                startActivity(objIntent);

            }
        });

    }


    private void initailwidget() {
        trafficListView = (ListView) findViewById(R.id.listView);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
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
} //main class นี่คือคลาสหลัก

