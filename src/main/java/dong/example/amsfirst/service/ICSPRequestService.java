package dong.example.amsfirst.service;

import dong.example.amsfirst.pojo.ExecCmdReqPo;
import dong.example.amsfirst.pojo.ExecCmdResPo;

public interface ICSPRequestService {

    ExecCmdResPo reciveCSPRequestService(ExecCmdReqPo execCmdReqPo);
}
