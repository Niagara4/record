/**
 * TimeFormatter 时间字符串格式化工具，针对中国时区
 */
package com.guardian;

import javax.baja.nre.util.TextUtil;
import javax.baja.sys.BAbsTime;
import javax.baja.sys.BRelTime;

/**
 * @author Chris Lee
 *
 */
public final class TimeFormatter {

    /**
     * 转换为Niagara标准时间字符串 YYYY-MM-ddTHH:mm:ss.999+8:00
     * @param str
     * @return YYYY-MM-ddTHH:mm:ss.999+8:00
     */
    public static final String toNiagaraStdString(String str) throws Exception {
        if (str == null || "".equals(str)) {
            throw new Exception("TimeFormatter can not convert string of Length 0");
        }
        String dateString = "";
        String timeString = "";
        if (str.contains("T")) {
            if (str.length() == 19) {
                return str;
            }
            dateString = str.substring(0, str.indexOf("T"));
            timeString = str.substring(str.indexOf("T") + 1);
        } else if (str.contains(" ")) {
            if (str.indexOf(" ") == str.lastIndexOf(" ")) {
                dateString = str.substring(0, str.indexOf(" "));
                timeString = str.substring(str.indexOf(" ") + 1);
            } else {
      
            }
            if (dateString.contains(":") && !timeString.contains(":")) {
                String temp = dateString;
                dateString = timeString;
                timeString = temp;
            }
        }
        if (dateString.contains("/")) {
            dateString = TextUtil.replace(dateString, "/", "-");
        }
        return dateString + "T" + timeString + ".999+8:00";
    }
  
    /**
     * 转换为Niagara标准时间字符串 YYYY-MM-ddTHH:mm:ss.999+8:00
     * @param t
     * @return YYYY-MM-ddTHH:mm:ss.999+8:00
     */
    public static final String toNiagaraStdString(BAbsTime t) {
        return t.toString();
    }
  
    /**
     * 转换为Niagara标准时间字符串 YYYY-MM-ddTHH:mm:ss.999+8:00
     * @param year
     * @param month
     * @param date
     * @param hour
     * @param minute
     * @param seconds
     * @return YYYY-MM-ddTHH:mm:ss.999+8:00
     */
    public static final String toNiagaraStdString(int year, int month, int date, int hour, int minute, int seconds) {
        return formatValueLength(year, 4) + "-" + getMonthValue(month) + "-" + formatValueLength(date, 2) + "T" + formatValueLength(hour, 2) + ":" + formatValueLength(minute, 2) + ":" + formatValueLength(seconds, 2) + ".999+8:00";
    }
  
    /**
     * 转换为Niagara标准时间字符串 YYYY-MM-ddTHH:mm:ss.999+8:00
     * @param date
     * @param clock
     * @return YYYY-MM-ddTHH:mm:ss.999+8:00
     * @throws Exception
     */
    public static final String toNiagaraStdString(String date, String clock) throws Exception {
        if (date == null || "".equals(date)) {
            throw new Exception("TimeFormatter can not convert string where date Length is 0");
        }
        if (clock == null || "".equals(clock)) {
            throw new Exception("TimeFormatter can not convert string where clock Length is 0");
        }
        return date + "T" + clock + ".999-8:00";
    }

    /**
     * 转换为Niagara标准时间字符串 YYYY-MM-ddTHH:mm:ss.999+8:00
     * @param year
     * @param month
     * @param date
     * @param hour
     * @param minute
     * @param seconds
     * @return YYYY-MM-ddTHH:mm:ss.999+8:00
     */
    public static final String toNiagaraStdString(String year, String month, String date, String hour, String minute, String seconds) {
        return formatValueLength(year, 4) + "-" + getMonthValue(month) + "-" + formatValueLength(date, 2) + "T" + formatValueLength(hour, 2) + ":" + formatValueLength(minute, 2) + ":" + formatValueLength(seconds, 2) + ".999+8:00";
    }

    /**
     * Make a String for int with the given length, lead by "0"
     * @param v the value needs format
     * @param l the total length needed
     * @return formatted string
     */
    private static final String formatValueLength(int v, int l) {
        String result = String.valueOf(v);
        for (;;) {
            if (result.length() >= l) {
                break;
            }
            result = "0" + result;
        }
        return result;
    }
  
    /**
     * Make a String for int with the given length, lead by "0"
     * @param v the string needs format
     * @param l the total length needed
     * @return formatted string
     */
    private static final String formatValueLength(String v, int l) {
        String result = v;
        for (;;) {
            if (result.length() >= l) {
                break;
            }
            result = "0" + result;
        }
        return result;
    }

    /**
     * month is 0~11, format as 00~11
     * @param m month index (0~11)
     * @return two digital string
     */
    private static final String getMonthValue(int m) {
        return formatValueLength(m,2);
    }

    /**
     * month is in String mode, format as 01~12
     * @param m month string, can be Jan/Feb/..., January/February/..., or index
     * @return two digital string
     */
    private static final String getMonthValue(String m) {
        String t = m.toLowerCase();
        if ("0".equals(t) || "00".equals(t) || "jan".equals(t) || "january".equals(t)) {
            return "01";
        }
        if ("1".equals(t) || "01".equals(t) || "feb".equals(t) || "febuary".equals(t)) {
            return "02";
        }
        if ("2".equals(t) || "02".equals(t) || "mar".equals(t) || "march".equals(t)) {
            return "03";
        }
        if ("3".equals(t) || "03".equals(t) || "apr".equals(t) || "april".equals(t)) {
            return "04";
        }
        if ("4".equals(t) || "04".equals(t) || "may".equals(t)) {
            return "05";
        }
        if ("5".equals(t) || "05".equals(t) || "jun".equals(t) || "june".equals(t)) {
            return "06";
        }
        if ("6".equals(t) || "06".equals(t) || "jul".equals(t) || "july".equals(t)) {
            return "07";
        }
        if ("7".equals(t) || "07".equals(t) || "aug".equals(t) || "august".equals(t)) {
            return "08";
        }
        if ("8".equals(t) || "08".equals(t) || "sep".equals(t) || "september".equals(t) || "sept".equals(t)) {
            return "09";
        }
        if ("9".equals(t) || "09".equals(t) || "oct".equals(t) || "october".equals(t) || "octo".equals(t)) {
            return "10";
        }
        if ("10".equals(t) || "nov".equals(t) || "november".equals(t) || "nove".equals(t)) {
            return "11";
        }
        if ("11".equals(t) || "dec".equals(t) || "december".equals(t) || "dece".equals(t)) {
            return "12";
        }
        return "00";
    }

    /**
     * 将BAbsTime格式化为 YYYY-MM-dd HH:mm:ss
     * @param t
     * @return YYYY-MM-dd HH:mm:ss
     */
    public static final String makeAbsTimeString(BAbsTime t) {
        StringBuffer s = new StringBuffer();
        s.append(formatValueLength(t.getYear(), 4));
        s.append("-");
        s.append(formatValueLength(t.getMonth().getMonthOfYear(), 2));
        s.append("-");
        s.append(formatValueLength(t.getDay(), 2));
        s.append(" ");
        s.append(formatValueLength(t.getHour(), 2));
        s.append(":");
        s.append(formatValueLength(t.getMinute(), 2));
        s.append(":");
        s.append(formatValueLength(t.getSecond(), 2));
        return s.toString();
    }
  
    /**
     * 将BAbsTime的日期格式化为 YYYY-MM-dd
     * @param t
     * @return YYYY-MM-dd
     */
    public static final String makeAbsDateString(BAbsTime t) {
        StringBuffer s = new StringBuffer();
        s.append(formatValueLength(t.getYear(), 4));
        s.append("-");
        s.append(formatValueLength(t.getMonth().getMonthOfYear(), 2));
        s.append("-");
        s.append(formatValueLength(t.getDay(), 2));
        return s.toString();
    }
  
    /**
     * 将BRelTime格式化为 d:HH:mm:ss
     * @param t
     * @return d:HH:mm:ss
     */
    public static final String makeRelTimeString(BRelTime t) {
        StringBuffer s = new StringBuffer();
        s.append(t.getDays());
        s.append(":");
        s.append(formatValueLength(t.getHours(), 2));
        s.append(":");
        s.append(formatValueLength(t.getMinutes(), 2));
        s.append(":");
        s.append(formatValueLength(t.getSeconds(), 2));
        return s.toString();
    }
}