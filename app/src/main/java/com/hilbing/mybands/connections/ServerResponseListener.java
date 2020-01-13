package com.hilbing.mybands.connections;

import com.hilbing.mybands.AppConstants;

public interface ServerResponseListener extends AppConstants {

    public void prepareRequest(Object... objects);
    public void goBackground(Object... objects);
    public void completedRequest(Object... objects);

}
