package com.example.democore.dbo;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;


/**
 * 代码自动生成，请不要修改，切记！！！
 */
@Data
public class DeviceInfoDO1 implements java.io.Serializable  {




    /**
     *数据唯一标识符
     */
    @ApiModelProperty(value = "数据唯一标识符")
    private String guid;


    /**
     *归属puc编码
     */
    @ApiModelProperty(value = "归属puc编码")
    private String pucId;


    /**
     *信息源系统ID
     */
    @ApiModelProperty(value = "信息源系统ID")
    private String systemId;


    /**
     *终端ID
     */
    @ApiModelProperty(value = "终端ID")
    private String deviceId;


    /**
     *终端号码
     */
    @ApiModelProperty(value = "终端号码")
    private String deviceNumber;


    /**
     *终端别名
     */
    @ApiModelProperty(value = "终端别名")
    private String deviceAlias;


    /**
     *号码类型
     */
    @ApiModelProperty(value = "号码类型")
    private Long numberType;


    /**
     *归属组织代码
     */
    @ApiModelProperty(value = "归属组织代码")
    private String orgIdentifier;


    /**
     *
     */
    @ApiModelProperty(value = "")
    private String staffGuid;


    /**
     *设备类型
     */
    @ApiModelProperty(value = "设备类型")
    private Long deviceType;


    /**
     *设备图表类型
     */
    @ApiModelProperty(value = "设备图表类型")
    private String deviceIconGuid;


    /**
     *
     */
    @ApiModelProperty(value = "")
    private String userImageGuid;


    /**
     *
     */
    @ApiModelProperty(value = "")
    private String carMake;


    /**
     *
     */
    @ApiModelProperty(value = "")
    private String carLicensePlate;


    /**
     *是否有GPS能力（0为无GPS能力）
     */
    @ApiModelProperty(value = "是否有GPS能力（0为无GPS能力）")
    private Integer hasGps;


    /**
     *
     */
    @ApiModelProperty(value = "")
    private Integer enableGps;


    /**
     *
     */
    @ApiModelProperty(value = "")
    private Long andOrFlag;


    /**
     *
     */
    @ApiModelProperty(value = "")
    private Long gpsInterval;


    /**
     *
     */
    @ApiModelProperty(value = "")
    private Long gpsChannel;


    /**
     *
     */
    @ApiModelProperty(value = "")
    private Long distance;


    /**
     *
     */
    @ApiModelProperty(value = "")
    private java.util.Date gpsDatetime;


    /**
     *
     */
    @ApiModelProperty(value = "")
    private Double longitude;


    /**
     *
     */
    @ApiModelProperty(value = "")
    private Double latitude;


    /**
     *
     */
    @ApiModelProperty(value = "")
    private Integer hasScreen;


    /**
     *
     */
    @ApiModelProperty(value = "")
    private Long versionSeq;


    /**
     *
     */
    @ApiModelProperty(value = "")
    private String orgHistory;


    /**
     *
     */
    @ApiModelProperty(value = "")
    private Long enableFlag;


    /**
     *
     */
    @ApiModelProperty(value = "")
    private String remark;


    /**
     *
     */
    @ApiModelProperty(value = "")
    private Long rrstime;


    /**
     *
     */
    @ApiModelProperty(value = "")
    private String subnetGuid;


    /**
     *
     */
    @ApiModelProperty(value = "")
    private String ability;


    /**
     *
     */
    @ApiModelProperty(value = "")
    private String lteUser;


    /**
     *
     */
    @ApiModelProperty(value = "")
    private String ltePassword;


}

