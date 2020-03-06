package dong.example.amsfirst.service.impl;

import dong.example.amsfirst.dao.CsprequestserviceMapper;
import dong.example.amsfirst.pojo.CsprequestservicePo;
import dong.example.amsfirst.pojo.ExecCmdReqPo;
import dong.example.amsfirst.pojo.ExecCmdResPo;
import dong.example.amsfirst.service.ICSPRequestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("cspRequestService")
public class CSPRequestServiceImpl implements ICSPRequestService {

    @Autowired
    private CsprequestserviceMapper csprequestserviceMapper;

    @Override
    public ExecCmdResPo reciveCSPRequestService(ExecCmdReqPo execCmdReqPo) {

        CsprequestservicePo csprequestservicePo  = new CsprequestservicePo();
        csprequestservicePo.setCspId(execCmdReqPo.getCspId());
        csprequestservicePo.setLspId(execCmdReqPo.getLspId());
        csprequestservicePo.setCorrelateId(execCmdReqPo.getCorrelateId());
        csprequestservicePo.setCmdFileUrl(execCmdReqPo.getCmdFileUrl());




        csprequestserviceMapper.insert(csprequestservicePo);



        ExecCmdResPo execCmdResPo =  new ExecCmdResPo();
        execCmdResPo.setResult(0);
        execCmdResPo.setErrorDescription("成功"+execCmdReqPo.getCorrelateId());
        System.out.println("service-----CSPRequestServiceImpl----reciveCSPRequestService"+"成功"+execCmdReqPo.getCorrelateId());
        return execCmdResPo;
    }
}
