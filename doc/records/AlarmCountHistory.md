# BAlarmCountHistoryRecord
extends **BValueHistoryRecord**  
报警统计记录

## 增加字段
| 字段名 | 数据类型 | 默认值 | 说明 |
|:-------:|:------:|:-------:|:------------|
| value | boolean | false | 记录的报警状态(记录报警还是正常状态) |
| count | int | 0 | 报警次数 |
| startFrom | BAbsTime | BAbsTime.DEFAULT | 本条记录起始时间 |
| EndAt | BAbsTime | BAbsTime.DEFAULT | 本条记录截至时间 |
| keptTime | BRelTime | BRelTime.DEFAULT | 本记录时间段内处于记录状态的时间 |

## to JSON String
| key | 赋值 | 说明 | 取值 |
|:-------|:------|:-------|:---------|
| time | `this.getTimestamp().getMillis()` | 记录时间戳(毫秒) | long |
| tag | `this.getTypeTag()` | 记录数据的统计时间类型 | minute/hour/day/week/month/year/cov |
| value | `this.getValueString()` | 记录的报警状态 | `this.getLexicon.get("api.json.value.alarmCount.value.*")` |
| count | `this.getCount()` | 发生次数 | long |
| start | `this.getStartFrom().getMillis()` | 记录内容起始时间戳(毫秒) | long |
| end | `this.getEndAt().getMillis()` | 记录内容截止时间戳(毫秒) | long |
| kept | `this.getKeptTime().getMillis()` | 记录的报警状态持续时间(毫秒) | long |

## lexicon
| key | value |
|:-------|:------|
| api.json.alarmCount.timestamp.mills | time |
| api.json.alarmCount.tag | tag |
| api.json.alarmCount.value | value |
| api.json.alarmCount.count | count |
| api.json.alarmCount.startFrom.mills | start |
| api.json.alarmCount.endAt.mills | end |
| api.json.alarmCount.keptTime.mills | kept |
| api.json.value.alarmCount.value.true | alarm |
| api.json.value.alarmCount.value.false | normal |

```
api.json.value.alarmCount.value.true=alarm
api.json.value.alarmCount.value.false=normal

api.json.alarmCount.timestamp.mills=time
api.json.alarmCount.tag=tag
api.json.alarmCount.value=value
api.json.alarmCount.count=count
api.json.alarmCount.startFrom.mills=start
api.json.alarmCount.endAt.mills=end
api.json.alarmCount.keptTime.mills=kept
```