# BDirectEnum
extends **BFrozenEnum**

标记运动方向，含静止时无方向，静止时取方向标签为N

## 取值
| note | tag | value | DirectTag |
|:------:|:------:|------:|:----:|
| 无方向 | still | 0 | N |
| 东 | east | 1 | E |
| 南 | south | 2 | S |
| 西 | west | 3 | W |
| 北 | north | 4 | N |
| 东北 | northEast | 5 | NE |
| 东南 | southEast | 6 | SE |
| 西北 | northWest | 7 | NW |
| 西南 | southWest | 8 | SW |

## 默认值
defaultValue = "still"

## lexicon
| key | en | cn | unicode |
|:------|:------|:------|:------|
| display.enum.direct.still | still | 静止 | \u9759\u6b62 |
| display.enum.direct.east | east | 东 | \u4e1c |
| display.enum.direct.south | south | 南 | \u5357 |
| display.enum.direct.west | west | 西 | \u897f |
| display.enum.direct.north | north | 北 | \u5317 |
| display.enum.direct.northEast | northEast | 东北 | \u4e1c\u5317 |
| display.enum.direct.southEast | southEast | 东南 | \u4e1c\u5357 |
| display.enum.direct.northWest | northWest | 西北 | \u897f\u5317 |
| display.enum.direct.southWest | southWest | 西南 | \u897f\u5357 |
