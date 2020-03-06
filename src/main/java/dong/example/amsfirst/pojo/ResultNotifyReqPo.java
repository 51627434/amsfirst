package dong.example.amsfirst.pojo;

public class ResultNotifyReqPo {

    private String	cspId;
    private String	lspId;
    private String	correlateId;
    private Integer	cmdResult;
    private String	resultFileURL;

    public String getCspId() {
        return cspId;
    }

    public void setCspId(String cspId) {
        this.cspId = cspId;
    }

    public String getLspId() {
        return lspId;
    }

    public void setLspId(String lspId) {
        this.lspId = lspId;
    }

    public String getCorrelateId() {
        return correlateId;
    }

    public void setCorrelateId(String correlateId) {
        this.correlateId = correlateId;
    }

    public Integer getCmdResult() {
        return cmdResult;
    }

    public void setCmdResult(Integer cmdResult) {
        this.cmdResult = cmdResult;
    }

    public String getResultFileURL() {
        return resultFileURL;
    }

    public void setResultFileURL(String resultFileURL) {
        this.resultFileURL = resultFileURL;
    }

    @Override
    public String toString() {
        return "ResultNotifyReqPo{" +
                "cspId='" + cspId + '\'' +
                ", lspId='" + lspId + '\'' +
                ", correlateId='" + correlateId + '\'' +
                ", cmdResult=" + cmdResult +
                ", resultFileURL='" + resultFileURL + '\'' +
                '}';
    }
}
