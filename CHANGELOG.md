# Change Log

## record-rt v3.2 - Released on November 15, 2018
* [HistoryTagEnum](./doc/enums/HistoryTagEnum.md)增加值custom，为客户自定义类型，并修改默认值为此值

## record-rt v3.1 - Released on July 28, 2018
* 增加**时间格式化**类型[TimeFormatter](./doc/TimeFormatter.md)

## record-rt v3.0.1 - Released on April 11, 2018
* 增加**消息记录**类型[BMessageTrendRecord](./doc/records/MessageTrend.md)的note字段
* 修正文档

## record-rt v3.0 - Released on April 11, 2018
* 增加**消息记录**类型[BMessageTrendRecord](./doc/records/MessageTrend.md)
* 修正[record.lexicon](./record/record-rt/src/lexicons/record.lexicon)中runCount名称错误问题

## record-rt v2.0.1 - Released on Dec 6, 2017
* 修正[AlarmCountHistoryRecord](./doc/records/AlarmCountHistory.md)和[RunCountHistoryRecord](./doc/records/RunCountHistory.md)中的set方法
* 修正[EnumHistoryRecord](./doc/records/EnumHistory.md)和[StringHistoryRecord](./doc/records/StringHistory.md)中typeTag属性重复问题

## record-rt v2.0 - Released on Dec 4, 2017
* 增加基类**abstract [BValueHistoryRecord](./doc/records/ValueHistory.md)**，并将typeTag属性和JSONSupport引用一并声明
* [EnumHistoryRecord](./doc/records/EnumHistory.md)和[StringHistoryRecord](./doc/records/StringHistory.md)基于[BValueHistoryRecord](./doc/records/ValueHistory.md)重写

## record-rt v1.5 - Released on Nov 23, 2017
* fix [module-include.xml](./record/record-rt/module-include.xml)

## record-rt v1.4 - Released on Nov 23, 2017
* 修正缺失的[JSONObj](./record/record-rt/src/com/guardian/json/JSONObj.java)和[JSONList](./record/record-rt/src/com/guardian/json/JSONList.java)的构造方法

## record-rt v1.3 - Released on Nov 17, 2017
* 为满足包名全小写规则，将com.guardian.historyRecord改为[com.guardian.history.records](./record/record-rt/src/com/guardian/history/records)，将com.guardian.historyRecord.enums改为[com.guardian.enums](./record/record-rt/src/com/guardian/enums)

## record-rt v1.2 - Released on Nov 13, 2017
* 增加**报警点类型**枚举[BAlarmLevelTypeEnum](./doc/enums/AlarmLevelTypeEnum.md)
* [EnumHistoryRecord](./doc/records/EnumHistory.md)，[StringHistoryRecord](./doc/records/StringHistory.md)增加tag字段和set()方法
* 缩减JSON的key长度
* 修正[BAlarmLogRecord](./doc/records/AlarmLogRecord.md)和[BAlarmOpenRecord](./doc/records/AlarmOpenRecord.md)的stationDisplayName属性的拼写，并增加字符串常量作为AlarmData的key

## record-rt v1.1 - Released on Nov 9, 2017
* 增加**报警完整日志记录**类型[BAlarmLogRecord](./doc/records/AlarmLogRecord.md)和**报警发生日志记录**类型[BAlarmOpenRecord](./doc/records/AlarmOpenRecord.md)
* Enums增加以下方法
    * `static String getDisplayText(TYPE enumValue)` 
    * `String getDisplayText()`
* Enums覆盖BFrozenEnums的以下方法
    * `String getDisplayTag(Context context)`
    * `String toString(Context context)`
* 继承JSONObject和JSONArray的类[JSONObj](./record/record-rt/src/com/guardian/json/JSONObj.java)和[JSONList](./record/record-rt/src/com/guardian/json/JSONList.java)，覆盖了原`toString()`方法，处理了生成字符串时unicode编码"$u"开头的问题
* 调整[EnergyIntervalRecord](./doc/records/EnergyInterval.md)，增加[FeeIntervalRecord](./doc/records/FeeInterval.md)，[EnumHistoryRecord](./doc/records/EnumHistory.md)，[StringHistoryRecord](./doc/records/StringHistory.md)
* 历史记录定义中实现了[JSONSupport](./record/record-rt/src/com/guardian/json/JSONSupport.java)接口
* module.lexicon默认为中文，在lexicon文件夹下提供英文lexicon文件[record.lexicon](./record/record-rt/src/lexicons/en.lexicon)
* 版本号升级和文档更新