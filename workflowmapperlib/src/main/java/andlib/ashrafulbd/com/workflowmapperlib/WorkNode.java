package andlib.ashrafulbd.com.workflowmapperlib;

import android.app.Activity;

import java.util.ArrayList;
import java.util.List;
import android.view.View;

/**
 * Created by MR on 21-Feb-17.
 */

public class WorkNode {
    private Activity activity;
    private int action;
    private View view;

    private List<WorkNode> parents;
    private List<WorkNode> children;

    public Activity getActivity() {
        return activity;
    }

    public void setActivity(Activity activity) {
        this.activity = activity;
    }

    public int getAction() {
        return action;
    }

    public void setAction(int action) {
        this.action = action;
    }

    public View getView() {
        return view;
    }

    public void setView(View view) {
        this.view = view;
    }

    public void addParent(WorkNode parentNode){
        if(parents == null){
            parents = new ArrayList<>();
        }

        parents.add(parentNode);
    }

    public void addChild(WorkNode childNode){
        if(children == null){
            children = new ArrayList<>();
        }

        children.add(childNode);
    }

    public List<WorkNode> getParents() {
        return parents;
    }

    public List<WorkNode> getChildren() {
        return children;
    }
}
