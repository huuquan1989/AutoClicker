package com.example.autoclicker

import android.content.Context

/** Lưu cài đặt, vị trí các chấm và macro đã ghi. */
class Prefs(context: Context) {

    companion object {
        const val MODE_TAP = 0
        const val MODE_SWIPE = 1
        const val MODE_MACRO = 2
        const val MODE_SEQ = 3
    }

    private val sp = context.applicationContext
        .getSharedPreferences("autoclicker", Context.MODE_PRIVATE)

    /** Kiểu thao tác: chạm, vuốt hoặc macro. (Tương thích bản cũ lưu swipeMode.) */
    var mode: Int
        get() = sp.getInt("mode", if (sp.getBoolean("swipeMode", false)) MODE_SWIPE else MODE_TAP)
        set(v) { sp.edit().putInt("mode", v).apply() }

    /** Khoảng nghỉ giữa hai lần thao tác (ms); với macro là nghỉ giữa hai vòng. */
    var intervalMs: Long
        get() = sp.getLong("intervalMs", 500L)
        set(v) { sp.edit().putLong("intervalMs", v).apply() }

    /** Số lần lặp (số vòng với macro), 0 = lặp mãi. */
    var repeatCount: Int
        get() = sp.getInt("repeatCount", 0)
        set(v) { sp.edit().putInt("repeatCount", v).apply() }

    var swipeDurationMs: Long
        get() = sp.getLong("swipeDurationMs", 300L)
        set(v) { sp.edit().putLong("swipeDurationMs", v).apply() }

    /** Chuỗi các bước chạm/vuốt tự tạo, dạng JSON (xem SeqStore). */
    var seqJson: String
        get() = sp.getString("seqJson", "") ?: ""
        set(v) { sp.edit().putString("seqJson", v).apply() }

    /** Macro đã ghi, dạng JSON (xem MacroStore). */
    var macroJson: String
        get() = sp.getString("macroJson", "") ?: ""
        set(v) { sp.edit().putString("macroJson", v).apply() }

    // Hẹn giờ theo đồng hồ điện thoại
    var schedHour: Int
        get() = sp.getInt("schedHour", 12)
        set(v) { sp.edit().putInt("schedHour", v.coerceIn(0, 23)).apply() }
    var schedMin: Int
        get() = sp.getInt("schedMin", 0)
        set(v) { sp.edit().putInt("schedMin", v.coerceIn(0, 59)).apply() }
    var schedSec: Int
        get() = sp.getInt("schedSec", 0)
        set(v) { sp.edit().putInt("schedSec", v.coerceIn(0, 59)).apply() }

    /** Bắt đầu sớm hơn giờ hẹn bao nhiêu mili giây (bù độ trễ). */
    var schedOffsetMs: Long
        get() = sp.getLong("schedOffsetMs", 0L)
        set(v) { sp.edit().putLong("schedOffsetMs", v.coerceIn(0L, 5_000L)).apply() }

    /** Tự hẹn lại vào cùng giờ ngày hôm sau sau khi chạy. */
    var schedDaily: Boolean
        get() = sp.getBoolean("schedDaily", false)
        set(v) { sp.edit().putBoolean("schedDaily", v).apply() }

    /** Tỉ lệ kích thước các chấm trên màn hình (%), 30..150, mặc định 100. */
    var markerScale: Int
        get() = sp.getInt("markerScale", 100).coerceIn(30, 150)
        set(v) { sp.edit().putInt("markerScale", v.coerceIn(30, 150)).apply() }

    // Vị trí góc trên-trái của cửa sổ nổi, -1 = chưa đặt.
    var ax: Int
        get() = sp.getInt("ax", -1)
        set(v) { sp.edit().putInt("ax", v).apply() }
    var ay: Int
        get() = sp.getInt("ay", -1)
        set(v) { sp.edit().putInt("ay", v).apply() }
    var bx: Int
        get() = sp.getInt("bx", -1)
        set(v) { sp.edit().putInt("bx", v).apply() }
    var by: Int
        get() = sp.getInt("by", -1)
        set(v) { sp.edit().putInt("by", v).apply() }
    var px: Int
        get() = sp.getInt("px", -1)
        set(v) { sp.edit().putInt("px", v).apply() }
    var py: Int
        get() = sp.getInt("py", -1)
        set(v) { sp.edit().putInt("py", v).apply() }
}
