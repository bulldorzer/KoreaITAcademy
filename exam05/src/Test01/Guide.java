package Test01;

public class Guide {
//	Tour KRtour = new KoreaTour();
//	Tour JPtour = new JapanTour();
//	Tour TWtour = new TiwanTour();
	Tour tour;
	
//	final void showProgram() {
//		System.out.println("<한국투어 모든정보>");
//		KRtour.hotel();
//		KRtour.meal();
//		KRtour.course();
//		System.out.println("-------------");
//		System.out.println("<일본투어 모든정보>");
//		JPtour.hotel();
//		JPtour.meal();
//		JPtour.course();
//		System.out.println("-------------");
//		System.out.println("<타이완투어 모든정보>");
//		TWtour.hotel();
//		TWtour.meal();
//		TWtour.course();
//		System.out.println("-------------");
//	};
	public Guide(Tour tour) {
//		super();
		this.tour = tour;
	};
	
	final void showProgram() {
		tour.hotel();
		tour.meal();
		tour.course();
		
	}

}
