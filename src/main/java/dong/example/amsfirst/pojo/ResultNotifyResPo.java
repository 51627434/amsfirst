package dong.example.amsfirst.pojo;

public class ResultNotifyResPo {
    private Integer result;
    private String errorDescription;

    public Integer getResult() {
        return result;
    }

    public void setResult(Integer result) {
        this.result = result;
    }

    public String getErrorDescription() {
        return errorDescription;
    }

    public void setErrorDescription(String errorDescription) {
        this.errorDescription = errorDescription;
    }

    @Override
    public String toString() {
        return "ExecCmdResPo{" +
                "result=" + result +
                ", errorDescription='" + errorDescription + '\'' +
                '}';
    }
}
