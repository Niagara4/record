# BAlarmLevelTypeEnum
extends **BFrozenEnum**

报警点类型

## 取值
| note | tag | value |
|:------:|:------:|------:|
| 模拟量 | emergency | 0 |
| 布尔值 | booleanTrip | 1 |
| 字符串 | booleanAlarm | 2 |
| 枚举值 | booleanWarning | 3 |
| 模拟量 | numericHighTrip | 4 |
| 布尔值 | numericHighAlarm | 5 |
| 字符串 | numericHighWarning | 6 |
| 枚举值 | numericLowTrip | 7 |
| 模拟量 | numericLowAlarm | 8 |
| 布尔值 | numericLowWarning | 9 |
| 字符串 | enumTrip | 10 |
| 枚举值 | enumAlarm | 11 |
| 枚举值 | enumWarning | 12 |

## 默认值
defaultValue = "booleanAlarm"

## lexicon
| key | en | cn | unicode |
|:------|:------|:------|:------|
| display.enum.alarmLevelType.emergency | emergency | 急停 | \u6025\u505c |
| display.enum.alarmLevelType.booleanTrip | booleanTrip | 开关量故障 | \u5f00\u5173\u91cf\u6545\u969c |
| display.enum.alarmLevelType.booleanAlarm | booleanAlarm | 开关量报警 | \u5f00\u5173\u91cf\u62a5\u8b66 |
| display.enum.alarmLevelType.booleanWarning | booleanWarning | 开关量预警 | \u5f00\u5173\u91cf\u9884\u8b66 |
| display.enum.alarmLevelType.numericHighTrip | numericHighTrip | 模拟值高故障 | \u6a21\u62df\u503c\u9ad8\u6545\u969c |
| display.enum.alarmLevelType.numericHighAlarm | numericHighAlarm | 模拟值高报警 | \u6a21\u62df\u503c\u9ad8\u62a5\u8b66 |
| display.enum.alarmLevelType.numericHighWarning | numericHighWarning | 模拟值高预警 | \u6a21\u62df\u503c\u9ad8\u9884\u8b66 |
| display.enum.alarmLevelType.numericLowTrip | numericLowTrip | 模拟值低故障 | \u6a21\u62df\u503c\u4f4e\u6545\u969c |
| display.enum.alarmLevelType.numericLowAlarm | numericLowAlarm | 模拟值低报警 | \u6a21\u62df\u503c\u4f4e\u62a5\u8b66 |
| display.enum.alarmLevelType.numericLowWarning | numericLowWarning | 模拟值低预警 | \u6a21\u62df\u503c\u4f4e\u9884\u8b66 |
| display.enum.alarmLevelType.enumTrip | enumTrip | 枚举值故障 | \u679a\u4e3e\u503c\u6545\u969c |
| display.enum.alarmLevelType.enumAlarm | enumAlarm | 枚举值报警 | \u679a\u4e3e\u503c\u62a5\u8b66 |
| display.enum.alarmLevelType.enumWarning | enumWarning | 枚举值预警 | \u679a\u4e3e\u503c\u9884\u8b66 |
