package com.model;

public class ReimbursementClaimHolder {
    private ReimbursementClaim reimbursementClaim;
    private final static ReimbursementClaimHolder INSTANCE = new ReimbursementClaimHolder();
    private ReimbursementClaimHolder(){};

    public static ReimbursementClaimHolder getInstance(){
        return INSTANCE;
    }

    public void setReimbursementClaim(ReimbursementClaim reimbursementClaim){
        this.reimbursementClaim = reimbursementClaim;
    }

    public ReimbursementClaim getReimbursementClaim(){
        return reimbursementClaim;
    }

}
