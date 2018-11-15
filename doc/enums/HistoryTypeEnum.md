# BHistoryTypeEnum
extends **BFrozenEnum**

历史纪录分类，用于查询时指定类型

## 取值
| note | tag | value |
|:------:|:------:|------:|
| 概况（统计数据） | summary | 0 |
| 运行状态（开停机） | runState | 1 |
| 报警状态 | alarmState | 2 |
| 日志 | log | 3 |
| 能耗 | energy | 4 |
| 测量数值（读取值） | meterRead | 5 |
| 数据变化（设定值） | cov | 6 |


## 默认值
defaultValue = "summary"

## lexicon
| key | en | cn | unicode |
|:------|:------|:------|:------|
| display.enum.historyType.summary | summary | 概况 | \u6982\u51b5 |
| display.enum.historyType.runState | runState | 运行状态 | \u8fd0\u884c\u72b6\u6001 |
| display.enum.historyType.alarmState | alarmState | 报警状态 | \u62a5\u8b66\u72b6\u6001 |
| display.enum.historyType.log | log | 日志 | \u65e5\u5fd7 |
| display.enum.historyType.energy | energy | 能耗 | \u80fd\u8017 |
| display.enum.historyType.meterRead | meterRead | 读取值 | \u8bfb\u53d6\u503c |
| display.enum.historyType.cov | cov | 数据变化 | \u6570\u636e\u53d8\u5316 |
