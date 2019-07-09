package com.tydic.cbss.oracle.po;

import java.util.Date;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
* Created by Mybatis Generator 
* @author legend 
* @date 2019-07-05 14:38:35
*/
@Data
@EqualsAndHashCode
public class TfBUserActiveRecord {
    private Long activeRecordId;

    private Short partitionId;

    private Long subsId;

    private String accNbr;

    private Long actionCode;

    private Long eventId;

    private Integer actionType;

    private Long ruleGroup;

    private Date activeTime;

    private Date startTime;

    private Date endTime;

    private Date endCycleTime;

    private Integer activeSource;
}