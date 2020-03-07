/**
 * CSPResponseServiceSkeleton.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.7.9  Built on : Nov 16, 2018 (12:05:37 GMT)
 */
package iptv;

import dong.example.amsfirst.pojo.ResultNotifyReqPo;
import dong.example.amsfirst.pojo.ResultNotifyResPo;
import dong.example.amsfirst.service.ICSPResponseService;
import dong.example.amsfirst.service.impl.CSPResponseServiceImpl;
import dong.example.amsfirst.utils.AppUtils;
import dong.example.amsfirst.utils.PrintLog;

/**
 *  CSPResponseServiceSkeleton java skeleton for the axisService
 */
public class CSPResponseServiceSkeleton
    implements CSPResponseServiceSkeletonInterface {
    /**
     * Auto generated method signature
     *
     * @param resultNotify0
     * @return resultNotifyResponse1
     */
    public iptv.ResultNotifyResponse resultNotify(
        iptv.ResultNotify resultNotify0) {
        //TODO : fill this with the necessary business logic
//       throw new UnsupportedOperationException("Please implement " +
//          this.getClass().getName() + "#resultNotify");


        //resultNotify0.setCmdResult(0);
        System.out.println("--------------------------------------------------------------");
        System.out.println(resultNotify0.getCmdResult());
        System.out.println(resultNotify0.getCSPID());
        System.out.println(resultNotify0.getLSPID());
        System.out.println(resultNotify0.getCorrelateID());
        System.out.println(resultNotify0.getResultFileURL());

        //获取接收的参数，并将参数赋值给对象
        System.out.println("c2--CSPResponseService---in");
        String cspId;
        String lspId;
        String correlateId;
        Integer cmdResult;
        String resultFileURL;

        ResultNotifyReqPo resultNotifyReqPo = new ResultNotifyReqPo();

        resultNotifyReqPo.setCspId(resultNotify0.getCSPID().toString());
        resultNotifyReqPo.setLspId(resultNotify0.getLSPID().toString());
        resultNotifyReqPo.setCorrelateId(resultNotify0.getCorrelateID().toString());
        resultNotifyReqPo.setCmdResult(resultNotify0.getCmdResult());
        resultNotifyReqPo.setResultFileURL(resultNotify0.getResultFileURL().toString());

        //获取service bean

        ICSPResponseService cspResponseService;
        cspResponseService = (ICSPResponseService)AppUtils.getObject("cspResponseService");

        ResultNotifyResPo resultNotifyResPo  = cspResponseService.reciveCSPResponseServic(resultNotifyReqPo);




        //测试bean注入
//        PrintLog p = null;
//        p  = (PrintLog) AppUtils.getObject("printLog");
//        System.out.println("resultNotify ------------p:"+p);

        ResultNotifyResponse resultNotifyResponse = new ResultNotifyResponse();

        CSPResult result = new CSPResult();
        result.setResult(resultNotifyResPo.getResult());

        org.apache.axis2.databinding.types.soapencoding.String errorDescription =  new org.apache.axis2.databinding.types.soapencoding.String();
        errorDescription.setString(resultNotifyResPo.getErrorDescription());
        result.setErrorDescription(errorDescription);

        resultNotifyResponse.setResultNotifyReturn(result);

        return resultNotifyResponse;

    }
}
