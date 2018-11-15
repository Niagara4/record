# BDeviceSummaryRecord
extends **BValueHistoryRecord**  
设备状态记录

## 增加字段
| 字段名 | 数据类型 | 默认值 | 说明 |
|:-------:|:------:|:-------:|:------------|
| deviceLogTag | [BLogTypeEnum](../enums/LogTypeEnum.md) | [BLogTypeEnum](../enums/LogTypeEnum.md).DEFAULT | 事件类型 |
| startTime | BAbsTime | BAbsTime.DEFAULT | 事件起始时间 |
| endTime | BAbsTime | BAbsTime.DEFAULT | 事件截止时间 |
| holdTime | BRelTime | BRelTime.DEFAULT | 事件持续时间 |
| note | String | "-" | 备注信息 |

## to JSON String
| key | 赋值 | 说明 | 取值 |
|:-------|:------|:-------|:---------|
| start | `this.getStartTime().getMillis()` | 事件起始时间(毫秒) | long |
| end | `this.getEndTime().getMillis()` | 事件截止时间(毫秒) | long |
| held | `this.getHoldTime().getMillis()` | 事件持续时间(毫秒) | long |
| tag | `this.getDeviceLogTag().getDisplayText()` | 事件类型 | String |
| note | `this.getNote()` | 备注信息 | String |

## lexicon
| key | value |
|:-------|:------|
| api.json.deviceSummary.start.mills | start |
| api.json.deviceSummary.end.mills | end |
| api.json.deviceSummary.held.mills | held |
| api.json.deviceSummary.tag | tag |
| api.json.deviceSummary.note | note |

```
api.json.deviceSummary.start=start
api.json.deviceSummary.end=end
api.json.deviceSummary.held=held
api.json.deviceSummary.tag=tag
api.json.deviceSummary.note=note
```