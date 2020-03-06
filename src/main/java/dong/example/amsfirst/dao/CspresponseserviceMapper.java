package dong.example.amsfirst.dao;

import dong.example.amsfirst.pojo.CspresponseservicePo;
import org.apache.ibatis.annotations.Insert;

public interface CspresponseserviceMapper {
//    private Integer id;
//    private String cspId;
//    private String lspId;
//    private String correlateId;
//    private Integer cmdResult;
//    private String resultFileURL;



    @Insert("INSERT INTO cspresponseservice(cspId,lspId,correlateId,cmdResult,resultFileURL) VALUES(#{cspId}, #{lspId}, #{correlateId}, #{cmdResult}, #{resultFileURL})")
    void insert(CspresponseservicePo po);
}
