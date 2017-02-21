package andlib.ashrafulbd.com.workflowmapperlib;

import android.app.Activity;
import android.content.Context;
import android.view.View;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by MR on 21-Feb-17.
 */

public class Mapper {

    public static final int ACTION_CLICK = 0x9011;
    public static final int ACTION_TOUCH = 0x9012;
    public static final int ACTION_LONG_PRESS = 0x9013;
    public static final int ACTION_BACK_PRESS = 0X9014;
    public static final int ACTION_SWIPE_LEFT = 0x9021;
    public static final int ACTION_SWIPE_RIGHT = 0x9022;
    public static final int ACTION_SWIPE_UP = 0x9023;
    public static final int ACTION_SWIPE_DOWN = 0X9024;
    public static final int ACTION_SWIPE_PATTERN = 0x9025;

    private static Mapper mapperInstance = null;
    private Mapper(){
        workNodes = new ArrayList<>();
    }

    private List<WorkNode> workNodes;

    private int markerPos = -1;
    private int lastMakerPos = -1;

    public static synchronized Mapper getInstance(){
        synchronized (mapperInstance){
            if(mapperInstance == null){
                mapperInstance = new Mapper();
            }
        }
        return mapperInstance;
    }

    public void addAction(Activity activity, View view, int action){
        WorkNode existingNode = getExistNode(activity);
        if(existingNode != null){
            //If back pressed or back action pressed, nothing to do
            if(action != ACTION_BACK_PRESS){
                WorkNode lastNode = workNodes.get(lastMakerPos);
                existingNode.addParent(lastNode);
                lastNode.addChild(existingNode);
                lastMakerPos = markerPos;
            }
        }
        else{
            //Prepare node
            WorkNode workNode = new WorkNode();
            workNode.setAction(action);
            workNode.setActivity(activity);
            workNode.setView(view);

            //Find parent
            if(markerPos >= 0){
                WorkNode pNode = workNodes.get(markerPos);
                workNode.addParent(pNode);
                pNode.addChild(workNode);
            }

            workNodes.add(workNode);
            markerPos++;
            lastMakerPos++;
        }

        updateValueToFile();
    }

    private WorkNode getExistNode(Activity activity){
        if(workNodes.isEmpty()) return null;
        String newAcName = activity.getPackageName() + "." + activity.getLocalClassName();
        int i = 0;
        int n = workNodes.size();
        WorkNode workNode;
        for (i = 0; i < n; i++) {
            workNode = workNodes.get(i);
            String existingName = workNode.getActivity().getPackageName() + "." + workNode.getActivity().getLocalClassName();
            if(newAcName.equals(existingName)) {
                markerPos = i;
                return workNode;
            }
        }

        return null;
    }

    //Update value to a json file
    private void updateValueToFile(){
        //TODO: add a json file in sd card and update value to that
    }
}
