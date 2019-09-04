package com.example.democore.service.impl;

import com.example.democore.dao2.DeviceInfoDao2;
import com.example.democore.dbo.DeviceInfoDO2;
import com.example.democore.service.DeviceService1;
import com.example.democore.service.DeviceService2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author Liyong
 * @Date 2019/9/4 11:14
 **/
@Service
public class DeviceServiceImpl2 implements DeviceService2 {

    @Autowired
    private DeviceInfoDao2 deviceInfoDao2;

    @Override
    public List<DeviceInfoDO2> listAll() {
        return deviceInfoDao2.listAll();
    }
}
