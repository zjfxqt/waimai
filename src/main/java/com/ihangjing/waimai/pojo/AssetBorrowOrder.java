package com.ihangjing.waimai.pojo;

import java.math.BigDecimal;
import java.util.Date;

public class AssetBorrowOrder {
    private Integer id;

    private Integer userId;

    private String outTradeNo;

    private Integer orderType;

    private Integer moneyAmount;

    private Integer apr;

    private Integer loanInterests;

    private Integer intoMoney;

    private Integer loanMethod;

    private Integer loanTerm;

    private String operatorName;

    private Date createdAt;

    private Date updatedAt;

    private Date orderTime;

    private String loanTime;

    private String loanEndTime;

    private Integer lateFeeApr;

    private Integer receiveCardId;

    private Integer debitCardId;

    private Date verifyTrialTime;

    private String verifyTrialRemark;

    private String verifyTrialUser;

    private String verifyReviewTime;

    private String verifyReviewRemark;

    private String verifyReviewUser;

    private Date verifyLoanTime;

    private String verifyLoanRemark;

    private String verifyLoanUser;

    private Integer capitalType;

    private String reasonRemark;

    private Integer creditLv;

    private Byte isHitRiskRule;

    private Byte autoRiskCheckStatus;

    private Integer customerType;

    private String yurref;

    private String serialNo;

    private String idNumber;

    private String userPhone;

    private String realname;

    private String cardNo;

    private String bankNumber;

    private Integer bankIscmb;

    private Integer status;

    private String payRemark;

    private String payStatus;

    private String clientType;

    private String autoVersion;

    private Integer autoResult;

    private Byte autoFlag;

    private Byte autoLoanFlag;

    private Integer reviewBackUserId;

    private String reviewBackUserName;

    private Integer reviewStatus;

    private Date distributeTime;

    private String cfcaContractId;

    private String projectName;

    private Date datachangetime;

    private BigDecimal renewalFee;

    private BigDecimal renewalPoundage;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getOutTradeNo() {
        return outTradeNo;
    }

    public void setOutTradeNo(String outTradeNo) {
        this.outTradeNo = outTradeNo;
    }

    public Integer getOrderType() {
        return orderType;
    }

    public void setOrderType(Integer orderType) {
        this.orderType = orderType;
    }

    public Integer getMoneyAmount() {
        return moneyAmount;
    }

    public void setMoneyAmount(Integer moneyAmount) {
        this.moneyAmount = moneyAmount;
    }

    public Integer getApr() {
        return apr;
    }

    public void setApr(Integer apr) {
        this.apr = apr;
    }

    public Integer getLoanInterests() {
        return loanInterests;
    }

    public void setLoanInterests(Integer loanInterests) {
        this.loanInterests = loanInterests;
    }

    public Integer getIntoMoney() {
        return intoMoney;
    }

    public void setIntoMoney(Integer intoMoney) {
        this.intoMoney = intoMoney;
    }

    public Integer getLoanMethod() {
        return loanMethod;
    }

    public void setLoanMethod(Integer loanMethod) {
        this.loanMethod = loanMethod;
    }

    public Integer getLoanTerm() {
        return loanTerm;
    }

    public void setLoanTerm(Integer loanTerm) {
        this.loanTerm = loanTerm;
    }

    public String getOperatorName() {
        return operatorName;
    }

    public void setOperatorName(String operatorName) {
        this.operatorName = operatorName;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public Date getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    public Date getOrderTime() {
        return orderTime;
    }

    public void setOrderTime(Date orderTime) {
        this.orderTime = orderTime;
    }

    public String getLoanTime() {
        return loanTime;
    }

    public void setLoanTime(String loanTime) {
        this.loanTime = loanTime;
    }

    public String getLoanEndTime() {
        return loanEndTime;
    }

    public void setLoanEndTime(String loanEndTime) {
        this.loanEndTime = loanEndTime;
    }

    public Integer getLateFeeApr() {
        return lateFeeApr;
    }

    public void setLateFeeApr(Integer lateFeeApr) {
        this.lateFeeApr = lateFeeApr;
    }

    public Integer getReceiveCardId() {
        return receiveCardId;
    }

    public void setReceiveCardId(Integer receiveCardId) {
        this.receiveCardId = receiveCardId;
    }

    public Integer getDebitCardId() {
        return debitCardId;
    }

    public void setDebitCardId(Integer debitCardId) {
        this.debitCardId = debitCardId;
    }

    public Date getVerifyTrialTime() {
        return verifyTrialTime;
    }

    public void setVerifyTrialTime(Date verifyTrialTime) {
        this.verifyTrialTime = verifyTrialTime;
    }

    public String getVerifyTrialRemark() {
        return verifyTrialRemark;
    }

    public void setVerifyTrialRemark(String verifyTrialRemark) {
        this.verifyTrialRemark = verifyTrialRemark;
    }

    public String getVerifyTrialUser() {
        return verifyTrialUser;
    }

    public void setVerifyTrialUser(String verifyTrialUser) {
        this.verifyTrialUser = verifyTrialUser;
    }

    public String getVerifyReviewTime() {
        return verifyReviewTime;
    }

    public void setVerifyReviewTime(String verifyReviewTime) {
        this.verifyReviewTime = verifyReviewTime;
    }

    public String getVerifyReviewRemark() {
        return verifyReviewRemark;
    }

    public void setVerifyReviewRemark(String verifyReviewRemark) {
        this.verifyReviewRemark = verifyReviewRemark;
    }

    public String getVerifyReviewUser() {
        return verifyReviewUser;
    }

    public void setVerifyReviewUser(String verifyReviewUser) {
        this.verifyReviewUser = verifyReviewUser;
    }

    public Date getVerifyLoanTime() {
        return verifyLoanTime;
    }

    public void setVerifyLoanTime(Date verifyLoanTime) {
        this.verifyLoanTime = verifyLoanTime;
    }

    public String getVerifyLoanRemark() {
        return verifyLoanRemark;
    }

    public void setVerifyLoanRemark(String verifyLoanRemark) {
        this.verifyLoanRemark = verifyLoanRemark;
    }

    public String getVerifyLoanUser() {
        return verifyLoanUser;
    }

    public void setVerifyLoanUser(String verifyLoanUser) {
        this.verifyLoanUser = verifyLoanUser;
    }

    public Integer getCapitalType() {
        return capitalType;
    }

    public void setCapitalType(Integer capitalType) {
        this.capitalType = capitalType;
    }

    public String getReasonRemark() {
        return reasonRemark;
    }

    public void setReasonRemark(String reasonRemark) {
        this.reasonRemark = reasonRemark;
    }

    public Integer getCreditLv() {
        return creditLv;
    }

    public void setCreditLv(Integer creditLv) {
        this.creditLv = creditLv;
    }

    public Byte getIsHitRiskRule() {
        return isHitRiskRule;
    }

    public void setIsHitRiskRule(Byte isHitRiskRule) {
        this.isHitRiskRule = isHitRiskRule;
    }

    public Byte getAutoRiskCheckStatus() {
        return autoRiskCheckStatus;
    }

    public void setAutoRiskCheckStatus(Byte autoRiskCheckStatus) {
        this.autoRiskCheckStatus = autoRiskCheckStatus;
    }

    public Integer getCustomerType() {
        return customerType;
    }

    public void setCustomerType(Integer customerType) {
        this.customerType = customerType;
    }

    public String getYurref() {
        return yurref;
    }

    public void setYurref(String yurref) {
        this.yurref = yurref;
    }

    public String getSerialNo() {
        return serialNo;
    }

    public void setSerialNo(String serialNo) {
        this.serialNo = serialNo;
    }

    public String getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(String idNumber) {
        this.idNumber = idNumber;
    }

    public String getUserPhone() {
        return userPhone;
    }

    public void setUserPhone(String userPhone) {
        this.userPhone = userPhone;
    }

    public String getRealname() {
        return realname;
    }

    public void setRealname(String realname) {
        this.realname = realname;
    }

    public String getCardNo() {
        return cardNo;
    }

    public void setCardNo(String cardNo) {
        this.cardNo = cardNo;
    }

    public String getBankNumber() {
        return bankNumber;
    }

    public void setBankNumber(String bankNumber) {
        this.bankNumber = bankNumber;
    }

    public Integer getBankIscmb() {
        return bankIscmb;
    }

    public void setBankIscmb(Integer bankIscmb) {
        this.bankIscmb = bankIscmb;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getPayRemark() {
        return payRemark;
    }

    public void setPayRemark(String payRemark) {
        this.payRemark = payRemark;
    }

    public String getPayStatus() {
        return payStatus;
    }

    public void setPayStatus(String payStatus) {
        this.payStatus = payStatus;
    }

    public String getClientType() {
        return clientType;
    }

    public void setClientType(String clientType) {
        this.clientType = clientType;
    }

    public String getAutoVersion() {
        return autoVersion;
    }

    public void setAutoVersion(String autoVersion) {
        this.autoVersion = autoVersion;
    }

    public Integer getAutoResult() {
        return autoResult;
    }

    public void setAutoResult(Integer autoResult) {
        this.autoResult = autoResult;
    }

    public Byte getAutoFlag() {
        return autoFlag;
    }

    public void setAutoFlag(Byte autoFlag) {
        this.autoFlag = autoFlag;
    }

    public Byte getAutoLoanFlag() {
        return autoLoanFlag;
    }

    public void setAutoLoanFlag(Byte autoLoanFlag) {
        this.autoLoanFlag = autoLoanFlag;
    }

    public Integer getReviewBackUserId() {
        return reviewBackUserId;
    }

    public void setReviewBackUserId(Integer reviewBackUserId) {
        this.reviewBackUserId = reviewBackUserId;
    }

    public String getReviewBackUserName() {
        return reviewBackUserName;
    }

    public void setReviewBackUserName(String reviewBackUserName) {
        this.reviewBackUserName = reviewBackUserName;
    }

    public Integer getReviewStatus() {
        return reviewStatus;
    }

    public void setReviewStatus(Integer reviewStatus) {
        this.reviewStatus = reviewStatus;
    }

    public Date getDistributeTime() {
        return distributeTime;
    }

    public void setDistributeTime(Date distributeTime) {
        this.distributeTime = distributeTime;
    }

    public String getCfcaContractId() {
        return cfcaContractId;
    }

    public void setCfcaContractId(String cfcaContractId) {
        this.cfcaContractId = cfcaContractId;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public Date getDatachangetime() {
        return datachangetime;
    }

    public void setDatachangetime(Date datachangetime) {
        this.datachangetime = datachangetime;
    }

    public BigDecimal getRenewalFee() {
        return renewalFee;
    }

    public void setRenewalFee(BigDecimal renewalFee) {
        this.renewalFee = renewalFee;
    }

    public BigDecimal getRenewalPoundage() {
        return renewalPoundage;
    }

    public void setRenewalPoundage(BigDecimal renewalPoundage) {
        this.renewalPoundage = renewalPoundage;
    }
}