package Interface;

public class FortiesHospital implements UsMedical,UkMedcical, IndianMedical {

	@Override
	public void PhysioServices() {
		System.out.println("FH_____physioServices");

	}

	@Override
	public void CardioServices() {
		System.out.println("FH________CardioServices");

	}

	@Override
	public void pediaServices() {
		System.out.println("FH_____pediaServices");

	}

	@Override
	public void EmergencyServices() {
		System.out.println("FH____EmergencyServies");

	}

	public void MedcicalInsurence() {
		System.out.println("FH____medcicalinsurence");
	}

	public void medicalTraning() {
		System.out.println("FH____MedicalTraning");

	}
// Uk methods come from UK.
	@Override
	public void EntServices() {
		
		
	}

	@Override
	public void DentalServices() {
		
		
	}
	// indian medical 

	@Override
	public void OrthoServices() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void oncologyServices() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void covid19vaccination() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void CoviedGuideLine() {
		// TODO Auto-generated method stub
		
	}

}
