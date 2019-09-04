package com.example.democore.service.impl;

import com.example.democore.dao1.DeviceInfoDao1;
import com.example.democore.dbo.DeviceInfoDO1;
import com.example.democore.service.DeviceService1;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author Liyong
 * @Date 2019/9/4 11:14
 **/
@Service
public class DeviceServiceImpl1 implements DeviceService1 {

    @Autowired
    private DeviceInfoDao1 deviceInfoDao1;

    @Override
    public List<DeviceInfoDO1> listAll() {
        return deviceInfoDao1.listAll();
    }
}
