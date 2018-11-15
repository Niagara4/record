# BEnergyIntervalRecord
extends **BValueHistoryRecord**  
能耗定时记录
不限定类型，可以是电费、气费、水费等各种类型

## 增加字段
| 字段名 | 数据类型 | 默认值 | 说明 |
|:-------:|:------:|:-------:|:------------|
| EndAt | BAbsTime | BAbsTime.DEFAULT | 记录截止时间 |
| cost | double | 0.0d | 记录周期内消耗 |
| fee | double | 0.0d | 记录周期内平均价格 |
| bill | double | 0.0d | 记录周期内的费用 |

## to JSON String
| key | 赋值 | 说明 | 取值 |
|:-------|:------|:-------|:---------|
| t | `this.getEndAt().getMillis()` | 记录时间戳(毫秒) | long |
| c | `this.getCost()` | 记录周期内消耗 | double |
| f | `this.getFee()` | 记录周期内平均价格 | double |
| b | `this.getBill()` | 记录周期内的费用 | double |

## lexicon
| key | value |
|:-------|:------|
| api.json.bill.endAt.mills | t |
| api.json.bill.cost | v |
| api.json.bill.fee | f |
| api.json.bill.bill | b |

```
api.json.bill.endAt.mills=t
api.json.bill.cost=c
api.json.bill.fee=f
api.json.bill.bill=b
```