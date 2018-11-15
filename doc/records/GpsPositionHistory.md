# BGpsPositionHistoryRecord
extends **BValueHistoryRecord**  
GPS轨迹记录

## 增加字段
| 字段名 | 数据类型 | 默认值 | 说明 |
|:-------:|:------:|:-------:|:------------|
| longitude | String | "nan" | 经度值 |
| longitudeTag | [BLngTagEnum](../enums/LngTagEnum.md) | [BLngTagEnum](../enums/LngTagEnum.md).east | 经度方向 |
| latitude | String | "nan" | 纬度值 |
| latitudeTag | [BLatTagEnum](../enums/LatTagEnum.md) | [BLatTagEnum](../enums/LatTagEnum.md).north | 纬度方向 |
| height | String | "nan" | 海拔高度（字符串，可含单位） |
| speed | String | "nan" | 运动速度（字符串，可含单位） |
| directAngel | double | 0.0d | 方向角 |
| directTag | [BDirectEnum](../enums/DirectEnum.md) | [BDirectEnum](../enums/DirectEnum.md).still | 运动方向 |
| updateTime | BAbsTime | BAbsTime.DEFAULT | 位置更新时间 |
| satelliteCount | String | "nan" | 卫星状态 |

## to JSON String
| key | 赋值 | 说明 | 取值 |
|:-------|:------|:-------|:---------|
| timestamp | `this.getTimestamp().getMillis()` | 记录时间戳(毫秒) | long |
| lng | `this.getLongitude()` | 经度 | String |
| lngTag | `BLngTagEnum.getDirectTag(this.getLongitudeTag())` | 经度标签 | String |
| lat | `this.getLatitude()` | 纬度 | String |
| latTag | `BLatTagEnum.getDirectTag(this.getLatitudeTag())` | 纬度标签 | String |
| height | `this.getHeight()` | 高度 | String |
| speed | `this.getSpeed()` | 速度 | String |
| directAngle | `this.getDirectAngel()` | 方向角 | String |
| directTag | `BDirectEnum.getDirectTag(this.getDirectTag())` | 前进方向 | String |
| updateTime | `this.getUpdateTime().getMillis()` | 更新时间(毫秒) | long |
| satellites | `this.getSatelliteCount()` | 定位使用卫星数量 | int |

## lexicon
| key | value |
|:-------|:------|
| api.json.gpsPosition.timestamp.mills | timestamp |
| api.json.gpsPosition.longitude | lng |
| api.json.gpsPosition.longitudeTag | lngTag |
| api.json.gpsPosition.latitude | lat |
| api.json.gpsPosition.latitudeTag | latTag |
| api.json.gpsPosition.height | height |
| api.json.gpsPosition.speed | speed |
| api.json.gpsPosition.directAngle | directAngle |
| api.json.gpsPosition.directTag | directTag |
| api.json.gpsPosition.updateTime.mills | updateTime |
| api.json.gpsPosition.satelliteCount | satellites |

```
api.json.gpsPosition.timestamp.mills=timestamp
api.json.gpsPosition.longitude=lng
api.json.gpsPosition.longitudeTag=lngTag
api.json.gpsPosition.latitude=lat
api.json.gpsPosition.latitudeTag=latTag
api.json.gpsPosition.height=height
api.json.gpsPosition.speed=speed
api.json.gpsPosition.directAngle=directAngle
api.json.gpsPosition.directTag=directTag
api.json.gpsPosition.updateTime.mills=updateTime
api.json.gpsPosition.satelliteCount=satellites
```