package pbru.mead.aoy.easytraffic;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import pbru.mead.aoy.easytraffic.R;

/**
 * Created by Lab on 8/18/2015.
 */
public class Myadater extends BaseAdapter{

    //Explicit

    private Context objContext;
    private int []iconInts;
    private String[] titleStrings;

    public Myadater(Context objContext, int[] iconInts, String[] titleStrings) {
        this.objContext = objContext;
        this.iconInts = iconInts;
        this.titleStrings = titleStrings;
    } //Constructor

    @Override
    public int getCount() {
        return titleStrings.length;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {

        LayoutInflater objLayoutInflater = (LayoutInflater) objContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View view1 = objLayoutInflater.inflate(R.layout.listview_traffic,viewGroup, false);
        // show Image
        ImageView iconImageView = (ImageView) view1.findViewById(R.id.imvicon);
        iconImageView.setImageResource(iconInts[i]);

        ///jiuui

        // show Text
        TextView titleTextView = (TextView) view1.findViewById(R.id.textView);
        titleTextView.setText(titleStrings[i]);

        return view1;
    }
}   // main class
