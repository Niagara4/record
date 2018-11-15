# BStationSummaryRecord
extends **BValueHistoryRecord**  
站点状态记录

## 增加字段
| 字段名 | 数据类型 | 默认值 | 说明 |
|:-------:|:------:|:-------:|:------------|
| deviceCount | long | 0l | 设备总数量 |
| deviceOnlineCount | long | 0l | 周期内在线设备数量 |
| deviceRunCount | long | 0l | 周期内运行设备数量 |
| deviceRunMinutesInHour | long | 0l | 周期内设备运行总分钟数 |
| deviceAlarmingCount | long | 0l | 周期内报警设备数量 |

## to JSON String
| key | 赋值 | 说明 | 取值 |
|:-------|:------|:-------|:---------|
| tag | `this.getTypeTag()` | 记录数据的统计时间类型 | minute/hour/day/week/month/year/cov |
| deviceCount | `this.getDeviceCount()` | 设备总数 | long |
| online | `this.getDeviceOnlineCount()` | 在线设备总数 | long |
| running | `this.getDeviceRunCount()` | 运行设备总数 | long |
| runMinutes | `this.getDeviceRunMinutesInHour()` | 设备总运行时间(分钟) | long |
| alarming | `this.getDeviceAlarmingCount()` | 设备总报警条数 | long |

## lexicon
| key | value |
|:-------|:------|
| api.json.stationSummary.typeTag | tag |
| api.json.stationSummary.deviceCount | deviceCount |
| api.json.stationSummary.deviceOnlineCount | online |
| api.json.stationSummary.deviceRunCount | running |
| api.json.stationSummary.deviceRunMinutes | runMinutes |
| api.json.stationSummary.deviceAlarmingCount | alarming |

```
api.json.stationSummary.typeTag=tag
api.json.stationSummary.deviceCount=deviceCount
api.json.stationSummary.deviceOnlineCount=online
api.json.stationSummary.deviceRunCount=running
api.json.stationSummary.deviceRunMinutes=runMinutes
api.json.stationSummary.deviceAlarmingCount=alarming
```