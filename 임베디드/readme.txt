temp.py: 기상청api 이용 10분단위로 현재 비오는지를 확인하여 같은 폴더 내에 test.txt로 전송한다.
->백그라운드로 실행하여 계속 돌아가게 함
UART_test.c: 예제 영상에서 두 프로세서간 UART통신이 이루어지는걸 확인하기 위해 사용한 코드
UART_file.c: 실제 날씨 정보를 받아 stm32보드로 전달해주는 코드

UART폴더 -> stm32보드 동작에 필요한 코드 모음

DHT.cpp, DHT.h
c언어와 c++의 호환성 문제로 실제 프로젝트에 적용하지 못한 DHT11 드라이버 코드

-> 임베디드는 모바일 프로그래밍에서 발전시켜 개발
