package dong.example.amsfirst.service.impl;

import dong.example.amsfirst.pojo.ResultNotifyReqPo;
import dong.example.amsfirst.pojo.ResultNotifyResPo;
import dong.example.amsfirst.service.ICSPResponseService;
import org.springframework.stereotype.Service;

@Service("cspResponseService")
public class CSPResponseServiceImpl implements ICSPResponseService {
    @Override
    public ResultNotifyResPo reciveCSPResponseServic(ResultNotifyReqPo resultNotifyReqPo) {

        ResultNotifyResPo resultNotifyResPo = new ResultNotifyResPo();
        resultNotifyResPo.setResult(0);
        resultNotifyResPo.setErrorDescription("成功"+resultNotifyReqPo.getCorrelateId());
        System.out.println("service-----CSPResponseServiceImpl----reciveCSPResponseServic"+"成功"+resultNotifyReqPo.getCorrelateId());
        return resultNotifyResPo;
    }
}
