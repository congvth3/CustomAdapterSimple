package helloworld.chcompany.vuthecong.customadapter1;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by vuthecong on 11/2/15.
 */
public class CustomListAdapter extends BaseAdapter {
    private Activity activity;
    private LayoutInflater inflater;
    private List<Number> numberItems;
    public CustomListAdapter (Activity activity, List<Number> numberItems) {
        this.activity = activity;
        this.numberItems = numberItems;
    }

    @Override
    public int getCount() {
        return numberItems.size();
    }

    @Override
    public Object getItem(int position) {
        return numberItems.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if(inflater == null)
            inflater = (LayoutInflater)activity.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        if (convertView == null)
            convertView = inflater.inflate(R.layout.list_row, null);
        TextView textView = (TextView)convertView.findViewById(R.id.number);
            Number n = numberItems.get(position);
            textView.setText(String.valueOf(n.getNumber()));
            return convertView;

    }
}
