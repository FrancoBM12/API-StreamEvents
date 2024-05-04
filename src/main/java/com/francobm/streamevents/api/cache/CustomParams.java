package com.francobm.streamevents.api.cache;

import com.francobm.streamevents.api.cache.actions.Action;
import com.francobm.streamevents.utils.SENotInstalledException;

import java.util.List;
import java.util.Map;

public class CustomParams {


    public Action getAction() {
        throw new SENotInstalledException();
    }

    public Map<String, Object> getParams() {
        throw new SENotInstalledException();
    }

    public boolean hasParam(String key){
        throw new SENotInstalledException();
    }

    public String getStringParam(String key){
        throw new SENotInstalledException();
    }

    public Double getDoubleParam(String key){
        throw new SENotInstalledException();
    }

    public Integer getIntParam(String key){
        throw new SENotInstalledException();
    }

    public Float getFloatParam(String key){
        throw new SENotInstalledException();
    }

    public Integer[] getIntsParam(String key){
        throw new SENotInstalledException();
    }

    public Boolean getBooleanParam(String key){
        throw new SENotInstalledException();
    }

    public List<?> getListParam(String key){
        throw new SENotInstalledException();
    }

    public void setAction(Action action) {
        throw new SENotInstalledException();
    }
}