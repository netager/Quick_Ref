package sec05_innerinterface_EX02;

class Button {
	
	OnClickListener ocl;
		
	void setOnClickListener(OnClickListener ocl) {
		this.ocl = ocl;
	}
	
	interface OnClickListener {
		public abstract void onClick();
	}
	
	void onClick() {
		ocl.onClick();
	}
}


public class ButtonAPIExample {
	public static void main(String[] args) {
		
		//#1. 개발자1. 클릭했을떄 음악 재생
		Button btn1 = new Button();
		btn1.setOnClickListener(new Button.OnClickListener() {
			@Override
			public void onClick() {
				System.out.println("개발자1 : 음악 재생");
			}
		});
		
		btn1.onClick();

		//#2. 개발자2. 클릭했을떄 네이버 접속
		Button btn2 = new Button();
		btn2.setOnClickListener(new Button.OnClickListener() {
			@Override
			public void onClick() {
				System.out.println("개발자2 : 네이버접속");
			}
		});
		
		btn2.onClick();

	} // main

}
