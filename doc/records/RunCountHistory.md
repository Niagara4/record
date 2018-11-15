# BRunCountHistoryRecord
extends **BValueHistoryRecord**  
运行状态统计记录

## 增加字段
| 字段名 | 数据类型 | 默认值 | 说明 |
|:-------:|:------:|:-------:|:------------|
| value | boolean | false | 记录的运行状态(记录运行还是停止状态) |
| startCount | int | 0 | 启动次数 |
| startFrom | BAbsTime | BAbsTime.DEFAULT | 本条记录起始时间 |
| EndAt | BAbsTime | BAbsTime.DEFAULT | 本条记录截至时间 |
| keptTime | BRelTime | BRelTime.DEFAULT | 本记录时间段内处于记录状态的时间 |

## to JSON String
| key | 赋值 | 说明 | 取值 |
|:-------|:------|:-------|:---------|
| time | `this.getTimestamp().getMillis()` | 记录时间戳(毫秒) | long |
| tag | `this.getTypeTag()` | 记录数据的统计时间类型 | minute/hour/day/week/month/year/cov |
| value | `this.getValueString()` | 记录的运行状态(记录运行还是停止状态) | `this.getLexicon.get("api.json.value.runCount.value.*")` |
| count | `this.getStartCount()` | 启动次数 | long |
| start | `this.getStartFrom().getMillis()` | 记录内容起始时间戳(毫秒) | long |
| end | `this.getEndAt().getMillis()` | 记录内容截止时间戳(毫秒) | long |
| kept | `this.getKeptTime().getMillis()` | 本记录时间段内处于记录状态的时间(毫秒) | long |

## lexicon
| key | value |
|:-------|:------|
| api.json.runCount.timestamp.mills | time |
| api.json.runCount.tag | tag |
| api.json.runCount.value | value |
| api.json.runCount.startCount | count |
| api.json.runCount.startFrom.mills | start |
| api.json.runCount.endAt.mills | end |
| api.json.runCount.keptTime.mills | kept |
| api.json.value.runCount.value.true | run |
| api.json.value.runCount.value.false | stop |

````
api.json.value.runCount.value.true=run
api.json.value.runCount.value.false=stop

api.json.runCount.timestamp=time
api.json.runCount.tag=tag
api.json.runCount.value=value
api.json.runCount.startCount=count
api.json.runCount.startFrom.mills=start
api.json.runCount.endAt.mills=end
api.json.runCount.keptTime.mills=kept
```