package new_expt;

import java.io.Serializable;

public class Policy implements Serializable{
    private String Policy_no;
    private String poilcyholderName;
    private String nomineeName;
    private String policyType;
    
    
	public String getPolicy_no() {
		return Policy_no;
	}
	
	
	public void setPolicy_no(String p) {
		if(p.startsWith("P")&&p.length()==4 )
		this.Policy_no = p;
		else
			System.out.println("Policy_no must starts with P And length should be 4");
	}
	
	
	public String getPoilcyholderName() {
		return poilcyholderName;
	}
	
	
	public void setPoilcyholderName(String poilcyholderName) throws InvaliPolicyException {
		if(!poilcyholderName.equals(null))
		this.poilcyholderName = poilcyholderName;
		else{
			System.out.println("Policy holder name is NULL");
				throw new InvaliPolicyException();
		}
		}
	
	
	public String getNomineeName() {
		return nomineeName;
	}
	
	
	public void setNomineeName(String nomineeName) throws InvaliPolicyException {
		if(!nomineeName.equals(null))
		this.nomineeName = nomineeName;
		else{
			System.out.println("Policy holder name is NULL");
		throw new InvaliPolicyException();
	}
	}
	
	
	public String getPolicyType() {
		return policyType;
	}
	
	
	public void setPolicyType(String policyType) throws InvaliPolicyException {
		if (policyType.equals("SmartKid" )|| policyType.equals("JivanSaral")) 
		this.policyType = policyType;
		else{
			System.out.println("Policy Type is wrong");
		throw new InvaliPolicyException();
	}
	}
	
	
	@Override
	public String toString() {
		return "Policy [Policy_no=" + Policy_no + ", poilcyholderName="
				+ poilcyholderName + ", nomineeName=" + nomineeName
				+ ", policyType=" + policyType + "]";
	}
	
	public Policy() {
		super();
	}
    


}
