# **final** TimeFormatter
extends **Object**
时间字符串格式化工具，针对中国时区

## 转换为Niagara标准时间字符串 YYYY-MM-ddTHH:mm:ss.999+8:00
* public static final _String_ **toNiagaraStdString**(_String_ str) throws Exception
* public static final _String_ **toNiagaraStdString**(_BAbsTime_ t)
* public static final _String_ **toNiagaraStdString**(_int_ year, _int_ month, _int_ date, _int_ hour, _int_ minute, _int_ seconds)
* public static final _String_ **toNiagaraStdString**(_String_ date, _String_ clock) throws Exception
* public static final _String_ **toNiagaraStdString**(_String_ year, _String_ month, _String_ date, _String_ hour, _String_ minute, _String_ seconds)

## 将**BAbsTime**格式化为 YYYY-MM-dd HH:mm:ss
* public static final _String_ **makeAbsTimeString**(_BAbsTime_ t)

## 将BAbsTime的日期格式化为 YYYY-MM-dd
* public static final _String_ **makeABsDateString**(_BAbsTime_ t)

## 将BRelTime格式化为 d:HH:mm:ss
* public static final _String_ **makeRelTimeString**(_BRelTime_ t)
