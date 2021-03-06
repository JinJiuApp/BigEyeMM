package dao;

// THIS CODE IS GENERATED BY greenDAO, EDIT ONLY INSIDE THE "KEEP"-SECTIONS

// KEEP INCLUDES - put your custom includes here
// KEEP INCLUDES END
/**
 * Entity mapped to table BANK_ITEM.
 */
public class BankItem {

    private Long id;
    private String payeeName;
    private String payeeCardNo;
    private String bankName;
    private String userId;
    private java.util.Date updateTime;

    // KEEP FIELDS - put your custom fields here
    // KEEP FIELDS END

    public BankItem() {
    }

    public BankItem(Long id) {
        this.id = id;
    }

    public BankItem(Long id, String payeeName, String payeeCardNo, String bankName, String userId, java.util.Date updateTime) {
        this.id = id;
        this.payeeName = payeeName;
        this.payeeCardNo = payeeCardNo;
        this.bankName = bankName;
        this.userId = userId;
        this.updateTime = updateTime;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPayeeName() {
        return payeeName;
    }

    public void setPayeeName(String payeeName) {
        this.payeeName = payeeName;
    }

    public String getPayeeCardNo() {
        return payeeCardNo;
    }

    public void setPayeeCardNo(String payeeCardNo) {
        this.payeeCardNo = payeeCardNo;
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public java.util.Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(java.util.Date updateTime) {
        this.updateTime = updateTime;
    }

    // KEEP METHODS - put your custom methods here
    // KEEP METHODS END

}
