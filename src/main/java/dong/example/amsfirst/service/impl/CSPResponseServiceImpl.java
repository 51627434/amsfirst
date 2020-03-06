package dong.example.amsfirst.service.impl;

import dong.example.amsfirst.dao.CspresponseserviceMapper;
import dong.example.amsfirst.pojo.CspresponseservicePo;
import dong.example.amsfirst.pojo.ResultNotifyReqPo;
import dong.example.amsfirst.pojo.ResultNotifyResPo;
import dong.example.amsfirst.service.ICSPResponseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("cspResponseService")
public class CSPResponseServiceImpl implements ICSPResponseService {

    @Autowired
    private CspresponseserviceMapper cspresponseserviceMapper;
    @Override
    public ResultNotifyResPo reciveCSPResponseServic(ResultNotifyReqPo resultNotifyReqPo) {


        CspresponseservicePo cspresponseservicePo = new CspresponseservicePo();

        cspresponseservicePo.setCspId(resultNotifyReqPo.getCspId());

        cspresponseservicePo.setLspId(resultNotifyReqPo.getCspId());
        cspresponseservicePo.setLspId(resultNotifyReqPo.getLspId());
        cspresponseservicePo.setCorrelateId(resultNotifyReqPo.getCorrelateId());
        cspresponseservicePo.setCmdResult(resultNotifyReqPo.getCmdResult());
        cspresponseservicePo.setResultFileURL(resultNotifyReqPo.getResultFileURL());

        System.out.println("service-----CSPResponseServiceImpl----cspresponseservicePo.getCmdResult()"+":"+cspresponseservicePo.getCmdResult());

        cspresponseserviceMapper.insert(cspresponseservicePo);


        ResultNotifyResPo resultNotifyResPo = new ResultNotifyResPo();
        resultNotifyResPo.setResult(0);
        resultNotifyResPo.setErrorDescription("成功"+resultNotifyReqPo.getCorrelateId());
        System.out.println("service-----CSPResponseServiceImpl----reciveCSPResponseServic"+"成功"+resultNotifyReqPo.getCorrelateId());
        return resultNotifyResPo;
    }
}
