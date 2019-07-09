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
@EqualsAndHashCode(callSuper=true)
public class TfBDiscntDeposit extends TfBDiscntDepositKey {
    private Integer actionRuleId;

    private Long chargeId;

    private String eparchyCode;

    private Long acctBalanceId;

    private Integer actionCode;

    private Integer condId;

    private String outerTradeId;

    private Long acctId;

    private Long userId;

    private String discntType;

    private Integer discntItemId;

    private String discntMode;

    private Long money;

    private Long leftMoney;

    private Short months;

    private String limitMode;

    private String splitMethod;

    private Long limitMoney;

    private String delayTag;

    private Integer startCycleId;

    private Integer endCycleId;

    private String timerType;

    private Integer itemGrpId;

    private Integer desDepositCode;

    private Integer perSmsId;

    private Integer lastSmsId;

    private Short fireDay;

    private Integer firedMonth;

    private String ifTrans;

    private Long relActionEventId;

    private Date recvTime;

    private String recvEparchyCode;

    private String recvCityCode;

    private String recvDepartId;

    private String recvStaffId;

    private String canUseTag;

    private String rsrvInfo;

    private Long rsrvFee;

    private String cancelTag;

    private Short versionNo;

    private Long sumConsume;

    private String resultInfo;

    private String canPreTrans;

    private String netTypeCode;

    private Integer depositCode;

    private Long discountCode;

    private Date rsrvDate1;

    private Date activeTime;

    private String cancelStaffId;

    private String cancelDepartId;

    private String cancelCityCode;

    private String cancelEparchyCode;

    private Date cancelTime;

    private Date nextDate;

    private Integer pDepositCode;

    private String ifStopTrans;

    private Integer consumeThreshold;

    private Long batchId;

    private String transFormula;

    private Date execDate;

    private Integer transMonths;

    private Long recvUserId;

    private String provinceCode;

    private Long productMoney;

    private Integer productStartCycle;

    private Integer productEndCycle;

    private Long activeRecordId;
}