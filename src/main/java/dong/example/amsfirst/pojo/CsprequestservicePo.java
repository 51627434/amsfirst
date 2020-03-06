package dong.example.amsfirst.pojo;

public class CsprequestservicePo {

    private Integer id;
    private String cspId;
    private String lspId;
    private String correlateId;
    private String cmdFileUrl;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

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

    public String getCmdFileUrl() {
        return cmdFileUrl;
    }

    public void setCmdFileUrl(String cmdFileUrl) {
        this.cmdFileUrl = cmdFileUrl;
    }

    @Override
    public String toString() {
        return "csprequestservicePo{" +
                "id=" + id +
                ", cspId='" + cspId + '\'' +
                ", lspId='" + lspId + '\'' +
                ", correlateId='" + correlateId + '\'' +
                ", cmdFileUrl='" + cmdFileUrl + '\'' +
                '}';
    }
}
