# BStringHistoryRecord
extends **BValueHistoryRecord**  
字符串记录

## 增加字段
| 字段名 | 数据类型 | 默认值 | 说明 |
|:-------:|:------:|:-------:|:------------|
| value | String | "" | 字符串 |

## to JSON String
| key | 赋值 | 说明 | 取值 |
|:-------|:------|:-------|:---------|
| t | `this.getTimestamp().getMillis()` | 记录时间戳(毫秒) | long |
| v | `this.getValue()` | 记录值 | String |
| s | `this.getStatus().getBits()` | 数据状态 | int |

## lexicon
| key | value |
|:-------|:------|
| api.json.stringHistory.timestamp.mills | t |
| api.json.stringHistory.value | v |
| api.json.stringHistory.statue | s |

```
api.json.stringHistory.timestamp.mills=t
api.json.stringHistory.value=v
api.json.stringHistory.statue=s
```