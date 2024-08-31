package com.zdf.servicedriveruser.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zdf.internalcommon.entity.CustomerLoginLog;
import com.zdf.servicedriveruser.mapper.CustomerLoginLogMapper;
import com.zdf.servicedriveruser.service.CustomerLoginLogService;
import org.springframework.stereotype.Service;

/**
* @author mrzhang
* @description 针对表【customer_login_log(客户登录记录)】的数据库操作Service实现
* @createDate 2024-07-17 15:21:34
*/
@Service
public class CustomerLoginLogServiceImpl extends ServiceImpl<CustomerLoginLogMapper, CustomerLoginLog>
    implements CustomerLoginLogService {

}




