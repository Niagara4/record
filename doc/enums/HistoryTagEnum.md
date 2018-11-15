# BHistoryTagEnum
extends **BFrozenEnum**

历史纪录时间间隔类型

## 取值
| note | tag | value |
|:------:|:------:|------:|
| 客户自定义 | custom | 0 |
| 分钟 | minute | 1 |
| 小时 | hour | 2 |
| 天 | day | 3 |
| 周 | week | 4 |
| 月 | month | 5 |
| 年 | year | 6 |
| 数值变化 | cov | 7 |

## 默认值
defaultValue = "custom"

## lexicon
| key | en | cn | unicode |
|:------|:------|:------|:------|
| display.enum.historyTag.custom | custom | 自定义 | \u81ea\u5b9a\u4e49 |
| display.enum.historyTag.minute | minute | 分钟 | \u5206\u949f |
| display.enum.historyTag.hour | hour | 小时 | \u5c0f\u65f6 |
| display.enum.historyTag.day | day | 天 | \u5929 |
| display.enum.historyTag.week | week | 周 | \u5468 |
| display.enum.historyTag.month | month | 月 | \u6708 |
| display.enum.historyTag.year | year | 年 | \u5e74 |
| display.enum.historyTag.cov | changeOfValue | 数值变化 | \u6570\u503c\u53d8\u5316 |
