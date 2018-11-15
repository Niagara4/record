# BAlarmOpenRecord
extends **BHistoryRecord**  
未恢复报警记录


## 增加字段
| 字段名 | 数据类型 | 默认值 | 说明 |
|:-------:|:------:|:-------:|:------------|
| occureTime | BAbsTime | BAbsTime.NULL | 报警发生时间 |
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
| api.json.openAlarm.occureTime.mills | occureTime |
| api.json.openAlarm.alarmUuid | alarmUuid |
| api.json.openAlarm.sourceUuid | sourceUuid |
| api.json.openAlarm.stationName | stationName |
| api.json.openAlarm.stationDisplayName | stationDisp |
| api.json.openAlarm.deviceName | deviceName |
| api.json.openAlarm.deviceDisplayName | deviceDisp |
| api.json.openAlarm.sourceString | sourceString |
| api.json.openAlarm.sourceTarget | sourceTarget |
| api.json.openAlarm.alarmMessage | alarmMessage |
| api.json.openAlarm.alarmValue | alarmValue |
| api.json.openAlarm.limitValue | limitValue |
| api.json.openAlarm.note | note |
| api.json.openAlarm.repeatTimes | repeatTimes |

```
api.json.openAlarm.occureTime.mills=occureTime
api.json.openAlarm.alarmUuid=alarmUuid
api.json.openAlarm.sourceUuid=sourceUuid
api.json.openAlarm.stationName=stationName
api.json.openAlarm.stationDisplayName=stationDisp
api.json.openAlarm.deviceName=deviceName
api.json.openAlarm.deviceDisplayName=deviceDisp
api.json.openAlarm.sourceString=sourceString
api.json.openAlarm.sourceTarget=sourceTarget
api.json.openAlarm.alarmMessage=alarmMessage
api.json.openAlarm.alarmValue=alarmValue
api.json.openAlarm.limitValue=limitValue
api.json.openAlarm.note=note
api.json.openAlarm.repeatTimes=repeatTimes
```