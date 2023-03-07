package chap2.quiz02;

public class Car {
	String model;
	int speed;
	char mode; //(P, R, N, D)
	boolean start;

	Car(){}
	Car(String s){
		model = s;
		speed = 0;
		mode = 'P';
		start = false;
	}
	public void setSpeed(int speed) {
		/*
		속도는 0 미만, 200 이상일 수 없습니다.
					시동이 걸려있지 않은 상태라면 속도를 지정할 수 없습니다.
					D나 R모드가 아니라면 속도를 지정할 수 없습니다.
					R모드는 속도를 40 초과해서 지정할 수 없습니다.
		 */
		if(start == false) {
			System.out.println("-----------------------");
			System.out.println("시동이 걸려있지 않습니다.");
		}
		else if(mode == 'N'||mode == 'P') {
			System.out.println("-----------------------");
			System.out.println("주행가능한 기어가 아닙니다.");
			return;
		}
		else if(speed<0 || speed>200) {
			System.out.println("-----------------------");
			System.out.println("속도는 0미만 200이상일 수 없습니다.");
			System.out.println("");
			return;
		}
		else if(mode == 'D') {
			this.speed = speed;
		}
		else if(mode == 'R') {
			if(mode > 40) return;
			this.speed = speed;
		}
	}
	//기본 형태로 지정합니다.
	public char setMode(char mode) {
		/*
		 전달받은 변속 모드에 따라 상태를 변경합니다.
				   지정된 값 이외의 매개값은 P 모드로 통일합니다.
		 */
		switch (mode){
		case 'P':
			this.mode = 'P';
			break;
		case 'N':
			this.mode = 'N';
			break;
		case 'D':
			this.mode = 'D';
			break;
		case 'R':
			this.mode = 'R';
			break;
		default:
			this.mode = 'P';
			break;

		}
		return this.mode;
	}
	public char getMode() {
		return mode;
	}

	public void engineStart() {
		/*
		 1. "시동버튼을 눌렀습니다." 는 출력문 실행.
		2. 엔진오일이 주입되는 기능 실행.
		3. 엔진에 연료가 주입되는 기능 실행.
		4. 시동 온/오프 상태 변수의 값을 변경.
		5. 실린더가 움직이는 기능 실행.
		6. "시동이 걸렸습니다." 는 출력문 실행.
		 */
		System.out.println("-----------------------");
		System.out.println("시동버튼을 눌렀습니다.");
		injectOil();
		injectGasoline();
		start = true;
		moveCylinder();
		System.out.println("시동이 걸렸습니다.");
	}
	private void injectGasoline() {
		/*
		 * 엔진에 연료가 주입되는 기능입니다.
		1. "연료가 엔진에 주입됩니다." 출력문 실행.
		 */
		System.out.println("연료가 엔진에 주입됩니다.");
	}
	private void injectOil() {
		/*
		 * 엔진오일이 주입되는 기능입니다.
		1. "엔진오일이 순환합니다." 출력문 실행.

		 */
		System.out.println("엔진오일이 순환합니다.");
	}
	private void moveCylinder() {
		/*
		 * 실린더가 움직이는 기능입니다.
		1. 시동 여부에 따라 실린더의 상태를 출력합니다.
		시동이 켜져 있다면? "실린더가 움직입니다." 출력문 실행.
		시동이 꺼져 있다면? "실린더가 움직이지 않습니다." 출력문 실행.
		 */
		if(start == true) 
			System.out.println("실린더가 움직입니다.");
		else 
			System.out.println("실린더가 움직이지 않습니다.");
	}
	void engineStop() {
		/*
		 * 시동을 끄는 기능입니다.
		1. 객체의 현재 속도를 확인해서 0 이상이라면 시동을 끌 수 없습니다.
		"주행 중에는 시동을 끌 수 없습니다." 출력문 실행하고 강제 종료.
		2. 속도가 0 이라면 변속기의 모드를 확인합니다.
		P 모드가 아니라면 "P 모드로 먼저 변속기를 변경하세요." 출력 후 강제 종료.
		3. 변속 모드까지 이상이 없다면 시동 온/오프 여부를 조작한 후 
		"시동이 꺼졌습니다." 출력문 실행.
		 */
		if(speed > 0) {
			System.out.println("-----------------------");
			System.out.println("주행 중에는 시동을 끌 수 없습니다.");
		}
		else if(mode != 'P') {
			System.out.println("-----------------------");
			System.out.println("P 모드로 먼저 변경하세요.");
		}
		else {
			start = false;
			System.out.println("시동이 꺼졌습니다.");
		}

	}
	void isStart(){
		
	}
	void setStart() {

	}
	void carStatus() {
		System.out.printf("시동여부: %b \n",this.start);
		System.out.printf("변속모드: %c\n",this.mode);
		System.out.printf("속도: %d\n",this.speed);	
	}
}
