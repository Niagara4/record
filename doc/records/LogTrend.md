# BLogTrendRecord
extends **BHistoryRecord**  
日志记录

## 增加字段
| 字段名 | 数据类型 | 默认值 | 说明 |
|:-------:|:------:|:-------:|:------------|
| time | BAbsTime | BAbsTime.now() | 日志时间 |
| logText | String | "-" | 日志内容 |

## to JSON String
| key | 赋值 | 说明 | 取值 |
|:-------|:------|:-------|:---------|
| t | `this.getTimestamp().getMillis()` | 记录时间戳(毫秒) | long |
| l | `this.getLogText()` | 日志内容 | String |

## lexicon
| key | value |
|:-------|:------|
| api.json.log.timestamp.mills | t |
| api.json.log.text | l |

```
api.json.log.timeStamp.mills=t
api.json.log.text=l
```