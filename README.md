# record-rt

自定义的history record，用于同步。
含history record使用的enum
***
## ENUMS

| 名称 | 说明 |
|:-------------|:----------------|
| [AlarmLevelTypeEnum](./doc/enums/AlarmLevelTypeEnum.md) | 报警点类型 |
| [ControlPointTypeEnum](./doc/enums/ControlPointTypeEnum.md) | 控制点类型 |
| [DirectEnum](./doc/enums/DirectEnum.md) | 方向，包含静止时无方向 |
| [HistoryPolicyEnum](./doc/enums/HistoryPolicyEnum.md) | 模拟量在一个时间段内整理为单点历史记录方式 |
| [HistoryRecordMethodEnum](./doc/enums/HistoryRecordMethodEnum.md) | 模拟量历史记录方式，用于时序连续记录 |
| [HistoryTagEnum](./doc/enums/HistoryTagEnum.md) | 历史纪录时间间隔类型 |
| [HistoryTypeEnum](./doc/enums/HistoryTypeEnum.md) | 历史纪录分类，用于查询时指定类型 |
| [LatTagEnum](./doc/enums/LatTagEnum.md) | 纬度标签 |
| [LngTagEnum](./doc/enums/LngTagEnum.md) | 经度标签 |
| [LogTypeEnum](./doc/enums/LogTypeEnum.md) | 事件日志内容类型 |

***
## RECORDS
基类**abstract [BValueHistoryRecord](./doc/records/ValueHistory.md)**  

| 名称 | 说明 | 父类 |
|:-------------|:----------------|:------------|
| [AlarmCountHistoryRecord](./doc/records/AlarmCountHistory.md) | 报警统计记录 | BValueHistoryRecord |
| [AlarmLogRecord](./doc/records/AlarmLogRecord.md) | 报警日志记录 | BHistoryRecord |
| [AlarmOpenRecord](./doc/records/AlarmOpenRecord.md) | 未恢复的报警记录 | BHistoryRecord |
| [BooleanHistoryRecord](./doc/records/BooleanHistory.md) | 布尔值记录 | BValueHistoryRecord |
| [DeviceSummaryRecord](./doc/records/DeviceSummary.md) | 设备状态记录 | BValueHistoryRecord |
| [EnergyIntervalRecord](./doc/records/EnergyInterval.md) | 能耗定时记录 | BValueHistoryRecord |
| [EnumHistoryRecord](./doc/records/EnumHistory.md) | 枚举值记录 | BValueHistoryRecord |
| [FeeIntervalRecord](./doc/records/FeeInterval.md) | 费用定时记录 | BValueHistoryRecord |
| [GpsPositionHistoryRecord](./doc/records/GpsPositionHistory.md) | GPS轨迹记录 | BValueHistoryRecord |
| [LogTrendRecord](./doc/records/LogTrend.md) | 日志记录 | BHistoryRecord |
| [MessageTrendRecord](./doc/records/MessageTrend.md) | 消息记录 | BHistoryRecord |
| [NumericHistoryRecord](./doc/records/NumericHistory.md) | 模拟量记录 | BValueHistoryRecord |
| [RunCountHistoryRecord](./doc/records/RunCountHistory.md) | 运行状态统计记录 | BValueHistoryRecord |
| [StationSummaryRecord](./doc/records/StationSummary.md) | 站点状态记录 | BValueHistoryRecord |
| [StringHistoryRecord](./doc/records/StringHistory.md) | 字符串记录 | BValueHistoryRecord |

***
## JSON
继承JSONObject和JSONArray的类[JSONObj](./record/record-rt/src/com/guardian/json/JSONObj.java)和[JSONList](./record/record-rt/src/com/guardian/json/JSONList.java)，覆盖了原`toString()`方法，处理了生成字符串时unicode编码"$u"开头的问题

***
## lexicon
默认[lexicon](./record/record-rt/module.lexicon)为中文，在生成jar中包含[lexicon/en.lexicon](./record/record-rt/src/lexicons/en.lexicon)为英文