package com.francobm.streamevents.api.cache.events;

import com.francobm.streamevents.utils.SENotInstalledException;

public class EventGoal<T extends Comparable<T>> {

    public boolean reachGoal(){
        throw new SENotInstalledException();
    }

    public T getGoal() {
        throw new SENotInstalledException();
    }

    public String getCondition() {
        throw new SENotInstalledException();
    }

    public T getCurrent() {
        throw new SENotInstalledException();
    }

    public void setCurrent(T current) {
        throw new SENotInstalledException();
    }

    public void increaseCurrent(){
        throw new SENotInstalledException();
    }

    public void decreaseCurrent(){
        throw new SENotInstalledException();
    }

    public void modifyCurrent(Object... variables){
        throw new SENotInstalledException();
    }

    public T getStart() {
        throw new SENotInstalledException();
    }

    public void resetCurrent(){
        throw new SENotInstalledException();
    }

    public ValueType getValueType() {
        throw new SENotInstalledException();
    }
}
