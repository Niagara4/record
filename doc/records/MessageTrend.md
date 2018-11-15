# BMessageTrendRecord
extends **BHistoryRecord**  
消息记录

## 增加字段
| 字段名 | 数据类型 | 默认值 | 说明 |
|:-------:|:------:|:-------:|:------------|
| time | BAbsTime | BAbsTime.now() | 消息发送时间 |
| messageType | String | "-" | 消息类型 |
| receiverName | String | "-" | 接收人姓名 |
| receiverAddress | String | "-" | 接收地址 |
| messageText | String | "-" | 消息内容 |
| note | String | "-" | 附加备注 |

## to JSON String
| key | 赋值 | 说明 | 取值 |
|:-------|:------|:-------|:---------|
| t | `this.getTimestamp().getMillis()` | 消息发送时间戳(毫秒) | long |
| p | `this.getMessageType()` | 消息类型 | String |
| n | `this.getReceiverName()` | 接收人姓名 | String |
| a | `this.getReceiverAddress()` | 接收地址 | String |
| m | `this.getMessageText()` | 消息内容 | String |
| i | `this.getNote()` | 附加备注 | String |

## lexicon
| key | value |
|:-------|:------|
| api.json.message.timestamp.mills | t |
| api.json.message.receiver.name | n |
| api.json.message.receiver.address | a |
| api.json.message.type | p |
| api.json.message.text | m |
| api.json.message.note | i |

```
api.json.message.timeStamp.mills=t
api.json.message.receiver.name=n
api.json.message.receiver.address=a
api.json.message.type=p
api.json.message.text=m
api.json.message.note=i
```