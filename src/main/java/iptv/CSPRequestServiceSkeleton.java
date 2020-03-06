/**
 * CSPRequestServiceSkeleton.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.7.9  Built on : Nov 16, 2018 (12:05:37 GMT)
 */
package iptv;

import dong.example.amsfirst.pojo.ExecCmdReqPo;
import dong.example.amsfirst.pojo.ExecCmdResPo;
import dong.example.amsfirst.service.ICSPRequestService;
import dong.example.amsfirst.utils.AppUtils;
import dong.example.amsfirst.utils.PrintLog;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *  CSPRequestServiceSkeleton java skeleton for the axisService
 */
public class CSPRequestServiceSkeleton
    implements CSPRequestServiceSkeletonInterface {
    /**
     * Auto generated method signature
     *
     * @param execCmd0
     * @return execCmdResponse1
     */
    public iptv.ExecCmdResponse execCmd(iptv.ExecCmd execCmd0) {
        //TODO : fill this with the necessary business logic
//        throw new UnsupportedOperationException("Please implement " +
//            this.getClass().getName() + "#execCmd");

        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//设置日期格式
        ExecCmdResponse res = new ExecCmdResponse();

        //获取接收的参数，并将参数赋值给对象
        System.out.println("c2--CSPRequestService---in");
        String cspId;
        String lspId;
        String correlateId;
        String cmdFileURL;
        ExecCmdReqPo execCmdReqPo = new ExecCmdReqPo();
        execCmdReqPo.setCspId(execCmd0.getCSPID().toString());
        execCmdReqPo.setLspId(execCmd0.getLSPID().toString());
        execCmdReqPo.setCorrelateId(execCmd0.getCorrelateID().toString());
        execCmdReqPo.setCmdFileUrl(execCmd0.getCmdFileURL().toString());

        //获取service bean
        ICSPRequestService cspRequestService;
        System.out.println("c2--CSPRequestService---getcspRequestService");
        cspRequestService = (ICSPRequestService) AppUtils.getObject("cspRequestService");
        //调用并获取返回对象
        ExecCmdResPo execCmdResPo = cspRequestService.reciveCSPRequestService(execCmdReqPo);


//        PrintLog p;
//        p  = (PrintLog) AppUtils.getObject("printLog");
//        System.out.println("execCmd ------------p:"+p);
        CSPResult result = new CSPResult();

       // result.setResult(2000);
        org.apache.axis2.databinding.types.soapencoding.String desc = new org.apache.axis2.databinding.types.soapencoding.String();
        //desc.setString("CmdFileURL:"+execCmd0.getCmdFileURL()+"时间"+df.format(new Date())+"---CSPID:"+execCmd0.getCSPID()+"---LSPID:"+execCmd0.getLSPID()+"---CorrelateID:"+execCmd0.getCorrelateID());
       //System.out.println(desc);
        //System.out.println(p.outLog());
        //result.setErrorDescription(desc);


        desc.setString(execCmdResPo.getErrorDescription());
        result.setResult(execCmdResPo.getResult());
        result.setErrorDescription(desc);
        res.setExecCmdReturn(result);
        return res;
    }
}
