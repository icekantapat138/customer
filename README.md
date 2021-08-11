# cs211-641-project-jabmoowai

## รายชื่อสมาชิก
* 63104504233 กันตพัฒน์ ราชวัตร์(icekantapat138)
  * LOGIN_REGISTER(หน้าล็อกอิน-ลงทะเบียน)
* 6310451081 ฐิตาพร เตชะวัฒนกนก(titaporn1081)  
  * ADMINISTRATOR(หน้าผู้ดูแลระบบ)
* 6310451324 ภคพร ศรีสุขา(phakaporn2544)
  * CUSTOMER(หน้าลูกค้าซื้อ)

## วิธีการติดตั้งหรือรันโปรแกรม
เมื่อ clone โปรแกรมลงมาไว้ในเครื่องให้เข้า folder login_register>>Login_register_Presentation จะมีไฟล์ที่ชื่อว่า login_register.zip ให้ดึงไฟล์ .zip ออกมาไว้ในหน้า desktop แล้วคลิกขวากด extract here จะมี 3 folder ออกมามีชื่อว่า bin , conf , legal ให้กดเข้าไปในไฟล์ bin>>จากนั้นเลื่อนลงไปจะพบไฟล์ชื่อ launch.sh ให้กดเข้าไปแล้ว program จะทำการรันขึ้นมาเป็นอันเสร็จสมบูรณ์ในการเปิดไฟล์

## ตัวอย่างข้อมูลผู้ใช้ระบบ
ในตัวอย่างข้อมูลผู้ใช้ระบบ เป็นการคิดข้อมูลผู้ใช้ในระบบยังไม่ได้นำตัวอย่างเหล่านี้เข้าไปใช้ในระบบจริงๆ 
* (Admin) (Admin) (Admin1234)
* (Customer) (kanptd) (Kanptd138)
* (Customer) (themmw) (Oosemmw1203)
* (Customer) (nooncolour) (Something20)
* (Customer) (chanbaek) (Parkcb0506)
* (Customer) (Joebaek) (Mymino4749)

## สรุปสิ่งที่พัฒนาแต่ละครั้งที่นำเสนอความก้าวหน้าของระบบ
* ครั้งที่ 1 (11/08/2021)
  * พัฒนาหน้า Login และเขียนข้อมูลหน้า Register ทดสอบการพัฒนาเข้าสู่หน้า admin_controller ด้วยการใส่ username = "Admin" และ password = "Admin1234" สามารถเข้าสู่หน้า admin_controllerได้ และพัฒนาหน้า Register โดยหน้า Register สามารถนำรูปภาพที่อยู่ในตัวเครื่องมาใส่ละโชว์เป็นรูปภาพใน ImageView ได้ (พัฒนาโดย : กันตพัฒน์ ราชวัตร์)
  * พัฒนาหน้า admin โดยพอใส่username กับ password ของ admin แล้ว ก็จะเข้าสู่หน้า admin_controller ซึ่งหน้านี้ประกอบไปด้วย customer-info , admin_lamborghini , admin_ferrari , admin_mclaren , admin_wmotor และ admin_bugatti โดยหน้า customer-info จะมี customer list หากกดชื่อลูกค้าใน customer list ข้อมูลจะไปปรากฏทางขวามือโดยจะมี fistname , lastname , username และ email ส่วนหน้า admin_(แบรนด์รถทั้ง 5 แบรนด์) จะประกอบไปด้วยรูปรถและช่องสำหรับเพิ่มจำนวนรถ(โดยจะพัฒนาเพิ่มให้ตัวเลขที่เพิ่มขึ้นในหน้า admin ไปแสดงในหน้าการสั่งซื้อรถของลูกค้า) (พัฒนาโดย : ฐิตาพร เตชะวัฒนกนก)
  * พัฒนาหน้า customer โดยพอใส่ username กับ password ของลูกค้าคนนั้นๆ จะเข้าสู่หน้า website ชึ่งหน้านี้แถบบนประกอบไปด้วยปุ่ม Cart(แสดงรายการสินค้าที่จะยืนยันซื้อ) ในหน้านี้จะมีราคาสินค้าทั้งหมดที่ได้ทำการสั่งซื้อและมีการเลือกการจัดส่ง , ปุ่มข้อมูลลูกค้า(จะแสดงข้อมูลที่ลูกค้าได้ทำการสมัครไว้) และปุ่ม logout ส่วนแถบล่างจะประกอบไปด้วย ปุ่มเข้าถึงข้อมูลสินค้าแบรนด์รถทั้ง 5 รุ่น(lamborghini, ferrari, mclaren, w motor, bugatti) หากกดปุ่มเหล่านี้ก็จะไปสู่หน้าข้อมูลสินค้าของแบรนด์นั้นๆ ลูกค้าสามารถสั่งซื้อสินค้าโดยจะมีแถบข้อความที่สามารถเขียนจำนวนคันที่ต้องการสั่งซื้อได้  (พัฒนาโดย : ภคพร ศรีสุขา)
* ครั้งที่ 2 (วันที่เสนอ)
  * (สรุปสิ่งที่พัฒนา) (พัฒนาโดยใคร)
  * (สรุปสิ่งที่พัฒนา) (พัฒนาโดยใคร)
  * (สรุปสิ่งที่พัฒนา) (พัฒนาโดยใคร)
  * (สรุปสิ่งที่พัฒนา) (พัฒนาโดยใคร)
* ครั้งที่ 3 (วันที่เสนอ)
  * (สรุปสิ่งที่พัฒนา) (พัฒนาโดยใคร)
  * (สรุปสิ่งที่พัฒนา) (พัฒนาโดยใคร)
  * (สรุปสิ่งที่พัฒนา) (พัฒนาโดยใคร)
  * (สรุปสิ่งที่พัฒนา) (พัฒนาโดยใคร)  