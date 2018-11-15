# BBooleanHistoryRecord
extends **BValueHistoryRecord**  
布尔值记录
存储时对应时间类型提前整理，以便加速查询

## 增加字段
| 字段名 | 数据类型 | 默认值 | 说明 |
|:-------:|:------:|:-------:|:------------|
| value | boolean | false | 布尔值 |

## to JSON String
| key | 赋值 | 说明 | 取值 |
|:-------|:------|:-------|:---------|
| t | `this.getTimestamp().getMillis()` | 记录时间戳(毫秒) | long |
| v | `this.getValue()` | 记录值 | boolean |
| s | `this.getStatus().getBits()` | 数据状态 | int |

## lexicon
| key | value |
|:-------|:------|
| api.json.booleanHistory.timestamp.mills | t |
| api.json.booleanHistory.value | v |
| api.json.booleanHistory.statue | s |

```
api.json.booleanHistory.timestamp.mills=t
api.json.booleanHistory.value=v
api.json.booleanHistory.statue=s
```