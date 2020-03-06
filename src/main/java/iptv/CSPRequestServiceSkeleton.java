/**
 * CSPRequestServiceSkeleton.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.7.9  Built on : Nov 16, 2018 (12:05:37 GMT)
 */
package iptv;

import dong.example.amsfirst.utls.AppUtil;
import dong.example.amsfirst.utls.PrintLog;

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




        PrintLog p = null;
        p  = (PrintLog) AppUtil.getObject("printLog");
        System.out.println("execCmd ------------p:"+p);
        CSPResult result = new CSPResult();

        result.setResult(2000);
        org.apache.axis2.databinding.types.soapencoding.String desc = new org.apache.axis2.databinding.types.soapencoding.String();
        desc.setString("CmdFileURL:"+execCmd0.getCmdFileURL()+"时间"+df.format(new Date())+"---CSPID:"+execCmd0.getCSPID()+"---LSPID:"+execCmd0.getLSPID()+"---CorrelateID:"+execCmd0.getCorrelateID());
        System.out.println(desc);
        System.out.println(p.outLog());
        result.setErrorDescription(desc);
        res.setExecCmdReturn(result);
        return res;
    }
}
