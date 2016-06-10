package com.tcs.enosenew;


import android.os.Bundle;
import android.support.design.widget.Snackbar;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;

import com.tcs.enosenew.services.TimerTask;
import com.tcs.enosenew.utilities.ConnectionDetector;


public class MainFragment extends Fragment {

    private static ImageView imageView;
    private static ProgressBar bar3;
    private static  TextView titles,something1,something2,something3,something4,something5,appname;
    public MainFragment() {
        // Required empty public constructor
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView =inflater.inflate(R.layout.fragment_main, container, false);

        imageView=(ImageView) rootView.findViewById(R.id.imageView2);
        titles = (TextView) rootView.findViewById(R.id.title);
        appname = (TextView) rootView.findViewById(R.id.appname);
        something1= (TextView) rootView.findViewById(R.id.something1);
        bar3 = (ProgressBar) rootView.findViewById(R.id.progressBar3);
        something2= (TextView) rootView.findViewById(R.id.something2);
        something3= (TextView) rootView.findViewById(R.id.something3);
        something4= (TextView) rootView.findViewById(R.id.something4);
        something5= (TextView) rootView.findViewById(R.id.something5);
        bar3.setVisibility(View.GONE);
        something1.setVisibility(View.GONE);
        something2.setVisibility(View.GONE);
        something3.setVisibility(View.GONE);
        something4.setVisibility(View.GONE);
        something5.setVisibility(View.GONE);
        titles.setVisibility(View.GONE);
        ConnectionDetector detector = new ConnectionDetector(getActivity());
        if( detector.isConnectingToInternet()) {
            bar3.setVisibility(View.VISIBLE);
            TimerTask task = new TimerTask();
            String status = "get_image";
            task.startTimer(status);

        }else {
            Snackbar.make(rootView, "Not Connected to Internet", Snackbar.LENGTH_LONG)
                    .setAction("Action", null).show();
        }

        return rootView;
    }



    public void setImage(String codes,String decay) {
        int code = Integer.parseInt(codes);
if(code==10)
{
    appname.setVisibility(View.GONE);
    something1.setVisibility(View.VISIBLE);
    something2.setVisibility(View.VISIBLE);
    titles.setVisibility(View.VISIBLE);
    something3.setVisibility(View.VISIBLE);
    something4.setVisibility(View.VISIBLE);
    something5.setVisibility(View.VISIBLE);
    titles.setText("Category : Non Veg");
    something1.setText("Food Status : Fresh");
    something2.setText("Decaying Index :"+ decay);
    something3.setText("Item Name : Chicken");
    something4.setText("No. of Days old : 0");
    something5.setText("Consumable : Yes");
imageView.setImageResource(R.drawable.freshmeet);
}
        else if(code==11)
{
    appname.setVisibility(View.GONE);
    something1.setVisibility(View.VISIBLE);
    something2.setVisibility(View.VISIBLE);
    something3.setVisibility(View.VISIBLE);
    titles.setVisibility(View.VISIBLE);
    something4.setVisibility(View.VISIBLE);
    something5.setVisibility(View.VISIBLE);
    titles.setText("Category : Non Veg");
    something1.setText("Food Status : Cook Well");
    something2.setText("Decaying Index :"+ decay);
    something3.setText("Item Name : Chicken");
    something4.setText("No. of Days old : 1");
    something5.setText("Consumable : Yes");
    imageView.setImageResource(R.drawable.freshmeet);
}
else if(code==12)
{
    appname.setVisibility(View.GONE);
    something1.setVisibility(View.VISIBLE);
    something2.setVisibility(View.VISIBLE);
    titles.setVisibility(View.VISIBLE);
    something3.setVisibility(View.VISIBLE);
    something4.setVisibility(View.VISIBLE);
    something5.setVisibility(View.VISIBLE);
    titles.setText("Category : Non Veg");
    something1.setText("Food Status : Spoiled");
    something2.setText("Decaying Index :"+ decay);
    something3.setText("Item Name : Chicken");
    something4.setText("No. of Days old : 2");
    something5.setText("Consumable : No");
    imageView.setImageResource(R.drawable.rottenmeet);
}
else if(code==13)
{
    appname.setVisibility(View.GONE);
    something1.setVisibility(View.VISIBLE);
    something2.setVisibility(View.VISIBLE);
    something3.setVisibility(View.VISIBLE);
    titles.setVisibility(View.VISIBLE);
    something4.setVisibility(View.VISIBLE);
    something5.setVisibility(View.VISIBLE);
    titles.setText("Category : Non Veg");
    something1.setText("Food Status : Spoiled");
    something2.setText("Decaying Index :"+ decay);
    something3.setText("Item Name : Chicken");
    something4.setText("No. of Days old : 3");
    something5.setText("Consumable : No");
    imageView.setImageResource(R.drawable.rottenmeet);
}
else if(code==14)
{
    appname.setVisibility(View.GONE);
    something1.setVisibility(View.VISIBLE);
    something2.setVisibility(View.VISIBLE);
    something3.setVisibility(View.VISIBLE);
    titles.setVisibility(View.VISIBLE);
    something4.setVisibility(View.VISIBLE);
    something5.setVisibility(View.VISIBLE);
    titles.setText("Category : Non Veg");
    something1.setText("Food Status : Spoiled");
    something2.setText("Decaying Index :"+ decay);
    something3.setText("Item Name : Chicken");
    something4.setText("No. of Days old : 4");
    something5.setText("Consumable : No");
    imageView.setImageResource(R.drawable.rottenmeet);
}
else if(code==15)
{
    appname.setVisibility(View.GONE);
    something1.setVisibility(View.VISIBLE);
    something2.setVisibility(View.VISIBLE);
    something3.setVisibility(View.VISIBLE);
    titles.setVisibility(View.VISIBLE);
    something4.setVisibility(View.VISIBLE);
    something5.setVisibility(View.VISIBLE);
    titles.setText("Category : Non Veg");
    something1.setText("Food Status : Spoiled");
    something2.setText("Decaying Index :"+ decay);
    something3.setText("Item Name : Chicken");
    something4.setText("No. of Days old : 5");
    something5.setText("Consumable : No");
    imageView.setImageResource(R.drawable.rottenmeet);
}
else if(code==20)
{
    appname.setVisibility(View.GONE);
    titles.setVisibility(View.VISIBLE);
    something1.setVisibility(View.VISIBLE);
    //something2.setVisibility(View.VISIBLE);
    something3.setVisibility(View.VISIBLE);
    something4.setVisibility(View.VISIBLE);
    something5.setVisibility(View.VISIBLE);
    titles.setText("Category : Non Veg");
    something1.setText("Food Status : Fresh");
   // something2.setText("Decaying Index :");
    something3.setText("Item Name : Egg");
    something4.setText("No. of Days old : 0");
    something5.setText("Consumable : Yes");
    imageView.setImageResource(R.drawable.fresheggs);
}
else if(code==21)
{
    appname.setVisibility(View.GONE);
    something1.setVisibility(View.VISIBLE);
    //something2.setVisibility(View.VISIBLE);
    something3.setVisibility(View.VISIBLE);
    titles.setVisibility(View.VISIBLE);
    something4.setVisibility(View.VISIBLE);
    something5.setVisibility(View.VISIBLE);
    titles.setText("Category : Non Veg");
    something1.setText("Food Status : Spoiled");
    // something2.setText("Decaying Index :");
    something3.setText("Item Name : Egg");
    something4.setText("No. of Days old : 1");
    something5.setText("Consumable : No");
    imageView.setImageResource(R.drawable.rottenegg);
}
else if(code==22)
{
    appname.setVisibility(View.GONE);
    something1.setVisibility(View.VISIBLE);
    //something2.setVisibility(View.VISIBLE);
    something3.setVisibility(View.VISIBLE);
    something4.setVisibility(View.VISIBLE);
    titles.setVisibility(View.VISIBLE);
    something5.setVisibility(View.VISIBLE);
    titles.setText("Category : Non Veg");
    something1.setText("Food Status : Spoiled");
    // something2.setText("Decaying Index :");
    something3.setText("Item Name : Egg");
    something4.setText("No. of Days old : 2");
    something5.setText("Consumable : No");
    imageView.setImageResource(R.drawable.rottenegg);
}
else if(code==30)
{
    appname.setVisibility(View.GONE);
    something1.setVisibility(View.VISIBLE);
    //something2.setVisibility(View.VISIBLE);
    something3.setVisibility(View.VISIBLE);
    titles.setVisibility(View.VISIBLE);
    something4.setVisibility(View.VISIBLE);
    something5.setVisibility(View.VISIBLE);
    titles.setText("Category : Non Veg");
    something1.setText("Food Status : Fresh");
    // something2.setText("Decaying Index :");
    something3.setText("Item Name : Fish");
    something4.setText("No. of Days old : 0");
    something5.setText("Consumable : Yes");
    imageView.setImageResource(R.drawable.freshfish);
}
else if(code==31)
{
    appname.setVisibility(View.GONE);
    something1.setVisibility(View.VISIBLE);
    //something2.setVisibility(View.VISIBLE);
    something3.setVisibility(View.VISIBLE);
    something4.setVisibility(View.VISIBLE);
    titles.setVisibility(View.VISIBLE);
    something5.setVisibility(View.VISIBLE);
    titles.setText("Category : Non Veg");
    something1.setText("Food Status : Spoiled");
    // something2.setText("Decaying Index :");
    something3.setText("Item Name : Fish");
    something4.setText("No. of Days old : 1");
    something5.setText("Consumable : No");
    imageView.setImageResource(R.drawable.rottenfish);
}
else if(code==40)
{
    appname.setVisibility(View.GONE);
    something1.setVisibility(View.VISIBLE);
    //something2.setVisibility(View.VISIBLE);
    titles.setVisibility(View.VISIBLE);
    something3.setVisibility(View.VISIBLE);
    something4.setVisibility(View.VISIBLE);
    something5.setVisibility(View.VISIBLE);
    titles.setText("Category : Veg");
    something1.setText("Food Status : Fresh");
    // something2.setText("Decaying Index :");
    something3.setText("Item Name : Pineapple");
    something4.setText("No. of Days old : 0");
    something5.setText("Consumable : Yes");
    imageView.setImageResource(R.drawable.pineapple);
}
else if(code==41)
{
    appname.setVisibility(View.GONE);
    something1.setVisibility(View.VISIBLE);
    //something2.setVisibility(View.VISIBLE);
    something3.setVisibility(View.VISIBLE);
    titles.setVisibility(View.VISIBLE);
    something4.setVisibility(View.VISIBLE);
    something5.setVisibility(View.VISIBLE);
    titles.setText("Category : Veg");
    something1.setText("Food Status : Spoiled");
    // something2.setText("Decaying Index :");
    something3.setText("Item Name : Pineapple");
    something4.setText("No. of Days old : 1");
    something5.setText("Consumable : No");
    imageView.setImageResource(R.drawable.rottenpineapple);
}
else if(code==42)
{
    appname.setVisibility(View.GONE);
    something1.setVisibility(View.VISIBLE);
    //something2.setVisibility(View.VISIBLE);
    titles.setVisibility(View.VISIBLE);
    something3.setVisibility(View.VISIBLE);
    something4.setVisibility(View.VISIBLE);
    something5.setVisibility(View.VISIBLE);
    titles.setText("Category : Veg");
    something1.setText("Food Status : Spoiled");
    // something2.setText("Decaying Index :");
    something3.setText("Item Name : Pineapple");
    something4.setText("No. of Days old : 2");
    something5.setText("Consumable : No");
    imageView.setImageResource(R.drawable.rottenpineapple);
}
else if(code==51)
{
    appname.setVisibility(View.GONE);
    something1.setVisibility(View.VISIBLE);
    //something2.setVisibility(View.VISIBLE);
    something3.setVisibility(View.VISIBLE);
    something4.setVisibility(View.VISIBLE);
    titles.setVisibility(View.VISIBLE);
    something5.setVisibility(View.VISIBLE);
    titles.setText("Category : Veg");
    something1.setText("Food Status : Fresh");
    // something2.setText("Decaying Index :");
    something3.setText("Item Name : Orange");
    something4.setText("No. of Days old : 0");
    something5.setText("Consumable : Yes");
    imageView.setImageResource(R.drawable.freshorange);
}
else if(code==52)
{
    appname.setVisibility(View.GONE);
    something1.setVisibility(View.VISIBLE);
    //something2.setVisibility(View.VISIBLE);
    something3.setVisibility(View.VISIBLE);
    titles.setVisibility(View.VISIBLE);
    something4.setVisibility(View.VISIBLE);
    something5.setVisibility(View.VISIBLE);
    titles.setText("Category : Veg");
    something1.setText("Food Status : Spoiled");
    // something2.setText("Decaying Index :");
    something3.setText("Item Name : Orange");
    something4.setText("No. of Days old : 1");
    something5.setText("Consumable : No");
    imageView.setImageResource(R.drawable.orange);
}
else if(code==53)
{
    appname.setVisibility(View.GONE);
    something1.setVisibility(View.VISIBLE);
    //something2.setVisibility(View.VISIBLE);
    something3.setVisibility(View.VISIBLE);
    titles.setVisibility(View.VISIBLE);
    something4.setVisibility(View.VISIBLE);
    something5.setVisibility(View.VISIBLE);
    titles.setText("Category : Veg");
    something1.setText("Food Status : Spoiled");
    // something2.setText("Decaying Index :");
    something3.setText("Item Name : Orange");
    something4.setText("No. of Days old : 2");
    something5.setText("Consumable : No");
    imageView.setImageResource(R.drawable.orange);
}
else if(code==60)
{
    appname.setVisibility(View.GONE);
    something1.setVisibility(View.VISIBLE);
    //something2.setVisibility(View.VISIBLE);
    something3.setVisibility(View.VISIBLE);
    titles.setVisibility(View.VISIBLE);
    something4.setVisibility(View.VISIBLE);
    //something5.setVisibility(View.VISIBLE);
    titles.setText("Category : Veg");
    something1.setText("Food Status : Fresh");
    // something2.setText("Decaying Index :");
    something3.setText("Item Name : Orange Peel");
    something4.setText("No. of Days old : 0");
    //something5.setText("Consumable : Yes");
    imageView.setImageResource(R.drawable.peelorange);
}
else if(code==61)
{
    appname.setVisibility(View.GONE);
    something1.setVisibility(View.VISIBLE);
    //something2.setVisibility(View.VISIBLE);
    something3.setVisibility(View.VISIBLE);
    titles.setVisibility(View.VISIBLE);
    something4.setVisibility(View.VISIBLE);
    //something5.setVisibility(View.VISIBLE);
    titles.setText("Category : Veg");
    something1.setText("Food Status : Spoiled");
    // something2.setText("Decaying Index :");
    something3.setText("Item Name : Orange Peel");
    something4.setText("No. of Days old : 1");
    //something5.setText("Consumable : Yes");
    imageView.setImageResource(R.drawable.crushedpeel);
}

else if(code==70)
{
    appname.setVisibility(View.GONE);
    //something1.setVisibility(View.VISIBLE);
    //something2.setVisibility(View.VISIBLE);
    something3.setVisibility(View.VISIBLE);
    something4.setVisibility(View.VISIBLE);
    something5.setVisibility(View.VISIBLE);
    titles.setVisibility(View.VISIBLE);
    titles.setText("Category : Non Ogranic");
   // something1.setText("Food Status : Spoiled");
    // something2.setText("Decaying Index :");
    something3.setText("Item Name : Solder Flux");
    something4.setText("No. of Days old : 0");
    something5.setText("Consumable : No");
    imageView.setImageResource(R.drawable.soldierflux);
}
else if(code==80)
{
    appname.setVisibility(View.GONE);
    //something1.setVisibility(View.VISIBLE);
    //something2.setVisibility(View.VISIBLE);
    something3.setVisibility(View.VISIBLE);
    something4.setVisibility(View.VISIBLE);
    titles.setVisibility(View.VISIBLE);
    something5.setVisibility(View.VISIBLE);
    titles.setText("Category : Non Organic");
    //something1.setText("Food Status : Spoiled");
    // something2.setText("Decaying Index :");
    something3.setText("Item Name : Coffee");
    something4.setText("No. of Days old : 0");
    something5.setText("Consumable : Yes");
    imageView.setImageResource(R.drawable.coffee);
}
else if(code==90)
{
    appname.setVisibility(View.GONE);
    something1.setVisibility(View.VISIBLE);
    //something2.setVisibility(View.VISIBLE);
    something3.setVisibility(View.VISIBLE);
    something4.setVisibility(View.VISIBLE);
    something5.setVisibility(View.VISIBLE);
    titles.setVisibility(View.VISIBLE);
    titles.setText("Category : Non Organic");
    something1.setText("Food Status : Fresh");
    // something2.setText("Decaying Index :");
    something3.setText("Item Name : Bread");
    something4.setText("No. of Days old : 0");
    something5.setText("Consumable : Yes");
    imageView.setImageResource(R.drawable.bread);
}
else if(code==91)
{
    appname.setVisibility(View.GONE);
    something1.setVisibility(View.VISIBLE);
    //something2.setVisibility(View.VISIBLE);
    something3.setVisibility(View.VISIBLE);
    something4.setVisibility(View.VISIBLE);
    something5.setVisibility(View.VISIBLE);
    titles.setVisibility(View.VISIBLE);
    titles.setText("Category : Non Organic");
    something1.setText("Food Status : Burned");
    // something2.setText("Decaying Index :");
    something3.setText("Item Name : Bread");
    something4.setText("No. of Days old : 1");
    something5.setText("Consumable : No");
    imageView.setImageResource(R.drawable.burnedbread);
}
else
{
    appname.setVisibility(View.VISIBLE);
    appname.setText("No Item Found");
    something1.setVisibility(View.GONE);
    something2.setVisibility(View.GONE);
    something3.setVisibility(View.GONE);
    something4.setVisibility(View.GONE);
    something5.setVisibility(View.GONE);
    titles.setVisibility(View.GONE);
    imageView.setImageResource(R.drawable.noitem);
}
        bar3.setVisibility(View.GONE);

    }
    public void progress(){
        bar3.setVisibility(View.VISIBLE);
    }
}
