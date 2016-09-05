package com.example.vladislav.part1.model;

import com.example.vladislav.part1.R;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Vladislav on 6/27/2016.
 */
public class NavigationDrawerItem {

    private String title;
    private int imageId;

    public String getTitle(){return title;}

    public void setTitle(String title){this.title = title;}

    public int getImageId(){return imageId;}

    public void setImageId(int imageId){this.imageId = imageId;}

    //Return the list of all the NavigationDrawer items
    public static List<NavigationDrawerItem> getData(){
        List<NavigationDrawerItem> dataList = new ArrayList<>();

        int[]imageIds = getImages();
        String[]titles = getTitles();

        for(int i = 0; i< titles.length; i++){
            NavigationDrawerItem navItem = new NavigationDrawerItem();
            navItem.setTitle(titles[i]);
            navItem.setImageId(imageIds[i]);
            dataList.add(navItem);
        }
        return dataList;
    }

    private static int[] getImages(){
        return  new int[]{
                R.drawable.ic_birds, R.drawable.ic_animal,
                R.drawable.ic_forest, R.drawable.ic_ocean,
                R.drawable.ic_planet, R.drawable.ic_landscape};
    }

    private static String[]getTitles(){
        return new String[]{
                "Birds" , "Animals", "Forest", "Ocean",
                "Planet", "Landscape"};
    }
}
