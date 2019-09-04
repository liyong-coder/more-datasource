package com.example.democore.dao2;

import com.example.democore.dbo.DeviceInfoDO2;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * 在此扩展表对应的Dao方法
 */
@Mapper
public interface DeviceInfoDao2 {

    List<DeviceInfoDO2> listAll();


}
