/**
 * CSPResponseServiceSkeleton.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.7.9  Built on : Nov 16, 2018 (12:05:37 GMT)
 */
package iptv;

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

        //测试bean注入
        PrintLog p = null;
        p  = (PrintLog) AppUtils.getObject("printLog");
        System.out.println("resultNotify ------------p:"+p);

        ResultNotifyResponse resultNotifyResponse = new ResultNotifyResponse();

        CSPResult result = new CSPResult();
        result.setResult(0);

        org.apache.axis2.databinding.types.soapencoding.String errorDescription =  new org.apache.axis2.databinding.types.soapencoding.String();
        errorDescription.setString("111111");
        result.setErrorDescription(errorDescription);

        resultNotifyResponse.setResultNotifyReturn(result);

        return resultNotifyResponse;

    }
}
