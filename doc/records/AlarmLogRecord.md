# BAlarmLogRecord
extends **BHistoryRecord**  
报警日志记录

## 增加字段
| 字段名 | 数据类型 | 默认值 | 说明 |
|:-------:|:------:|:-------:|:------------|
| occureTime | BAbsTime | BAbsTime.NULL | 报警发生时间 |
| recoverTime | BAbsTime | BAbsTime.NULL | 报警恢复时间 |
| ackTime | BAbsTime | BAbsTime.NULL | 报警响应时间 |
| alarmUuid | String | "-" | 报警记录UUID |
| sourceUuid | String | "-" | 报警源UUID |
| stationName | String | "-" | 发生站点名 |
| stationDisplayName | String | "-" | 发生站点显示名 |
| deviceName | String | "-" | 发生设备名 |
| deviceDisplayName | String | "-" | 发生设备显示名 |
| sourceString | String | "-" | 报警源名称 |
| sourceTarget | String | "-" | 报警源地址 |
| alarmMessage | String | "-" | 消息内容 |
| alarmValue | String | "-" | 报警值 |
| limitValue | String | "-" | 触发值 |
| note | String | "-" | 备注内容 |
| repeatTimes | long | 0 | 重复发生次数 |

## to JSON String
| key | 赋值 | 说明 | 取值 |
|:-------|:------|:-------|:---------|
| occureTime | `this.getOccureTime().getMillis()` | 报警发生时间(毫秒) | long |
| recoverTime | `this.getRecoverTime().getMillis()` | 报警恢复时间(毫秒) | long |
| ackTime | `this.getAckTime().getMillis()` | 报警响应时间(毫秒) | long |
| alarmUuid | `this.getAlarmUuid()` | 报警记录UUID | string |
| sourceUuid | `this.getSourceUuid()` | 报警源UUID | string |
| stationName | `this.getStationName()` | 发生站点名 | string |
| stationDisp | `this.getStationDisplayName()` | 发生站点显示名 | string |
| deviceName | `this.getDeviceName()` | 发生设备名 | string |
| deviceDisp | `this.getDeviceDisplayName()` | 发生设备显示名 | string |
| sourceString | `this.getSourceString()` | 报警源名称 | string |
| sourceTarget | `this.getSourceTarget()` | 报警源地址 | string |
| alarmMessage | `this.getAlarmMessage()` | 消息内容 | string |
| alarmValue | `this.getAlarmValue()` | 报警值 | string |
| limitValue | `this.getLimitValue()` | 触发值 | string |
| note | `this.getNote()` | 备注内容 | string |
| repeatTimes | `this.getRepeatTimes()` | 重复发生次数 | long |

## lexicon
| key | value |
|:-------|:------|
| api.json.alarmLog.occureTime.mills | occureTime |
| api.json.alarmLog.recoverTime.mills | recoverTime |
| api.json.alarmLog.acknowledgeTime.mills | ackTime |
| api.json.alarmLog.alarmUuid | alarmUuid |
| api.json.alarmLog.sourceUuid | sourceUuid |
| api.json.alarmLog.stationName | stationName |
| api.json.alarmLog.stationDisplayName | stationDisp |
| api.json.alarmLog.deviceName | deviceName |
| api.json.alarmLog.deviceDisplayName | deviceDisp |
| api.json.alarmLog.sourceString | sourceString |
| api.json.alarmLog.sourceTarget | sourceTarget |
| api.json.alarmLog.alarmMessage | alarmMessage |
| api.json.alarmLog.alarmValue | alarmValue |
| api.json.alarmLog.limitValue | limitValue |
| api.json.alarmLog.note | note |
| api.json.alarmLog.repeatTimes | repeatTimes |

```
api.json.alarmLog.occureTime.mills=occure
api.json.alarmLog.recoverTime.mills=recover
api.json.alarmLog.acknowledgeTime.mills=ack
api.json.alarmLog.alarmUuid=alarmUuid
api.json.alarmLog.sourceUuid=sourceUuid
api.json.alarmLog.stationName=station
api.json.alarmLog.stationDisplayName=stationDisp
api.json.alarmLog.deviceName=deviceName
api.json.alarmLog.deviceDisplayName=deviceDisp
api.json.alarmLog.sourceString=sourceString
api.json.alarmLog.sourceTarget=sourceTarget
api.json.alarmLog.alarmMessage=alarmMessage
api.json.alarmLog.alarmValue=alarmValue
api.json.alarmLog.limitValue=limitValue
api.json.alarmLog.note=note
api.json.alarmLog.repeatTimes=repeatTimes
```