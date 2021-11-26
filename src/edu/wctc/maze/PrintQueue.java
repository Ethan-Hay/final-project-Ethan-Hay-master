package edu.wctc.maze;

import java.util.*;

public enum PrintQueue {
    INSTANCE;
    private static List<String> queue = new ArrayList<String>();
    public static void enqueue(String s)
    {
        queue.add(s);
    }
    public static String flush()
    {
        String full = "";
        for(int x = 0; x < queue.size(); x++)
        {
            full += (queue.get(x) + "\n");
        }
        queue.clear();
        return full;
        
    }
}
    

