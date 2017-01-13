package com.fissilmi.acer.bit;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.NavUtils;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import com.fissilmi.acer.bit.db.DBAdaptertwo;
import com.fissilmi.acer.bit.model.Question;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class ViewAnswer2Activity extends AppCompatActivity {

    private ListView lvQsAns;

    private List<Question> questionsList;
    private Question currentQuestion;

    ArrayList<HashMap<String, Object>> originalValues = new ArrayList<HashMap<String, Object>>();

    HashMap<String, Object> temp = new HashMap<String, Object>();

    public static String KEY_QUES = "questions";
    public static String KEY_CANS = "canswer";
    public static String KEY_YANS = "yanswer";

    private ViewAnswer2Activity.CustomAdapter adapter;

    ArrayList<String> myAnsList=new ArrayList<String>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_viewanswers);

        Intent in = getIntent();
        myAnsList=in.getExtras().getStringArrayList("myAnsList");


        lvQsAns=(ListView)findViewById(R.id.lvQsAns);

        //Initialize the database
        final DBAdaptertwo dbAdaptertwo=new DBAdaptertwo(this);
        questionsList= dbAdaptertwo.getAllQuestions();


        for (int i = 0; i < questionsList.size(); i++) {
            currentQuestion=questionsList.get(i);
            temp = new HashMap<String, Object>();
            temp.put(KEY_QUES,  currentQuestion.getQUESTION());
            temp.put(KEY_CANS, currentQuestion.getANSWER());
            temp.put(KEY_YANS, myAnsList.get(i));

            // add the row to the ArrayList
            originalValues.add(temp);

        }

        adapter = new ViewAnswer2Activity.CustomAdapter(ViewAnswer2Activity.this, R.layout.list_row,
                originalValues);
        lvQsAns.setAdapter(adapter);

    }

    // define your custom adapter
    private class CustomAdapter extends ArrayAdapter<HashMap<String, Object>> {
        LayoutInflater inflater;

        public CustomAdapter(Context context, int textViewResourceId,
                             ArrayList<HashMap<String, Object>> Strings) {
            super(context, textViewResourceId, Strings);
            inflater = (LayoutInflater) context
                    .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        }

        // class for caching the views in a row
        private class ViewHolder {

            TextView tvQS, tvCans, tvYouans;

        }

        ViewAnswer2Activity.CustomAdapter.ViewHolder viewHolder;

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {

            if (convertView == null) {

                convertView = inflater.inflate(R.layout.list_row, null);
                viewHolder = new ViewAnswer2Activity.CustomAdapter.ViewHolder();

                viewHolder.tvQS = (TextView) convertView.findViewById(R.id.tvQuestions);

                viewHolder.tvCans = (TextView) convertView
                        .findViewById(R.id.tvCorrectAns);
                viewHolder.tvYouans = (TextView) convertView
                        .findViewById(R.id.tvYourAns);

                // link the cached views to the convertview
                convertView.setTag(viewHolder);

            } else
                viewHolder = (ViewAnswer2Activity.CustomAdapter.ViewHolder) convertView.getTag();

            viewHolder.tvQS.setText(originalValues.get(position).get(KEY_QUES)
                    .toString());

            viewHolder.tvCans.setText("Correct Ans: "+originalValues.get(position).get(KEY_CANS)
                    .toString());
            viewHolder.tvYouans.setText("Your Ans: "+originalValues.get(position)
                    .get(KEY_YANS).toString());

            // return the view to be displayed
            return convertView;
        }
    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            // Respond to the action bar's Up/Home button
            case android.R.id.home:
                NavUtils.navigateUpFromSameTask(this);
                return true;
        }
        return super.onOptionsItemSelected(item);
    }
}