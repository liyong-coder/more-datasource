package com.example.democore.dao1;

import com.example.democore.dbo.DeviceInfoDO1;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * 在此扩展表对应的Dao方法
 */
@Mapper
public interface DeviceInfoDao1 {
    List<DeviceInfoDO1> listAll();
}
