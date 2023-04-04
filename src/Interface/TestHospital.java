package Interface;

public class TestHospital {

	public static void main(String[] args) {
		
		FortiesHospital us= new FortiesHospital ();
		us.PhysioServices();
		us.CardioServices();
		us.pediaServices();
		us.EmergencyServices();
		us.MedcicalInsurence();
		us.medicalTraning();
		us.covid19vaccination();
		us.CoviedGuideLine();
		
		
		UsMedical tc= new FortiesHospital ();
		tc.CardioServices();
		tc.EmergencyServices();
		tc.pediaServices();
		tc.PhysioServices();
		
		WHO wh= new FortiesHospital();
		wh.covid19vaccination();
		wh.CoviedGuideLine();
		
		
		

	}

}
