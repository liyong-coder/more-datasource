package com.example.democore.dbo;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;


/**
 * 代码自动生成，请不要修改，切记！！！
 */
@Data
public class DeviceInfoDO2 implements java.io.Serializable  {


    private static final long serialVersionUID = 1L;


    //表名
    public static final String TABLE_NAME="device_info";




    //定义字段常量
    /**
     *主键
     *id
     */
    public static final String  ID="id";

    /**
     *主键
     *id
     */
    public static final String  DB_ID="id";

    /**
     *数据唯一标识符
     *guid
     */
    public static final String  GUID="guid";

    /**
     *数据唯一标识符
     *guid
     */
    public static final String  DB_GUID="guid";

    /**
     *归属puc编码
     *pucId
     */
    public static final String  PUC_ID="pucId";

    /**
     *归属puc编码
     *puc_id
     */
    public static final String  DB_PUC_ID="puc_id";

    /**
     *信息源系统ID
     *systemId
     */
    public static final String  SYSTEM_ID="systemId";

    /**
     *信息源系统ID
     *system_id
     */
    public static final String  DB_SYSTEM_ID="system_id";

    /**
     *终端ID
     *deviceId
     */
    public static final String  DEVICE_ID="deviceId";

    /**
     *终端ID
     *device_id
     */
    public static final String  DB_DEVICE_ID="device_id";

    /**
     *终端号码
     *deviceNumber
     */
    public static final String  DEVICE_NUMBER="deviceNumber";

    /**
     *终端号码
     *device_number
     */
    public static final String  DB_DEVICE_NUMBER="device_number";

    /**
     *终端别名
     *deviceAlias
     */
    public static final String  DEVICE_ALIAS="deviceAlias";

    /**
     *终端别名
     *device_alias
     */
    public static final String  DB_DEVICE_ALIAS="device_alias";

    /**
     *号码类型
     *numberType
     */
    public static final String  NUMBER_TYPE="numberType";

    /**
     *号码类型
     *number_type
     */
    public static final String  DB_NUMBER_TYPE="number_type";

    /**
     *归属组织代码
     *orgIdentifier
     */
    public static final String  ORG_IDENTIFIER="orgIdentifier";

    /**
     *归属组织代码
     *org_identifier
     */
    public static final String  DB_ORG_IDENTIFIER="org_identifier";

    /**
     *
     *staffGuid
     */
    public static final String  STAFF_GUID="staffGuid";

    /**
     *
     *staff_guid
     */
    public static final String  DB_STAFF_GUID="staff_guid";

    /**
     *设备类型
     *deviceType
     */
    public static final String  DEVICE_TYPE="deviceType";

    /**
     *设备类型
     *device_type
     */
    public static final String  DB_DEVICE_TYPE="device_type";

    /**
     *设备图表类型
     *deviceIconGuid
     */
    public static final String  DEVICE_ICON_GUID="deviceIconGuid";

    /**
     *设备图表类型
     *device_icon_guid
     */
    public static final String  DB_DEVICE_ICON_GUID="device_icon_guid";

    /**
     *
     *userImageGuid
     */
    public static final String  USER_IMAGE_GUID="userImageGuid";

    /**
     *
     *user_image_guid
     */
    public static final String  DB_USER_IMAGE_GUID="user_image_guid";

    /**
     *
     *carMake
     */
    public static final String  CAR_MAKE="carMake";

    /**
     *
     *car_make
     */
    public static final String  DB_CAR_MAKE="car_make";

    /**
     *
     *carLicensePlate
     */
    public static final String  CAR_LICENSE_PLATE="carLicensePlate";

    /**
     *
     *car_license_plate
     */
    public static final String  DB_CAR_LICENSE_PLATE="car_license_plate";

    /**
     *是否有GPS能力（0为无GPS能力）
     *hasGps
     */
    public static final String  HAS_GPS="hasGps";

    /**
     *是否有GPS能力（0为无GPS能力）
     *has_gps
     */
    public static final String  DB_HAS_GPS="has_gps";

    /**
     *
     *enableGps
     */
    public static final String  ENABLE_GPS="enableGps";

    /**
     *
     *enable_gps
     */
    public static final String  DB_ENABLE_GPS="enable_gps";

    /**
     *
     *andOrFlag
     */
    public static final String  AND_OR_FLAG="andOrFlag";

    /**
     *
     *and_or_flag
     */
    public static final String  DB_AND_OR_FLAG="and_or_flag";

    /**
     *
     *gpsInterval
     */
    public static final String  GPS_INTERVAL="gpsInterval";

    /**
     *
     *gps_interval
     */
    public static final String  DB_GPS_INTERVAL="gps_interval";

    /**
     *
     *gpsChannel
     */
    public static final String  GPS_CHANNEL="gpsChannel";

    /**
     *
     *gps_channel
     */
    public static final String  DB_GPS_CHANNEL="gps_channel";

    /**
     *
     *distance
     */
    public static final String  DISTANCE="distance";

    /**
     *
     *distance
     */
    public static final String  DB_DISTANCE="distance";

    /**
     *
     *gpsDatetime
     */
    public static final String  GPS_DATETIME="gpsDatetime";

    /**
     *
     *gps_datetime
     */
    public static final String  DB_GPS_DATETIME="gps_datetime";

    /**
     *
     *longitude
     */
    public static final String  LONGITUDE="longitude";

    /**
     *
     *longitude
     */
    public static final String  DB_LONGITUDE="longitude";

    /**
     *
     *latitude
     */
    public static final String  LATITUDE="latitude";

    /**
     *
     *latitude
     */
    public static final String  DB_LATITUDE="latitude";

    /**
     *
     *hasScreen
     */
    public static final String  HAS_SCREEN="hasScreen";

    /**
     *
     *has_screen
     */
    public static final String  DB_HAS_SCREEN="has_screen";

    /**
     *
     *versionSeq
     */
    public static final String  VERSION_SEQ="versionSeq";

    /**
     *
     *version_seq
     */
    public static final String  DB_VERSION_SEQ="version_seq";

    /**
     *
     *orgHistory
     */
    public static final String  ORG_HISTORY="orgHistory";

    /**
     *
     *org_history
     */
    public static final String  DB_ORG_HISTORY="org_history";

    /**
     *
     *enableFlag
     */
    public static final String  ENABLE_FLAG="enableFlag";

    /**
     *
     *enable_flag
     */
    public static final String  DB_ENABLE_FLAG="enable_flag";

    /**
     *
     *remark
     */
    public static final String  REMARK="remark";

    /**
     *
     *remark
     */
    public static final String  DB_REMARK="remark";

    /**
     *
     *rrstime
     */
    public static final String  RRSTIME="rrstime";

    /**
     *
     *rrstime
     */
    public static final String  DB_RRSTIME="rrstime";

    /**
     *
     *subnetGuid
     */
    public static final String  SUBNET_GUID="subnetGuid";

    /**
     *
     *subnet_guid
     */
    public static final String  DB_SUBNET_GUID="subnet_guid";

    /**
     *
     *ability
     */
    public static final String  ABILITY="ability";

    /**
     *
     *ability
     */
    public static final String  DB_ABILITY="ability";

    /**
     *
     *lteUser
     */
    public static final String  LTE_USER="lteUser";

    /**
     *
     *lte_user
     */
    public static final String  DB_LTE_USER="lte_user";

    /**
     *
     *ltePassword
     */
    public static final String  LTE_PASSWORD="ltePassword";

    /**
     *
     *lte_password
     */
    public static final String  DB_LTE_PASSWORD="lte_password";

    /**
     *是否删除:0,未删除);1,已删除
     *isDeleted
     */
    public static final String  IS_DELETED="isDeleted";

    /**
     *是否删除:0,未删除);1,已删除
     *is_deleted
     */
    public static final String  DB_IS_DELETED="is_deleted";

    /**
     *创建时间
     *gmtCreate
     */
    public static final String  GMT_CREATE="gmtCreate";

    /**
     *创建时间
     *gmt_create
     */
    public static final String  DB_GMT_CREATE="gmt_create";

    /**
     *更新时间
     *gmtModified
     */
    public static final String  GMT_MODIFIED="gmtModified";

    /**
     *更新时间
     *gmt_modified
     */
    public static final String  DB_GMT_MODIFIED="gmt_modified";




    /**
     *主键
     */
    @ApiModelProperty(value = "主键")
    private Long id;


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


    /**
     *是否删除:0,未删除);1,已删除
     */
    @ApiModelProperty(value = "是否删除:0,未删除);1,已删除")
    private Integer isDeleted;


    /**
     *创建时间
     */
    @ApiModelProperty(value = "创建时间")
    private java.util.Date gmtCreate;


    /**
     *更新时间
     */
    @ApiModelProperty(value = "更新时间")
    private java.util.Date gmtModified;
}

