# BLogTypeEnum
extends **BFrozenEnum**

事件日志内容类型

## 取值
| note | tag | value |
|:------:|:------:|------:|
| 登陆 | login | 0 |
| 设定 | modify | 1 |
| 远程JACE上线 | stationOnline | 2 |
| 远程JACE掉线 | stationOffline | 3 |
| 远程JACE报警 | stationAlarm | 4 |
| 远程JACE报警解除 | stationRecover | 5 |
| 设备上线 | deviceOnline | 6 |
| 设备断线 | deviceOffline | 7 |
| 设备启动 | deviceStart | 8 |
| 设备停机 | deviceStop | 9 |
| 设备报警 | deviceAlarm | 10 |
| 设备报警解除 | deviceReset | 11 |
| 控制点报警 | pointAlarm | 12 |
| 控制点报警解除 | pointReset | 13 |

## 默认值
defaultValue = "modify"

## lexicon
| key | en | cn | unicode |
|:------|:------|:------|:------|
| display.enum.logType.login | login | 登陆 | \u767b\u9646 |
| display.enum.logType.modify | modify | 设定 | \u8bbe\u5b9a |
| display.enum.logType.stationOnline | stationOnline | 远程站点上线 | \u8fdc\u7a0b\u7ad9\u70b9\u4e0a\u7ebf |
| display.enum.logType.stationOffline | stationOffline | 远程站点掉线 | \u8fdc\u7a0b\u7ad9\u70b9\u6389\u7ebf |
| display.enum.logType.stationAlarm | stationAlarm | 远程站点报警 | \u8fdc\u7a0b\u7ad9\u70b9\u62a5\u8b66 |
| display.enum.logType.stationRecover | stationRecover | 远程站点报警解除 | \u8fdc\u7a0b\u7ad9\u70b9\u62a5\u8b66\u89e3\u9664 |
| display.enum.logType.deviceOnline | deviceOnline | 设备上线 | \u8bbe\u5907\u4e0a\u7ebf |
| display.enum.logType.deviceOffline | deviceOffline | 设备断线 | \u8bbe\u5907\u65ad\u7ebf |
| display.enum.logType.deviceStart | deviceStart | 设备启动 | \u8bbe\u5907\u542f\u52a8 |
| display.enum.logType.deviceStop | deviceStop | 设备停机 | \u8bbe\u5907\u505c\u673a |
| display.enum.logType.deviceAlarm | deviceAlarm | 设备报警 | \u8bbe\u5907\u62a5\u8b66 |
| display.enum.logType.deviceReset | deviceReset | 设备报警解除 | \u8bbe\u5907\u62a5\u8b66\u89e3\u9664 |
| display.enum.logType.pointAlarm | pointAlarm |  控制点报警 | \u63a7\u5236\u70b9\u62a5\u8b66 |
| display.enum.logType.pointReset | pointReset |  控制点报警解除 | \u63a7\u5236\u70b9\u62a5\u8b66\u89e3\u9664 |
