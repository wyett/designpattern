package com.wyett.chainofresponsiblity.SchedulerHandler;

/**
 * @author : wyettLei
 * @date : Created in 2019/9/30 14:38
 * @description: TODO
 */

public interface DatabaseVarBuilder {
    void setDatabaseName();
    void setDatabaseType();
    void setDatabaseVersion();
    void setQpsAvg();
    void setQpsMax();
    void setWriteLinePerDay();
    DatabaseVar getDatabaseVarBuilder();
}
