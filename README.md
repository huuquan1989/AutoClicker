# Tự Động Chạm (AutoClicker)

Ứng dụng Android tự động lặp lại thao tác **chạm** hoặc **vuốt** trên màn hình.
Dùng Dịch vụ trợ năng (Accessibility Service) để gửi thao tác, không cần root.

- Android 7.0 (API 24) trở lên
- Thanh điều khiển nổi: ▶ Bắt đầu / ■ Dừng, đổi kiểu Chạm ↔ Vuốt, ✕ ẩn thanh
- Chấm **A** (điểm chạm hoặc điểm đầu vuốt) và chấm **B** (điểm cuối vuốt) kéo thả được
- **Thu phóng chấm**: ở màn hình chính kéo thanh "Kích thước các chấm" (30%–150%) để thu nhỏ/phóng to mọi chấm chạm/vuốt
  ngay trên màn hình, giữ nguyên tâm; thu nhỏ để đỡ che màn hình.
- **Macro**: nhấn ● Ghi, thao tác bình thường (chạm, vuốt, nhấn giữ, kể cả chờ giữa các bước), nhấn ■ Xong,
  rồi ▶ Phát để lặp lại đúng chuỗi thao tác đó. Macro được lưu lại cho lần sau.
  - Mỗi lần chỉ ghi một ngón tay. Các nút Back/Home và cử chỉ vuốt từ mép màn hình là của hệ thống nên không ghi được.
  - Khi ghi, hãy đợi thao tác vừa làm được "chiếu lại" xong rồi mới chạm tiếp (chỉ mất chừng một phần giây).
- **Chuỗi**: nhấn ＋ Chạm / ＋ Vuốt để thêm các bước 1, 2, 3… (tối đa 50). Mỗi bước là một chấm đánh số kéo thả được
  (chạm: 1 chấm xanh lá; vuốt: chấm xanh dương = điểm đầu, chấm đỏ = điểm cuối). Thời gian chờ trước mỗi bước và
  thời gian của từng cú vuốt sửa trong danh sách ở màn hình chính.
  **Nhấn giữ một chấm** để mở pop-up nhỏ chỉnh trực tiếp: số lần ấn (hiện trên chấm dạng `3×5`), thời gian chờ trước bước
  (thời gian chuyển từ bước trước sang), nghỉ giữa các lần ấn, và thời gian vuốt (với bước vuốt). Dùng nút −/＋: chạm để đổi
  một nấc, giữ để đổi nhanh dần. Pop-up có nút **Xong** và **Xóa bước**. Nhấn ▶ Phát để chạy lần lượt rồi lặp theo số vòng đã cài.
- **Hẹn giờ theo đồng hồ điện thoại**: nhấn giữ nút **⏰** trên thanh nổi để mở pop-up đặt giờ:phút:giây, bấm sớm (ms),
  số lần ấn và nghỉ giữa các lần, rồi nhấn **⏰ Hẹn giờ** (hoặc chạm nhanh nút ⏰ để hẹn/hủy). Nút ⏰ đếm ngược đến giờ hẹn.
  Đến đúng giờ, ứng dụng tự chạy theo kiểu đang chọn: **Chạm** một điểm 1 hoặc nhiều lần (đặt số lần = 1 hoặc N),
  **Vuốt**, **Macro** hay **Chuỗi**. Nút **＋1 phút** đặt nhanh giờ hẹn = bây giờ + 1 phút để thử; **Hằng ngày** tự hẹn lại ngày hôm sau.
  - Giờ được so với đồng hồ thực của máy, sai số cỡ vài mili giây. Độ trễ khi gửi thao tác của Android có thể thêm vài chục ms,
    nên nếu cần chuẩn hơn thì tăng "Bấm sớm".
  - Trong lúc đang hẹn, ứng dụng giữ màn hình sáng. Không khóa máy, không bấm ✕ (ẩn thanh sẽ hủy hẹn) và đừng để hệ thống
    tắt ứng dụng (nên tắt tối ưu pin cho app này).
- **Thu gọn thanh**: chạm vào **≡** để ẩn các nút (chỉ còn nút ≡, các chấm vẫn ở nguyên), chạm lại để mở. Kéo ≡ để di chuyển thanh.
  Không thu gọn được khi đang chạy hoặc ghi; khi bắt đầu chạy (kể cả theo hẹn giờ) thanh tự mở lại để luôn có nút Dừng.
- **Cài đặt nhanh ở chế độ Chạm / Vuốt**: **nhấn giữ chấm A (hoặc B)** để mở pop-up chỉnh số lần lặp, thời gian giữa các lần ấn
  và thời gian vuốt (chế độ Vuốt), giống cách nhấn giữ chấm ở chế độ Chuỗi. Macro không có chấm nên chỉnh số vòng và thời gian nghỉ
  bằng pop-up của nút ⏰ (nhấn giữ ⏰) hoặc ở màn hình chính.
- **Dừng nhanh**: nút ■ Dừng phản hồi ngay khi vừa chạm xuống, và có thể nhấn phím tăng/giảm âm lượng để dừng.
  Khoảng nghỉ tối thiểu là 50 ms để hệ thống kịp nhận thao tác của bạn.
- Tuỳ chỉnh: khoảng nghỉ (ms), số lần lặp (0 = mãi mãi), thời gian mỗi lần vuốt (ms)
- Không cần cấp quyền "hiển thị trên ứng dụng khác"; không dùng Internet

## Build ra file APK

### Cách 1: GitHub Actions (không cần cài gì)
1. Tạo repo GitHub mới, tải toàn bộ thư mục này lên (nhánh `main`).
2. Vào tab **Actions** → workflow **Build APK** (tự chạy khi push, hoặc bấm **Run workflow**).
3. Khi chạy xong, tải artifact **AutoClicker-debug-apk** → giải nén được `app-debug.apk`.

### Cách 2: Android Studio
1. Cài Android Studio, chọn **Open** và trỏ vào thư mục dự án, đợi Gradle đồng bộ.
2. Menu **Build → Build Bundle(s) / APK(s) → Build APK(s)**.
3. File nằm ở `app/build/outputs/apk/debug/app-debug.apk`.

### Cách 3: Dòng lệnh
Cần JDK 17 và Android SDK (đặt `ANDROID_HOME`):

```
./gradlew assembleDebug
```

## Cài đặt và sử dụng
1. Chép APK vào điện thoại và cài (cho phép cài từ nguồn không xác định nếu được hỏi).
2. Mở ứng dụng → **Bật dịch vụ trợ năng** → chọn **Tự Động Chạm** → bật.
   - Android 13 trở lên: nếu công tắc bị mờ, vào **Thông tin ứng dụng** → dấu ⋮ → **Cho phép cài đặt bị hạn chế**, rồi bật lại dịch vụ.
3. Thanh điều khiển nổi sẽ hiện ra. Mở ứng dụng cần thao tác, kéo chấm A (và B) tới vị trí mong muốn.
4. Nhấn **▶ Bắt đầu**. Nhấn **■ Dừng** để dừng bất cứ lúc nào.
5. Đã nhấn ✕ để ẩn thanh? Mở lại ứng dụng và nhấn **Lưu và hiện thanh điều khiển**.

## Lưu ý
- Khi đang chạy, các chấm mờ đi và "xuyên thấu" để thao tác lọt xuống ứng dụng bên dưới.
- Nếu xoay màn hình, hãy kéo lại vị trí các chấm.
- Một số ứng dụng (ngân hàng, màn hình bảo mật…) chặn thao tác từ dịch vụ trợ năng.
- Chỉ dùng cho mục đích hợp lệ; một số game và dịch vụ cấm tự động hoá trong điều khoản sử dụng.
- Đây là bản debug (ký bằng khoá debug), phù hợp để dùng cá nhân.

## Cấu trúc
```
app/src/main/java/com/example/autoclicker/
  AutoClickService.kt   dịch vụ trợ năng, thanh nổi, vòng lặp chạm/vuốt
  MainActivity.kt       màn hình cài đặt
  Prefs.kt              lưu cài đặt và vị trí chấm
app/src/main/res/        giao diện, chuỗi tiếng Việt, cấu hình dịch vụ
.github/workflows/build.yml   build APK tự động
```
