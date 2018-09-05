package cn.chipsgateway.currentlimiting;

public abstract class AbstractCurrentlimiter {


    protected ICurrentlimitingDataSource iCurrentlimitingDataSource;
    protected CurrentlimiterConfig currentlimiterConfig;

    abstract Boolean runCurrentLimiting();

    abstract void setiCurrentlimitingDataSource(ICurrentlimitingDataSource iCurrentlimitingDataSource);

    abstract void setCurrentlimiterConfig(CurrentlimiterConfig currentlimiterConfig);

}