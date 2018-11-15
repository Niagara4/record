# BNumericHistoryRecord
extends **BValueHistoryRecord**  
模拟量记录
存储时对应时间类型提前整理，以便加速查询

## 增加字段
| 字段名 | 数据类型 | 默认值 | 说明 |
|:-------:|:------:|:-------:|:------------|
| value | double | 0.0d | 模拟量值 |

## to JSON String
| key | 赋值 | 说明 | 取值 |
|:-------|:------|:-------|:---------|
| t | `this.getTimestamp().getMillis()` | 记录时间戳(毫秒) | long |
| v | `new DecimalFormat(",##0.00").format(this.getValue())` | 记录值 | double |
| s | `this.getStatus().getBits()` | 数据状态 | int |

## lexicon
| key | value |
|:-------|:------|
| api.json.numericHistory.timestamp.mills | t |
| api.json.numericHistory.value | v |
| api.json.numericHistory.statue | s |

```
api.json.numericHistory.timestamp.mills=t
api.json.numericHistory.value=v
api.json.numericHistory.statue=s
```