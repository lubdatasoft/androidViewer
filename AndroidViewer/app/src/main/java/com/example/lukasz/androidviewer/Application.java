package com.example.lukasz.androidviewer;

/**
 * Created by lukasz on 12.06.2016.
 */
public class Application {
    private ApplicationState applicationState;
    private static Application ourInstance = new Application();

    public static Application getInstance() {
        return ourInstance;
    }

    private Application() {
       setApplicationState(ApplicationState.Demo);
    }

    public ApplicationState getApplicationState() {
        return applicationState;
    }

    public void setApplicationState(ApplicationState applicationState) {
        this.applicationState = applicationState;
    }
}
