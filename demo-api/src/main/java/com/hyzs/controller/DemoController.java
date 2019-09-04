package com.hyzs.controller;

import com.example.democore.dbo.DeviceInfoDO1;
import com.example.democore.dbo.DeviceInfoDO2;
import com.example.democore.service.DeviceService1;
import com.example.democore.service.DeviceService2;
import com.hyzs.gz.common.core.util.CommonUtils;
import com.hyzs.gz.common.core.vo.ResponseVO;
import com.hyzs.gz.common.core.web.controller.BaseController;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Author Liyong
 * @Date 2019/9/4 11:12
 **/
@RestController
@RequestMapping("/api/v1.0/app")
@Api(value="DemoController",description = "管理API")
public class DemoController extends BaseController {


    @Autowired
    private DeviceService1 deviceService1;
    @Autowired
    private DeviceService2 deviceService2;

    @ApiOperation("查所有")
    @RequestMapping(value = "/listAll1",method = RequestMethod.POST)
    public ResponseVO<List<DeviceInfoDO1>> listAll1(){
        return CommonUtils.okResponseVO(deviceService1.listAll());
    }

    @ApiOperation("查所有")
    @RequestMapping(value = "/listAll2",method = RequestMethod.POST)
    public ResponseVO<List<DeviceInfoDO2>> listAll2(){
        return CommonUtils.okResponseVO(deviceService2.listAll());
    }

}
