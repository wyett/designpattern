package com.wyett.chainofresponsiblity.SchedulerHandler;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * @author : wyettLei
 * @date : Created in 2019/9/30 15:17
 * @description: TODO
 * @modified By:
 * @version: $
 */

@Setter
@Getter
@ToString
public class DatabaseVar {
    private String databasename;
    private String databasetype;
    private String databaseversion;
    private int qpsAvg;
    private int qpsMax;
    private int writeLinePerDay;
}
