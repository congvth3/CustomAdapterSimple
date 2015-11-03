package helloworld.chcompany.vuthecong.customadapter1;

import android.app.Activity;
import android.app.ListActivity;
import android.app.ProgressDialog;
import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.BaseAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;


public class MainActivity extends Activity {
    private static final String TAG = MainActivity.class.getSimpleName();
    private ProgressDialog pDialog;
    private List<Number> NumberList = new ArrayList<>();
    private ListView listView;
    private CustomListAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView = (ListView)findViewById(R.id.list);
        adapter = new CustomListAdapter(this, NumberList);
        listView.setAdapter(adapter);
        for (int i = 1; i < 5; i++)
        {
            NumberList.add();
        }

        //pDialog = new ProgressDialog(this);
        //pDialog.setMessage("Loading...");
        //pDialog.show();

        //getActionBar().setBackgroundDrawable(new ColorDrawable(Color.parseColor("#1b1b1b")));




        adapter.notifyDataSetChanged();
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
    //@Override
    //public void onDestroy() {
        //super.onDestroy();
        //hidePDialog();
    //}
        //private void hidePDialog() {
            //if (pDialog != null) {
                //pDialog.dismiss();
                //pDialog = null;
            //}
        //}
    }

