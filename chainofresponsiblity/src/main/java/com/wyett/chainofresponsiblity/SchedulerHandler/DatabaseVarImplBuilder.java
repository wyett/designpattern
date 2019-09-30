package com.wyett.chainofresponsiblity.SchedulerHandler;

/**
 * @author : wyettLei
 * @date : Created in 2019/9/30 15:26
 * @description: TODO
 */

public class DatabaseVarImplBuilder implements DatabaseVarBuilder {
    private DatabaseVar databaseVar;
    public DatabaseVarImplBuilder() {
        this.databaseVar = new DatabaseVar();
    }

    @Override
    public void setDatabaseName() {
        databaseVar.setDatabasename("");
    }

    @Override
    public void setDatabaseType() {
        databaseVar.getDatabasetype();
    }

    @Override
    public void setDatabaseVersion("") {
        databaseVar.setDatabaseversion("");
    }

    @Override
    public void setQpsAvg() {
        databaseVar.setQpsAvg();
    }

    @Override
    public void setQpsMax() {
        databaseVar.setQpsMax();
    }

    @Override
    public void setWriteLinePerDay() {
        databaseVar.setWriteLinePerDay();
    }

    @Override
    public DatabaseVar getDatabaseVarBuilder() {
        return this.databaseVar;
    }
}
