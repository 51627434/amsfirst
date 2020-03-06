package dong.example.amsfirst.service.impl;

import dong.example.amsfirst.pojo.ExecCmdReqPo;
import dong.example.amsfirst.pojo.ExecCmdResPo;
import dong.example.amsfirst.service.ICSPRequestService;
import org.springframework.stereotype.Service;

@Service("cspRequestService")
public class CSPRequestServiceImpl implements ICSPRequestService {
    @Override
    public ExecCmdResPo reciveCSPRequestService(ExecCmdReqPo execCmdReqPo) {

        ExecCmdResPo execCmdResPo =  new ExecCmdResPo();
        execCmdResPo.setResult(0);
        execCmdResPo.setErrorDescription("成功"+execCmdReqPo.getCorrelateId());
        System.out.println("service-----CSPRequestServiceImpl----reciveCSPRequestService"+"成功"+execCmdReqPo.getCorrelateId());
        return execCmdResPo;
    }
}
