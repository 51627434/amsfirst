package dong.example.amsfirst.dao;

import dong.example.amsfirst.pojo.CsprequestservicePo;
import org.apache.ibatis.annotations.Insert;

public interface CsprequestserviceMapper {


//    private Integer id;
//    private String cspId;
//    private String lspId;
//    private String correlateId;
//    private String cmdFileUrl;


    @Insert("INSERT INTO csprequestservice(cspId,lspId,correlateId,cmdFileUrl) VALUES(#{cspId}, #{lspId}, #{correlateId}, #{cmdFileUrl})")
    void insert(CsprequestservicePo po);
}
