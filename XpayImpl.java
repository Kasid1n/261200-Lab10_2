public class XpayImpl implements Xpay{
    private String creditCardNo;
    private String customerName;
    private String cExpMonth;
    private String cExpYear;
    private Short cCVVNo;
    private Double amount;

    @Override
    public String getCreditCardNo() {
        return creditCardNo;
    }

    @Override
    public void setCreditCardNo(String creditCardNo) {
        this.creditCardNo = creditCardNo;
    }

    @Override
    public String getCustomerName(){
        return customerName;
    }

    @Override
    public void setCustomerName(String customerName){
        this.customerName = customerName;
    }

    @Override
    public String getCardExpMonth(){
        return cExpMonth;
    }

    @Override
    public void setCardExpMonth(String cardExpMonth){
        this.cExpMonth = cardExpMonth;
    }

    @Override
    public String getCardExpYear(){
        return cExpYear;
    }

    @Override
    public void setCardExpYear(String cardExpYear){
        this.cExpYear = cardExpYear;
    }

    @Override
    public Short getCardCVVNo(){
        return cCVVNo;
    }

    @Override
    public void setCardCVVNo(Short cardCVVNo){
        this.cCVVNo = cardCVVNo;
    }

    @Override
    public Double getAmount(){
        return amount;
    }

    @Override
    public void setAmount(Double amount){
        this.amount = amount;
    }
}
