# BHistoryPolicyEnum
extends **BFrozenEnum**

模拟量在一个时间段内整理为单点历史记录方式

## 取值
| note | tag | value |
|:------:|:------:|------:|
| 平均值 | average | 0 |
| 总和 | sum | 1 |
| 最大值 | max | 2 |
| 最小值 | min | 3 |
| 实时值 | input | 4 |

## 默认值
defaultValue = "input"

## lexicon
| key | en | cn | unicode |
|:------|:------|:------|:------|
| display.enum.historyPolicy.average | average | 平均值 | \u5e73\u5747\u503c |
| display.enum.historyPolicy.sum | sum | 总和 | \u603b\u548c |
| display.enum.historyPolicy.max | max | 最大值 | \u6700\u5927\u503c |
| display.enum.historyPolicy.min | min | 最小值 | \u6700\u5c0f\u503c |
| display.enum.historyPolicy.input | input | 实时值 | \u5b9e\u65f6\u503c |
